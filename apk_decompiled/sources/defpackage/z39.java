package defpackage;

import androidx.compose.ui.node.Owner;

/* JADX INFO: loaded from: classes.dex */
public final class z39 extends m5c {
    public static final v30 A0;
    public final j4h y0;
    public y39 z0;

    static {
        v30 v30VarJ = dch.j();
        int i = d54.i;
        v30VarJ.e(d54.e);
        v30VarJ.l(1.0f);
        v30VarJ.m(1);
        A0 = v30VarJ;
    }

    public z39(av9 av9Var) {
        super(av9Var);
        j4h j4hVar = new j4h();
        j4hVar.H = 0;
        this.y0 = j4hVar;
        j4hVar.L = this;
        this.z0 = av9Var.M != null ? new y39(this) : null;
    }

    @Override // defpackage.h5b
    public final int Q(int i) {
        q28 q28VarF = this.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.e((m5c) av9Var.k0.I, av9Var.p(), i);
    }

    @Override // defpackage.c3d
    public final void Z(long j, float f, bz7 bz7Var) {
        if (this.T) {
            hma hmaVarF1 = f1();
            hmaVarF1.getClass();
            x1(hmaVarF1.T, f, bz7Var, null);
        } else {
            x1(j, f, bz7Var, null);
        }
        if (this.N) {
            return;
        }
        this.S.A().o0();
    }

    @Override // defpackage.h5b
    public final int a(int i) {
        q28 q28VarF = this.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.d((m5c) av9Var.k0.I, av9Var.p(), i);
    }

    @Override // defpackage.m5c, defpackage.c3d
    public final void a0(long j, float f, ja8 ja8Var) {
        z39 z39Var;
        if (this.T) {
            hma hmaVarF1 = f1();
            hmaVarF1.getClass();
            z39Var = this;
            z39Var.x1(hmaVarF1.T, f, null, ja8Var);
        } else {
            z39Var = this;
            z39Var.x1(j, f, null, ja8Var);
        }
        if (z39Var.N) {
            return;
        }
        z39Var.S.A().o0();
    }

    @Override // defpackage.m5c
    public final void a1() {
        if (this.z0 == null) {
            this.z0 = new y39(this);
        }
    }

    @Override // defpackage.m5c
    public final hma f1() {
        return this.z0;
    }

    @Override // defpackage.m5c
    public final hqb h1() {
        return this.y0;
    }

    @Override // defpackage.fma
    public final int i0(ut utVar) {
        y39 y39Var = this.z0;
        if (y39Var != null) {
            return y39Var.i0(utVar);
        }
        n5b n5bVar = this.S.t().p;
        bv9 bv9Var = n5bVar.c0;
        if (!n5bVar.Q) {
            if (n5bVar.J.d == vu9.E) {
                bv9Var.f = true;
                if (bv9Var.b) {
                    n5bVar.a0 = true;
                    n5bVar.b0 = true;
                }
            } else {
                bv9Var.g = true;
            }
        }
        z39 z39VarD = n5bVar.d();
        boolean z = z39VarD.O;
        z39VarD.O = true;
        n5bVar.C();
        z39VarD.O = z;
        Integer num = (Integer) bv9Var.i.get(utVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.h5b
    public final int l(int i) {
        q28 q28VarF = this.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.c((m5c) av9Var.k0.I, av9Var.p(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(defpackage.i5c r12, long r13, defpackage.dn8 r15, int r16, boolean r17) {
        /*
            r11 = this;
            av9 r0 = r11.S
            boolean r1 = r12.p(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            boolean r1 = r11.I1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L38
        L16:
            r9 = r16
            boolean r1 = defpackage.j8d.b(r9, r2)
            if (r1 == 0) goto L36
            long r4 = r11.g1()
            float r11 = r11.V0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L36
            r10 = r3
            goto L14
        L34:
            r9 = r16
        L36:
            r10 = r17
        L38:
            if (r3 == 0) goto L7e
            int r11 = r15.G
            wwb r0 = r0.L()
            java.lang.Object[] r1 = r0.E
            int r0 = r0.G
            int r0 = r0 - r2
        L45:
            if (r0 < 0) goto L7c
            r2 = r1[r0]
            r5 = r2
            av9 r5 = (defpackage.av9) r5
            boolean r2 = r5.Y()
            if (r2 == 0) goto L77
            r4 = r12
            r6 = r13
            r8 = r15
            r4.l(r5, r6, r8, r9, r10)
            long r2 = r15.a()
            float r6 = defpackage.dtj.h(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L77
            boolean r6 = defpackage.dtj.j(r2)
            if (r6 == 0) goto L77
            boolean r2 = defpackage.dtj.i(r2)
            if (r2 != 0) goto L77
            boolean r2 = r12.o(r15, r5)
            if (r2 == 0) goto L7c
        L77:
            int r0 = r0 + (-1)
            r9 = r16
            goto L45
        L7c:
            r15.G = r11
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z39.n1(i5c, long, dn8, int, boolean):void");
    }

    @Override // defpackage.h5b
    public final int o(int i) {
        q28 q28VarF = this.S.F();
        o5b o5bVarR = q28VarF.r();
        av9 av9Var = (av9) q28VarF.F;
        return o5bVarR.a((m5c) av9Var.k0.I, av9Var.p(), i);
    }

    @Override // defpackage.h5b
    public final c3d u(long j) {
        if (this.U) {
            y39 y39Var = this.z0;
            y39Var.getClass();
            j = y39Var.H;
        }
        d0(j);
        av9 av9Var = this.S;
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((av9) objArr[i2]).A().P = xu9.G;
        }
        A1(av9Var.b0.b(this, av9Var.p(), j));
        r1();
        return this;
    }

    @Override // defpackage.m5c
    public final void w1(fb2 fb2Var, ja8 ja8Var) throws Throwable {
        av9 av9Var = this.S;
        Owner ownerA = dv9.a(av9Var);
        wwb wwbVarL = av9Var.L();
        Object[] objArr = wwbVarL.E;
        int i = wwbVarL.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (av9Var2.Y()) {
                av9Var2.k(fb2Var, ja8Var);
            }
        }
        if (ownerA.getShowLayoutBounds()) {
            long j = this.G;
            fb2Var.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, A0);
        }
    }
}
