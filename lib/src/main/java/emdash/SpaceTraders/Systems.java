/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders;

import com.fasterxml.jackson.databind.ObjectMapper;
import emdash.SpaceTraders.utils.HTTPClient;
import emdash.SpaceTraders.utils.HTTPRequest;
import emdash.SpaceTraders.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

/**
 * Systems
 */
public class Systems {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Systems(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Get Jump Gate
     * Get jump gate details for a waypoint.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetJumpGateResponse getJumpGate(emdash.SpaceTraders.models.operations.GetJumpGateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetJumpGateRequest.class, baseUrl, "/systems/{systemSymbol}/waypoints/{waypointSymbol}/jump-gate", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetJumpGateResponse res = new emdash.SpaceTraders.models.operations.GetJumpGateResponse(contentType, httpRes.statusCode()) {{
            getJumpGate200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetJumpGate200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetJumpGate200ApplicationJSON.class);
                res.getJumpGate200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get Market
     * Retrieve imports, exports and exchange data from a marketplace. Imports can be sold, exports can be purchased, and exchange goods can be purchased or sold. Send a ship to the waypoint to access trade good prices and recent transactions.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetMarketResponse getMarket(emdash.SpaceTraders.models.operations.GetMarketRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetMarketRequest.class, baseUrl, "/systems/{systemSymbol}/waypoints/{waypointSymbol}/market", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetMarketResponse res = new emdash.SpaceTraders.models.operations.GetMarketResponse(contentType, httpRes.statusCode()) {{
            getMarket200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetMarket200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetMarket200ApplicationJSON.class);
                res.getMarket200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get Shipyard
     * Get the shipyard for a waypoint. Send a ship to the waypoint to access ships that are currently available for purchase and recent transactions.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetShipyardResponse getShipyard(emdash.SpaceTraders.models.operations.GetShipyardRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetShipyardRequest.class, baseUrl, "/systems/{systemSymbol}/waypoints/{waypointSymbol}/shipyard", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetShipyardResponse res = new emdash.SpaceTraders.models.operations.GetShipyardResponse(contentType, httpRes.statusCode()) {{
            getShipyard200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetShipyard200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetShipyard200ApplicationJSON.class);
                res.getShipyard200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get System
     * Get the details of a system.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetSystemResponse getSystem(emdash.SpaceTraders.models.operations.GetSystemRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetSystemRequest.class, baseUrl, "/systems/{systemSymbol}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetSystemResponse res = new emdash.SpaceTraders.models.operations.GetSystemResponse(contentType, httpRes.statusCode()) {{
            getSystem200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetSystem200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetSystem200ApplicationJSON.class);
                res.getSystem200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List Waypoints
     * Fetch all of the waypoints for a given system. System must be charted or a ship must be present to return waypoint details.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetSystemWaypointsResponse getSystemWaypoints(emdash.SpaceTraders.models.operations.GetSystemWaypointsRequest request, emdash.SpaceTraders.models.operations.GetSystemWaypointsSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetSystemWaypointsRequest.class, baseUrl, "/systems/{systemSymbol}/waypoints", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = emdash.SpaceTraders.utils.Utils.getQueryParams(emdash.SpaceTraders.models.operations.GetSystemWaypointsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetSystemWaypointsResponse res = new emdash.SpaceTraders.models.operations.GetSystemWaypointsResponse(contentType, httpRes.statusCode()) {{
            getSystemWaypoints200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetSystemWaypoints200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetSystemWaypoints200ApplicationJSON.class);
                res.getSystemWaypoints200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List Systems
     * Return a list of all systems.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetSystemsResponse getSystems(emdash.SpaceTraders.models.operations.GetSystemsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(baseUrl, "/systems");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        java.util.List<NameValuePair> queryParams = emdash.SpaceTraders.utils.Utils.getQueryParams(emdash.SpaceTraders.models.operations.GetSystemsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetSystemsResponse res = new emdash.SpaceTraders.models.operations.GetSystemsResponse(contentType, httpRes.statusCode()) {{
            getSystems200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetSystems200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetSystems200ApplicationJSON.class);
                res.getSystems200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get Waypoint
     * View the details of a waypoint.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetWaypointResponse getWaypoint(emdash.SpaceTraders.models.operations.GetWaypointRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetWaypointRequest.class, baseUrl, "/systems/{systemSymbol}/waypoints/{waypointSymbol}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetWaypointResponse res = new emdash.SpaceTraders.models.operations.GetWaypointResponse(contentType, httpRes.statusCode()) {{
            getWaypoint200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetWaypoint200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetWaypoint200ApplicationJSON.class);
                res.getWaypoint200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}