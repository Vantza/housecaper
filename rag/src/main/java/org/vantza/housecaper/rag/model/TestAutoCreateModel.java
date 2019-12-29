package org.vantza.housecaper.rag.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "test_auto_create_model")
public class TestAutoCreateModel extends AbstractEntity {
    String name;

    Boolean sex;
}
