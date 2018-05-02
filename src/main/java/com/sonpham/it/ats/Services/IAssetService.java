package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.pojos.Asset;

import java.util.List;

public interface IAssetService {
    public List<Asset> getAllAssets();
    public List<Asset> getAssetsByFleetId(long id);
    public Asset getAssetByDeviceId(String deviceId);
}
