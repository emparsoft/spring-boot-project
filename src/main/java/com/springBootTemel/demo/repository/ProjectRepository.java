package com.springBootTemel.demo.repository;

import com.springBootTemel.demo.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;


//@Repository yazmamıza gerek yok
public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project getByProjectCode(String projectCode);

    List<Project> getAllByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);

    Project getByProjectCodeAndIdNot(@NotNull String projectCode, Long id);
}
