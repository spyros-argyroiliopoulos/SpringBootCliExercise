package com.codehub.spring.core.repository;

import java.util.List;

import com.codehub.spring.core.domain.Triangle;

public interface TriangleRepository {

    List<Triangle> getTriangles();
}
