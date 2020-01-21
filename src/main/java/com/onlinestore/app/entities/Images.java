package com.onlinestore.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "IMAGES")
public class Images {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMAGES_SEQ")
    @SequenceGenerator(name="IMAGES_SEQ", sequenceName="IMAGES_SEQ", allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MAIN_IMAGE_FLAG")
    private Integer mainImageFlag;

    @Column(name = "FILENAME")
    private String filename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainImageFlag() {
        return mainImageFlag;
    }

    public void setMainImageFlag(Integer mainImageFlag) {
        this.mainImageFlag = mainImageFlag;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
