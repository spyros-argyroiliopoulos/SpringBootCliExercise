package com.codehub.spring.core.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehub.spring.core.domain.Triangle;
import com.codehub.spring.core.repository.TriangleRepository;

@Service
public class TriangleServiceImpl implements ShapeService {

    @Autowired
    private TriangleRepository triangleRepository;

    @Override
    public double findLargestArea() {
        List<Triangle> triangleList = triangleRepository.getTriangles();
        triangleList.sort(Comparator.comparing(Triangle::area).reversed());
        return triangleList.get(0).area();
    }

    @Override
    public double findShortestLength() {
        List<Triangle> triangleList = triangleRepository.getTriangles();
        triangleList.sort(Comparator.comparing(Triangle::circumference));
        return triangleList.get(0).circumference();
    }
}
