package org.vantza.housecaper.rag.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Data
@Entity(name = "test_table")
public class TestTable {
    @Id
    @Column(name = "column_1")
    int column1;
    @Column(name = "column_2")
    String column2;
    @Column(name = "column_3")
    float column3;
    @Column(name = "column_4")
    String column4;
    @Column(name = "column_5")
    int column5;
    @Column(name = "column_6")
    Instant column6;
}
