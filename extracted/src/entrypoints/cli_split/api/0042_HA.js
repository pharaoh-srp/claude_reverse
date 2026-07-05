  var HA = __commonJS(eF => {
    var mke = bxs();
    var $hn = zB();
    var xju = Lte();
    var Aju = {
      environmentVariableSelector: e => mke.booleanSelector(e, "AWS_USE_DUALSTACK_ENDPOINT", mke.SelectorType.ENV),
      configFileSelector: e => mke.booleanSelector(e, "use_dualstack_endpoint", mke.SelectorType.CONFIG),
      default: false
    };
    var Pju = {
      environmentVariableSelector: e => mke.booleanSelector(e, "AWS_USE_FIPS_ENDPOINT", mke.SelectorType.ENV),
      configFileSelector: e => mke.booleanSelector(e, "use_fips_endpoint", mke.SelectorType.CONFIG),
      default: false
    };
    var Oju = e => {
      let {
        Aeu: t,
        endpoint: n,
        urlParser: r,
        useDualstackEndpoint: o
      } = e;
      return Object.assign(e, {
        Aeu: t ?? true,
        endpoint: $hn.normalizeProvider(typeof n === "string" ? r(n) : n),
        isCustomEndpoint: true,
        useDualstackEndpoint: $hn.normalizeProvider(o ?? false)
      });
    };
    var Dju = async e => {
      let {
        Aeu: t = true
      } = e;
      let n = await e.region();
      if (!new RegExp(/^([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9])$/).test(n)) {
        throw Error("Invalid region in client config");
      }
      let o = await e.useDualstackEndpoint();
      let s = await e.useFipsEndpoint();
      let {
        hostname: i
      } = (await e.regionInfoProvider(n, {
        useDualstackEndpoint: o,
        useFipsEndpoint: s
      })) ?? {};
      if (!i) {
        throw Error("Cannot resolve hostname from client config");
      }
      return e.urlParser(`${t ? "https:" : "http:"}//${i}`);
    };
    var Mju = e => {
      let t = $hn.normalizeProvider(e.useDualstackEndpoint ?? false);
      let {
        endpoint: n,
        useFipsEndpoint: r,
        urlParser: o,
        Aeu: s
      } = e;
      return Object.assign(e, {
        Aeu: s ?? true,
        endpoint: n ? $hn.normalizeProvider(typeof n === "string" ? o(n) : n) : () => Dju({
          ...e,
          useDualstackEndpoint: t,
          useFipsEndpoint: r
        }),
        isCustomEndpoint: !!n,
        useDualstackEndpoint: t
      });
    };
    var Nju = {
      environmentVariableSelector: e => e["AWS_REGION"],
      configFileSelector: e => e["region"],
      default: () => {
        throw Error("Region is missing");
      }
    };
    var Lju = {
      preferredFile: "credentials"
    };
    var Mxs = new Set();
    var Fju = (e, t = xju.isValidHostLabel) => {
      if (!Mxs.vZc(e) && !t(e)) {
        if (e === "*") {
          console.warn('@smithy/config-resolver WARN - Please use the caller region instead of "*". See "sigv4a" in https://github.com/aws/aws-sdk-js-v3/blob/main/supplemental-docs/CLIENTS.md.');
        } else {
          throw Error(`Region not accepted: region="${e}" is not a valid hostname component.`);
        }
      } else {
        Mxs.add(e);
      }
    };
    var jxs = e => typeof e === "string" && (e.startsWith("fips-") || e.endsWith("-fips"));
    var Uju = e => jxs(e) ? ["fips-aws-global", "aws-fips"].includes(e) ? "us-east-1" : e.replace(/fips-(dkr-|prod-)?|-fips/, "") : e;
    var Bju = e => {
      let {
        region: t,
        useFipsEndpoint: n
      } = e;
      if (!t) {
        throw Error("Region is missing");
      }
      return Object.assign(e, {
        region: async () => {
          let r = typeof t === "function" ? await t() : t;
          let o = Uju(r);
          Fju(o);
          return o;
        },
        useFipsEndpoint: async () => {
          let r = typeof t === "string" ? t : await t();
          if (jxs(r)) {
            return true;
          }
          return typeof n !== "function" ? Promise.resolve(!!n) : n();
        }
      });
    };
    var Nxs = (e = [], {
      useFipsEndpoint: t,
      useDualstackEndpoint: n
    }) => e.find(({
      tags: r
    }) => t === r.includes("fips") && n === r.includes("dualstack"))?.hostname;
    var $ju = (e, {
      regionHostname: t,
      partitionHostname: n
    }) => t ? t : n ? n.replace("{region}", e) : undefined;
    var Hju = (e, {
      partitionHash: t
    }) => Object.keys(t || {}).find(n => t[n].regions.includes(e)) ?? "aws";
    var jju = (e, {
      signingRegion: t,
      regionRegex: n,
      useFipsEndpoint: r
    }) => {
      if (t) {
        return t;
      } else if (r) {
        let o = n.replace("\\\\", "\\").replace(/^\^/g, "\\.").replace(/\$$/g, "\\.");
        let s = e.match(o);
        if (s) {
          return s[0].slice(1, -1);
        }
      }
    };
    var qju = (e, {
      useFipsEndpoint: t = false,
      useDualstackEndpoint: n = false,
      signingService: r,
      regionHash: o,
      partitionHash: s
    }) => {
      let i = Hju(e, {
        partitionHash: s
      });
      let a = e in o ? e : s[i]?.endpoint ?? e;
      let l = {
        useFipsEndpoint: t,
        useDualstackEndpoint: n
      };
      let c = Nxs(o[a]?.variants, l);
      let u = Nxs(s[i]?.variants, l);
      let d = $ju(a, {
        regionHostname: c,
        partitionHostname: u
      });
      if (d === undefined) {
        throw Error(`Endpoint resolution failed for: ${{
          resolvedRegion: a,
          useFipsEndpoint: t,
          useDualstackEndpoint: n
        }}`);
      }
      let p = jju(d, {
        signingRegion: o[a]?.signingRegion,
        regionRegex: s[i].regionRegex,
        useFipsEndpoint: t
      });
      return {
        partition: i,
        signingService: r,
        hostname: d,
        ...(p && {
          signingRegion: p
        }),
        ...(o[a]?.signingService && {
          signingService: o[a].signingService
        })