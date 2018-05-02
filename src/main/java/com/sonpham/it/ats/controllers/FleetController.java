package com.sonpham.it.ats.controllers;

import com.sonpham.it.ats.Services.IFleetService;
import com.sonpham.it.ats.pojos.Fleet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ats")
public class FleetController {
    @Autowired
    private IFleetService fleetService;
    @GetMapping("/v3/fleets")
    public ResponseEntity<List<Fleet>> getAllFleets() {
        List<Fleet> fleets = fleetService.getAllFleets();
        return new ResponseEntity<>(fleets, HttpStatus.OK);
    }
    @GetMapping("/v3/fleet/{id}")
    public ResponseEntity<Fleet> getFleetById(@PathVariable("id") long id) {
        if (id > 0) {
            Fleet fleet = fleetService.getFleetById(id);
            return new ResponseEntity<>(fleet, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
}
