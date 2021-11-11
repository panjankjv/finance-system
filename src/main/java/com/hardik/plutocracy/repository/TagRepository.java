package com.hardik.plutocracy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardik.plutocracy.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {

}
