package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.dao.IFleetDao;
import com.sonpham.it.ats.pojos.Fleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FleetService implements IFleetService {
    @Autowired
    private IFleetDao fleetDao;
    @Override
    public List<Fleet> getAllFleets() {
        return fleetDao.getAllFleets();
    }

    @Override
    public Fleet getFleetById(long id) {
        return fleetDao.getFleetById(id);
    }
}
