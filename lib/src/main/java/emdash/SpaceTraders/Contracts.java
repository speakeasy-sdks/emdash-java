/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders;

import com.fasterxml.jackson.databind.ObjectMapper;
import emdash.SpaceTraders.utils.HTTPClient;
import emdash.SpaceTraders.utils.HTTPRequest;
import emdash.SpaceTraders.utils.JSON;
import emdash.SpaceTraders.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

/**
 * Contracts
 */
public class Contracts {
	
	private SDKConfiguration sdkConfiguration;

	public Contracts(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Accept Contract
     * Accept a contract.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.AcceptContractResponse acceptContract(emdash.SpaceTraders.models.operations.AcceptContractRequest request, emdash.SpaceTraders.models.operations.AcceptContractSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.AcceptContractRequest.class, baseUrl, "/my/contracts/{contractId}/accept", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.AcceptContractResponse res = new emdash.SpaceTraders.models.operations.AcceptContractResponse(contentType, httpRes.statusCode()) {{
            acceptContract200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.AcceptContract200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.AcceptContract200ApplicationJSON.class);
                res.acceptContract200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Deliver Contract
     * Deliver cargo on a given contract.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.DeliverContractResponse deliverContract(emdash.SpaceTraders.models.operations.DeliverContractRequest request, emdash.SpaceTraders.models.operations.DeliverContractSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.DeliverContractRequest.class, baseUrl, "/my/contracts/{contractId}/deliver", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = emdash.SpaceTraders.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.DeliverContractResponse res = new emdash.SpaceTraders.models.operations.DeliverContractResponse(contentType, httpRes.statusCode()) {{
            deliverContract200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.DeliverContract200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.DeliverContract200ApplicationJSON.class);
                res.deliverContract200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Fulfill Contract
     * Fulfill a contract
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.FulfillContractResponse fulfillContract(emdash.SpaceTraders.models.operations.FulfillContractRequest request, emdash.SpaceTraders.models.operations.FulfillContractSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.FulfillContractRequest.class, baseUrl, "/my/contracts/{contractId}/fulfill", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.FulfillContractResponse res = new emdash.SpaceTraders.models.operations.FulfillContractResponse(contentType, httpRes.statusCode()) {{
            fulfillContract200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.FulfillContract200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.FulfillContract200ApplicationJSON.class);
                res.fulfillContract200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get Contract
     * Get the details of a contract by ID.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetContractResponse getContract(emdash.SpaceTraders.models.operations.GetContractRequest request, emdash.SpaceTraders.models.operations.GetContractSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(emdash.SpaceTraders.models.operations.GetContractRequest.class, baseUrl, "/my/contracts/{contractId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetContractResponse res = new emdash.SpaceTraders.models.operations.GetContractResponse(contentType, httpRes.statusCode()) {{
            getContract200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetContract200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetContract200ApplicationJSON.class);
                res.getContract200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List Contracts
     * List all of your contracts.
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetContractsResponse getContracts(emdash.SpaceTraders.models.operations.GetContractsRequest request, emdash.SpaceTraders.models.operations.GetContractsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(baseUrl, "/my/contracts");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        java.util.List<NameValuePair> queryParams = emdash.SpaceTraders.utils.Utils.getQueryParams(emdash.SpaceTraders.models.operations.GetContractsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetContractsResponse res = new emdash.SpaceTraders.models.operations.GetContractsResponse(contentType, httpRes.statusCode()) {{
            getContracts200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetContracts200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetContracts200ApplicationJSON.class);
                res.getContracts200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}