package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.constants.Constants;
import com.sonpham.it.ats.pojos.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class AssetDao implements IAssetDao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Asset> getAllAssets() {
        return entityManager.createQuery(Constants.GET_ALL_ASSETS).getResultList();
    }
    @Override
    public List<Asset> getAssetsByFleetId(long fleetId) {
        return entityManager.createQuery(Constants.GET_ASSETS_BY_FLEETID + fleetId).getResultList();
    }
    @Override
    public Asset getAssetByDeviceId(String deviceId) {
        return (Asset) entityManager.createQuery(Constants.GET_ASSET_BY_DEVICEID)
                                    .setParameter(1, deviceId).getSingleResult();
    }
}
