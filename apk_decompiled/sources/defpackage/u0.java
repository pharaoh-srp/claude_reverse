package defpackage;

import android.view.KeyEvent;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends qw5 implements d8d, wo9, ujf, p6i, oe4, lbc, u19, d38 {
    public static final lja o0 = new lja(12);
    public zub U;
    public h19 V;
    public boolean W;
    public String X;
    public vue Y;
    public boolean Z;
    public zy7 a0;
    public final pt7 b0;
    public h19 c0;
    public e38 d0;
    public nw5 e0;
    public odd f0;
    public lp8 g0;
    public final evb h0;
    public long i0;
    public odd j0;
    public zub k0;
    public boolean l0;
    public fkg m0;
    public final lja n0;

    public u0(zub zubVar, h19 h19Var, boolean z, boolean z2, String str, vue vueVar, zy7 zy7Var) {
        this.U = zubVar;
        this.V = h19Var;
        this.W = z;
        this.X = str;
        this.Y = vueVar;
        this.Z = z2;
        this.a0 = zy7Var;
        this.b0 = new pt7(zubVar, 0, new n0(1, this, u0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        evb evbVar = kka.a;
        this.h0 = new evb();
        this.i0 = 0L;
        zub zubVar2 = this.U;
        this.k0 = zubVar2;
        this.l0 = zubVar2 == null;
        this.n0 = o0;
    }

    public void A1() {
    }

    public abstract boolean B1(KeyEvent keyEvent);

    public void C(t7d t7dVar, u7d u7dVar, long j) {
        long jY = csg.y(j);
        this.i0 = (((long) Float.floatToRawIntBits((int) (jY & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jY >> 32)) << 32);
        z1();
        if (this.Z) {
            if (this.d0 == null) {
                e38 e38VarF = npk.f(this);
                p1(e38VarF);
                this.d0 = e38VarF;
            }
            if (u7dVar == u7d.F) {
                int i = t7dVar.f;
                tp4 tp4Var = null;
                if (i == 4) {
                    gb9.D(d1(), null, null, new t0(this, tp4Var, 0), 3);
                } else if (i == 5) {
                    gb9.D(d1(), null, null, new t0(this, tp4Var, 1), 3);
                }
            }
        }
    }

    public abstract void C1(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(defpackage.zub r4, defpackage.h19 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.vue r9, defpackage.zy7 r10) {
        /*
            r3 = this;
            zub r0 = r3.k0
            boolean r0 = defpackage.x44.r(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.t1()
            r3.k0 = r4
            r3.U = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            h19 r0 = r3.V
            boolean r0 = defpackage.x44.r(r0, r5)
            if (r0 != 0) goto L1f
            r3.V = r5
            r4 = r1
        L1f:
            boolean r5 = r3.W
            if (r5 == r6) goto L2b
            r3.W = r6
            if (r6 == 0) goto L2a
            r3.F0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.Z
            pt7 r6 = r3.b0
            if (r5 == r7) goto L46
            if (r7 == 0) goto L37
            r3.p1(r6)
            goto L3d
        L37:
            r3.q1(r6)
            r3.t1()
        L3d:
            av9 r5 = defpackage.yfd.W(r3)
            r5.V()
            r3.Z = r7
        L46:
            java.lang.String r5 = r3.X
            boolean r5 = defpackage.x44.r(r5, r8)
            if (r5 != 0) goto L57
            r3.X = r8
            av9 r5 = defpackage.yfd.W(r3)
            r5.V()
        L57:
            vue r5 = r3.Y
            boolean r5 = defpackage.x44.r(r5, r9)
            if (r5 != 0) goto L68
            r3.Y = r9
            av9 r5 = defpackage.yfd.W(r3)
            r5.V()
        L68:
            r3.a0 = r10
            boolean r5 = r3.l0
            zub r7 = r3.k0
            if (r7 != 0) goto L72
            r8 = r1
            goto L73
        L72:
            r8 = r2
        L73:
            if (r5 == r8) goto L81
            if (r7 != 0) goto L78
            r2 = r1
        L78:
            r3.l0 = r2
            if (r2 != 0) goto L81
            nw5 r5 = r3.e0
            if (r5 != 0) goto L81
            goto L82
        L81:
            r1 = r4
        L82:
            if (r1 == 0) goto L97
            nw5 r4 = r3.e0
            if (r4 != 0) goto L8c
            boolean r5 = r3.l0
            if (r5 != 0) goto L97
        L8c:
            if (r4 == 0) goto L91
            r3.q1(r4)
        L91:
            r4 = 0
            r3.e0 = r4
            r3.z1()
        L97:
            zub r3 = r3.U
            r6.t1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0.D1(zub, h19, boolean, boolean, java.lang.String, vue, zy7):void");
    }

    @Override // defpackage.lbc
    public final void F0() {
        if (this.W) {
            d4c.a0(this, new k0(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wo9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.z1()
            long r0 = defpackage.ssj.i(r12)
            boolean r2 = r11.Z
            r3 = 3
            r4 = 0
            evb r5 = r11.h0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            int r2 = defpackage.ssj.j(r12)
            r8 = 2
            boolean r2 = defpackage.rkj.g(r2, r8)
            if (r2 == 0) goto L4e
            boolean r2 = androidx.compose.foundation.b.f(r12)
            if (r2 == 0) goto L4e
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L44
            odd r2 = new odd
            long r9 = r11.i0
            r2.<init>(r9)
            r5.h(r0, r2)
            zub r0 = r11.U
            if (r0 == 0) goto L42
            l45 r0 = r11.d1()
            s0 r1 = new s0
            r1.<init>(r11, r2, r4, r8)
            defpackage.gb9.D(r0, r4, r4, r1, r3)
        L42:
            r0 = r6
            goto L45
        L44:
            r0 = r7
        L45:
            boolean r11 = r11.B1(r12)
            if (r11 != 0) goto L7f
            if (r0 == 0) goto L80
            goto L7f
        L4e:
            boolean r2 = r11.Z
            if (r2 == 0) goto L80
            int r2 = defpackage.ssj.j(r12)
            boolean r2 = defpackage.rkj.g(r2, r6)
            if (r2 == 0) goto L80
            boolean r2 = androidx.compose.foundation.b.f(r12)
            if (r2 == 0) goto L80
            java.lang.Object r0 = r5.g(r0)
            odd r0 = (defpackage.odd) r0
            if (r0 == 0) goto L7d
            zub r1 = r11.U
            if (r1 == 0) goto L7a
            l45 r1 = r11.d1()
            s0 r2 = new s0
            r2.<init>(r11, r0, r4, r3)
            defpackage.gb9.D(r1, r4, r4, r2, r3)
        L7a:
            r11.C1(r12)
        L7d:
            if (r0 == 0) goto L80
        L7f:
            return r6
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0.L(android.view.KeyEvent):boolean");
    }

    public void R() {
        lp8 lp8Var;
        zub zubVar = this.U;
        if (zubVar != null && (lp8Var = this.g0) != null) {
            zubVar.c(new mp8(lp8Var));
        }
        this.g0 = null;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        vue vueVar = this.Y;
        if (vueVar != null) {
            ckf.s(ekfVar, vueVar.a);
        }
        ckf.g(ekfVar, this.X, new k0(this, 1));
        if (this.Z) {
            this.b0.X0(ekfVar);
        } else {
            ckf.b(ekfVar);
        }
        s1(ekfVar);
    }

    @Override // defpackage.ujf
    public final boolean Z0() {
        return true;
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        F0();
        if (!this.l0) {
            z1();
        }
        if (this.Z) {
            p1(this.b0);
        }
    }

    @Override // defpackage.hqb
    public final void i1() {
        t1();
        if (this.k0 == null) {
            this.U = null;
        }
        nw5 nw5Var = this.e0;
        if (nw5Var != null) {
            q1(nw5Var);
        }
        this.e0 = null;
        e38 e38Var = this.d0;
        if (e38Var != null) {
            q1(e38Var);
        }
        this.d0 = null;
    }

    @Override // defpackage.wo9
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return this.n0;
    }

    public void s1(ekf ekfVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t1() {
        /*
            r17 = this;
            r0 = r17
            zub r1 = r0.U
            evb r2 = r0.h0
            if (r1 == 0) goto L76
            odd r3 = r0.f0
            if (r3 == 0) goto L14
            ndd r4 = new ndd
            r4.<init>(r3)
            r1.c(r4)
        L14:
            odd r3 = r0.j0
            if (r3 == 0) goto L20
            ndd r4 = new ndd
            r4.<init>(r3)
            r1.c(r4)
        L20:
            lp8 r3 = r0.g0
            if (r3 == 0) goto L2c
            mp8 r4 = new mp8
            r4.<init>(r3)
            r1.c(r4)
        L2c:
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r6 = 0
            r7 = r6
        L37:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L51:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            odd r13 = (defpackage.odd) r13
            ndd r14 = new ndd
            r14.<init>(r13)
            r1.c(r14)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L51
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L37
        L76:
            r1 = 0
            r0.f0 = r1
            r0.j0 = r1
            r0.g0 = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0.t1():void");
    }

    public final long u1(long j) {
        long jU0 = yfd.W(this).d0.U0(((ovi) yb5.o(this, ve4.u)).d());
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (jU0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (jU0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void v1(boolean z) {
        zub zubVar = this.U;
        if (zubVar != null) {
            fkg fkgVar = this.m0;
            tp4 tp4Var = null;
            if (fkgVar == null || !fkgVar.c()) {
                odd oddVar = z ? this.j0 : this.f0;
                if (oddVar != null) {
                    ndd nddVar = new ndd(oddVar);
                    lf9 lf9Var = (lf9) ((mp4) d1()).E.x0(dd8.J);
                    gb9.D(d1(), null, null, new o0(zubVar, nddVar, lf9Var != null ? lf9Var.D0(new l0(zubVar, 0, nddVar)) : null, tp4Var, 0), 3);
                }
            } else {
                fkg fkgVar2 = this.m0;
                if (fkgVar2 != null) {
                    fkgVar2.d(null);
                }
            }
            if (z) {
                this.j0 = null;
            } else {
                this.f0 = null;
            }
        }
    }

    public final void w1(long j, boolean z) {
        zub zubVar = this.U;
        if (zubVar != null) {
            fkg fkgVar = this.m0;
            if (fkgVar == null || !fkgVar.c()) {
                odd oddVar = z ? this.j0 : this.f0;
                if (oddVar != null) {
                    gb9.D(d1(), null, null, new q0(oddVar, zubVar, null), 3);
                }
            } else {
                fkgVar.d(null);
                gb9.D(d1(), null, null, new p0(fkgVar, j, zubVar, (tp4) null, 0), 3);
            }
            if (z) {
                this.j0 = null;
            } else {
                this.f0 = null;
            }
        }
    }

    public final void x1(m19 m19Var) {
        zub zubVar = this.U;
        if (zubVar != null) {
            odd oddVar = new odd(m19Var.b());
            z9e z9eVar = new z9e();
            npk.h(this, new lj2(m19Var, 6, z9eVar));
            tp4 tp4Var = null;
            if (z9eVar.E || oo3.a(this)) {
                this.m0 = gb9.D(d1(), null, null, new r0(zubVar, oddVar, this, tp4Var, 0), 3);
            } else {
                this.j0 = oddVar;
                gb9.D(d1(), null, null, new q0(zubVar, oddVar, tp4Var, 1), 3);
            }
        }
    }

    public final void y1(z7d z7dVar) {
        zub zubVar = this.U;
        if (zubVar != null) {
            odd oddVar = new odd(z7dVar.e());
            z9e z9eVar = new z9e();
            npk.h(this, new lj2(z7dVar, 7, z9eVar));
            tp4 tp4Var = null;
            if (z9eVar.E || oo3.a(this)) {
                this.m0 = gb9.D(d1(), null, null, new r0(zubVar, oddVar, this, tp4Var, 1), 3);
            } else {
                this.f0 = oddVar;
                gb9.D(d1(), null, null, new q0(zubVar, oddVar, tp4Var, 2), 3);
            }
        }
    }

    public final void z1() {
        if (this.e0 != null) {
            return;
        }
        h19 h19Var = this.W ? this.c0 : this.V;
        if (h19Var != null) {
            if (this.U == null) {
                this.U = new zub();
            }
            this.b0.t1(this.U);
            zub zubVar = this.U;
            zubVar.getClass();
            nw5 nw5VarA = h19Var.a(zubVar);
            p1(nw5VarA);
            this.e0 = nw5VarA;
        }
    }
}
