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

/**
 * Agents
 */
public class Agents {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Agents(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * My Agent Details
     * Fetch your agent's details.
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetMyAgentResponse getMyAgent(emdash.SpaceTraders.models.operations.GetMyAgentSecurity security) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(baseUrl, "/my/agent");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this._defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetMyAgentResponse res = new emdash.SpaceTraders.models.operations.GetMyAgentResponse(contentType, httpRes.statusCode()) {{
            getMyAgent200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetMyAgent200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetMyAgent200ApplicationJSON.class);
                res.getMyAgent200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}