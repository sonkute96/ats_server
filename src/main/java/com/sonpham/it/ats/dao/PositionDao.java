package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.constants.Constants;
import com.sonpham.it.ats.pojos.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PositionDao implements IPositionDao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Position> getAllPositions() {
        return entityManager.createQuery(Constants.GET_ALL_POSITIONS).getResultList();
    }
    @Override
    public List<Position> getPositionsByAssetId(long assetId) {
        return entityManager.createQuery(Constants.GET_POSITIONS_BY_ASSETID + assetId).getResultList();
    }
    @Override
    public List<Position> getPositionsByFleetId(long fleetId) {
        return entityManager.createQuery(Constants.GET_POSITIONS_BY_FLEETID + fleetId + ")").getResultList();
    }
}
