package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.pojos.Asset;

import java.util.List;

public interface IAssetDao {
    public List<Asset> getAllAssets();
    public List<Asset> getAssetsByFleetId(long id);
    public Asset getAssetByDeviceId(String deviceId);
}
