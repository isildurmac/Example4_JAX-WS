package cu.uci.cdae.tutoriales;

import cu.uci.cdae.tutoriales.users.User;
import cu.uci.cdae.tutoriales.users.UsersPortType;
import cu.uci.cdae.tutoriales.users.UsersService;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;

import javax.xml.ws.BindingProvider;
import java.util.Map;

public class WSClient {
   
    public static void main(String[] args) {
        UsersService service = new UsersService();
        UsersPortType port = service.getUsersPort();
        /* Este codigo se usa para desabilitar el chequeo del CommonName del certificado usado, se recomienda no hacer
        * esto en un ambiente de producción*/
        HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(port).getConduit();
        TLSClientParameters tlsCP = new TLSClientParameters();
        // other TLS/SSL configuration like setting up TrustManagers
        tlsCP.setDisableCNCheck(true);
        httpConduit.setTlsClientParameters(tlsCP);

        /*
        Mediante  esta vía se especifica el usuario y contraseña mediante el código
         */
        Map ctx = ((BindingProvider) port).getRequestContext();
        ctx.put("ws-security.username", "jorge");
        ctx.put("ws-security.password", "jorgepassword");

        User user = port.getUserbyID(3);
        System.out.println("el nombre del usuario es: " + user.getName());
    }
}

