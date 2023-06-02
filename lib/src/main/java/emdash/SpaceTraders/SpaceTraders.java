/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package emdash.SpaceTraders;

import com.fasterxml.jackson.databind.ObjectMapper;
import emdash.SpaceTraders.utils.HTTPClient;
import emdash.SpaceTraders.utils.HTTPRequest;
import emdash.SpaceTraders.utils.JSON;
import emdash.SpaceTraders.utils.SerializedBody;
import emdash.SpaceTraders.utils.SpeakeasyHTTPClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * SpaceTraders is an open-universe game and learning platform that offers a set of HTTP endpoints to control a fleet of ships and explore a multiplayer universe.
 * 
 * The API is documented using [OpenAPI](https://github.com/SpaceTradersAPI/api-docs). You can send your first request right here in your browser to check the status of the game server.
 * 
 * ```json http
 * {
 *   "method": "GET",
 *   "url": "https://api.spacetraders.io/v2",
 * }
 * ```
 * 
 * Unlike a traditional game, SpaceTraders does not have a first-party client or app to play the game. Instead, you can use the API to build your own client, write a script to automate your ships, or try an app built by the community.
 * 
 * We have a [Discord channel](https://discord.com/invite/jh6zurdWk5) where you can share your projects, ask questions, and get help from other players.
 * 
 * 
 * 
 */
public class SpaceTraders {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        /**
         * v2
         */
        "https://api.spacetraders.io/v2",
	};
	
	
  	
    /**
     * Agents
     */
    public Agents agents;
    /**
     * Contracts
     */
    public Contracts contracts;
    /**
     * Factions
     */
    public Factions factions;
    /**
     * Fleet
     */
    public Fleet fleet;
    /**
     * Systems
     */
    public Systems systems;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private emdash.SpaceTraders.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.1.1";
	private String _genVersion = "2.34.7";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		private emdash.SpaceTraders.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(emdash.SpaceTraders.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SpaceTraders build() throws Exception {
			return new SpaceTraders(this.client, this.security, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SpaceTraders(HTTPClient client, emdash.SpaceTraders.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = emdash.SpaceTraders.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = emdash.SpaceTraders.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}

		if (this._serverUrl.endsWith("/")) {
            this._serverUrl = this._serverUrl.substring(0, this._serverUrl.length() - 1);
        }

		
		
		this.agents = new Agents(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.contracts = new Contracts(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.factions = new Factions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.fleet = new Fleet(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.systems = new Systems(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}

    /**
     * Get Status
     * Return the status of the game server.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.GetStatusResponse getStatus() throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(baseUrl, "/");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.GetStatusResponse res = new emdash.SpaceTraders.models.operations.GetStatusResponse(contentType, httpRes.statusCode()) {{
            getStatus200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.GetStatus200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.GetStatus200ApplicationJSON.class);
                res.getStatus200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Register New Agent
     * Creates a new agent and ties it to a temporary Account.
     * 
     * The agent symbol is a 3-14 character string that will represent your agent. This symbol will prefix the symbol of every ship you own. Agent symbols will be cast to all uppercase characters.
     * 
     * A new agent will be granted an authorization token, a contract with their starting faction, a command ship with a jump drive, and one hundred thousand credits.
     * 
     * &gt; #### Keep your token safe and secure
     * &gt;
     * &gt; Save your token during the alpha phase. There is no way to regenerate this token without starting a new agent. In the future you will be able to generate and manage your tokens from the SpaceTraders website.
     * 
     * You can accept your contract using the `/my/contracts/{contractId}/accept` endpoint. You will want to navigate your command ship to a nearby asteroid field and execute the `/my/ships/{shipSymbol}/extract` endpoint to mine various types of ores and minerals.
     * 
     * Return to the contract destination and execute the `/my/ships/{shipSymbol}/deliver` endpoint to deposit goods into the contract.
     * 
     * When your contract is fulfilled, you can call `/my/contracts/{contractId}/fulfill` to retrieve payment.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public emdash.SpaceTraders.models.operations.RegisterResponse register(emdash.SpaceTraders.models.operations.RegisterRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = emdash.SpaceTraders.utils.Utils.generateURL(baseUrl, "/register");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = emdash.SpaceTraders.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        emdash.SpaceTraders.models.operations.RegisterResponse res = new emdash.SpaceTraders.models.operations.RegisterResponse(contentType, httpRes.statusCode()) {{
            register201ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (emdash.SpaceTraders.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                emdash.SpaceTraders.models.operations.Register201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), emdash.SpaceTraders.models.operations.Register201ApplicationJSON.class);
                res.register201ApplicationJSONObject = out;
            }
        }

        return res;
    }
}