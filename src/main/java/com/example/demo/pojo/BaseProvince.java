package com.example.demo.pojo;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "base_province")
public class BaseProvince {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String provinceid;

    private String province;

    private String wm;

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getWm() {
        return wm;
    }

    public void setWm(String wm) {
        this.wm = wm == null ? null : wm.trim();
    }
}