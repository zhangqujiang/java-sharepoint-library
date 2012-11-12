
package com.microsoft.webservices.sharepoint.sharepointemailws;

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
 * 2012-11-10T16:48:46.128+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class SharepointEmailWSSoap_SharepointEmailWSSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", "SharepointEmailWS");

    private SharepointEmailWSSoap_SharepointEmailWSSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SharepointEmailWS.WSDL_LOCATION;
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
      
        SharepointEmailWS ss = new SharepointEmailWS(wsdlURL, SERVICE_NAME);
        SharepointEmailWSSoap port = ss.getSharepointEmailWSSoap12();  
        
        {
        System.out.println("Invoking getJobStatus...");
        int _getJobStatus_jobId = 0;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestResponse _getJobStatus__return = port.getJobStatus(_getJobStatus_jobId);
        System.out.println("getJobStatus.result=" + _getJobStatus__return);


        }
        {
        System.out.println("Invoking modifyContact...");
        java.lang.String _modifyContact_oldAlias = "";
        java.lang.String _modifyContact_newAlias = "";
        java.lang.String _modifyContact_firstName = "";
        java.lang.String _modifyContact_lastName = "";
        java.lang.String _modifyContact_forwardingEmail = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.ContactFlags _modifyContact_flags = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestStatus _modifyContact__return = port.modifyContact(_modifyContact_oldAlias, _modifyContact_newAlias, _modifyContact_firstName, _modifyContact_lastName, _modifyContact_forwardingEmail, _modifyContact_flags);
        System.out.println("modifyContact.result=" + _modifyContact__return);


        }
        {
        System.out.println("Invoking changeContactsMembershipInDistributionGroup...");
        java.lang.String _changeContactsMembershipInDistributionGroup_alias = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.ArrayOfString _changeContactsMembershipInDistributionGroup_addListForContacts = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.ArrayOfString _changeContactsMembershipInDistributionGroup_deleteListForContacts = null;
        boolean _changeContactsMembershipInDistributionGroup_deleteAllCurrentMembers = false;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestStatus _changeContactsMembershipInDistributionGroup__return = port.changeContactsMembershipInDistributionGroup(_changeContactsMembershipInDistributionGroup_alias, _changeContactsMembershipInDistributionGroup_addListForContacts, _changeContactsMembershipInDistributionGroup_deleteListForContacts, _changeContactsMembershipInDistributionGroup_deleteAllCurrentMembers);
        System.out.println("changeContactsMembershipInDistributionGroup.result=" + _changeContactsMembershipInDistributionGroup__return);


        }
        {
        System.out.println("Invoking createContact...");
        java.lang.String _createContact_alias = "";
        java.lang.String _createContact_firstName = "";
        java.lang.String _createContact_lastName = "";
        java.lang.String _createContact_forwardingEmail = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.ContactFlags _createContact_flags = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestStatus _createContact__return = port.createContact(_createContact_alias, _createContact_firstName, _createContact_lastName, _createContact_forwardingEmail, _createContact_flags);
        System.out.println("createContact.result=" + _createContact__return);


        }
        {
        System.out.println("Invoking renameDistributionGroup...");
        java.lang.String _renameDistributionGroup_oldAlias = "";
        java.lang.String _renameDistributionGroup_newAlias = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestInfo _renameDistributionGroup_info = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestResponse _renameDistributionGroup__return = port.renameDistributionGroup(_renameDistributionGroup_oldAlias, _renameDistributionGroup_newAlias, _renameDistributionGroup_info);
        System.out.println("renameDistributionGroup.result=" + _renameDistributionGroup__return);


        }
        {
        System.out.println("Invoking createDistributionGroup...");
        java.lang.String _createDistributionGroup_alias = "";
        java.lang.String _createDistributionGroup_name = "";
        java.lang.String _createDistributionGroup_description = "";
        java.lang.String _createDistributionGroup_contactCN = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestInfo _createDistributionGroup_info = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.DistributionGroupFlags _createDistributionGroup_flags = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestResponse _createDistributionGroup__return = port.createDistributionGroup(_createDistributionGroup_alias, _createDistributionGroup_name, _createDistributionGroup_description, _createDistributionGroup_contactCN, _createDistributionGroup_info, _createDistributionGroup_flags);
        System.out.println("createDistributionGroup.result=" + _createDistributionGroup__return);


        }
        {
        System.out.println("Invoking changeUsersMembershipInDistributionGroup...");
        java.lang.String _changeUsersMembershipInDistributionGroup_alias = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.ArrayOfString _changeUsersMembershipInDistributionGroup_addNt4NameList = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.ArrayOfString _changeUsersMembershipInDistributionGroup_deleteNt4NameList = null;
        boolean _changeUsersMembershipInDistributionGroup_deleteAllCurrentMembers = false;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestStatus _changeUsersMembershipInDistributionGroup__return = port.changeUsersMembershipInDistributionGroup(_changeUsersMembershipInDistributionGroup_alias, _changeUsersMembershipInDistributionGroup_addNt4NameList, _changeUsersMembershipInDistributionGroup_deleteNt4NameList, _changeUsersMembershipInDistributionGroup_deleteAllCurrentMembers);
        System.out.println("changeUsersMembershipInDistributionGroup.result=" + _changeUsersMembershipInDistributionGroup__return);


        }
        {
        System.out.println("Invoking modifyDistributionGroup...");
        java.lang.String _modifyDistributionGroup_alias = "";
        java.lang.String _modifyDistributionGroup_name = "";
        java.lang.String _modifyDistributionGroup_description = "";
        java.lang.String _modifyDistributionGroup_contactCN = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestInfo _modifyDistributionGroup_info = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.DistributionGroupFlags _modifyDistributionGroup_flags = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestResponse _modifyDistributionGroup__return = port.modifyDistributionGroup(_modifyDistributionGroup_alias, _modifyDistributionGroup_name, _modifyDistributionGroup_description, _modifyDistributionGroup_contactCN, _modifyDistributionGroup_info, _modifyDistributionGroup_flags);
        System.out.println("modifyDistributionGroup.result=" + _modifyDistributionGroup__return);


        }
        {
        System.out.println("Invoking deleteDistributionGroup...");
        java.lang.String _deleteDistributionGroup_alias = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestInfo _deleteDistributionGroup_info = null;
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestResponse _deleteDistributionGroup__return = port.deleteDistributionGroup(_deleteDistributionGroup_alias, _deleteDistributionGroup_info);
        System.out.println("deleteDistributionGroup.result=" + _deleteDistributionGroup__return);


        }
        {
        System.out.println("Invoking deleteContact...");
        java.lang.String _deleteContact_alias = "";
        com.microsoft.webservices.sharepoint.sharepointemailws.RequestStatus _deleteContact__return = port.deleteContact(_deleteContact_alias);
        System.out.println("deleteContact.result=" + _deleteContact__return);


        }

        System.exit(0);
    }

}
