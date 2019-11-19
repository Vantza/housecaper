package org.vantza.housecaper.rag.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TestAutoCreateModel {

    @Id
    Integer id;

    String name;

    Boolean sex;
}
