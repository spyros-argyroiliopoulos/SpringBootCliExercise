package com.codehub.spring.core.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.codehub.spring.core.domain.basic.Line;
import com.codehub.spring.core.domain.basic.Point;
import com.codehub.spring.core.utilities.PointReader;

@Repository
public class LineRepositoryCsvImpl implements LineRepository {

    @Value("${csv.file.name}")
    private String fileName;

    @Autowired
    private PointReader pointReader;

    public List<Line> getLines() {
        List<Point> pointList = getPoints();
        List<Line> lineList = new ArrayList<>();
        for (int i = 1; i < pointList.size(); i += 2) {
            lineList.add(new Line(pointList.get(i-1), pointList.get(i)));
        }
        return lineList;
    }

    private List<Point> getPoints() {
        return pointReader.readFile(fileName);
    }
}