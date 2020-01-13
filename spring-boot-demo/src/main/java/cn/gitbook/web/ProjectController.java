package cn.gitbook.web;

import cn.gitbook.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping(value = "/{id}")
    public String getProjectById(@PathVariable("id") Integer id){
        return service.getProjectById(id);
    }
}
