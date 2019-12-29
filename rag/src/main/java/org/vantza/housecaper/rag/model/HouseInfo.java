package org.vantza.housecaper.rag.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document(collection = "house_info")
public class HouseInfo {
    private String id;
    private String resource;
    private String title;
    private Map<String, String> baseInfo;
}
