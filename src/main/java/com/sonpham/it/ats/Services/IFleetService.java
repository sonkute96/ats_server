package com.sonpham.it.ats.Services;

import com.sonpham.it.ats.pojos.Fleet;

import java.util.List;

public interface IFleetService {
    public List<Fleet> getAllFleets();
    public Fleet getFleetById(long id);
}
