package org.vantza.housecaper.rag.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vantza.housecaper.rag.model.HouseInfo;
import org.vantza.housecaper.rag.model.TestTable;
import org.vantza.housecaper.rag.service.TestService;

import java.util.List;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test/mysql")
    public List<TestTable> testMysql() {
        log.warn("come in test mysql!");
        return testService.testMysql();
    }

    @GetMapping("test/mongo")
    public List<HouseInfo> testMongo() {
        log.warn("come in test mongo!");
        return testService.testMongo();
    }
}
