package com.springBootTemel.demo.service.impl;

import com.springBootTemel.demo.dto.IssueDto;
import com.springBootTemel.demo.entity.Issue;
import com.springBootTemel.demo.entity.Project;
import com.springBootTemel.demo.repository.IssueRepository;
import com.springBootTemel.demo.service.IssueService;
import com.springBootTemel.demo.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issueDto) {
        if (issueDto.getDate() == null) {
            throw new IllegalArgumentException("TARİH BOŞ OLAMAZ");
        }
        Issue issueEntity  = modelMapper.map(issueDto, Issue.class);
        issueEntity = issueRepository.save(issueEntity);
        issueDto.setId(issueEntity.getId());
        return issueDto;
    }



    @Override
    public IssueDto getById(Long id) {
        Issue issue = issueRepository.getOne(id);
        return modelMapper.map(issue,IssueDto.class);
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage<IssueDto> response = new TPage<>();
        response.setStat(data,Arrays.asList(modelMapper.map(data.getContent(),IssueDto[].class)));
        return response;
    }



    @Override
    public Boolean delete(Project project) {
        return null;
    }

    public Boolean delete(Long id) {
        issueRepository.deleteById(id);
        return true;
    }

    @Override
    public IssueDto update(Long id, IssueDto issueDto) {
        return null;
    }
}
