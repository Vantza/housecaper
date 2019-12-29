package org.vantza.housecaper.rag.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.Instant;

/**
 * @author ycao
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Entity {
    @Id
    private String id;
    @CreationTimestamp
    private Instant createTime;
    @UpdateTimestamp
    private Instant updateTime;
    private String creator;
    private String modifier;
    @Version
    private int version;
}
