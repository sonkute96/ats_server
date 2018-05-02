package com.sonpham.it.ats.controllers;

import com.sonpham.it.ats.Services.IPositionService;
import com.sonpham.it.ats.pojos.Position;
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
public class PositionController {
    @Autowired
    private IPositionService positionService;
    @GetMapping("/v1/positions")
    public ResponseEntity<List<Position>> getAllPositions() {
        List<Position> positions = positionService.getAllPositions();
        return new ResponseEntity<>(positions, HttpStatus.OK);
    }
    @GetMapping("/v1/asset/positions/{assetId}")
    public ResponseEntity<List<Position>> getPositionsByAssetId(@PathVariable("assetId") long assetId) {
        if (assetId > 0) {
            List<Position> positions = positionService.getPositionsByAssetId(assetId);
            return new ResponseEntity<>(positions, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    @GetMapping("/v1/positions/{fleetId}")
    public ResponseEntity<List<Position>> getPositionsByAssets(@PathVariable("fleetId")long fleetId) {
        if (fleetId > 0) {
            List<Position> positions = positionService.getPositionsByFleetId(fleetId);
            return new ResponseEntity<>(positions, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
