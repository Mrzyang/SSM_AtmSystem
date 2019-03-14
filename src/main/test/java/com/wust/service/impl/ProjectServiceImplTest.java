package com.wust.service.impl;

import com.wust.service.ProjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class ProjectServiceImplTest {
    @Resource
    private ProjectService projectService;

    @Test
    public void getAllProjects(){
        List list=projectService.getAllProjects();
        System.out.println(list);
    }


}