package com.codehub.spring.core.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.codehub.spring.core.domain.Triangle;
import com.codehub.spring.core.domain.basic.Point;
import com.codehub.spring.core.utilities.PointReader;

@Repository
public class TriangleRepositoryImpl implements TriangleRepository {

    @Value("${csv.file.name}")
    private String fileName;

    @Autowired
    private PointReader pointReader;

    public List<Triangle> getTriangles() {
        List<Point> pointList = getPoints();
        List<Triangle> triangleList = new ArrayList<>();
        for (int i = 2; i < pointList.size(); i += 3) {
            Triangle tr = new Triangle(pointList.get(i-2), pointList.get(i-1), pointList.get(i));
            //System.out.println(tr.area());
            triangleList.add(tr);
        }
        return triangleList;
    }

    private List<Point> getPoints() {
        return pointReader.readFile(fileName);
    }
}
