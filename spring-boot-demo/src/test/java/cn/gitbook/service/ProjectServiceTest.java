package cn.gitbook.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ProjectServiceTest {
    @Autowired
    private ProjectService service;

    @Test
    public void getProjectById(){
        Assert.isTrue(service.getProjectById(1).equals("devops"));
    }
}
