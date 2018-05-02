package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.dao.IPositionDao;
import com.sonpham.it.ats.pojos.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionService implements IPositionService {
    @Autowired
    private IPositionDao positionDao;
    @Override
    public List<Position> getAllPositions() {
        return positionDao.getAllPositions();
    }

    @Override
    public List<Position> getPositionsByAssetId(long assetId) {
        return positionDao.getPositionsByAssetId(assetId);
    }
    @Override
    public List<Position> getPositionsByFleetId(long fleetId) {
        return positionDao.getPositionsByFleetId(fleetId);
    }
}
