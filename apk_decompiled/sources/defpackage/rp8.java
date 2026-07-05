package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rp8 extends hqb implements d8d {
    public zub S;
    public lp8 T;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p1(defpackage.rp8 r4, defpackage.vp4 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.op8
            if (r0 == 0) goto L13
            r0 = r5
            op8 r0 = (defpackage.op8) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            op8 r0 = new op8
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            lp8 r0 = r0.E
            defpackage.sf5.h0(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            lp8 r5 = r4.T
            if (r5 != 0) goto L4c
            lp8 r5 = new lp8
            r5.<init>()
            zub r1 = r4.S
            r0.E = r5
            r0.H = r2
            java.lang.Object r0 = r1.b(r5, r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.T = r0
        L4c:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp8.p1(rp8, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q1(defpackage.rp8 r4, defpackage.vp4 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.pp8
            if (r0 == 0) goto L13
            r0 = r5
            pp8 r0 = (defpackage.pp8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            pp8 r0 = new pp8
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            lp8 r5 = r4.T
            if (r5 == 0) goto L47
            mp8 r1 = new mp8
            r1.<init>(r5)
            zub r5 = r4.S
            r0.G = r3
            java.lang.Object r5 = r5.b(r1, r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.T = r2
        L47:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp8.q1(rp8, vp4):java.lang.Object");
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        if (u7dVar == u7d.F) {
            int i = t7dVar.f;
            tp4 tp4Var = null;
            if (i == 4) {
                gb9.D(d1(), null, null, new qp8(this, tp4Var, 0), 3);
            } else if (i == 5) {
                gb9.D(d1(), null, null, new qp8(this, tp4Var, 1), 3);
            }
        }
    }

    @Override // defpackage.d8d
    public final void R() {
        r1();
    }

    @Override // defpackage.hqb
    public final void i1() {
        r1();
    }

    public final void r1() {
        lp8 lp8Var = this.T;
        if (lp8Var != null) {
            this.S.c(new mp8(lp8Var));
            this.T = null;
        }
    }
}
