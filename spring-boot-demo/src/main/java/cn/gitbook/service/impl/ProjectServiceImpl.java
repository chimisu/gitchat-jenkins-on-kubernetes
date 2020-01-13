package cn.gitbook.service.impl;

import cn.gitbook.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public String getProjectById(Integer id) {
        if(id != null && id == 1){
            return "devops";
        }
        return "";
    }
}
