package com.codehub.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.service.ShapeService;

@Controller
public class ShapeController {

    @Autowired
    @Qualifier("triangleServiceImpl")
    ShapeService shapeService;

    public double getArea() {
        return shapeService.findLargestArea();
    }

    public double getLength() {
        return shapeService.findShortestLength();
    }

}
