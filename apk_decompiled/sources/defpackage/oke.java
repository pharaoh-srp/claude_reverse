package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class oke {
    public final Context a;
    public final l45 b;
    public final fk0 c;
    public final mn5 d;
    public final u0h e = new u0h(new dg8(26, this));
    public final amg f;
    public final a4e g;
    public final amg h;
    public final a4e i;
    public fkg j;
    public final amg k;
    public final a4e l;

    public oke(Context context, l45 l45Var, fk0 fk0Var, b4e b4eVar, mn5 mn5Var) {
        this.a = context;
        this.b = l45Var;
        this.c = fk0Var;
        this.d = mn5Var;
        amg amgVarA = bmg.a(new h6d(null));
        this.f = amgVarA;
        this.g = j8.k(amgVarA);
        amg amgVarA2 = bmg.a(Boolean.FALSE);
        this.h = amgVarA2;
        this.i = j8.k(amgVarA2);
        amg amgVarA3 = bmg.a(co7.a);
        this.k = amgVarA3;
        this.l = j8.k(amgVarA3);
        if (x44.r((String) fk0Var.v.getValue(), "1.260618.10")) {
            e();
        }
        dfk dfkVarD = d();
        kke kkeVar = new kke(this);
        synchronized (dfkVarD) {
            pyj pyjVar = dfkVarD.b;
            synchronized (pyjVar) {
                pyjVar.a.c("registerListener", new Object[0]);
                pyjVar.d.add(kkeVar);
                pyjVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.oke r5, defpackage.vp4 r6) {
        /*
            amg r0 = r5.f
            boolean r1 = r6 instanceof defpackage.mke
            if (r1 == 0) goto L15
            r1 = r6
            mke r1 = (defpackage.mke) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            mke r1 = new mke
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.E
            int r2 = r1.G
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L28
            goto L49
        L28:
            r5 = move-exception
            goto L4c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r4
        L30:
            defpackage.sf5.h0(r6)
            dfk r5 = r5.d()     // Catch: java.lang.Throwable -> L28
            r5l r5 = r5.a()     // Catch: java.lang.Throwable -> L28
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            r1.G = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = defpackage.zh4.k(r5, r1)     // Catch: java.lang.Throwable -> L28
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L49
            return r5
        L49:
            lm0 r6 = (defpackage.lm0) r6     // Catch: java.lang.Throwable -> L28
            goto L51
        L4c:
            hre r6 = new hre
            r6.<init>(r5)
        L51:
            boolean r5 = r6 instanceof defpackage.hre
            if (r5 != 0) goto L74
            r5 = r6
            lm0 r5 = (defpackage.lm0) r5
            int r1 = r5.d()
            r2 = 2
            if (r1 != r2) goto L69
            g6d r1 = new g6d
            int r2 = r5.d()
            r1.<init>(r5, r2)
            goto L6e
        L69:
            h6d r1 = new h6d
            r1.<init>(r4)
        L6e:
            r0.getClass()
            r0.n(r4, r1)
        L74:
            java.lang.Throwable r5 = defpackage.jre.a(r6)
            if (r5 == 0) goto L95
            h6d r6 = new h6d
            boolean r1 = r5 instanceof java.lang.Exception
            if (r1 == 0) goto L84
            r1 = r5
            java.lang.Exception r1 = (java.lang.Exception) r1
            goto L85
        L84:
            r1 = r4
        L85:
            if (r1 != 0) goto L8c
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r5)
        L8c:
            r6.<init>(r1)
            r0.getClass()
            r0.n(r4, r6)
        L95:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.a(oke, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r15, int r16, int r17, defpackage.vp4 r18) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.b(boolean, int, int, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.nke
            if (r0 == 0) goto L13
            r0 = r5
            nke r0 = (defpackage.nke) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nke r0 = new nke
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r5)     // Catch: java.lang.Throwable -> L26
            goto L47
        L26:
            r5 = move-exception
            goto L4a
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            dfk r5 = r4.d()     // Catch: java.lang.Throwable -> L26
            r5l r5 = r5.a()     // Catch: java.lang.Throwable -> L26
            r5.getClass()     // Catch: java.lang.Throwable -> L26
            r0.G = r2     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = defpackage.zh4.k(r5, r0)     // Catch: java.lang.Throwable -> L26
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L47
            return r0
        L47:
            lm0 r5 = (defpackage.lm0) r5     // Catch: java.lang.Throwable -> L26
            goto L50
        L4a:
            hre r0 = new hre
            r0.<init>(r5)
            r5 = r0
        L50:
            boolean r0 = r5 instanceof defpackage.hre
            amg r4 = r4.f
            if (r0 != 0) goto L73
            r0 = r5
            lm0 r0 = (defpackage.lm0) r0
            int r1 = r0.d()
            r2 = 3
            if (r1 != r2) goto L73
            g6d r5 = new g6d
            int r1 = r0.d()
            r5.<init>(r0, r1)
            r4.getClass()
            r4.n(r3, r5)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L73:
            java.lang.Throwable r5 = defpackage.jre.a(r5)
            if (r5 == 0) goto L94
            h6d r0 = new h6d
            boolean r1 = r5 instanceof java.lang.Exception
            if (r1 == 0) goto L83
            r1 = r5
            java.lang.Exception r1 = (java.lang.Exception) r1
            goto L84
        L83:
            r1 = r3
        L84:
            if (r1 != 0) goto L8b
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r5)
        L8b:
            r0.<init>(r1)
            r4.getClass()
            r4.n(r3, r0)
        L94:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oke.c(vp4):java.lang.Object");
    }

    public final dfk d() {
        Object value = this.e.getValue();
        value.getClass();
        return (dfk) value;
    }

    public final void e() {
        Boolean bool = Boolean.TRUE;
        amg amgVar = this.h;
        amgVar.getClass();
        tp4 tp4Var = null;
        amgVar.n(null, bool);
        if (this.g.E.getValue() instanceof h6d) {
            fkg fkgVar = this.j;
            if (fkgVar == null || fkgVar.Z()) {
                this.j = gb9.D(this.b, null, null, new al8(this, tp4Var, 27), 3);
            }
        }
    }
}
