package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ky extends tc6 {
    public ry n0;
    public ukc o0;
    public Boolean p0;
    public eo7 q0;
    public eo7 r0;
    public cz5 s0;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K1(defpackage.ky r7, float r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.hy
            if (r0 == 0) goto L13
            r0 = r9
            hy r0 = (defpackage.hy) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            hy r0 = new hy
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            aae r7 = r0.E
            defpackage.sf5.h0(r9)
            goto Lad
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L32:
            defpackage.sf5.h0(r9)
            return r9
        L36:
            defpackage.sf5.h0(r9)
            ry r9 = r7.n0
            boolean r9 = r9.d()
            m45 r1 = defpackage.m45.E
            if (r9 == 0) goto L93
            ry r7 = r7.n0
            r0.H = r3
            boolean r9 = r7.d()
            if (r9 != 0) goto L52
            java.lang.String r9 = "AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information."
            defpackage.e39.a(r9)
        L52:
            lsc r9 = r7.g
            java.lang.Object r9 = r9.getValue()
            vq5 r2 = r7.c()
            float r3 = r7.f()
            bz7 r5 = r7.b
            if (r5 == 0) goto L8d
            zy7 r6 = r7.c
            if (r6 == 0) goto L87
            java.lang.Object r2 = defpackage.fy.c(r2, r3, r8, r5, r6)
            bz7 r3 = r7.a
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7f
            java.lang.Object r7 = defpackage.fy.g(r7, r2, r8, r0)
            goto L83
        L7f:
            java.lang.Object r7 = defpackage.fy.g(r7, r9, r8, r0)
        L83:
            if (r7 != r1) goto L86
            goto Lab
        L86:
            return r7
        L87:
            java.lang.String r7 = "velocityThreshold"
            defpackage.x44.o0(r7)
            throw r4
        L8d:
            java.lang.String r7 = "positionalThreshold"
            defpackage.x44.o0(r7)
            throw r4
        L93:
            aae r9 = new aae
            r9.<init>()
            r9.E = r8
            ry r3 = r7.n0
            jy r5 = new jy
            r5.<init>(r7, r9, r8, r4)
            r0.E = r9
            r0.H = r2
            java.lang.Object r7 = defpackage.ry.b(r3, r5, r0)
            if (r7 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r7 = r9
        Lad:
            float r7 = r7.E
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky.K1(ky, float, vp4):java.lang.Object");
    }

    @Override // defpackage.tc6
    public final void B1(long j) {
    }

    @Override // defpackage.tc6
    public final void C1(cc6 cc6Var) {
        if (this.R) {
            gb9.D(d1(), null, null, new m0(this, cc6Var, null, 14), 3);
        }
    }

    @Override // defpackage.tc6
    public final boolean H1() {
        return this.n0.l.getValue() != null;
    }

    public final boolean L1() {
        Boolean bool = this.p0;
        if (bool == null) {
            return yfd.W(this).e0 == fu9.F && this.o0 == ukc.F;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public final void M1(eo7 eo7Var) {
        if (eo7Var == null) {
            z8i z8iVar = vx.a;
            b8 b8Var = vx.b;
            cz5 cz5Var = yfd.W(this).d0;
            this.s0 = cz5Var;
            eo7Var = new kcg(new fj0(this.n0, b8Var, new p7(1, cz5Var)), fy.b, z8iVar);
        }
        this.r0 = eo7Var;
    }

    @Override // defpackage.nw5
    public final void f() {
        R();
        if (this.R) {
            cz5 cz5Var = yfd.W(this).d0;
            cz5 cz5Var2 = this.s0;
            if (cz5Var2 == null || !cz5Var2.equals(cz5Var)) {
                this.s0 = cz5Var;
                M1(this.q0);
            }
        }
    }

    @Override // defpackage.hqb
    public final void h1() {
        M1(this.q0);
    }

    @Override // defpackage.tc6
    public final Object w1(sc6 sc6Var, sc6 sc6Var2) {
        Object objB = ry.b(this.n0, new gy(sc6Var, this, null), sc6Var2);
        return objB == m45.E ? objB : iei.a;
    }
}
