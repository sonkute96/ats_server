package com.sonpham.it.ats.dao;

import com.sonpham.it.ats.pojos.Fleet;

import java.util.List;

public interface IFleetDao {
    public List<Fleet> getAllFleets();
    public Fleet getFleetById(long id);
}
