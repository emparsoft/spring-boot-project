package com.springBootTemel.demo.repository;

import com.springBootTemel.demo.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long>{

}
