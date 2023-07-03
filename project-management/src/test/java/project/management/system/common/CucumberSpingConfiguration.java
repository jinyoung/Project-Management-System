package project.management.system.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import project.management.system.ProjectManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProjectManagementApplication.class })
public class CucumberSpingConfiguration {}
