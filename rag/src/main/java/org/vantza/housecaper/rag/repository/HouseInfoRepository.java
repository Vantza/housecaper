package org.vantza.housecaper.rag.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.vantza.housecaper.rag.model.HouseInfo;

@Repository
public interface HouseInfoRepository extends MongoRepository<HouseInfo, String> {
}
