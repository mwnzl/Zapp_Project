package com.zapp.berufapp.repository;

import com.zapp.berufapp.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Option, Long> {

}

