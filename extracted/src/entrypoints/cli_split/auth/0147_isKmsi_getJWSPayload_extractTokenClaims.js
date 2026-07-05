  __export(fkn, {
    isKmsi: () => isKmsi,
    getJWSPayload: () => getJWSPayload,
    extractTokenClaims: () => extractTokenClaims,
    checkMaxAge: () => checkMaxAge
  });
  function extractTokenClaims(e, t) {
    let n = getJWSPayload(e);
    try {
      let r = t(n);
      return JSON.parse(r);
    } catch (r) {
      throw rs("token_parsing_error");
    }
  }
  function isKmsi(e) {
    if (!e.signin_state) {
      return false;
    }
    let t = ["kmsi", "dvc_dmjd"];
    return e.signin_state.some(r => t.includes(r.trim().toLowerCase()));
  }
  function getJWSPayload(e) {
    if (!e) {
      throw rs("null_or_empty_token");
    }
    let n = /^([^\.\s]*)\.([^\.\s]+)\.([^\.\s]*)$/.exec(e);
    if (!n || n.length < 4) {
      throw rs("token_parsing_error");
    }
    return n[2];
  }
  function checkMaxAge(e, t) {
    if (t === 0 || Date.now() - 300000 > e + t) {
      throw rs("max_age_transpired");
    }
  }
  var nit = __lazy(() => {
    YP();
    RI(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  var MF = {};