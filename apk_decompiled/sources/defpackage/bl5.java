package defpackage;

import com.anthropic.claude.configs.MobileObservabilityConfig;
import com.datadog.trace.bootstrap.config.provider.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bl5 implements f89 {
    public static final Set K = mp0.Z0(new String[]{"text/event-stream", "application/grpc", "application/grpc+proto", "application/grpc+json"});
    public static final b79 L = wd6.H0(400, 500);
    public final kw9 E;
    public final h1e F;
    public final Set G;
    public final u0h H;
    public final u0h I;
    public final u0h J;

    public bl5(kw9 kw9Var) {
        g1e g1eVar = h1e.E;
        this.E = kw9Var;
        this.F = g1eVar;
        this.G = sf5.f0(n3i.F);
        final int i = 0;
        this.H = new u0h(new zy7(this) { // from class: al5
            public final /* synthetic */ bl5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() throws IOException {
                Double datadog_request_trace_sample_rate;
                vf4 vf4Var;
                int i2 = i;
                bl5 bl5Var = this.F;
                switch (i2) {
                    case 0:
                        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) ((rc8) bl5Var.E.getValue()).l(MobileObservabilityConfig.CONFIG_NAME, iv1.J(jce.b(MobileObservabilityConfig.class)));
                        return Double.valueOf(wd6.c0((mobileObservabilityConfig == null || (datadog_request_trace_sample_rate = mobileObservabilityConfig.getDatadog_request_trace_sample_rate()) == null) ? 1.0d : datadog_request_trace_sample_rate.doubleValue(), 0.0d, 1.0d));
                    case 1:
                        return Boolean.valueOf(bl5Var.F.c() < ((Number) bl5Var.H.getValue()).doubleValue());
                    default:
                        k99 k99VarA = kj5.a(null);
                        int i3 = ykj.a;
                        h99 h99VarT = k99VarA.t();
                        gbf feature = k99VarA.getFeature("tracing");
                        if7 if7Var = feature != null ? feature.c : null;
                        m3i m3iVar = if7Var instanceof m3i ? (m3i) if7Var : null;
                        tk5 tk5Var = m3iVar != null ? new tk5(0, m3iVar.G) : null;
                        if (tk5Var == null) {
                            tk5Var = null;
                        }
                        sij w4cVar = tk5Var != null ? (sij) tk5Var.F : null;
                        g99 g99Var = g99.E;
                        m3i m3iVar2 = m3iVar;
                        if (if7Var == null) {
                            dch.H(h99VarT, 5, g99Var, yf5.d0, null, false, 56);
                        } else if (m3iVar2 == null) {
                            dch.H(h99VarT, 5, g99.F, yf5.e0, null, false, 56);
                        } else if (w4cVar == null) {
                            dch.H(h99VarT, 5, g99Var, new tnh(18, m3iVar2), null, false, 56);
                        } else if (k99VarA.q().length() == 0) {
                            dch.H(h99VarT, 5, g99Var, yf5.f0, null, false, 56);
                        }
                        String strQ = k99VarA.q();
                        h99 h99VarT2 = k99VarA.t();
                        m35 m35Var = new m35();
                        m35Var.c = new w4c();
                        m35Var.a(vf4.O1);
                        m35Var.m = h99VarT2;
                        if (w4cVar == null) {
                            w4cVar = new w4c();
                        }
                        m35Var.c = w4cVar;
                        strQ.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mp0.Z0(new n3i[]{n3i.E, n3i.F});
                        Set set = bl5Var.G;
                        set.getClass();
                        Properties properties = new Properties();
                        String strS0 = w44.S0(set, ",", null, null, bx.j0, 30);
                        properties.setProperty("trace.propagation.style.extract", strS0);
                        properties.setProperty("trace.propagation.style.inject", strS0);
                        properties.setProperty("service.name", strQ);
                        properties.setProperty("trace.rate.limit", String.valueOf(Integer.MAX_VALUE));
                        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(5));
                        properties.setProperty("trace.URLAsResourceNameRule.enabled", "false");
                        properties.setProperty("v2.compatibility.enabled", String.valueOf(false));
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(entry.getKey() + ":" + entry.getValue());
                        }
                        properties.setProperty("tags", w44.S0(arrayList, ",", null, null, null, 62));
                        vf4 vf4Var2 = vf4.O1;
                        if (properties.isEmpty()) {
                            vf4Var = vf4.O1;
                        } else {
                            b bVar = new b(new gmf(23, properties));
                            vf4Var = new vf4(bVar, new j69(bVar));
                        }
                        m35Var.a(vf4Var);
                        o35 o35Var = new o35(m35Var.a, m35Var.b, m35Var.c, m35Var.d, m35Var.e, m35Var.f, m35Var.g, m35Var.h, m35Var.i, m35Var.j, m35Var.k, m35Var.l, m35Var.n, m35Var.m);
                        yk5 yk5Var = new yk5(k99VarA, o35Var, new unb(16));
                        vz8 vz8Var = new vz8(16);
                        sp4 sp4Var = o35Var.P;
                        if (sp4Var != null) {
                            sp4Var.b.add(vz8Var);
                            sp4Var.a.E("Added scope listener {}", vz8Var);
                            ((t7f) sp4Var.c.get()).getClass();
                        }
                        return yk5Var;
                }
            }
        });
        final int i2 = 1;
        this.I = new u0h(new zy7(this) { // from class: al5
            public final /* synthetic */ bl5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() throws IOException {
                Double datadog_request_trace_sample_rate;
                vf4 vf4Var;
                int i22 = i2;
                bl5 bl5Var = this.F;
                switch (i22) {
                    case 0:
                        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) ((rc8) bl5Var.E.getValue()).l(MobileObservabilityConfig.CONFIG_NAME, iv1.J(jce.b(MobileObservabilityConfig.class)));
                        return Double.valueOf(wd6.c0((mobileObservabilityConfig == null || (datadog_request_trace_sample_rate = mobileObservabilityConfig.getDatadog_request_trace_sample_rate()) == null) ? 1.0d : datadog_request_trace_sample_rate.doubleValue(), 0.0d, 1.0d));
                    case 1:
                        return Boolean.valueOf(bl5Var.F.c() < ((Number) bl5Var.H.getValue()).doubleValue());
                    default:
                        k99 k99VarA = kj5.a(null);
                        int i3 = ykj.a;
                        h99 h99VarT = k99VarA.t();
                        gbf feature = k99VarA.getFeature("tracing");
                        if7 if7Var = feature != null ? feature.c : null;
                        m3i m3iVar = if7Var instanceof m3i ? (m3i) if7Var : null;
                        tk5 tk5Var = m3iVar != null ? new tk5(0, m3iVar.G) : null;
                        if (tk5Var == null) {
                            tk5Var = null;
                        }
                        sij w4cVar = tk5Var != null ? (sij) tk5Var.F : null;
                        g99 g99Var = g99.E;
                        m3i m3iVar2 = m3iVar;
                        if (if7Var == null) {
                            dch.H(h99VarT, 5, g99Var, yf5.d0, null, false, 56);
                        } else if (m3iVar2 == null) {
                            dch.H(h99VarT, 5, g99.F, yf5.e0, null, false, 56);
                        } else if (w4cVar == null) {
                            dch.H(h99VarT, 5, g99Var, new tnh(18, m3iVar2), null, false, 56);
                        } else if (k99VarA.q().length() == 0) {
                            dch.H(h99VarT, 5, g99Var, yf5.f0, null, false, 56);
                        }
                        String strQ = k99VarA.q();
                        h99 h99VarT2 = k99VarA.t();
                        m35 m35Var = new m35();
                        m35Var.c = new w4c();
                        m35Var.a(vf4.O1);
                        m35Var.m = h99VarT2;
                        if (w4cVar == null) {
                            w4cVar = new w4c();
                        }
                        m35Var.c = w4cVar;
                        strQ.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mp0.Z0(new n3i[]{n3i.E, n3i.F});
                        Set set = bl5Var.G;
                        set.getClass();
                        Properties properties = new Properties();
                        String strS0 = w44.S0(set, ",", null, null, bx.j0, 30);
                        properties.setProperty("trace.propagation.style.extract", strS0);
                        properties.setProperty("trace.propagation.style.inject", strS0);
                        properties.setProperty("service.name", strQ);
                        properties.setProperty("trace.rate.limit", String.valueOf(Integer.MAX_VALUE));
                        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(5));
                        properties.setProperty("trace.URLAsResourceNameRule.enabled", "false");
                        properties.setProperty("v2.compatibility.enabled", String.valueOf(false));
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(entry.getKey() + ":" + entry.getValue());
                        }
                        properties.setProperty("tags", w44.S0(arrayList, ",", null, null, null, 62));
                        vf4 vf4Var2 = vf4.O1;
                        if (properties.isEmpty()) {
                            vf4Var = vf4.O1;
                        } else {
                            b bVar = new b(new gmf(23, properties));
                            vf4Var = new vf4(bVar, new j69(bVar));
                        }
                        m35Var.a(vf4Var);
                        o35 o35Var = new o35(m35Var.a, m35Var.b, m35Var.c, m35Var.d, m35Var.e, m35Var.f, m35Var.g, m35Var.h, m35Var.i, m35Var.j, m35Var.k, m35Var.l, m35Var.n, m35Var.m);
                        yk5 yk5Var = new yk5(k99VarA, o35Var, new unb(16));
                        vz8 vz8Var = new vz8(16);
                        sp4 sp4Var = o35Var.P;
                        if (sp4Var != null) {
                            sp4Var.b.add(vz8Var);
                            sp4Var.a.E("Added scope listener {}", vz8Var);
                            ((t7f) sp4Var.c.get()).getClass();
                        }
                        return yk5Var;
                }
            }
        });
        final int i3 = 2;
        this.J = new u0h(new zy7(this) { // from class: al5
            public final /* synthetic */ bl5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() throws IOException {
                Double datadog_request_trace_sample_rate;
                vf4 vf4Var;
                int i22 = i3;
                bl5 bl5Var = this.F;
                switch (i22) {
                    case 0:
                        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) ((rc8) bl5Var.E.getValue()).l(MobileObservabilityConfig.CONFIG_NAME, iv1.J(jce.b(MobileObservabilityConfig.class)));
                        return Double.valueOf(wd6.c0((mobileObservabilityConfig == null || (datadog_request_trace_sample_rate = mobileObservabilityConfig.getDatadog_request_trace_sample_rate()) == null) ? 1.0d : datadog_request_trace_sample_rate.doubleValue(), 0.0d, 1.0d));
                    case 1:
                        return Boolean.valueOf(bl5Var.F.c() < ((Number) bl5Var.H.getValue()).doubleValue());
                    default:
                        k99 k99VarA = kj5.a(null);
                        int i32 = ykj.a;
                        h99 h99VarT = k99VarA.t();
                        gbf feature = k99VarA.getFeature("tracing");
                        if7 if7Var = feature != null ? feature.c : null;
                        m3i m3iVar = if7Var instanceof m3i ? (m3i) if7Var : null;
                        tk5 tk5Var = m3iVar != null ? new tk5(0, m3iVar.G) : null;
                        if (tk5Var == null) {
                            tk5Var = null;
                        }
                        sij w4cVar = tk5Var != null ? (sij) tk5Var.F : null;
                        g99 g99Var = g99.E;
                        m3i m3iVar2 = m3iVar;
                        if (if7Var == null) {
                            dch.H(h99VarT, 5, g99Var, yf5.d0, null, false, 56);
                        } else if (m3iVar2 == null) {
                            dch.H(h99VarT, 5, g99.F, yf5.e0, null, false, 56);
                        } else if (w4cVar == null) {
                            dch.H(h99VarT, 5, g99Var, new tnh(18, m3iVar2), null, false, 56);
                        } else if (k99VarA.q().length() == 0) {
                            dch.H(h99VarT, 5, g99Var, yf5.f0, null, false, 56);
                        }
                        String strQ = k99VarA.q();
                        h99 h99VarT2 = k99VarA.t();
                        m35 m35Var = new m35();
                        m35Var.c = new w4c();
                        m35Var.a(vf4.O1);
                        m35Var.m = h99VarT2;
                        if (w4cVar == null) {
                            w4cVar = new w4c();
                        }
                        m35Var.c = w4cVar;
                        strQ.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mp0.Z0(new n3i[]{n3i.E, n3i.F});
                        Set set = bl5Var.G;
                        set.getClass();
                        Properties properties = new Properties();
                        String strS0 = w44.S0(set, ",", null, null, bx.j0, 30);
                        properties.setProperty("trace.propagation.style.extract", strS0);
                        properties.setProperty("trace.propagation.style.inject", strS0);
                        properties.setProperty("service.name", strQ);
                        properties.setProperty("trace.rate.limit", String.valueOf(Integer.MAX_VALUE));
                        properties.setProperty("trace.partial.flush.min.spans", String.valueOf(5));
                        properties.setProperty("trace.URLAsResourceNameRule.enabled", "false");
                        properties.setProperty("v2.compatibility.enabled", String.valueOf(false));
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(entry.getKey() + ":" + entry.getValue());
                        }
                        properties.setProperty("tags", w44.S0(arrayList, ",", null, null, null, 62));
                        vf4 vf4Var2 = vf4.O1;
                        if (properties.isEmpty()) {
                            vf4Var = vf4.O1;
                        } else {
                            b bVar = new b(new gmf(23, properties));
                            vf4Var = new vf4(bVar, new j69(bVar));
                        }
                        m35Var.a(vf4Var);
                        o35 o35Var = new o35(m35Var.a, m35Var.b, m35Var.c, m35Var.d, m35Var.e, m35Var.f, m35Var.g, m35Var.h, m35Var.i, m35Var.j, m35Var.k, m35Var.l, m35Var.n, m35Var.m);
                        yk5 yk5Var = new yk5(k99VarA, o35Var, new unb(16));
                        vz8 vz8Var = new vz8(16);
                        sp4 sp4Var = o35Var.P;
                        if (sp4Var != null) {
                            sp4Var.b.add(vz8Var);
                            sp4Var.a.E("Added scope listener {}", vz8Var);
                            ((t7f) sp4Var.c.get()).getClass();
                        }
                        return yk5Var;
                }
            }
        });
    }

    public static Long a(pqe pqeVar) {
        String str;
        try {
            rqe rqeVar = pqeVar.K;
            p8b p8bVarE = rqeVar.e();
            if (p8bVarE != null) {
                str = p8bVarE.b + "/" + p8bVarE.c;
            } else {
                str = null;
            }
            if (!w44.G0(K, str)) {
                String strA = pqeVar.J.a("Sec-WebSocket-Accept");
                if (strA == null) {
                    strA = null;
                }
                if (strA == null || bsg.I0(strA)) {
                    long jD = rqeVar.d();
                    Long lValueOf = Long.valueOf(jD);
                    if (jD < 0) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        return lValueOf;
                    }
                    long j = pqeVar.d(33554432L).G;
                    Long lValueOf2 = Long.valueOf(j);
                    if (j >= 0) {
                        return lValueOf2;
                    }
                }
            }
        } catch (IOException | IllegalStateException unused) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0275  */
    @Override // defpackage.f89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pqe c(defpackage.v4e r31) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl5.c(v4e):pqe");
    }
}
