
package com.microsoft.schemas.sharepoint.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:42.736+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class AuthenticationSoap_AuthenticationSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Authentication");

    private AuthenticationSoap_AuthenticationSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Authentication.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Authentication ss = new Authentication(wsdlURL, SERVICE_NAME);
        AuthenticationSoap port = ss.getAuthenticationSoap12();  
        
        {
        System.out.println("Invoking login...");
        java.lang.String _login_username = "";
        java.lang.String _login_password = "";
        com.microsoft.schemas.sharepoint.soap.LoginResult _login__return = port.login(_login_username, _login_password);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking mode...");
        com.microsoft.schemas.sharepoint.soap.AuthenticationMode _mode__return = port.mode();
        System.out.println("mode.result=" + _mode__return);


        }

        System.exit(0);
    }

}
