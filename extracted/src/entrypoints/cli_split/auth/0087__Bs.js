  var _Bs;
  var bBs;
  var wUr;
  var ubn = ({
    logger: e,
    signingName: t
  } = {}) => async () => {
    if (e?.debug?.("@aws-sdk/token-providers - fromEnvSigningName"), !t) {
      throw new wUr.TokenProviderError("Please pass 'signingName' to compute environment variable key", {
        logger: e
      });
    }
    let n = bBs.getBearerTokenEnvKey(t);
    if (!(n in process.env)) {
      throw new wUr.TokenProviderError(`Token not present in '${n}' environment variable`, {
        logger: e
      });
    }
    let r = {
      token: process.env[n]
    };
    _Bs.setTokenFeature(r, "BEARER_SERVICE_ENV_VARS", "3");
    return r;
  };
  var SBs = __lazy(() => {
    _Bs = __toESM(UP(), 1);
    bBs = __toESM(yBs(), 1);
    wUr = __toESM(wy(), 1);
  });