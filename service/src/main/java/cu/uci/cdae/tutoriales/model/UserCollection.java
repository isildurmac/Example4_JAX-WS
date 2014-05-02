package cu.uci.cdae.tutoriales.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * Created by Jorge on 28/04/14.
 */
@XmlRootElement
public class UserCollection {
    private Collection<User> users;
    public UserCollection() {
    }
    public UserCollection(Collection<User> users) {
        this.users = users;
    }
    @XmlElement(name="user")
    @XmlElementWrapper(name="users")
    public Collection<User> getUsers() {
        return users;
    }
}
