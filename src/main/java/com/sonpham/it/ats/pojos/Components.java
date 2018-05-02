package com.sonpham.it.ats.pojos;

import java.util.List;

public class Components {
    private List<Asset> assets;
    private List<Position> positions;
    public Components(List<Asset> assets, List<Position> positions) {
        this.assets = assets;
        this.positions = positions;
    }
    public List<Asset> getAssets() {
        return assets;
    }
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
    public List<Position> getPositions() {
        return positions;
    }
    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
