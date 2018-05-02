package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.pojos.Position;

import java.util.List;

public interface IPositionDao {
    public List<Position> getAllPositions();
    public List<Position> getPositionsByAssetId(long assetId);
    public List<Position> getPositionsByFleetId(long fleetId);
}
