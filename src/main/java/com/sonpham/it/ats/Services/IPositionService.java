package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.pojos.Position;

import java.util.List;

public interface IPositionService {
    public List<Position> getAllPositions();
    public List<Position> getPositionsByAssetId(long assetId);
    public List<Position> getPositionsByFleetId(long fleetId);

}
