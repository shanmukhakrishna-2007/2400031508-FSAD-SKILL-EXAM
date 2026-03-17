package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.service.HotelService;

@RestController
@RequestMapping("/hotel")
@Validated
public class HotelController {

    @Autowired
    private HotelService service;

 @PostMapping("/add")
    public Hotel addHotel(@Valid @RequestBody Hotel hotel) {
        return service.addHotel(hotel);
    }

    @PutMapping("/update")
    public Hotel updateHotel(@Valid @RequestBody Hotel hotel) {
        return service.updateHotel(hotel);
    }

}