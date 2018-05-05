package com.codehub.spring.core.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehub.spring.core.domain.Triangle;
import com.codehub.spring.core.repository.TriangleRepository;

@Service
public class TriangleServiceImpl implements TriangleService {

    @Autowired
    private TriangleRepository triangleRepository;

    public double findLargerArea() {
        List<Triangle> triangleList = triangleRepository.getTriangles();
        triangleList.sort(Comparator.comparing(Triangle::area).reversed());
        return triangleList.get(0).area();
    }
}
