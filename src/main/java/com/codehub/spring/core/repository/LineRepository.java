package com.codehub.spring.core.repository;

import java.util.List;

import com.codehub.spring.core.domain.basic.Line;

public interface LineRepository {

    List<Line> getLines();
}
