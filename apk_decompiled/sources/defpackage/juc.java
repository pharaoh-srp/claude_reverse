package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class juc implements y4i, y1e {
    public final pz7 a;
    public final lze b;
    public final AtomicInteger c;
    public x4i d;

    public juc(pz7 pz7Var, lze lzeVar) {
        lzeVar.getClass();
        this.a = pz7Var;
        this.b = lzeVar;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.y4i
    public final Boolean a(tp4 tp4Var) {
        return Boolean.valueOf(this.d != null || this.b.s0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.e9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, defpackage.bz7 r13, defpackage.vp4 r14) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.iuc
            if (r0 == 0) goto L13
            r0 = r14
            iuc r0 = (defpackage.iuc) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            iuc r0 = new iuc
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.sf5.h0(r14)
            return r14
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L31:
            bz7 r13 = r0.F
            java.lang.String r12 = r0.E
            defpackage.sf5.h0(r14)
        L38:
            r7 = r12
            r8 = r13
            goto L4b
        L3b:
            defpackage.sf5.h0(r14)
            r0.E = r12
            r0.F = r13
            r0.I = r3
            java.lang.Boolean r14 = r11.a(r0)
            if (r14 != r4) goto L38
            goto L69
        L4b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            r9 = 0
            if (r12 == 0) goto L6b
            d30 r5 = new d30
            r10 = 1
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.E = r9
            r0.F = r9
            r0.I = r2
            pz7 r11 = r6.a
            java.lang.Object r11 = r11.invoke(r5, r0)
            if (r11 != r4) goto L6a
        L69:
            return r4
        L6a:
            return r11
        L6b:
            r6 = r11
            lze r11 = r6.b
            tze r11 = r11.L0(r7)
            java.lang.Object r12 = r8.invoke(r11)     // Catch: java.lang.Throwable -> L7a
            defpackage.csg.o(r11, r9)
            return r12
        L7a:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            r13 = r0
            defpackage.csg.o(r11, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juc.b(java.lang.String, bz7, vp4):java.lang.Object");
    }

    @Override // defpackage.y1e
    public final lze c() {
        return this.b;
    }

    @Override // defpackage.y4i
    public final Object d(x4i x4iVar, pz7 pz7Var, tp4 tp4Var) {
        return this.a.invoke(new j30(this, x4iVar, pz7Var, (tp4) null, 5), tp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.x4i r8, defpackage.pz7 r9, defpackage.tp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.huc
            if (r0 == 0) goto L13
            r0 = r10
            huc r0 = (defpackage.huc) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            huc r0 = new huc
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.F
            int r1 = r0.H
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.c
            r5 = 1
            lze r6 = r7.b
            if (r1 == 0) goto L36
            if (r1 != r5) goto L30
            int r5 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L2e
            goto L74
        L2e:
            r8 = move-exception
            goto L88
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L36:
            defpackage.sf5.h0(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L54
            if (r10 == r5) goto L4e
            r1 = 2
            if (r10 != r1) goto L4a
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.u00.r(r6, r10)
            goto L59
        L4a:
            defpackage.mr9.b()
            return r3
        L4e:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.u00.r(r6, r10)
            goto L59
        L54:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            defpackage.u00.r(r6, r10)
        L59:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L61
            r7.d = r8
        L61:
            guc r8 = new guc     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2e
            r0.E = r5     // Catch: java.lang.Throwable -> L2e
            r0.H = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.invoke(r8, r0)     // Catch: java.lang.Throwable -> L2e
            m45 r8 = defpackage.m45.E
            if (r10 != r8) goto L74
            return r8
        L74:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L7c
            r7.d = r3
        L7c:
            if (r5 == 0) goto L84
            java.lang.String r7 = "END TRANSACTION"
            defpackage.u00.r(r6, r7)
            return r10
        L84:
            defpackage.u00.r(r6, r2)
            return r10
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L93
            if (r10 != 0) goto L95
            r7.d = r3     // Catch: android.database.SQLException -> L93
            goto L95
        L93:
            r7 = move-exception
            goto L99
        L95:
            defpackage.u00.r(r6, r2)     // Catch: android.database.SQLException -> L93
            goto L9c
        L99:
            defpackage.mwa.p(r8, r7)
        L9c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juc.e(x4i, pz7, tp4):java.lang.Object");
    }
}
