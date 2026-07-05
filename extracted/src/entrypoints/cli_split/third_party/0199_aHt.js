  var aHt = __commonJS((ycy, q9i) => {
    var oVd = Number.MAX_SAFE_INTEGER || 9007199254740991;
    var sVd = ["major", "premajor", "minor", "preminor", "patch", "prepatch", "prerelease"];
    q9i.exports = {
      MAX_LENGTH: 256,
      MAX_SAFE_COMPONENT_LENGTH: 16,
      MAX_SAFE_BUILD_LENGTH: 250,
      MAX_SAFE_INTEGER: oVd,
      RELEASE_TYPES: sVd,
      SEMVER_SPEC_VERSION: "2.0.0",
      FLAG_INCLUDE_PRERELEASE: 1,
      FLAG_LOOSE: 2
    };
  });
  var lHt = __commonJS((_cy, W9i) => {
    var iVd = typeof process === "object" && process.env && process.env.NODE_DEBUG && /\bsemver\b/i.test(process.env.NODE_DEBUG) ? (...e) => console.error("SEMVER", ...e) : () => {};
    W9i.exports = iVd;
  });