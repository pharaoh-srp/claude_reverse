  var UP = __commonJS(Qnt => {
    var WLr = {
      warningEmitted: false
    };
    var o5u = e => {
      if (e && !WLr.warningEmitted && parseInt(e.substring(1, e.indexOf("."))) < 18) {
        WLr.warningEmitted = true;
        process.emitWarning(`NodeDeprecationWarning: The AWS SDK for JavaScript (v3) will
no longer support Node.js 16.x on January 6, 2025.

To continue receiving updates to AWS services, bug fixes, and security
updates please upgrade to a supported Node.js LTS version.

More information can be found at: https://a.co/74kJMmI`);
      }
    };
    function s5u(e, t, n) {
      if (!e.$source) {
        e.$source = {};
      }
      e.$source[t] = n;
      return e;
    }
    function i5u(e, t, n) {
      if (!e.__aws_sdk_context) {
        e.__aws_sdk_context = {
          features: {}
        };
      } else if (!e.__aws_sdk_context.features) {
        e.__aws_sdk_context.features = {};
      }
      e.__aws_sdk_context.features[t] = n;
    }
    function a5u(e, t, n) {
      if (!e.$source) {
        e.$source = {};
      }
      e.$source[t] = n;
      return e;
    }
    Qnt.emitWarningIfUnsupportedVersion = o5u;
    Qnt.setCredentialFeature = s5u;
    Qnt.setFeature = i5u;
    Qnt.setTokenFeature = a5u;
    Qnt.state = WLr;
  });