  var zbo = __commonJS(uEe => {
    Object.defineProperty(uEe, "__esModule", {
      value: true
    });
    uEe.childDepType = uEe.depTypeGreater = uEe.DepType = undefined;
    var Yp;
    (function (e) {
      e[e.PROD = 0] = "PROD";
      e[e.DEV = 1] = "DEV";
      e[e.OPTIONAL = 2] = "OPTIONAL";
      e[e.DEV_OPTIONAL = 3] = "DEV_OPTIONAL";
      e[e.ROOT = 4] = "ROOT";
    })(Yp = uEe.DepType || (uEe.DepType = {}));
    var t$p = (e, t) => {
      switch (t) {
        case Yp.DEV:
          switch (e) {
            case Yp.OPTIONAL:
            case Yp.PROD:
            case Yp.ROOT:
              return true;
            case Yp.DEV:
            case Yp.DEV_OPTIONAL:
            default:
              return false;
          }
        case Yp.DEV_OPTIONAL:
          switch (e) {
            case Yp.OPTIONAL:
            case Yp.PROD:
            case Yp.ROOT:
            case Yp.DEV:
              return true;
            case Yp.DEV_OPTIONAL:
            default:
              return false;
          }
        case Yp.OPTIONAL:
          switch (e) {
            case Yp.PROD:
            case Yp.ROOT:
              return true;
            case Yp.OPTIONAL:
            case Yp.DEV:
            case Yp.DEV_OPTIONAL:
            default:
              return false;
          }
        case Yp.PROD:
          switch (e) {
            case Yp.ROOT:
              return true;
            case Yp.PROD:
            case Yp.OPTIONAL:
            case Yp.DEV:
            case Yp.DEV_OPTIONAL:
            default:
              return false;
          }
        case Yp.ROOT:
          switch (e) {
            case Yp.ROOT:
            case Yp.PROD:
            case Yp.OPTIONAL:
            case Yp.DEV:
            case Yp.DEV_OPTIONAL:
            default:
              return false;
          }
        default:
          return false;
      }
    };
    uEe.depTypeGreater = t$p;
    var n$p = (e, t) => {
      if (t === Yp.ROOT) {
        throw Error("Something went wrong, a child dependency can't be marked as the ROOT");
      }
      switch (e) {
        case Yp.ROOT:
          return t;
        case Yp.PROD:
          if (t === Yp.OPTIONAL) {
            return Yp.OPTIONAL;
          }
          return Yp.PROD;
        case Yp.OPTIONAL:
          return Yp.OPTIONAL;
        case Yp.DEV_OPTIONAL:
          return Yp.DEV_OPTIONAL;
        case Yp.DEV:
          if (t === Yp.OPTIONAL) {
            return Yp.DEV_OPTIONAL;
          }
          return Yp.DEV;
      }
    };
    uEe.childDepType = n$p;
  });