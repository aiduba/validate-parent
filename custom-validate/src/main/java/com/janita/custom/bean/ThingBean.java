package com.janita.custom.bean;

import com.janita.custom.annotation.JsonArray;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Janita on 2017-05-22 20:27
 */
public class ThingBean {

    @NotBlank(message = "id is not empty")
    @Length(max = 36, message = "id length > 36")
    private String id ;

    @NotBlank(message = "name is not empty")
    private String name ;

    //限制这个入参必须是json数组格式
    @JsonArray(message = "extension is not json array")
    private String extension;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "ThingBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }
}
