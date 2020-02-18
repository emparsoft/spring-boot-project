package com.springBootTemel.demo.service;

import com.springBootTemel.demo.entity.Issue;
import com.springBootTemel.demo.entity.IssueHistory;
import com.springBootTemel.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory user);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);

}
