package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Hotel;
import com.klef.fsad.exam.repository.HotelRepository;

@Service
public class HotelService {

 @Autowired
 private HotelRepository repo;

 public Hotel addHotel(Hotel hotel) {
  return repo.save(hotel);
 }

 public Hotel updateHotel(Hotel hotel) {
  return repo.save(hotel);
 }

}