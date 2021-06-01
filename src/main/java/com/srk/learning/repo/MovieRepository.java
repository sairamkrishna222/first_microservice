package com.srk.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srk.learning.bean.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
