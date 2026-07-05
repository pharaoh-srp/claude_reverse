  function qX() {
    if (kmo) {
      return kmo;
    }
    let e = X_a();
    if (!e.isSupported) {
      throw Error("@ant/computer-use-input is not supported on this platform");
    }
    return kmo = e;
  }
  var kmo;
  var tba = {};