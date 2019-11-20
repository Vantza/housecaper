package org.vantza.housecaper.rag.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "house_info")
public class HouseInfo {
    private String id;
    private String resource;
    private String title;
}
