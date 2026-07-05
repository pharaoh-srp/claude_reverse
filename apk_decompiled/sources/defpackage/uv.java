package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricAction;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uv extends iwe {
    public static final long w;
    public static final /* synthetic */ int x = 0;
    public final koi b;
    public final wqd c;
    public final vn5 d;
    public final pkc e;
    public final fod f;
    public final vpd g;
    public final wz5 h;
    public final wz5 i;
    public final zy1 j;
    public final hi6 k;
    public final pdg l;
    public final lsc m;
    public final wz5 n;
    public final wz5 o;
    public final lsc p;
    public final yih q;
    public final wz5 r;
    public final wz5 s;
    public final lsc t;
    public final wz5 u;
    public final wz5 v;

    static {
        lz1 lz1Var = uh6.F;
        w = v40.Q(5, zh6.MINUTES);
    }

    public uv(koi koiVar, wqd wqdVar, vn5 vn5Var, pkc pkcVar, fod fodVar, vpd vpdVar, hl8 hl8Var, h86 h86Var) {
        super(h86Var);
        this.b = koiVar;
        this.c = wqdVar;
        this.d = vn5Var;
        this.e = pkcVar;
        this.f = fodVar;
        this.g = vpdVar;
        int i = 0;
        this.h = mpk.w(new ov(this, i));
        int i2 = 1;
        this.i = mpk.w(new ov(this, i2));
        this.j = x44.a();
        this.k = hl8.c(hl8Var, HealthMetricAction.PROJECTS_LOAD, this.a, null, null, 12);
        this.l = new pdg();
        tp4 tp4Var = null;
        this.m = mpk.P(null);
        this.n = mpk.w(new ov(this, 2));
        this.o = mpk.w(new ov(this, 3));
        this.p = mpk.P(gnd.F);
        this.q = new yih((String) null, 3);
        this.r = mpk.w(new ov(this, 4));
        a5 a5Var = a5.N;
        this.s = mpk.x(new ov(this, 5), a5Var);
        this.t = mpk.P(new Date());
        this.u = mpk.w(new ov(this, 6));
        this.v = mpk.x(new ov(this, 7), a5Var);
        gb9.D(this.a, null, null, new pv(this, tp4Var, i), 3);
        gb9.D(this.a, null, null, new pv(this, tp4Var, i2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.uv r6, defpackage.gnd r7, defpackage.vp4 r8) {
        /*
            wqd r0 = r6.c
            pdg r1 = r6.l
            boolean r2 = r8 instanceof defpackage.rv
            if (r2 == 0) goto L17
            r2 = r8
            rv r2 = (defpackage.rv) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.H = r3
            goto L1c
        L17:
            rv r2 = new rv
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r2.F
            int r8 = r2.H
            r3 = 0
            iei r4 = defpackage.iei.a
            r5 = 1
            if (r8 == 0) goto L34
            if (r8 != r5) goto L2e
            gnd r7 = r2.E
            defpackage.sf5.h0(r6)
            goto L58
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L34:
            defpackage.sf5.h0(r6)
            boolean r6 = r1.contains(r7)
            if (r6 != 0) goto L5b
            boolean r6 = r0.m(r7)
            if (r6 == 0) goto L44
            goto L5b
        L44:
            r2.E = r7
            r2.H = r5
            kza r6 = new kza
            r8 = 24
            r6.<init>(r0, r7, r3, r8)
            java.lang.Object r6 = defpackage.fd9.N(r6, r2)
            m45 r8 = defpackage.m45.E
            if (r6 != r8) goto L58
            return r8
        L58:
            r1.add(r7)
        L5b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv.O(uv, gnd, vp4):java.lang.Object");
    }

    public final String P() {
        return this.q.d().G.toString();
    }

    public final boolean Q() {
        return !bsg.I0(P());
    }

    public final gnd R() {
        return (gnd) this.p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, lm6] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [uv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.lang.String r7, defpackage.gnd r8, boolean r9, defpackage.vp4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.tv
            if (r0 == 0) goto L13
            r0 = r10
            tv r0 = (defpackage.tv) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            tv r0 = new tv
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.I
            lm6 r2 = defpackage.lm6.E
            r3 = 0
            r4 = 1
            iei r5 = defpackage.iei.a
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            gnd r8 = r0.F
            java.lang.String r7 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            goto L57
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L34:
            defpackage.sf5.h0(r10)
            boolean r10 = defpackage.bsg.I0(r7)
            if (r10 == 0) goto L41
            r6.T(r3)
            return r5
        L41:
            if (r9 == 0) goto L46
            r6.T(r3)
        L46:
            wqd r9 = r6.c     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            r0.E = r7     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            r0.F = r8     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            r0.I = r4     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            java.lang.Object r10 = r9.t(r8, r7, r0)     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            m45 r9 = defpackage.m45.E
            if (r10 != r9) goto L57
            return r9
        L57:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L98 java.util.concurrent.CancellationException -> L9c
            java.lang.String r9 = r6.P()
            boolean r7 = defpackage.x44.r(r9, r7)
            if (r7 == 0) goto L97
            gnd r7 = r6.R()
            if (r7 != r8) goto L97
            if (r10 == 0) goto L94
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.x44.y(r10, r7)
            r2.<init>(r7)
            java.util.Iterator r7 = r10.iterator()
        L7c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r7.next()
            com.anthropic.claude.api.project.Project r8 = (com.anthropic.claude.api.project.Project) r8
            java.lang.String r8 = r8.m404getUuid5pmjbU()
            com.anthropic.claude.types.strings.ProjectId r8 = com.anthropic.claude.types.strings.ProjectId.m1079boximpl(r8)
            r2.add(r8)
            goto L7c
        L94:
            r6.T(r2)
        L97:
            return r5
        L98:
            r6.T(r2)
            return r5
        L9c:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv.S(java.lang.String, gnd, boolean, vp4):java.lang.Object");
    }

    public final void T(List list) {
        this.m.setValue(list);
    }
}
