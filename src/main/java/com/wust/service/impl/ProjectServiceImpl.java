package com.wust.service.impl;

import com.wust.mapper.ProjectMapper;
import com.wust.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    public List getAllProjects(){
        return projectMapper.getAllProjects();
    }
}
