package cu.uci.cdae.tutoriales.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jorge on 27/04/14.
 */
@XmlRootElement(name = "user")
public class User {
    private Integer id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
