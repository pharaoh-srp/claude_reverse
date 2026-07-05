  __export(ClientAuthErrorCodes, {
    userTimeoutReached: () => "user_timeout_reached",
    userCanceled: () => "user_canceled",
    unexpectedCredentialType: () => "unexpected_credential_type",
    tokenRefreshRequired: () => "token_refresh_required",
    tokenParsingError: () => "token_parsing_error",
    tokenClaimsCnfRequiredForSignedJwt: () => "token_claims_cnf_required_for_signedjwt",
    stateNotFound: () => "state_not_found",
    stateMismatch: () => "state_mismatch",
    requestCannotBeMade: () => "request_cannot_be_made",
    openIdConfigError: () => "openid_config_error",
    nullOrEmptyToken: () => "null_or_empty_token",
    nonceMismatch: () => "nonce_mismatch",
    noNetworkConnectivity: () => "no_network_connectivity",
    noCryptoObject: () => "no_crypto_object",
    noAccountInSilentRequest: () => "no_account_in_silent_request",
    noAccountFound: () => "no_account_found",
    networkError: () => "network_error",
    nestedAppAuthBridgeDisabled: () => "nested_app_auth_bridge_disabled",
    multipleMatchingTokens: () => "multiple_matching_tokens",
    multipleMatchingAppMetadata: () => "multiple_matching_appMetadata",
    multipleMatchingAccounts: () => "multiple_matching_accounts",
    missingTenantIdError: () => "missing_tenant_id_error",
    methodNotImplemented: () => "method_not_implemented",
    maxAgeTranspired: () => "max_age_transpired",
    keyIdMissing: () => "key_id_missing",
    invalidState: () => "invalid_state",
    invalidClientCredential: () => "invalid_client_credential",
    invalidCacheRecord: () => "invalid_cache_record",
    invalidCacheEnvironment: () => "invalid_cache_environment",
    invalidAssertion: () => "invalid_assertion",
    hashNotDeserialized: () => "hash_not_deserialized",
    endpointResolutionError: () => "endpoints_resolution_error",
    endSessionEndpointNotSupported: () => "end_session_endpoint_not_supported",
    emptyInputScopeSet: () => "empty_input_scopeset",
    deviceCodeUnknownError: () => "device_code_unknown_error",
    deviceCodePollingCancelled: () => "device_code_polling_cancelled",
    deviceCodeExpired: () => "device_code_expired",
    clientInfoEmptyError: () => "client_info_empty_error",
    clientInfoDecodingError: () => "client_info_decoding_error",
    cannotRemoveEmptyScope: () => "cannot_remove_empty_scope",
    cannotAppendScopeSet: () => "cannot_append_scopeset",
    bindingKeyNotRemoved: () => "binding_key_not_removed",
    authorizationCodeMissingFromServerResponse: () => "authorization_code_missing_from_server_response",
    authTimeNotFound: () => "auth_time_not_found"
  });
  var RI = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function rs(e, t) {
    return new ClientAuthError(e, t);
  }
  var Vp;
  var ClientAuthErrorMessage;
  var ClientAuthError;
  var YP = __lazy(() => {
    JY();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    Vp = {
      ["client_info_decoding_error"]: "The client info could not be parsed/decoded correctly",
      ["client_info_empty_error"]: "The client info was empty",
      ["token_parsing_error"]: "Token cannot be parsed",
      ["null_or_empty_token"]: "The token is null or empty",
      ["endpoints_resolution_error"]: "Endpoints cannot be resolved",
      ["network_error"]: "Network request failed",
      ["openid_config_error"]: "Could not retrieve endpoints. Check your authority and verify the .well-known/openid-configuration endpoint returns the required endpoints.",
      ["hash_not_deserialized"]: "The hash parameters could not be deserialized",
      ["invalid_state"]: "State was not the expected format",
      ["state_mismatch"]: "State mismatch error",
      ["state_not_found"]: "State not found",
      ["nonce_mismatch"]: "Nonce mismatch error",
      ["auth_time_not_found"]: "Max Age was requested and the ID token is missing the auth_time variable. auth_time is an optional claim and is not enabled by default - it must be enabled. See https://aka.ms/msaljs/optional-claims for more information.",
      ["max_age_transpired"]: "Max Age is set to 0, or too much time has elapsed since the last end-user authentication.",
      ["multiple_matching_tokens"]: "The cache contains multiple tokens satisfying the requirements. Call AcquireToken again providing more requirements such as authority or account.",
      ["multiple_matching_accounts"]: "The cache contains multiple accounts satisfying the given parameters. Please pass more info to obtain the correct account",
      ["multiple_matching_appMetadata"]: "The cache contains multiple appMetadata satisfying the given parameters. Please pass more info to obtain the correct appMetadata",
      ["request_cannot_be_made"]: "Token request cannot be made without authorization code or refresh token.",
      ["cannot_remove_empty_scope"]: "Cannot remove null or empty scope from ScopeSet",
      ["cannot_append_scopeset"]: "Cannot append ScopeSet",
      ["empty_input_scopeset"]: "Empty input ScopeSet cannot be processed",
      ["device_code_polling_cancelled"]: "Caller has cancelled token endpoint polling during device code flow by setting DeviceCodeRequest.cancel = true.",
      ["device_code_expired"]: "Device code is expired.",
      ["device_code_unknown_error"]: "Device code stopped polling for unknown reasons.",
      ["no_account_in_silent_request"]: "Please pass an account object, silent flow is not supported without account information",
      ["invalid_cache_record"]: "Cache record object was null or undefined.",
      ["invalid_cache_environment"]: "Invalid environment when attempting to create cache entry",
      ["no_account_found"]: "No account found in cache for given key.",
      ["no_crypto_object"]: "No crypto object detected.",
      ["unexpected_credential_type"]: "Unexpected credential type.",
      ["invalid_assertion"]: "Client assertion must meet requirements described in https://tools.ietf.org/html/rfc7515",
      ["invalid_client_credential"]: "Client credential (secret, certificate, or assertion) must not be empty when creating a confidential client. An application should at most have one credential",
      ["token_refresh_required"]: "Cannot return token from cache because it must be refreshed. This may be due to one of the following reasons: forceRefresh parameter is set to true, claims have been requested, there is no cached access token or it is expired.",
      ["user_timeout_reached"]: "User defined timeout for device code polling reached",
      ["token_claims_cnf_required_for_signedjwt"]: "Cannot generate a POP jwt if the token_claims are not populated",
      ["authorization_code_missing_from_server_response"]: "Server response does not contain an authorization code to proceed",
      ["binding_key_not_removed"]: "Could not remove the credential's binding key from storage.",
      ["end_session_endpoint_not_supported"]: "The provided authority does not support logout",
      ["key_id_missing"]: "A keyId value is missing from the requested bound token's cache record and is required to match the token to it's stored binding key.",
      ["no_network_connectivity"]: "No network connectivity. Check your internet connection.",
      ["user_canceled"]: "User cancelled the flow.",
      ["missing_tenant_id_error"]: "A tenant id - not common, organizations, or consumers - must be specified when using the client_credentials flow.",
      ["method_not_implemented"]: "This method has not been implemented",
      ["nested_app_auth_bridge_disabled"]: "The nested app auth bridge is disabled"
    };
    ClientAuthErrorMessage = {
      clientInfoDecodingError: {
        code: "client_info_decoding_error",
        desc: Vp["client_info_decoding_error"]
      },
      clientInfoEmptyError: {
        code: "client_info_empty_error",
        desc: Vp["client_info_empty_error"]
      },
      tokenParsingError: {
        code: "token_parsing_error",
        desc: Vp["token_parsing_error"]
      },
      nullOrEmptyToken: {
        code: "null_or_empty_token",
        desc: Vp["null_or_empty_token"]
      },
      endpointResolutionError: {
        code: "endpoints_resolution_error",
        desc: Vp["endpoints_resolution_error"]
      },
      networkError: {
        code: "network_error",
        desc: Vp["network_error"]
      },
      unableToGetOpenidConfigError: {
        code: "openid_config_error",
        desc: Vp["openid_config_error"]
      },
      hashNotDeserialized: {
        code: "hash_not_deserialized",
        desc: Vp["hash_not_deserialized"]
      },
      invalidStateError: {
        code: "invalid_state",
        desc: Vp["invalid_state"]
      },
      stateMismatchError: {
        code: "state_mismatch",
        desc: Vp["state_mismatch"]
      },
      stateNotFoundError: {
        code: "state_not_found",
        desc: Vp["state_not_found"]
      },
      nonceMismatchError: {
        code: "nonce_mismatch",
        desc: Vp["nonce_mismatch"]
      },
      authTimeNotFoundError: {
        code: "auth_time_not_found",
        desc: Vp["auth_time_not_found"]
      },
      maxAgeTranspired: {
        code: "max_age_transpired",
        desc: Vp["max_age_transpired"]
      },
      multipleMatchingTokens: {
        code: "multiple_matching_tokens",
        desc: Vp["multiple_matching_tokens"]
      },
      multipleMatchingAccounts: {
        code: "multiple_matching_accounts",
        desc: Vp["multiple_matching_accounts"]
      },
      multipleMatchingAppMetadata: {
        code: "multiple_matching_appMetadata",
        desc: Vp["multiple_matching_appMetadata"]
      },
      tokenRequestCannotBeMade: {
        code: "request_cannot_be_made",
        desc: Vp["request_cannot_be_made"]
      },
      removeEmptyScopeError: {
        code: "cannot_remove_empty_scope",
        desc: Vp["cannot_remove_empty_scope"]
      },
      appendScopeSetError: {
        code: "cannot_append_scopeset",
        desc: Vp["cannot_append_scopeset"]
      },
      emptyInputScopeSetError: {
        code: "empty_input_scopeset",
        desc: Vp["empty_input_scopeset"]
      },
      DeviceCodePollingCancelled: {
        code: "device_code_polling_cancelled",
        desc: Vp["device_code_polling_cancelled"]
      },
      DeviceCodeExpired: {
        code: "device_code_expired",
        desc: Vp["device_code_expired"]
      },
      DeviceCodeUnknownError: {
        code: "device_code_unknown_error",
        desc: Vp["device_code_unknown_error"]
      },
      NoAccountInSilentRequest: {
        code: "no_account_in_silent_request",
        desc: Vp["no_account_in_silent_request"]
      },
      invalidCacheRecord: {
        code: "invalid_cache_record",
        desc: Vp["invalid_cache_record"]
      },
      invalidCacheEnvironment: {
        code: "invalid_cache_environment",
        desc: Vp["invalid_cache_environment"]
      },
      noAccountFound: {
        code: "no_account_found",
        desc: Vp["no_account_found"]
      },
      noCryptoObj: {
        code: "no_crypto_object",
        desc: Vp["no_crypto_object"]
      },
      unexpectedCredentialType: {
        code: "unexpected_credential_type",
        desc: Vp["unexpected_credential_type"]
      },
      invalidAssertion: {
        code: "invalid_assertion",
        desc: Vp["invalid_assertion"]
      },
      invalidClientCredential: {
        code: "invalid_client_credential",
        desc: Vp["invalid_client_credential"]
      },
      tokenRefreshRequired: {
        code: "token_refresh_required",
        desc: Vp["token_refresh_required"]
      },
      userTimeoutReached: {
        code: "user_timeout_reached",
        desc: Vp["user_timeout_reached"]
      },
      tokenClaimsRequired: {
        code: "token_claims_cnf_required_for_signedjwt",
        desc: Vp["token_claims_cnf_required_for_signedjwt"]
      },
      noAuthorizationCodeFromServer: {
        code: "authorization_code_missing_from_server_response",
        desc: Vp["authorization_code_missing_from_server_response"]
      },
      bindingKeyNotRemovedError: {
        code: "binding_key_not_removed",
        desc: Vp["binding_key_not_removed"]
      },
      logoutNotSupported: {
        code: "end_session_endpoint_not_supported",
        desc: Vp["end_session_endpoint_not_supported"]
      },
      keyIdMissing: {
        code: "key_id_missing",
        desc: Vp["key_id_missing"]
      },
      noNetworkConnectivity: {
        code: "no_network_connectivity",
        desc: Vp["no_network_connectivity"]
      },
      userCanceledError: {
        code: "user_canceled",
        desc: Vp["user_canceled"]
      },
      missingTenantIdError: {
        code: "missing_tenant_id_error",
        desc: Vp["missing_tenant_id_error"]
      },
      nestedAppAuthBridgeDisabled: {
        code: "nested_app_auth_bridge_disabled",
        desc: Vp["nested_app_auth_bridge_disabled"]
      }
    };
    ClientAuthError = class U0e extends AuthError {
      constructor(e, t) {
        super(e, t ? `${Vp[e]}: ${t}` : Vp[e]);
        this.name = "ClientAuthError";
        Object.setPrototypeOf(this, U0e.prototype);
      }
    };
  });
  var Jst;
  var n6r = __lazy(() => {
    YP();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    Jst = {
      createNewGuid: () => {
        throw rs("method_not_implemented");
      },
      base64Decode: () => {
        throw rs("method_not_implemented");
      },
      base64Encode: () => {
        throw rs("method_not_implemented");
      },
      base64UrlEncode: () => {
        throw rs("method_not_implemented");
      },
      encodeKid: () => {
        throw rs("method_not_implemented");
      },
      async getPublicKeyThumbprint() {
        throw rs("method_not_implemented");
      },
      async removeTokenBindingKey() {
        throw rs("method_not_implemented");
      },
      async clearKeystore() {
        throw rs("method_not_implemented");
      },
      async signJwt() {
        throw rs("method_not_implemented");
      },
      async hashString() {
        throw rs("method_not_implemented");
      }
    };
  });
  class Logger {
    constructor(e, t, n) {
      this.level = LogLevel.Info;
      let r = () => {
        return;
      };
      let o = e || Logger.createDefaultLoggerOptions();
      this.localCallback = o.loggerCallback || r;
      this.piiLoggingEnabled = o.piiLoggingEnabled || false;
      this.level = typeof o.logLevel === "number" ? o.logLevel : LogLevel.Info;
      this.correlationId = o.correlationId || xo.EMPTY_STRING;
      this.packageName = t || xo.EMPTY_STRING;
      this.packageVersion = n || xo.EMPTY_STRING;
    }
    static createDefaultLoggerOptions() {
      return {
        loggerCallback: () => {},
        piiLoggingEnabled: false,
        logLevel: LogLevel.Info
      };
    }
    clone(e, t, n) {
      return new Logger({
        loggerCallback: this.localCallback,
        piiLoggingEnabled: this.piiLoggingEnabled,
        logLevel: this.level,
        correlationId: n || this.correlationId
      }, e, t);
    }
    logMessage(e, t) {
      if (t.logLevel > this.level || !this.piiLoggingEnabled && t.containsPii) {
        return;
      }
      let o = `${`[${new Date().toUTCString()}] : [${t.correlationId || this.correlationId || ""}]`} : ${this.packageName}@${this.packageVersion} : ${LogLevel[t.logLevel]} - ${e}`;
      this.executeCallback(t.logLevel, o, t.containsPii || false);
    }
    executeCallback(e, t, n) {
      if (this.localCallback) {
        this.localCallback(e, t, n);
      }
    }
    error(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Error,
        containsPii: false,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    errorPii(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Error,
        containsPii: true,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    warning(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Warning,
        containsPii: false,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    warningPii(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Warning,
        containsPii: true,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    info(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Info,
        containsPii: false,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    infoPii(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Info,
        containsPii: true,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    verbose(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Verbose,
        containsPii: false,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    verbosePii(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Verbose,
        containsPii: true,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    trace(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Trace,
        containsPii: false,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    tracePii(e, t) {
      this.logMessage(e, {
        logLevel: LogLevel.Trace,
        containsPii: true,
        correlationId: t || xo.EMPTY_STRING
      });
    }
    isPiiLoggingEnabled() {
      return this.piiLoggingEnabled || false;
    }
  }
  var LogLevel;
  var ikn = __lazy(() => {
    aw(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    (function (e) {
      e[e.Error = 0] = "Error";
      e[e.Warning = 1] = "Warning";
      e[e.Info = 2] = "Info";
      e[e.Verbose = 3] = "Verbose";
      e[e.Trace = 4] = "Trace";
    })(LogLevel || (LogLevel = {}));
  });
  var lkn = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  var AzureCloudInstance;
  var ckn = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */AzureCloudInstance = {
      None: "none",
      AzurePublic: "https://login.microsoftonline.com",
      AzurePpe: "https://login.windows-ppe.net",
      AzureChina: "https://login.chinacloudapi.cn",
      AzureGermany: "https://login.microsoftonline.de",
      AzureUsGovernment: "https://login.microsoftonline.us"
    };
  });
  var ClientConfigurationErrorCodes = {};