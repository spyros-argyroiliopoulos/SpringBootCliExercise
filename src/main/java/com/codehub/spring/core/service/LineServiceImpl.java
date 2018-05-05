package com.codehub.spring.core.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehub.spring.core.domain.basic.Line;
import com.codehub.spring.core.repository.LineRepository;

@Service
public class LineServiceImpl implements ShapeService {

    @Autowired
    private LineRepository lineRepository;

    @Override
    public double findShortestLength() {
        List<Line> lineList = lineRepository.getLines();
        lineList.sort(Comparator.comparingDouble(Line::distance));
        return lineList.get(0).distance();
    }

    @Override
    public double findLargestArea() {
        throw new UnsupportedOperationException("Lines have no Area!");
    }
}
