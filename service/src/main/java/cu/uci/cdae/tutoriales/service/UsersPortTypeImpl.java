package cu.uci.cdae.tutoriales.service;

import java.util.HashMap;
import java.util.Map;
import cu.uci.cdae.tutoriales.model.User;
import cu.uci.cdae.tutoriales.users.ListUsersResponse;
import cu.uci.cdae.tutoriales.users.UsersPortType;

import javax.jws.WebService;

/**
 * Created by Jorge on 28/04/14.
 */
@WebService(targetNamespace = "http://tutoriales.cdae.uci.cu/Users/",
        endpointInterface = "cu.uci.cdae.tutoriales.users.UsersPortType",
        portName="UsersPort",
        serviceName = "UsersService")
public class UsersPortTypeImpl implements UsersPortType {
    private static Map<Integer, User> users = new HashMap<Integer, User>();
    static {
        users.put(1, new User(1, "User1"));
        users.put(2, new User(2, "User2"));
        users.put(3, new User(3, "User3"));
    }
    @Override
    public ListUsersResponse listUsers() {
        ListUsersResponse listUsersResponse = new ListUsersResponse();
        cu.uci.cdae.tutoriales.users.User userWS = null;
        for (User user : users.values()) {
            userWS = new cu.uci.cdae.tutoriales.users.User();
            userWS.setId(user.getId());
            userWS.setName(user.getName());
            listUsersResponse.getUsuarios().add(userWS);
        }
        return listUsersResponse;
    }
    @Override
    public cu.uci.cdae.tutoriales.users.User getUserbyID(int id) {
        User user = users.get(id);
        cu.uci.cdae.tutoriales.users.User userWS = new cu.uci.cdae.tutoriales.users.User();
        userWS.setId(user.getId());
        userWS.setName(user.getName());
        return userWS;
    }
}
