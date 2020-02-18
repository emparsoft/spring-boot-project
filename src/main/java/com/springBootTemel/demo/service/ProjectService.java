package com.springBootTemel.demo.service;

import com.springBootTemel.demo.dto.ProjectDto;
import com.springBootTemel.demo.entity.Issue;
import com.springBootTemel.demo.entity.Project;
import com.springBootTemel.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;

public interface ProjectService {
    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    Page<Project> getAllPageable(Pageable pageable);

    Project getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Boolean delete(Project project);

    ProjectDto update(Long id,ProjectDto project);
}
