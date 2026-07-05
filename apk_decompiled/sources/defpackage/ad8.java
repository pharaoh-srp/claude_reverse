package defpackage;

import com.anthropic.claude.api.account.GrowthBookExperiment;
import com.anthropic.claude.api.account.GrowthBookExperimentResult;
import com.anthropic.claude.api.account.GrowthBookFeature;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class ad8 implements rc8 {
    public final bg9 a;
    public final vg5 b;
    public final l45 c;
    public final boolean d;
    public fzc e = fzc.H;
    public Map f;
    public String g;
    public JsonObject h;
    public boolean i;
    public final LinkedHashMap j;
    public Map k;
    public final lsc l;
    public final LinkedHashMap m;
    public final ConcurrentHashMap n;
    public final lsc o;

    public ad8(bg9 bg9Var, vg5 vg5Var, l45 l45Var, b4e b4eVar, boolean z) {
        this.a = bg9Var;
        this.b = vg5Var;
        this.c = l45Var;
        this.d = z;
        nm6 nm6Var = nm6.E;
        this.f = nm6Var;
        this.j = new LinkedHashMap();
        this.k = nm6Var;
        this.l = new lsc(iei.a, ql8.J);
        this.m = new LinkedHashMap();
        this.n = new ConcurrentHashMap();
        this.o = mpk.P(Boolean.FALSE);
    }

    public final void a() {
        kwb kwbVarC;
        this.m.clear();
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            try {
                this.l.setValue(iei.a);
                kwbVarC.w().p();
            } finally {
                rcg.q(rcgVarJ2);
            }
        } finally {
        }
    }

    @Override // defpackage.rc8
    public final boolean b() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.anthropic.claude.api.account.GrowthBookSchema r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wc8
            if (r0 == 0) goto L13
            r0 = r6
            wc8 r0 = (defpackage.wc8) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            wc8 r0 = new wc8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            com.anthropic.claude.api.account.GrowthBookSchema r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L49
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r6)
            boolean r6 = r4.d
            if (r6 != 0) goto L36
            goto L49
        L36:
            boolean r6 = r4.b()
            if (r6 != 0) goto L49
            r0.E = r5
            r0.H = r2
            java.lang.Object r6 = r4.u(r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L49
            return r0
        L49:
            java.util.Map r6 = r5.getFeatures()
            r4.f = r6
            java.lang.String r6 = r5.getHashing_algorithm()
            r4.g = r6
            kotlinx.serialization.json.JsonObject r5 = r5.getUser()
            r4.h = r5
            java.util.LinkedHashMap r5 = r4.m
            r5.clear()
            lsc r5 = r4.o
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.setValue(r6)
            rcg r5 = defpackage.ycg.j()
            boolean r6 = r5 instanceof defpackage.kwb
            if (r6 == 0) goto L72
            kwb r5 = (defpackage.kwb) r5
            goto L73
        L72:
            r5 = r3
        L73:
            if (r5 == 0) goto La1
            kwb r5 = r5.C(r3, r3)
            if (r5 == 0) goto La1
            rcg r6 = r5.j()     // Catch: java.lang.Throwable -> L94
            iei r0 = defpackage.iei.a     // Catch: java.lang.Throwable -> L96
            lsc r4 = r4.l     // Catch: java.lang.Throwable -> L96
            r4.setValue(r0)     // Catch: java.lang.Throwable -> L96
            defpackage.rcg.q(r6)     // Catch: java.lang.Throwable -> L94
            iuj r4 = r5.w()
            r4.p()
            r5.c()
            return r0
        L94:
            r4 = move-exception
            goto L9b
        L96:
            r4 = move-exception
            defpackage.rcg.q(r6)     // Catch: java.lang.Throwable -> L94
            throw r4     // Catch: java.lang.Throwable -> L94
        L9b:
            throw r4     // Catch: java.lang.Throwable -> L9c
        L9c:
            r4 = move-exception
            r5.c()
            throw r4
        La1:
            java.lang.String r4 = "Cannot create a mutable snapshot of an read-only snapshot"
            defpackage.sz6.j(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad8.c(com.anthropic.claude.api.account.GrowthBookSchema, vp4):java.lang.Object");
    }

    @Override // defpackage.rc8
    public final wlg d() {
        return mpk.x(new dg7(this, 1), a5.N);
    }

    @Override // defpackage.rc8
    public final void e() {
        this.k = nm6.E;
        a();
        v();
    }

    @Override // defpackage.rc8
    public final wlg f(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        return mpk.x(new tc8(this, str, kSerializer, 0), a5.N);
    }

    @Override // defpackage.rc8
    public final wlg g(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        return mpk.x(new tc8(this, str, kSerializer, 1), a5.N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rc8
    public final void h(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        this.k = sta.m0(this.k, new cpc(str, new GrowthBookFeature(jsonElement, (List) null, 2, (mq5) (0 == true ? 1 : 0))));
        a();
        v();
    }

    @Override // defpackage.rc8
    public final Object i(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        try {
            return l(str, kSerializer);
        } catch (Throwable th) {
            SilentException.a(new SilentException("Failed to parse feature ".concat(str), th), ozf.G, false, 2);
            return null;
        }
    }

    @Override // defpackage.rc8
    public final void j(String str) {
        str.getClass();
        this.k = sta.i0(str, this.k);
        a();
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rc8
    public final void k(String str, boolean z) {
        str.getClass();
        this.k = sta.m0(this.k, new cpc(str, new GrowthBookFeature((JsonElement) ch9.a(Boolean.valueOf(z)), (List) null, 2, (mq5) (0 == true ? 1 : 0))));
        a();
        v();
    }

    @Override // defpackage.rc8
    public final Object l(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        pg7 pg7VarT = t(str, kSerializer);
        if (pg7VarT != null) {
            return pg7VarT.c;
        }
        return null;
    }

    @Override // defpackage.rc8
    public final wlg m(String str) {
        return mpk.x(new vc8(this, 0, str), a5.N);
    }

    @Override // defpackage.rc8
    public final pg7 n(String str) {
        str.getClass();
        return s(str);
    }

    @Override // defpackage.rc8
    public final boolean o(String str) {
        pg7 pg7VarS = s(str);
        if (pg7VarS != null) {
            return pg7VarS.b.getOn();
        }
        return false;
    }

    @Override // defpackage.rc8
    public final void p() {
        this.e = fzc.H;
    }

    @Override // defpackage.rc8
    public final Set q() {
        return w44.t1(this.k.keySet());
    }

    @Override // defpackage.rc8
    public final void r(k4i k4iVar) {
        k4iVar.getClass();
        fzc fzcVar = this.e;
        iyc iycVar = fzcVar.G;
        if (!iycVar.containsKey(k4iVar)) {
            if (fzcVar.isEmpty()) {
                fzcVar = new fzc(k4iVar, k4iVar, iycVar.f(k4iVar, new r7a()));
            } else {
                Object obj = fzcVar.F;
                Object obj2 = iycVar.get(obj);
                obj2.getClass();
                fzcVar = new fzc(fzcVar.E, k4iVar, iycVar.f(obj, new r7a(((r7a) obj2).a, k4iVar)).f(k4iVar, new r7a(obj)));
            }
        }
        this.e = fzcVar;
    }

    public final pg7 s(String str) {
        GrowthBookFeature growthBookFeature;
        GrowthBookFeature growthBookFeature2 = (GrowthBookFeature) this.k.get(str);
        String str2 = this.g;
        int i = 0;
        if (str2 == null || str2.equals("")) {
            growthBookFeature = (GrowthBookFeature) this.f.get(str);
        } else {
            if (str2.equals("sha256")) {
                Object objComputeIfAbsent = this.n.computeIfAbsent(str, new uc8(i, new fg7(12)));
                objComputeIfAbsent.getClass();
                growthBookFeature = (GrowthBookFeature) this.f.get((String) objComputeIfAbsent);
                if (growthBookFeature == null) {
                }
            } else if (!this.i) {
                this.i = true;
                SilentException.a(new SilentException(ij0.j("Unsupported hashing algorithm: ", str2, ", falling back to direct lookup")), ozf.F, false, 2);
            }
            growthBookFeature = (GrowthBookFeature) this.f.get(str);
        }
        if (growthBookFeature2 != null) {
            str.getClass();
            return new pg7(str, growthBookFeature2, null, true);
        }
        if (growthBookFeature == null) {
            return null;
        }
        Iterator it = this.e.iterator();
        while (true) {
            jzc jzcVar = (jzc) it;
            if (!jzcVar.hasNext()) {
                break;
            }
            ((k4i) jzcVar.next()).e(str, growthBookFeature);
        }
        JsonElement defaultValue = growthBookFeature.getDefaultValue();
        GrowthBookExperiment experiment = growthBookFeature.getExperiment();
        String key = experiment != null ? experiment.getKey() : null;
        GrowthBookExperimentResult experimentResult = growthBookFeature.getExperimentResult();
        wf7 wf7Var = new wf7(defaultValue, key, experimentResult != null ? experimentResult.getVariationId() : null);
        LinkedHashMap linkedHashMap = this.j;
        if (!x44.r((wf7) linkedHashMap.get(str), wf7Var)) {
            linkedHashMap.put(str, wf7Var);
            Iterator it2 = this.e.iterator();
            while (true) {
                jzc jzcVar2 = (jzc) it2;
                if (!jzcVar2.hasNext()) {
                    break;
                }
                ((k4i) jzcVar2.next()).c(str, growthBookFeature, this.h);
            }
        }
        str.getClass();
        return new pg7(str, growthBookFeature, null, false);
    }

    public final pg7 t(String str, KSerializer kSerializer) {
        LinkedHashMap linkedHashMap = this.m;
        pg7 pg7Var = (pg7) linkedHashMap.get(str);
        if (pg7Var != null) {
            return pg7Var;
        }
        pg7 pg7VarS = s(str);
        if (pg7VarS == null) {
            return null;
        }
        GrowthBookFeature growthBookFeature = pg7VarS.b;
        JsonElement defaultValue = growthBookFeature.getDefaultValue();
        Object objA = ((defaultValue instanceof JsonObject) && ((JsonObject) defaultValue).isEmpty()) ? null : this.a.a(kSerializer, defaultValue);
        String str2 = pg7VarS.a;
        boolean z = pg7VarS.d;
        str2.getClass();
        pg7 pg7Var2 = new pg7(str2, growthBookFeature, objA, z);
        linkedHashMap.put(str, pg7Var2);
        return pg7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.zc8
            if (r0 == 0) goto L13
            r0 = r6
            zc8 r0 = (defpackage.zc8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zc8 r0 = new zc8
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            defpackage.sf5.h0(r6)
            goto L46
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2d:
            defpackage.sf5.h0(r6)
            vg5 r6 = r5.b
            kp7 r6 = r6.getData()
            v70 r1 = new v70
            r1.<init>(r6, r2)
            r0.G = r4
            java.lang.Object r6 = defpackage.j8.I(r1, r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L46
            return r0
        L46:
            java.lang.String r6 = (java.lang.String) r6
            iei r0 = defpackage.iei.a
            if (r6 != 0) goto L4d
            return r0
        L4d:
            bg9 r1 = r5.a     // Catch: java.lang.Throwable -> L64
            fyc r4 = com.anthropic.claude.configs.PersistedFeatureOverrides.Companion     // Catch: java.lang.Throwable -> L64
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch: java.lang.Throwable -> L64
            s06 r4 = (defpackage.s06) r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r1.b(r6, r4)     // Catch: java.lang.Throwable -> L64
            com.anthropic.claude.configs.PersistedFeatureOverrides r6 = (com.anthropic.claude.configs.PersistedFeatureOverrides) r6     // Catch: java.lang.Throwable -> L64
            java.util.Map r6 = r6.getOverrides()     // Catch: java.lang.Throwable -> L64
            r5.k = r6     // Catch: java.lang.Throwable -> L64
            return r0
        L64:
            r5 = move-exception
            com.anthropic.claude.core.telemetry.SilentException r6 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r1 = "Failed to load persisted GrowthBook overrides"
            r6.<init>(r1, r5)
            r5 = 0
            com.anthropic.claude.core.telemetry.SilentException.a(r6, r3, r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad8.u(vp4):java.lang.Object");
    }

    public final void v() {
        gb9.D(this.c, null, null, new cj(this, null, 28), 3);
    }
}
