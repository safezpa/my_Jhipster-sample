package cn.iouoi.cucumber.stepdefs;

import cn.iouoi.Service1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Service1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
