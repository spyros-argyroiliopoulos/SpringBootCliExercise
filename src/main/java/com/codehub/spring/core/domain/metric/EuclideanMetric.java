package com.codehub.spring.core.domain.metric;

import com.codehub.spring.core.domain.basic.Point;

public interface EuclideanMetric {

//    Overloading at interface

    double distance();

    double distance(Point a, Point b);
}
