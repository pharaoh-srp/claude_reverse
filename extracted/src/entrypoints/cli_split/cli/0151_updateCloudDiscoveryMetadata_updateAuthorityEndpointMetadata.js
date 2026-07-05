  __export(qj, {
    updateCloudDiscoveryMetadata: () => updateCloudDiscoveryMetadata,
    updateAuthorityEndpointMetadata: () => updateAuthorityEndpointMetadata,
    isThrottlingEntity: () => isThrottlingEntity,
    isServerTelemetryEntity: () => isServerTelemetryEntity,
    isRefreshTokenEntity: () => isRefreshTokenEntity,
    isIdTokenEntity: () => isIdTokenEntity,
    isCredentialEntity: () => isCredentialEntity,
    isAuthorityMetadataExpired: () => isAuthorityMetadataExpired,
    isAuthorityMetadataEntity: () => isAuthorityMetadataEntity,
    isAppMetadataEntity: () => isAppMetadataEntity,
    isAccessTokenEntity: () => isAccessTokenEntity,
    generateAuthorityMetadataExpiresAt: () => generateAuthorityMetadataExpiresAt,
    generateAppMetadataKey: () => generateAppMetadataKey,
    createRefreshTokenEntity: () => createRefreshTokenEntity,
    createIdTokenEntity: () => createIdTokenEntity,
    createAccessTokenEntity: () => createAccessTokenEntity
  });
  function createIdTokenEntity(e, t, n, r, o) {
    return {
      credentialType: aS.ID_TOKEN,
      homeAccountId: e,
      environment: t,
      clientId: r,
      secret: n,
      realm: o,
      lastUpdatedAt: Date.now().toString()
    };
  }
  function createAccessTokenEntity(e, t, n, r, o, s, i, a, l, c, u, d, p, m, f) {
    let h = {
      homeAccountId: e,
      credentialType: aS.ACCESS_TOKEN,
      secret: n,
      cachedAt: nowSeconds().toString(),
      expiresOn: i.toString(),
      extendedExpiresOn: a.toString(),
      environment: t,
      clientId: r,
      realm: o,
      target: s,
      tokenType: u || Hh.BEARER,
      lastUpdatedAt: Date.now().toString()
    };
    if (d) {
      h.userAssertionHash = d;
    }
    if (c) {
      h.refreshOn = c.toString();
    }
    if (m) {
      h.requestedClaims = m;
      h.requestedClaimsHash = f;
    }
    if (h.tokenType?.toLowerCase() !== Hh.BEARER.toLowerCase()) {
      switch (h.credentialType = aS.ACCESS_TOKEN_WITH_AUTH_SCHEME, h.tokenType) {
        case Hh.POP:
          let g = extractTokenClaims(n, l);
          if (!g?.cnf?.kid) {
            throw rs("token_claims_cnf_required_for_signedjwt");
          }
          h.keyId = g.cnf.kid;
          break;
        case Hh.SSH:
          h.keyId = p;
      }
    }
    return h;
  }
  function createRefreshTokenEntity(e, t, n, r, o, s, i) {
    let a = {
      credentialType: aS.REFRESH_TOKEN,
      homeAccountId: e,
      environment: t,
      clientId: r,
      secret: n,
      lastUpdatedAt: Date.now().toString()
    };
    if (s) {
      a.userAssertionHash = s;
    }
    if (o) {
      a.familyId = o;
    }
    if (i) {
      a.expiresOn = i.toString();
    }
    return a;
  }
  function isCredentialEntity(e) {
    return e.hasOwnProperty("homeAccountId") && e.hasOwnProperty("environment") && e.hasOwnProperty("credentialType") && e.hasOwnProperty("clientId") && e.hasOwnProperty("secret");
  }
  function isAccessTokenEntity(e) {
    if (!e) {
      return false;
    }
    return isCredentialEntity(e) && e.hasOwnProperty("realm") && e.hasOwnProperty("target") && (e.credentialType === aS.ACCESS_TOKEN || e.credentialType === aS.ACCESS_TOKEN_WITH_AUTH_SCHEME);
  }
  function isIdTokenEntity(e) {
    if (!e) {
      return false;
    }
    return isCredentialEntity(e) && e.hasOwnProperty("realm") && e.credentialType === aS.ID_TOKEN;
  }
  function isRefreshTokenEntity(e) {
    if (!e) {
      return false;
    }
    return isCredentialEntity(e) && e.credentialType === aS.REFRESH_TOKEN;
  }
  function isServerTelemetryEntity(e, t) {
    let n = e.indexOf(ZD.CACHE_KEY) === 0;
    let r = true;
    if (t) {
      r = t.hasOwnProperty("failedRequests") && t.hasOwnProperty("errors") && t.hasOwnProperty("cacheHits");
    }
    return n && r;
  }
  function isThrottlingEntity(e, t) {
    let n = false;
    if (e) {
      n = e.indexOf(dce.THROTTLING_PREFIX) === 0;
    }
    let r = true;
    if (t) {
      r = t.hasOwnProperty("throttleTime");
    }
    return n && r;
  }
  function generateAppMetadataKey({
    environment: e,
    clientId: t
  }) {
    return ["appmetadata", e, t].join(N_e.CACHE_KEY_SEPARATOR).toLowerCase();
  }
  function isAppMetadataEntity(e, t) {
    if (!t) {
      return false;
    }
    return e.indexOf("appmetadata") === 0 && t.hasOwnProperty("clientId") && t.hasOwnProperty("environment");
  }
  function isAuthorityMetadataEntity(e, t) {
    if (!t) {
      return false;
    }
    return e.indexOf(zst.CACHE_KEY) === 0 && t.hasOwnProperty("aliases") && t.hasOwnProperty("preferred_cache") && t.hasOwnProperty("preferred_network") && t.hasOwnProperty("canonical_authority") && t.hasOwnProperty("authorization_endpoint") && t.hasOwnProperty("token_endpoint") && t.hasOwnProperty("issuer") && t.hasOwnProperty("aliasesFromNetwork") && t.hasOwnProperty("endpointsFromNetwork") && t.hasOwnProperty("expiresAt") && t.hasOwnProperty("jwks_uri");
  }
  function generateAuthorityMetadataExpiresAt() {
    return nowSeconds() + zst.REFRESH_TIME_SECONDS;
  }
  function updateAuthorityEndpointMetadata(e, t, n) {
    e.authorization_endpoint = t.authorization_endpoint;
    e.token_endpoint = t.token_endpoint;
    e.end_session_endpoint = t.end_session_endpoint;
    e.issuer = t.issuer;
    e.endpointsFromNetwork = n;
    e.jwks_uri = t.jwks_uri;
  }
  function updateCloudDiscoveryMetadata(e, t, n) {
    e.aliases = t.aliases;
    e.preferred_cache = t.preferred_cache;
    e.preferred_network = t.preferred_network;
    e.aliasesFromNetwork = n;
  }
  function isAuthorityMetadataExpired(e) {
    return e.expiresAt <= nowSeconds();
  }
  var kkn = __lazy(() => {
    nit();
    YP();
    aw();
    G0e();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  class eM {
    constructor(e, t, n, r, o, s, i, a) {
      this.canonicalAuthority = e;
      this._canonicalAuthority.validateAsUri();
      this.networkInterface = t;
      this.cacheManager = n;
      this.authorityOptions = r;
      this.regionDiscoveryMetadata = {
        region_used: undefined,
        region_source: undefined,
        region_outcome: undefined
      };
      this.logger = o;
      this.performanceClient = i;
      this.correlationId = s;
      this.managedIdentity = a || false;
      this.regionDiscovery = new RUt(t, this.logger, this.performanceClient, this.correlationId);
    }
    getAuthorityType(e) {
      if (e.HostNameAndPort.endsWith(xo.CIAM_AUTH_URL)) {
        return XY.Ciam;
      }
      let t = e.PathSegments;
      if (t.length) {
        switch (t[0].toLowerCase()) {
          case xo.ADFS:
            return XY.Adfs;
          case xo.DSTS:
            return XY.Dsts;
        }
      }
      return XY.Default;
    }
    get authorityType() {
      return this.getAuthorityType(this.canonicalAuthorityUrlComponents);
    }
    get protocolMode() {
      return this.authorityOptions.protocolMode;
    }
    get options() {
      return this.authorityOptions;
    }
    get canonicalAuthority() {
      return this._canonicalAuthority.urlString;
    }
    set canonicalAuthority(e) {
      this._canonicalAuthority = new bm(e);
      this._canonicalAuthority.validateAsUri();
      this._canonicalAuthorityUrlComponents = null;
    }
    get canonicalAuthorityUrlComponents() {
      if (!this._canonicalAuthorityUrlComponents) {
        this._canonicalAuthorityUrlComponents = this._canonicalAuthority.getUrlComponents();
      }
      return this._canonicalAuthorityUrlComponents;
    }
    get hostnameAndPort() {
      return this.canonicalAuthorityUrlComponents.HostNameAndPort.toLowerCase();
    }
    get tenant() {
      return this.canonicalAuthorityUrlComponents.PathSegments[0];
    }
    get authorizationEndpoint() {
      if (this.discoveryComplete()) {
        return this.replacePath(this.metadata.authorization_endpoint);
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    get tokenEndpoint() {
      if (this.discoveryComplete()) {
        return this.replacePath(this.metadata.token_endpoint);
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    get deviceCodeEndpoint() {
      if (this.discoveryComplete()) {
        return this.replacePath(this.metadata.token_endpoint.replace("/token", "/devicecode"));
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    get endSessionEndpoint() {
      if (this.discoveryComplete()) {
        if (!this.metadata.end_session_endpoint) {
          throw rs("end_session_endpoint_not_supported");
        }
        return this.replacePath(this.metadata.end_session_endpoint);
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    get selfSignedJwtAudience() {
      if (this.discoveryComplete()) {
        return this.replacePath(this.metadata.issuer);
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    get jwksUri() {
      if (this.discoveryComplete()) {
        return this.replacePath(this.metadata.jwks_uri);
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    canReplaceTenant(e) {
      return e.PathSegments.length === 1 && !eM.reservedTenantDomains.vZc(e.PathSegments[0]) && this.getAuthorityType(e) === XY.Default && this.protocolMode !== ProtocolMode.OIDC;
    }
    replaceTenant(e) {
      return e.replace(/{tenant}|{tenantid}/g, this.tenant);
    }
    replacePath(e) {
      let t = e;
      let r = new bm(this.metadata.canonical_authority).getUrlComponents();
      let o = r.PathSegments;
      this.canonicalAuthorityUrlComponents.PathSegments.forEach((i, a) => {
        let l = o[a];
        if (a === 0 && this.canReplaceTenant(r)) {
          let c = new bm(this.metadata.authorization_endpoint).getUrlComponents().PathSegments[0];
          if (l !== c) {
            this.logger.verbose(`Replacing tenant domain name ${l} with id ${c}`);
            l = c;
          }
        }
        if (i !== l) {
          t = t.replace(`/${l}/`, `/${i}/`);
        }
      });
      return this.replaceTenant(t);
    }
    get defaultOpenIdConfigurationEndpoint() {
      let e = this.hostnameAndPort;
      if (this.canonicalAuthority.endsWith("v2.0/") || this.authorityType === XY.Adfs || this.protocolMode === ProtocolMode.OIDC && !this.isAliasOfKnownMicrosoftAuthority(e)) {
        return `${this.canonicalAuthority}.well-known/openid-configuration`;
      }
      return `${this.canonicalAuthority}v2.0/.well-known/openid-configuration`;
    }
    discoveryComplete() {
      return !!this.metadata;
    }
    async resolveEndpointsAsync() {
      this.performanceClient?.addQueueMeasurement(io.AuthorityResolveEndpointsAsync, this.correlationId);
      let e = this.getCurrentMetadataEntity();
      let t = await yg(this.updateCloudDiscoveryMetadata.bind(this), io.AuthorityUpdateCloudDiscoveryMetadata, this.logger, this.performanceClient, this.correlationId)(e);
      this.canonicalAuthority = this.canonicalAuthority.replace(this.hostnameAndPort, e.preferred_network);
      let n = await yg(this.updateEndpointMetadata.bind(this), io.AuthorityUpdateEndpointMetadata, this.logger, this.performanceClient, this.correlationId)(e);
      this.updateCachedMetadata(e, t, {
        source: n
      });
      this.performanceClient?.addFields({
        cloudDiscoverySource: t,
        authorityEndpointSource: n
      }, this.correlationId);
    }
    getCurrentMetadataEntity() {
      let e = this.cacheManager.getAuthorityMetadataByAlias(this.hostnameAndPort);
      if (!e) {
        e = {
          aliases: [],
          preferred_cache: this.hostnameAndPort,
          preferred_network: this.hostnameAndPort,
          canonical_authority: this.canonicalAuthority,
          authorization_endpoint: "",
          token_endpoint: "",
          end_session_endpoint: "",
          issuer: "",
          aliasesFromNetwork: false,
          endpointsFromNetwork: false,
          expiresAt: generateAuthorityMetadataExpiresAt(),
          jwks_uri: ""
        };
      }
      return e;
    }
    updateCachedMetadata(e, t, n) {
      if (t !== $j.CACHE && n?.source !== $j.CACHE) {
        e.expiresAt = generateAuthorityMetadataExpiresAt();
        e.canonical_authority = this.canonicalAuthority;
      }
      let r = this.cacheManager.generateAuthorityMetadataCacheKey(e.preferred_cache);
      this.cacheManager.setAuthorityMetadata(r, e);
      this.metadata = e;
    }
    async updateEndpointMetadata(e) {
      this.performanceClient?.addQueueMeasurement(io.AuthorityUpdateEndpointMetadata, this.correlationId);
      let t = this.updateEndpointMetadataFromLocalSources(e);
      if (t) {
        if (t.source === $j.HARDCODED_VALUES) {
          if (this.authorityOptions.azureRegionConfiguration?.azureRegion) {
            if (t.metadata) {
              let r = await yg(this.updateMetadataWithRegionalInformation.bind(this), io.AuthorityUpdateMetadataWithRegionalInformation, this.logger, this.performanceClient, this.correlationId)(t.metadata);
              updateAuthorityEndpointMetadata(e, r, false);
              e.canonical_authority = this.canonicalAuthority;
            }
          }
        }
        return t.source;
      }
      let n = await yg(this.getEndpointMetadataFromNetwork.bind(this), io.AuthorityGetEndpointMetadataFromNetwork, this.logger, this.performanceClient, this.correlationId)();
      if (n) {
        if (this.authorityOptions.azureRegionConfiguration?.azureRegion) {
          n = await yg(this.updateMetadataWithRegionalInformation.bind(this), io.AuthorityUpdateMetadataWithRegionalInformation, this.logger, this.performanceClient, this.correlationId)(n);
        }
        updateAuthorityEndpointMetadata(e, n, true);
        return $j.NETWORK;
      } else {
        throw rs("openid_config_error", this.defaultOpenIdConfigurationEndpoint);
      }
    }
    updateEndpointMetadataFromLocalSources(e) {
      this.logger.verbose("Attempting to get endpoint metadata from authority configuration");
      let t = this.getEndpointMetadataFromConfig();
      if (t) {
        this.logger.verbose("Found endpoint metadata in authority configuration");
        updateAuthorityEndpointMetadata(e, t, false);
        return {
          source: $j.CONFIG
        };
      }
      if (this.logger.verbose("Did not find endpoint metadata in the config... Attempting to get endpoint metadata from the hardcoded values."), this.authorityOptions.skipAuthorityMetadataCache) {
        this.logger.verbose("Skipping hardcoded metadata cache since skipAuthorityMetadataCache is set to true. Attempting to get endpoint metadata from the network metadata cache.");
      } else {
        let r = this.getEndpointMetadataFromHardcodedValues();
        if (r) {
          updateAuthorityEndpointMetadata(e, r, false);
          return {
            source: $j.HARDCODED_VALUES,
            metadata: r
          };
        } else {
          this.logger.verbose("Did not find endpoint metadata in hardcoded values... Attempting to get endpoint metadata from the network metadata cache.");
        }
      }
      let n = isAuthorityMetadataExpired(e);
      if (this.isAuthoritySameType(e) && e.endpointsFromNetwork && !n) {
        this.logger.verbose("Found endpoint metadata in the cache.");
        return {
          source: $j.CACHE
        };
      } else if (n) {
        this.logger.verbose("The metadata entity is expired.");
      }
      return null;
    }
    isAuthoritySameType(e) {
      return new bm(e.canonical_authority).getUrlComponents().PathSegments.length === this.canonicalAuthorityUrlComponents.PathSegments.length;
    }
    getEndpointMetadataFromConfig() {
      if (this.authorityOptions.authorityMetadata) {
        try {
          return JSON.parse(this.authorityOptions.authorityMetadata);
        } catch (e) {
          throw JT("invalid_authority_metadata");
        }
      }
      return null;
    }
    async getEndpointMetadataFromNetwork() {
      this.performanceClient?.addQueueMeasurement(io.AuthorityGetEndpointMetadataFromNetwork, this.correlationId);
      let e = {};
      let t = this.defaultOpenIdConfigurationEndpoint;
      this.logger.verbose(`Authority.getEndpointMetadataFromNetwork: attempting to retrieve OAuth endpoints from ${t}`);
      try {
        let n = await this.networkInterface.sendGetRequestAsync(t, e);
        if (pvi(n.body)) {
          return n.body;
        } else {
          this.logger.verbose("Authority.getEndpointMetadataFromNetwork: could not parse response as OpenID configuration");
          return null;
        }
      } catch (n) {
        this.logger.verbose(`Authority.getEndpointMetadataFromNetwork: ${n}`);
        return null;
      }
    }
    getEndpointMetadataFromHardcodedValues() {
      if (this.hostnameAndPort in l6r) {
        return l6r[this.hostnameAndPort];
      }
      return null;
    }
    async updateMetadataWithRegionalInformation(e) {
      this.performanceClient?.addQueueMeasurement(io.AuthorityUpdateMetadataWithRegionalInformation, this.correlationId);
      let t = this.authorityOptions.azureRegionConfiguration?.azureRegion;
      if (t) {
        if (t !== xo.AZURE_REGION_AUTO_DISCOVER_FLAG) {
          this.regionDiscoveryMetadata.region_outcome = okn.CONFIGURED_NO_AUTO_DETECTION;
          this.regionDiscoveryMetadata.region_used = t;
          return eM.replaceWithRegionalInformation(e, t);
        }
        let n = await yg(this.regionDiscovery.detectRegion.bind(this.regionDiscovery), io.RegionDiscoveryDetectRegion, this.logger, this.performanceClient, this.correlationId)(this.authorityOptions.azureRegionConfiguration?.environmentRegion, this.regionDiscoveryMetadata);
        if (n) {
          this.regionDiscoveryMetadata.region_outcome = okn.AUTO_DETECTION_REQUESTED_SUCCESSFUL;
          this.regionDiscoveryMetadata.region_used = n;
          return eM.replaceWithRegionalInformation(e, n);
        }
        this.regionDiscoveryMetadata.region_outcome = okn.AUTO_DETECTION_REQUESTED_FAILED;
      }
      return e;
    }
    async updateCloudDiscoveryMetadata(e) {
      this.performanceClient?.addQueueMeasurement(io.AuthorityUpdateCloudDiscoveryMetadata, this.correlationId);
      let t = this.updateCloudDiscoveryMetadataFromLocalSources(e);
      if (t) {
        return t;
      }
      let n = await yg(this.getCloudDiscoveryMetadataFromNetwork.bind(this), io.AuthorityGetCloudDiscoveryMetadataFromNetwork, this.logger, this.performanceClient, this.correlationId)();
      if (n) {
        updateCloudDiscoveryMetadata(e, n, true);
        return $j.NETWORK;
      }
      throw JT("untrusted_authority");
    }
    updateCloudDiscoveryMetadataFromLocalSources(e) {
      this.logger.verbose("Attempting to get cloud discovery metadata  from authority configuration");
      this.logger.verbosePii(`Known Authorities: ${this.authorityOptions.knownAuthorities || xo.NOT_APPLICABLE}`);
      this.logger.verbosePii(`Authority Metadata: ${this.authorityOptions.authorityMetadata || xo.NOT_APPLICABLE}`);
      this.logger.verbosePii(`Canonical Authority: ${e.canonical_authority || xo.NOT_APPLICABLE}`);
      let t = this.getCloudDiscoveryMetadataFromConfig();
      if (t) {
        this.logger.verbose("Found cloud discovery metadata in authority configuration");
        updateCloudDiscoveryMetadata(e, t, false);
        return $j.CONFIG;
      }
      if (this.logger.verbose("Did not find cloud discovery metadata in the config... Attempting to get cloud discovery metadata from the hardcoded values."), this.options.skipAuthorityMetadataCache) {
        this.logger.verbose("Skipping hardcoded cloud discovery metadata cache since skipAuthorityMetadataCache is set to true. Attempting to get cloud discovery metadata from the network metadata cache.");
      } else {
        let r = svi(this.hostnameAndPort);
        if (r) {
          this.logger.verbose("Found cloud discovery metadata from hardcoded values.");
          updateCloudDiscoveryMetadata(e, r, false);
          return $j.HARDCODED_VALUES;
        }
        this.logger.verbose("Did not find cloud discovery metadata in hardcoded values... Attempting to get cloud discovery metadata from the network metadata cache.");
      }
      let n = isAuthorityMetadataExpired(e);
      if (this.isAuthoritySameType(e) && e.aliasesFromNetwork && !n) {
        this.logger.verbose("Found cloud discovery metadata in the cache.");
        return $j.CACHE;
      } else if (n) {
        this.logger.verbose("The metadata entity is expired.");
      }
      return null;
    }
    getCloudDiscoveryMetadataFromConfig() {
      if (this.authorityType === XY.Ciam) {
        this.logger.verbose("CIAM authorities do not support cloud discovery metadata, generate the aliases from authority host.");
        return eM.createCloudDiscoveryMetadataFromHost(this.hostnameAndPort);
      }
      if (this.authorityOptions.cloudDiscoveryMetadata) {
        this.logger.verbose("The cloud discovery metadata has been provided as a network response, in the config.");
        try {
          this.logger.verbose("Attempting to parse the cloud discovery metadata.");
          let e = JSON.parse(this.authorityOptions.cloudDiscoveryMetadata);
          let t = uUt(e.metadata, this.hostnameAndPort);
          if (this.logger.verbose("Parsed the cloud discovery metadata."), t) {
            this.logger.verbose("There is returnable metadata attached to the parsed cloud discovery metadata.");
            return t;
          } else {
            this.logger.verbose("There is no metadata attached to the parsed cloud discovery metadata.");
          }
        } catch (e) {
          throw this.logger.verbose("Unable to parse the cloud discovery metadata. Throwing Invalid Cloud Discovery Metadata Error."), JT("invalid_cloud_discovery_metadata");
        }
      }
      if (this.isInKnownAuthorities()) {
        this.logger.verbose("The host is included in knownAuthorities. Creating new cloud discovery metadata from the host.");
        return eM.createCloudDiscoveryMetadataFromHost(this.hostnameAndPort);
      }
      return null;
    }
    async getCloudDiscoveryMetadataFromNetwork() {
      this.performanceClient?.addQueueMeasurement(io.AuthorityGetCloudDiscoveryMetadataFromNetwork, this.correlationId);
      let e = `${xo.AAD_INSTANCE_DISCOVERY_ENDPT}${this.canonicalAuthority}oauth2/v2.0/authorize`;
      let t = {};
      let n = null;
      try {
        let r = await this.networkInterface.sendGetRequestAsync(e, t);
        let o;
        let s;
        if (fvi(r.body)) {
          o = r.body;
          s = o.metadata;
          this.logger.verbosePii(`tenant_discovery_endpoint is: ${o.tenant_discovery_endpoint}`);
        } else if (gvi(r.body)) {
          if (this.logger.warning(`A CloudInstanceDiscoveryErrorResponse was returned. The cloud instance discovery network request's status code is: ${r.status}`), o = r.body, o.error === xo.INVALID_INSTANCE) {
            this.logger.error("The CloudInstanceDiscoveryErrorResponse error is invalid_instance.");
            return null;
          }
          this.logger.warning(`The CloudInstanceDiscoveryErrorResponse error is ${o.error}`);
          this.logger.warning(`The CloudInstanceDiscoveryErrorResponse error description is ${o.error_description}`);
          this.logger.warning("Setting the value of the CloudInstanceDiscoveryMetadata (returned from the network) to []");
          s = [];
        } else {
          this.logger.error("AAD did not return a CloudInstanceDiscoveryResponse or CloudInstanceDiscoveryErrorResponse");
          return null;
        }
        this.logger.verbose("Attempting to find a match between the developer's authority and the CloudInstanceDiscoveryMetadata returned from the network request.");
        n = uUt(s, this.hostnameAndPort);
      } catch (r) {
        if (r instanceof AuthError) {
          this.logger.error(`There was a network error while attempting to get the cloud discovery instance metadata.
Error: ${r.errorCode}
Error Description: ${r.errorMessage}`);
        } else {
          let o = r;
          this.logger.error(`A non-MSALJS error was thrown while attempting to get the cloud instance discovery metadata.
Error: ${o.name}
Error Description: ${o.message}`);
        }
        return null;
      }
      if (!n) {
        this.logger.warning("The developer's authority was not found within the CloudInstanceDiscoveryMetadata returned from the network request.");
        this.logger.verbose("Creating custom Authority for custom domain scenario.");
        n = eM.createCloudDiscoveryMetadataFromHost(this.hostnameAndPort);
      }
      return n;
    }
    isInKnownAuthorities() {
      return this.authorityOptions.knownAuthorities.filter(t => t && bm.getDomainFromUrl(t).toLowerCase() === this.hostnameAndPort).length > 0;
    }
    static generateAuthority(e, t) {
      let n;
      if (t && t.azureCloudInstance !== AzureCloudInstance.None) {
        let r = t.tenant ? t.tenant : xo.DEFAULT_COMMON_TENANT;
        n = `${t.azureCloudInstance}/${r}/`;
      }
      return n ? n : e;
    }
    static createCloudDiscoveryMetadataFromHost(e) {
      return {
        preferred_network: e,
        preferred_cache: e,
        aliases: [e]
      };
    }
    getPreferredCache() {
      if (this.managedIdentity) {
        return xo.DEFAULT_AUTHORITY_HOST;
      } else if (this.discoveryComplete()) {
        return this.metadata.preferred_cache;
      } else {
        throw rs("endpoints_resolution_error");
      }
    }
    isAlias(e) {
      return this.metadata.aliases.indexOf(e) > -1;
    }
    isAliasOfKnownMicrosoftAuthority(e) {
      return u6r.vZc(e);
    }
    static isPublicCloudAuthority(e) {
      return xo.KNOWN_PUBLIC_CLOUDS.indexOf(e) >= 0;
    }
    static buildRegionalAuthorityString(e, t, n) {
      let r = new bm(e);
      r.validateAsUri();
      let o = r.getUrlComponents();
      let s = `${t}.${o.HostNameAndPort}`;
      if (this.isPublicCloudAuthority(o.HostNameAndPort)) {
        s = `${t}.${xo.REGIONAL_AUTH_PUBLIC_CLOUD_SUFFIX}`;
      }
      let i = bm.constructAuthorityUriFromObject({
        ...r.getUrlComponents(),
        HostNameAndPort: s
      }).urlString;
      if (n) {
        return `${i}?${n}`;
      }
      return i;
    }
    static replaceWithRegionalInformation(e, t) {
      let n = {
        ...e
      };
      if (n.authorization_endpoint = eM.buildRegionalAuthorityString(n.authorization_endpoint, t), n.token_endpoint = eM.buildRegionalAuthorityString(n.token_endpoint, t), n.end_session_endpoint) {
        n.end_session_endpoint = eM.buildRegionalAuthorityString(n.end_session_endpoint, t);
      }
      return n;
    }
    static transformCIAMAuthority(e) {
      let t = e;
      let r = new bm(e).getUrlComponents();
      if (r.PathSegments.length === 0 && r.HostNameAndPort.endsWith(xo.CIAM_AUTH_URL)) {
        let o = r.HostNameAndPort.split(".")[0];
        t = `${t}${o}${xo.AAD_TENANT_DOMAIN_SUFFIX}`;
      }
      return t;
    }
  }
  function Svi(e) {
    let r = new bm(e).getUrlComponents().PathSegments.slice(-1)[0]?.toLowerCase();
    switch (r) {
      case LW.COMMON:
      case LW.ORGANIZATIONS:
      case LW.CONSUMERS:
        return;
      default:
        return r;
    }
  }
  function Akn(e) {
    return e.endsWith(xo.FORWARD_SLASH) ? e : `${e}${xo.FORWARD_SLASH}`;
  }
  function h8r(e) {
    let t = e.cloudDiscoveryMetadata;
    let n = undefined;
    if (t) {
      try {
        n = JSON.parse(t);
      } catch (r) {
        throw JT("invalid_cloud_discovery_metadata");
      }
    }
    return {
      canonicalAuthority: e.authority ? Akn(e.authority) : undefined,
      knownAuthorities: e.knownAuthorities,
      cloudDiscoveryMetadata: n
    };
  }
  var Ikn = __lazy(() => {
    o6r();
    mvi();
    q0e();
    YP();
    aw();
    d6r();
    H0e();
    lUt();
    ckn();
    hvi();
    yvi();
    bvi();
    JY();
    wne();
    z_e();
    kkn();
    RI();
    j_e(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    eM.reservedTenantDomains = new Set(["{tenant}", "{tenantid}", LW.COMMON, LW.CONSUMERS, LW.ORGANIZATIONS]);
  });
  var Pkn = {};