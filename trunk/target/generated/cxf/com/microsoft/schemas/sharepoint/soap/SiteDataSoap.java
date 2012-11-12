package com.microsoft.schemas.sharepoint.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:46.456+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", name = "SiteDataSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface SiteDataSoap {

    @RequestWrapper(localName = "GetContent", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContent")
    @WebMethod(operationName = "GetContent", action = "http://schemas.microsoft.com/sharepoint/soap/GetContent")
    @ResponseWrapper(localName = "GetContentResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentResponse")
    public void getContent(
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.ObjectType objectType,
        @WebParam(name = "objectId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String objectId,
        @WebParam(name = "folderUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String folderUrl,
        @WebParam(name = "itemId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String itemId,
        @WebParam(name = "retrieveChildItems", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        boolean retrieveChildItems,
        @WebParam(name = "securityOnly", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        boolean securityOnly,
        @WebParam(mode = WebParam.Mode.INOUT, name = "lastItemIdOnPage", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> lastItemIdOnPage,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetContentResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> getContentResult
    );

    @RequestWrapper(localName = "EnumerateFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.EnumerateFolder")
    @WebMethod(operationName = "EnumerateFolder", action = "http://schemas.microsoft.com/sharepoint/soap/EnumerateFolder")
    @ResponseWrapper(localName = "EnumerateFolderResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.EnumerateFolderResponse")
    public void enumerateFolder(
        @WebParam(name = "strFolderUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strFolderUrl,
        @WebParam(mode = WebParam.Mode.OUT, name = "EnumerateFolderResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> enumerateFolderResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "vUrls", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSFPUrl> vUrls
    );

    @WebResult(name = "GetListItemsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetListItems", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListItems")
    @WebMethod(operationName = "GetListItems", action = "http://schemas.microsoft.com/sharepoint/soap/GetListItems")
    @ResponseWrapper(localName = "GetListItemsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListItemsResponse")
    public java.lang.String getListItems(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strListName,
        @WebParam(name = "strQuery", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strQuery,
        @WebParam(name = "strViewFields", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strViewFields,
        @WebParam(name = "uRowLimit", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        long uRowLimit
    );

    @RequestWrapper(localName = "GetListCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListCollection")
    @WebMethod(operationName = "GetListCollection", action = "http://schemas.microsoft.com/sharepoint/soap/GetListCollection")
    @ResponseWrapper(localName = "GetListCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListCollectionResponse")
    public void getListCollection(
        @WebParam(mode = WebParam.Mode.OUT, name = "GetListCollectionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getListCollectionResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "vLists", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSList> vLists
    );

    @RequestWrapper(localName = "GetSite", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSite")
    @WebMethod(operationName = "GetSite", action = "http://schemas.microsoft.com/sharepoint/soap/GetSite")
    @ResponseWrapper(localName = "GetSiteResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSiteResponse")
    public void getSite(
        @WebParam(mode = WebParam.Mode.OUT, name = "GetSiteResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getSiteResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "sSiteMetadata", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<SSiteMetadata> sSiteMetadata,
        @WebParam(mode = WebParam.Mode.OUT, name = "vWebs", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSWebWithTime> vWebs,
        @WebParam(mode = WebParam.Mode.OUT, name = "strUsers", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strUsers,
        @WebParam(mode = WebParam.Mode.OUT, name = "strGroups", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strGroups,
        @WebParam(mode = WebParam.Mode.OUT, name = "vGroups", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfString> vGroups
    );

    @RequestWrapper(localName = "GetWeb", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWeb")
    @WebMethod(operationName = "GetWeb", action = "http://schemas.microsoft.com/sharepoint/soap/GetWeb")
    @ResponseWrapper(localName = "GetWebResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetWebResponse")
    public void getWeb(
        @WebParam(mode = WebParam.Mode.OUT, name = "GetWebResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getWebResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "sWebMetadata", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<SWebMetadata> sWebMetadata,
        @WebParam(mode = WebParam.Mode.OUT, name = "vWebs", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSWebWithTime> vWebs,
        @WebParam(mode = WebParam.Mode.OUT, name = "vLists", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSListWithTime> vLists,
        @WebParam(mode = WebParam.Mode.OUT, name = "vFPUrls", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSFPUrl> vFPUrls,
        @WebParam(mode = WebParam.Mode.OUT, name = "strRoles", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strRoles,
        @WebParam(mode = WebParam.Mode.OUT, name = "vRolesUsers", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfString> vRolesUsers,
        @WebParam(mode = WebParam.Mode.OUT, name = "vRolesGroups", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfString> vRolesGroups
    );

    @RequestWrapper(localName = "GetSiteAndWeb", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSiteAndWeb")
    @WebMethod(operationName = "GetSiteAndWeb", action = "http://schemas.microsoft.com/sharepoint/soap/GetSiteAndWeb")
    @ResponseWrapper(localName = "GetSiteAndWebResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSiteAndWebResponse")
    public void getSiteAndWeb(
        @WebParam(name = "strUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strUrl,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetSiteAndWebResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getSiteAndWebResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "strSite", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strSite,
        @WebParam(mode = WebParam.Mode.OUT, name = "strWeb", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strWeb
    );

    @RequestWrapper(localName = "GetAttachments", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetAttachments")
    @WebMethod(operationName = "GetAttachments", action = "http://schemas.microsoft.com/sharepoint/soap/GetAttachments")
    @ResponseWrapper(localName = "GetAttachmentsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetAttachmentsResponse")
    public void getAttachments(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strListName,
        @WebParam(name = "strItemId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strItemId,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetAttachmentsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getAttachmentsResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "vAttachments", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfString> vAttachments
    );

    @WebResult(name = "GetChangesExResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetChangesEx", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetChangesEx")
    @WebMethod(operationName = "GetChangesEx", action = "http://schemas.microsoft.com/sharepoint/soap/GetChangesEx")
    @ResponseWrapper(localName = "GetChangesExResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetChangesExResponse")
    public java.lang.String getChangesEx(
        @WebParam(name = "version", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        int version,
        @WebParam(name = "xmlInput", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String xmlInput
    );

    @WebResult(name = "GetContentExResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetContentEx", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentEx")
    @WebMethod(operationName = "GetContentEx", action = "http://schemas.microsoft.com/sharepoint/soap/GetContentEx")
    @ResponseWrapper(localName = "GetContentExResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetContentExResponse")
    public java.lang.String getContentEx(
        @WebParam(name = "version", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        int version,
        @WebParam(name = "xmlInput", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String xmlInput
    );

    @RequestWrapper(localName = "GetSiteUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSiteUrl")
    @WebMethod(operationName = "GetSiteUrl", action = "http://schemas.microsoft.com/sharepoint/soap/GetSiteUrl")
    @ResponseWrapper(localName = "GetSiteUrlResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetSiteUrlResponse")
    public void getSiteUrl(
        @WebParam(name = "Url", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String url,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetSiteUrlResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getSiteUrlResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "siteUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> siteUrl,
        @WebParam(mode = WebParam.Mode.OUT, name = "siteId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> siteId
    );

    @RequestWrapper(localName = "GetList", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetList")
    @WebMethod(operationName = "GetList", action = "http://schemas.microsoft.com/sharepoint/soap/GetList")
    @ResponseWrapper(localName = "GetListResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetListResponse")
    public void getList(
        @WebParam(name = "strListName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strListName,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetListResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Long> getListResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "sListMetadata", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<SListMetadata> sListMetadata,
        @WebParam(mode = WebParam.Mode.OUT, name = "vProperties", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<ArrayOfSProperty> vProperties
    );

    @RequestWrapper(localName = "GetChanges", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetChanges")
    @WebMethod(operationName = "GetChanges", action = "http://schemas.microsoft.com/sharepoint/soap/GetChanges")
    @ResponseWrapper(localName = "GetChangesResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetChangesResponse")
    public void getChanges(
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.ObjectType objectType,
        @WebParam(name = "contentDatabaseId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String contentDatabaseId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "LastChangeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> lastChangeId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "CurrentChangeId", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> currentChangeId,
        @WebParam(name = "Timeout", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        int timeout,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetChangesResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> getChangesResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "moreChanges", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Boolean> moreChanges
    );

    @RequestWrapper(localName = "GetURLSegments", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetURLSegments")
    @WebMethod(operationName = "GetURLSegments", action = "http://schemas.microsoft.com/sharepoint/soap/GetURLSegments")
    @ResponseWrapper(localName = "GetURLSegmentsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetURLSegmentsResponse")
    public void getURLSegments(
        @WebParam(name = "strURL", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String strURL,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetURLSegmentsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.Boolean> getURLSegmentsResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "strWebID", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strWebID,
        @WebParam(mode = WebParam.Mode.OUT, name = "strBucketID", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strBucketID,
        @WebParam(mode = WebParam.Mode.OUT, name = "strListID", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strListID,
        @WebParam(mode = WebParam.Mode.OUT, name = "strItemID", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        javax.xml.ws.Holder<java.lang.String> strItemID
    );
}
