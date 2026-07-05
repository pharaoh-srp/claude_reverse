package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class gff extends rok {
    public static final ob0 W = new ob0(MTTypesetterKt.kLineSkipLimitMultiplier);
    public static final ob0 X = new ob0(1.0f);
    public final lsc F;
    public final lsc G;
    public Object H;
    public a6i I;
    public long J;
    public final p3f K;
    public odg L;
    public final hsc M;
    public ua2 N;
    public final jxb O;
    public final gxb P;
    public long Q;
    public final qvb R;
    public zef S;
    public final yef T;
    public float U;
    public final yef V;

    /* JADX WARN: Type inference failed for: r3v6, types: [yef] */
    /* JADX WARN: Type inference failed for: r3v7, types: [yef] */
    public gff(Object obj) {
        super(7);
        this.F = mpk.P(obj);
        this.G = mpk.P(obj);
        this.H = obj;
        this.K = new p3f(7, this);
        this.M = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
        this.O = new jxb();
        this.P = new gxb();
        this.Q = Long.MIN_VALUE;
        this.R = new qvb();
        final int i = 0;
        this.T = new bz7(this) { // from class: yef
            public final /* synthetic */ gff F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj2) {
                int i2 = i;
                iei ieiVar = iei.a;
                gff gffVar = this.F;
                long jLongValue = ((Long) obj2).longValue();
                switch (i2) {
                    case 0:
                        gffVar.Q = jLongValue;
                        break;
                    default:
                        long j = jLongValue - gffVar.Q;
                        gffVar.Q = jLongValue;
                        long jM = mwa.M(j / ((double) gffVar.U));
                        qvb qvbVar = gffVar.R;
                        if (qvbVar.i()) {
                            Object[] objArr = qvbVar.a;
                            int i3 = qvbVar.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                zef zefVar = (zef) objArr[i5];
                                gff.R0(zefVar, jM);
                                zefVar.k(true);
                            }
                            a6i a6iVar = gffVar.I;
                            if (a6iVar != null) {
                                a6iVar.o();
                            }
                            int i6 = qvbVar.b;
                            Object[] objArr2 = qvbVar.a;
                            b79 b79VarH0 = wd6.H0(0, i6);
                            int i7 = b79VarH0.E;
                            int i8 = b79VarH0.F;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((zef) objArr2[i7]).h()) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            mp0.z0(i6 - i4, i6, null, objArr2);
                            qvbVar.b -= i4;
                        }
                        zef zefVar2 = gffVar.S;
                        if (zefVar2 != null) {
                            zefVar2.l(gffVar.J);
                            gff.R0(zefVar2, jM);
                            gffVar.U0(zefVar2.g());
                            if (zefVar2.g() == 1.0f) {
                                gffVar.S = null;
                            }
                            gffVar.T0();
                        }
                        break;
                }
                return ieiVar;
            }
        };
        final int i2 = 1;
        this.V = new bz7(this) { // from class: yef
            public final /* synthetic */ gff F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj2) {
                int i22 = i2;
                iei ieiVar = iei.a;
                gff gffVar = this.F;
                long jLongValue = ((Long) obj2).longValue();
                switch (i22) {
                    case 0:
                        gffVar.Q = jLongValue;
                        break;
                    default:
                        long j = jLongValue - gffVar.Q;
                        gffVar.Q = jLongValue;
                        long jM = mwa.M(j / ((double) gffVar.U));
                        qvb qvbVar = gffVar.R;
                        if (qvbVar.i()) {
                            Object[] objArr = qvbVar.a;
                            int i3 = qvbVar.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                zef zefVar = (zef) objArr[i5];
                                gff.R0(zefVar, jM);
                                zefVar.k(true);
                            }
                            a6i a6iVar = gffVar.I;
                            if (a6iVar != null) {
                                a6iVar.o();
                            }
                            int i6 = qvbVar.b;
                            Object[] objArr2 = qvbVar.a;
                            b79 b79VarH0 = wd6.H0(0, i6);
                            int i7 = b79VarH0.E;
                            int i8 = b79VarH0.F;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((zef) objArr2[i7]).h()) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            mp0.z0(i6 - i4, i6, null, objArr2);
                            qvbVar.b -= i4;
                        }
                        zef zefVar2 = gffVar.S;
                        if (zefVar2 != null) {
                            zefVar2.l(gffVar.J);
                            gff.R0(zefVar2, jM);
                            gffVar.U0(zefVar2.g());
                            if (zefVar2.g() == 1.0f) {
                                gffVar.S = null;
                            }
                            gffVar.T0();
                        }
                        break;
                }
                return ieiVar;
            }
        };
    }

    public static final void L0(gff gffVar) {
        hsc hscVar = gffVar.M;
        a6i a6iVar = gffVar.I;
        if (a6iVar == null) {
            return;
        }
        zef zefVar = gffVar.S;
        if (zefVar == null) {
            if (gffVar.J <= 0 || hscVar.h() == 1.0f || x44.r(gffVar.G.getValue(), gffVar.F.getValue())) {
                zefVar = null;
            } else {
                zefVar = new zef();
                zefVar.o(hscVar.h());
                long j = gffVar.J;
                zefVar.l(j);
                zefVar.j(mwa.M((1.0d - ((double) hscVar.h())) * j));
                zefVar.f().e(0, hscVar.h());
            }
        }
        if (zefVar != null) {
            zefVar.l(gffVar.J);
            gffVar.R.a(zefVar);
            a6iVar.m(zefVar);
        }
        gffVar.S = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(defpackage.gff r11, defpackage.vp4 r12) {
        /*
            qvb r0 = r11.R
            boolean r1 = r12 instanceof defpackage.aff
            if (r1 == 0) goto L15
            r1 = r12
            aff r1 = (defpackage.aff) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            aff r1 = new aff
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.E
            int r2 = r1.G
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            iei r7 = defpackage.iei.a
            m45 r8 = defpackage.m45.E
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            goto L34
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L34:
            defpackage.sf5.h0(r12)
            goto L72
        L38:
            defpackage.sf5.h0(r12)
            boolean r12 = r0.h()
            if (r12 == 0) goto L46
            zef r12 = r11.S
            if (r12 != 0) goto L46
            return r7
        L46:
            c45 r12 = r1.getContext()
            float r12 = defpackage.mpk.I(r12)
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L59
            r11.Q0()
            r11.Q = r5
            return r7
        L59:
            long r9 = r11.Q
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 != 0) goto L72
            yef r12 = r11.T
            r1.G = r4
            c45 r2 = r1.getContext()
            arb r2 = defpackage.j8.O(r2)
            java.lang.Object r12 = r2.b0(r1, r12)
            if (r12 != r8) goto L72
            goto L88
        L72:
            boolean r12 = r0.i()
            if (r12 != 0) goto L80
            zef r12 = r11.S
            if (r12 == 0) goto L7d
            goto L80
        L7d:
            r11.Q = r5
            return r7
        L80:
            r1.G = r3
            java.lang.Object r12 = r11.P0(r1)
            if (r12 != r8) goto L72
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gff.M0(gff, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(defpackage.gff r8, defpackage.vp4 r9) {
        /*
            jxb r0 = r8.O
            boolean r1 = r9 instanceof defpackage.eff
            if (r1 == 0) goto L15
            r1 = r9
            eff r1 = (defpackage.eff) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            eff r1 = new eff
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.F
            int r2 = r1.H
            r3 = 0
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.E
            defpackage.sf5.h0(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.E
            defpackage.sf5.h0(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.sf5.h0(r9)
            lsc r9 = r8.F
            java.lang.Object r9 = r9.getValue()
            r1.E = r9
            r1.H = r5
            java.lang.Object r2 = r0.c(r1)
            if (r2 != r6) goto L50
            goto L6b
        L50:
            r1.E = r9
            r1.H = r4
            ua2 r2 = new ua2
            tp4 r1 = defpackage.zni.I(r1)
            r2.<init>(r5, r1)
            r2.t()
            r8.N = r2
            r0.d(r3)
            java.lang.Object r0 = r2.r()
            if (r0 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.x44.r(r9, r0)
            if (r9 == 0) goto L78
            iei r8 = defpackage.iei.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.Q = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gff.N0(gff, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(defpackage.gff r8, defpackage.vp4 r9) {
        /*
            jxb r0 = r8.O
            boolean r1 = r9 instanceof defpackage.fff
            if (r1 == 0) goto L15
            r1 = r9
            fff r1 = (defpackage.fff) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            fff r1 = new fff
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.F
            int r2 = r1.H
            r3 = 0
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.E
            defpackage.sf5.h0(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.E
            defpackage.sf5.h0(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.sf5.h0(r9)
            lsc r9 = r8.F
            java.lang.Object r9 = r9.getValue()
            r1.E = r9
            r1.H = r5
            java.lang.Object r2 = r0.c(r1)
            if (r2 != r6) goto L50
            goto L77
        L50:
            java.lang.Object r2 = r8.H
            boolean r2 = defpackage.x44.r(r9, r2)
            if (r2 == 0) goto L5c
            r0.d(r3)
            goto L81
        L5c:
            r1.E = r9
            r1.H = r4
            ua2 r2 = new ua2
            tp4 r1 = defpackage.zni.I(r1)
            r2.<init>(r5, r1)
            r2.t()
            r8.N = r2
            r0.d(r3)
            java.lang.Object r0 = r2.r()
            if (r0 != r6) goto L78
        L77:
            return r6
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.x44.r(r9, r0)
            if (r1 == 0) goto L84
        L81:
            iei r8 = defpackage.iei.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.Q = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gff.O0(gff, vp4):java.lang.Object");
    }

    public static void R0(zef zefVar, long j) {
        long jE = zefVar.e() + j;
        zefVar.n(jE);
        long jB = zefVar.b();
        if (jE >= jB) {
            zefVar.o(1.0f);
            return;
        }
        dsi dsiVarA = zefVar.a();
        if (dsiVarA == null) {
            float f = jE / jB;
            zefVar.o((f * 1.0f) + ((1.0f - f) * zefVar.f().a(0)));
            return;
        }
        ob0 ob0VarF = zefVar.f();
        ob0 ob0VarD = zefVar.d();
        if (ob0VarD == null) {
            ob0VarD = W;
        }
        zefVar.o(wd6.d0(((ob0) dsiVarA.p(jE, ob0VarF, X, ob0VarD)).a(0), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
    }

    public final Object P0(vp4 vp4Var) {
        float fI = mpk.I(vp4Var.getContext());
        iei ieiVar = iei.a;
        if (fI <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            Q0();
            return ieiVar;
        }
        this.U = fI;
        Object objB0 = j8.O(vp4Var.getContext()).b0(vp4Var, this.V);
        return objB0 == m45.E ? objB0 : ieiVar;
    }

    public final void Q0() {
        a6i a6iVar = this.I;
        if (a6iVar != null) {
            a6iVar.c();
        }
        this.R.d();
        if (this.S != null) {
            this.S = null;
            U0(1.0f);
            T0();
        }
    }

    public final Object S0(float f, Object obj, xzg xzgVar) {
        if (MTTypesetterKt.kLineSkipLimitMultiplier > f || f > 1.0f) {
            bbd.a("Expecting fraction between 0 and 1. Got " + f);
        }
        a6i a6iVar = this.I;
        if (a6iVar != null) {
            Object objA = gxb.a(this.P, new dff(obj, this.F.getValue(), this, a6iVar, f, null), xzgVar);
            if (objA == m45.E) {
                return objA;
            }
        }
        return iei.a;
    }

    public final void T0() {
        a6i a6iVar = this.I;
        if (a6iVar == null) {
            return;
        }
        a6iVar.l(mwa.M(((double) this.M.h()) * ((Number) a6iVar.l.getValue()).longValue()));
    }

    public final void U0(float f) {
        this.M.i(f);
    }

    public final void V0(odg odgVar) {
        cd cdVar;
        if (x44.r(this.L, odgVar)) {
            return;
        }
        odg odgVar2 = this.L;
        if (odgVar2 != null) {
            odgVar2.b(this);
        }
        odg odgVar3 = this.L;
        if (odgVar3 != null && (cdVar = (cd) odgVar3.i) != null) {
            cdVar.h();
        }
        this.L = odgVar;
        if (odgVar != null) {
            odgVar.e();
        }
        odg odgVar4 = this.L;
        if (odgVar4 != null) {
            odgVar4.d(this, nai.y, this.K);
        }
    }

    public final Object W0(zo6 zo6Var, xzg xzgVar) {
        a6i a6iVar = this.I;
        if (a6iVar != null && (!x44.r(this.G.getValue(), zo6Var) || !x44.r(this.F.getValue(), zo6Var))) {
            Object objA = gxb.a(this.P, new py(this, zo6Var, a6iVar, null, 6), xzgVar);
            if (objA == m45.E) {
                return objA;
            }
        }
        return iei.a;
    }

    @Override // defpackage.rok
    public final Object q0() {
        return this.G.getValue();
    }

    @Override // defpackage.rok
    public final Object t0() {
        return this.F.getValue();
    }

    @Override // defpackage.rok
    public final void x0(Object obj) {
        this.G.setValue(obj);
    }

    @Override // defpackage.rok
    public final void y0(a6i a6iVar) {
        a6i a6iVar2 = this.I;
        if (a6iVar2 != null && a6iVar != a6iVar2) {
            bbd.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.I + ", new instance: " + a6iVar);
        }
        this.I = a6iVar;
    }

    @Override // defpackage.rok
    public final void z0() {
        this.I = null;
        odg odgVar = this.L;
        if (odgVar != null) {
            odgVar.b(this);
        }
    }
}
