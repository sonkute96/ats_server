package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.dao.IAssetDao;
import com.sonpham.it.ats.pojos.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetService implements IAssetService {
    @Autowired
    private IAssetDao assetDao;
    @Override
    public List<Asset> getAllAssets() {
        return assetDao.getAllAssets();
    }

    @Override
    public List<Asset> getAssetsByFleetId(long id) {
        return assetDao.getAssetsByFleetId(id);
    }
    @Override
    public Asset getAssetByDeviceId(String deviceId) {
        return assetDao.getAssetByDeviceId(deviceId);
    }
}
