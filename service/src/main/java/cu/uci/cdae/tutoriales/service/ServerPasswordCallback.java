package cu.uci.cdae.tutoriales.service;

import org.apache.ws.security.WSPasswordCallback;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

public class ServerPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        /* Esta implementacion debe adecuarse al método de almacenaje de los usuarios y contraseñas  */
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        if ("jorge".equals(pc.getIdentifier())) {
            pc.setPassword("jorgepassword");
        }
    }
}
