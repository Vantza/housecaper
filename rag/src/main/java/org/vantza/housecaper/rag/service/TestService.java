package org.vantza.housecaper.rag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vantza.housecaper.rag.model.HouseInfo;
import org.vantza.housecaper.rag.model.TestTable;
import org.vantza.housecaper.rag.repository.HouseInfoRepository;
import org.vantza.housecaper.rag.repository.TestRepository;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public TestRepository testRepository;

    @Autowired
    private HouseInfoRepository houseInfoRepository;

    public List<TestTable> testMysql() {
        return testRepository.findAll();
    }

    public List<HouseInfo> testMongo() {
        return houseInfoRepository.findAll();
    }
}
