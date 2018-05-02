package com.sonpham.it.ats.constants;

public class Constants {
    public static final String GET_ALL_POSITIONS = "FROM Position as pos where id IN (Select lastPosition FROM Asset) ORDER BY pos.id";
    public static final String GET_POSITIONS_BY_ASSETID = "FROM Position as pos where pos.deviceId = ";
    public static final String GET_POSITIONS_BY_FLEETID = "From Position as pos where pos.id IN (SELECT lastPosition FROM Asset as a WHERE a.fleet = ";
    public static final String GET_ALL_ASSETS = "FROM Asset as a ORDER BY a.id";
    public static final String GET_ASSET_BY_DEVICEID = "FROM Asset as a where a.deviceId = ?";
    public static final String GET_ASSETS_BY_FLEETID = "FROM Asset as a where a.fleet = ";
    public static final String GET_ALL_FLEETS = "FROM Fleet as fle ORDER BY fle.id";
    public static final String GET_FLEET_BY_ID = "FROM Fleet as fle where fle.id = ";
}
