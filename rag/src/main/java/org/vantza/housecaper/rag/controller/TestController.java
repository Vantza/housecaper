package org.vantza.housecaper.rag.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vantza.housecaper.rag.model.TestTable;
import org.vantza.housecaper.rag.service.TestService;

import java.util.List;

@Slf4j
@RestController
public class TestController {

    @Autowired
    public TestService testService;

    @GetMapping("test")
    public List<TestTable> test() {
        log.warn("come in test!");
        return testService.test();
    }
}
