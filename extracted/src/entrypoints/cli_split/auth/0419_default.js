  __export(adc, {
    default: () => zlf
  });
  var zlf;
  function Mtn() {
    return true;
  }
  function Ntn(e) {
    return (e.voice?.enabled ?? e.voiceEnabled) === true;
  }
  function jdr() {
    try {
      if (!isAnthropicAuthEnabled()) {
        return false;
      }
      return hasStoredOAuthToken();
    } catch {
      return false;
    }
  }
  function qdr() {
    return isPolicyAllowed("allow_voice_mode");
  }
  function JCt() {
    return jdr() && Mtn() && qdr();
  }
  var Ltn = __lazy(() => {
    Kc();
    no();
  });
  var pdc = {};