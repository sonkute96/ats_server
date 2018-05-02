package com.sonpham.it.ats.controllers;

import com.sonpham.it.ats.Services.IAssetService;
import com.sonpham.it.ats.pojos.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ats")
public class AssetController {
    @Autowired
    private IAssetService assetService;
    @GetMapping("/v2/assets")
    public ResponseEntity<List<Asset>> getAllAssets() {
        List<Asset> assets = assetService.getAllAssets();
        return new ResponseEntity<>(assets, HttpStatus.OK);
    }
    @GetMapping("/v2/assets/{fleetId}")
    public ResponseEntity<List<Asset>> getAssetsByFleetId(@PathVariable("fleetId") long fleetId) {
        if (fleetId > 0) {
            List<Asset> assets = assetService.getAssetsByFleetId(fleetId);
            return new ResponseEntity<List<Asset>>(assets, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    @GetMapping("/v2/asset/{deviceId}")
    public ResponseEntity<Asset> getAssetByDeviceId(@PathVariable("deviceId") String deviceId) {
        if (!deviceId.isEmpty() || deviceId != null) {
            Asset asset = assetService.getAssetByDeviceId(deviceId);
            return new ResponseEntity<>(asset, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
