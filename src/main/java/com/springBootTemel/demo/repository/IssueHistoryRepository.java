package com.springBootTemel.demo.repository;

import com.springBootTemel.demo.entity.IssueHistory;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {

}
