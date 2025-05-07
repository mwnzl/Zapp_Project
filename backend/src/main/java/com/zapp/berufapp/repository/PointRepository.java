package com.zapp.berufapp.repository;

import com.zapp.berufapp.entity.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Long> {
}
