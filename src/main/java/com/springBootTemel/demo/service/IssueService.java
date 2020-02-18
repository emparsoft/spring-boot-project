package com.springBootTemel.demo.service;

import com.springBootTemel.demo.dto.IssueDto;
import com.springBootTemel.demo.entity.Issue;
import com.springBootTemel.demo.entity.IssueHistory;
import com.springBootTemel.demo.entity.Project;
import com.springBootTemel.demo.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IssueService {

    IssueDto save(IssueDto project);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

    IssueDto update(Long id, IssueDto project);
}
