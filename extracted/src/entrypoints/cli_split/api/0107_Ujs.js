  var Ujs = __commonJS(Rrt => {
    Object.defineProperty(Rrt, "__esModule", {
      value: true
    });
    Rrt.warning = undefined;
    Rrt.stsRegionDefaultResolver = fZu;
    var Fjs = HA();
    var mZu = VB();
    function fZu(e = {}) {
      return (0, mZu.loadConfig)({
        ...Fjs.NODE_REGION_CONFIG_OPTIONS,
        async default() {
          if (!Rrt.warning.silence) {
            console.warn("@aws-sdk - WARN - default STS region of us-east-1 used. See @aws-sdk/credential-providers README and set a region explicitly.");
          }
          return "us-east-1";
        }
      }, {
        ...Fjs.NODE_REGION_CONFIG_FILE_OPTIONS,
        ...e
      });