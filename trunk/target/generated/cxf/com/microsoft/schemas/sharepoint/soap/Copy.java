package com.microsoft.schemas.sharepoint.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:43.117+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "Copy", 
                  wsdlLocation = "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/copy.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/") 
public class Copy extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Copy");
    public final static QName CopySoap12 = new QName("http://schemas.microsoft.com/sharepoint/soap/", "CopySoap12");
    public final static QName CopySoap = new QName("http://schemas.microsoft.com/sharepoint/soap/", "CopySoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/copy.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Copy.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/copy.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Copy(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Copy(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Copy() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Copy(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Copy(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Copy(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CopySoap
     */
    @WebEndpoint(name = "CopySoap12")
    public CopySoap getCopySoap12() {
        return super.getPort(CopySoap12, CopySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CopySoap
     */
    @WebEndpoint(name = "CopySoap12")
    public CopySoap getCopySoap12(WebServiceFeature... features) {
        return super.getPort(CopySoap12, CopySoap.class, features);
    }
    /**
     *
     * @return
     *     returns CopySoap
     */
    @WebEndpoint(name = "CopySoap")
    public CopySoap getCopySoap() {
        return super.getPort(CopySoap, CopySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CopySoap
     */
    @WebEndpoint(name = "CopySoap")
    public CopySoap getCopySoap(WebServiceFeature... features) {
        return super.getPort(CopySoap, CopySoap.class, features);
    }

}
