package defpackage;

import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m35 {
    public vf4 a;
    public String b;
    public sij c;
    public c4f d;
    public yj5 e;
    public HashMap f;
    public HashMap g;
    public HashMap h;
    public HashMap i;
    public HashMap j;
    public int k;
    public boolean l;
    public h99 m;
    public boolean n;

    public final void a(vf4 vf4Var) {
        String str;
        this.a = vf4Var;
        String str2 = vf4Var.e;
        HashMap map = vf4Var.C;
        this.b = str2;
        String strSubstring = null;
        this.d = fd9.V(vf4Var, null);
        Map mapSingletonMap = Collections.singletonMap("runtime-id", vf4Var.b ? uf4.a : "");
        HashMap map2 = new HashMap(mapSingletonMap.size() + 2);
        map2.putAll(mapSingletonMap);
        map2.put("language", DebugImage.JVM);
        map2.put("_dd.trace_span_attribute_schema", Integer.valueOf(bgg.a.F));
        map2.put("_dd.profiling.enabled", Integer.valueOf((vf4Var.x0 && vf4Var.a.f) ? 1 : 0));
        if (vf4Var.o0 && (str = sf4.a) != null && !str.isEmpty()) {
            map2.put("_dd.hostname", str);
        }
        if (vf4Var.D1) {
            HashMap map3 = new HashMap();
            String strA = vf4.a("WEBSITE_SITE_NAME");
            if (strA != null) {
                map3.put("aas.site.name", strA);
            }
            if (vf4.a("FUNCTIONS_WORKER_RUNTIME") == null && vf4.a("FUNCTIONS_EXTENSIONS_VERSION") == null) {
                map3.put("aas.site.kind", "app");
                map3.put("aas.site.type", "app");
            } else {
                map3.put("aas.site.kind", "functionapp");
                map3.put("aas.site.type", "function");
            }
            String strA2 = vf4.a("WEBSITE_RESOURCE_GROUP");
            if (strA2 != null) {
                map3.put("aas.resource.group", strA2);
            }
            String strA3 = vf4.a("WEBSITE_OWNER_NAME");
            int iIndexOf = strA3 == null ? -1 : strA3.indexOf("+");
            if (iIndexOf > 0) {
                strSubstring = strA3.substring(0, iIndexOf);
                map3.put("aas.subscription.id", strSubstring);
            }
            if (strSubstring != null && strA != null && strA2 != null) {
                StringBuilder sbR = kgh.r("/subscriptions/", strSubstring, "/resourcegroups/", strA2, "/providers/microsoft.web/sites/");
                sbR.append(strA);
                map3.put("aas.resource.id", sbR.toString().toLowerCase(Locale.ROOT));
            }
            String strA4 = vf4.a("WEBSITE_INSTANCE_ID");
            if (strA4 == null) {
                strA4 = "unknown";
            }
            map3.put("aas.environment.instance_id", strA4);
            String strA5 = vf4.a("COMPUTERNAME");
            if (strA5 == null) {
                strA5 = "unknown";
            }
            map3.put("aas.environment.instance_name", strA5);
            String strA6 = vf4.a("WEBSITE_OS");
            if (strA6 == null) {
                strA6 = "unknown";
            }
            map3.put("aas.environment.os", strA6);
            String strA7 = vf4.a("DD_AAS_JAVA_EXTENSION_VERSION");
            if (strA7 == null) {
                strA7 = "unknown";
            }
            map3.put("aas.environment.extension_version", strA7);
            String property = System.getProperty("java.vm.name", "unknown");
            if (property != null) {
                xf4.b.a(3, property, "java.vm.name");
            }
            map3.put("aas.environment.runtime", property);
            map2.putAll(map3);
        }
        map2.putAll(Collections.singletonMap("process_id", Long.valueOf(t2d.a)));
        this.f = new HashMap(Collections.unmodifiableMap(map2));
        Map map4 = vf4Var.y;
        int size = map4.size();
        HashMap map5 = vf4Var.z;
        HashMap map6 = new HashMap(map5.size() + size + 1, 1.0f);
        map6.putAll(map4);
        map6.putAll(map5);
        this.g = new HashMap(Collections.unmodifiableMap(map6));
        this.h = new HashMap(vf4Var.x);
        this.i = new HashMap(vf4Var.A);
        this.j = new HashMap(map);
        this.k = vf4Var.X;
        this.l = vf4Var.Y;
        this.n = vf4Var.j;
        this.e = new yj5(4, new ArrayList(d4c.J(vf4Var, vf4Var.b0, o35.a(map)).values()));
    }
}
