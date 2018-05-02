package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.constants.Constants;
import com.sonpham.it.ats.pojos.Fleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class FleetDao implements IFleetDao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Fleet> getAllFleets() {
        return entityManager.createQuery(Constants.GET_ALL_FLEETS).getResultList();
    }
    @Override
    public Fleet getFleetById(long id) {
        return (Fleet) entityManager.createQuery(Constants.GET_FLEET_BY_ID + id).getSingleResult();
    }
}
