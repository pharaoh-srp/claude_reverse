package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z64 extends u0 {
    public boolean A0;
    public m19 B0;
    public fkg C0;
    public fkg D0;
    public boolean E0;
    public boolean F0;
    public long G0;
    public boolean H0;
    public String p0;
    public zy7 q0;
    public boolean r0;
    public final evb s0;
    public final evb t0;
    public z7d u0;
    public fkg v0;
    public fkg w0;
    public boolean x0;
    public boolean y0;
    public long z0;

    public z64(zy7 zy7Var, zy7 zy7Var2, zub zubVar, vue vueVar, String str, String str2, boolean z, boolean z2) {
        super(zubVar, null, z, z2, str2, vueVar, zy7Var);
        this.p0 = str;
        this.q0 = zy7Var2;
        this.r0 = true;
        evb evbVar = kka.a;
        this.s0 = new evb();
        this.t0 = new evb();
        this.z0 = -1L;
        this.G0 = -1L;
    }

    @Override // defpackage.u19
    public final void A(s20 s20Var, u7d u7dVar) {
        z1();
        if (this.Z && this.d0 == null) {
            e38 e38VarF = npk.f(this);
            p1(e38VarF);
            this.d0 = e38VarF;
        }
        int i = 1;
        int i2 = 0;
        if (u7dVar != u7d.F) {
            if (u7dVar != u7d.G || this.B0 == null || this.F0) {
                return;
            }
            List listF = s20Var.f();
            int size = listF.size();
            while (i2 < size) {
                m19 m19Var = (m19) ((ArrayList) listF).get(i2);
                if (m19Var.f() && m19Var != this.B0) {
                    E1(true);
                    return;
                }
                i2++;
            }
            return;
        }
        if (this.B0 == null) {
            List listF2 = s20Var.f();
            int size2 = listF2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (xb5.f((m19) ((ArrayList) listF2).get(i3))) {
                    m19 m19Var2 = (m19) ((ArrayList) s20Var.f()).get(0);
                    m19Var2.a();
                    this.B0 = m19Var2;
                    if (this.Z) {
                        fkg fkgVar = this.D0;
                        tp4 tp4Var = null;
                        if (fkgVar != null && fkgVar.c()) {
                            ((ovi) yb5.o(this, ve4.u)).getClass();
                            if (m19Var2.e() - this.G0 < 40) {
                                this.H0 = true;
                                return;
                            }
                            this.E0 = true;
                            fkg fkgVar2 = this.D0;
                            if (fkgVar2 != null) {
                                fkgVar2.d(null);
                            }
                            this.D0 = null;
                        }
                        this.F0 = false;
                        x1(m19Var2);
                        if (this.q0 != null) {
                            this.C0 = gb9.D(d1(), null, null, new y64(this, tp4Var, i), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.F0) {
            List listF3 = s20Var.f();
            int size3 = listF3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                m19 m19Var3 = (m19) ((ArrayList) listF3).get(i4);
                if (!m19Var3.d() || m19Var3.c()) {
                    List listF4 = s20Var.f();
                    int size4 = listF4.size();
                    while (i2 < size4) {
                        ((m19) ((ArrayList) listF4).get(i2)).a();
                        i2++;
                    }
                    return;
                }
            }
            m19 m19Var4 = (m19) ((ArrayList) s20Var.f()).get(0);
            m19Var4.a();
            long jE = m19Var4.e();
            m19 m19Var5 = this.B0;
            m19Var5.getClass();
            F1(jE, m19Var5);
            return;
        }
        List listF5 = s20Var.f();
        int size5 = listF5.size();
        for (int i5 = 0; i5 < size5; i5++) {
            m19 m19Var6 = (m19) ((ArrayList) listF5).get(i5);
            if (m19Var6.f() || !m19Var6.d() || m19Var6.c()) {
                float f = ((ovi) yb5.o(this, ve4.u)).f();
                List listF6 = s20Var.f();
                int size6 = listF6.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    m19 m19Var7 = (m19) ((ArrayList) listF6).get(i6);
                    long jB = m19Var7.b();
                    m19 m19Var8 = this.B0;
                    m19Var8.getClass();
                    boolean z = Math.abs(fcc.d(fcc.h(jB, m19Var8.b()))) > f;
                    if (m19Var7.f() || z) {
                        E1(true);
                        return;
                    }
                }
                return;
            }
        }
        m19 m19Var9 = (m19) ((ArrayList) s20Var.f()).get(0);
        m19Var9.a();
        long jE2 = m19Var9.e();
        m19 m19Var10 = this.B0;
        m19Var10.getClass();
        F1(jE2, m19Var10);
    }

    @Override // defpackage.u0
    public final void A1() {
        H1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // defpackage.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B1(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = defpackage.ssj.i(r7)
            zy7 r7 = r6.q0
            r2 = 0
            if (r7 == 0) goto L25
            evb r7 = r6.s0
            java.lang.Object r3 = r7.e(r0)
            if (r3 != 0) goto L25
            l45 r3 = r6.d1()
            y64 r4 = new y64
            r5 = 2
            r4.<init>(r6, r2, r5)
            r5 = 3
            fkg r2 = defpackage.gb9.D(r3, r2, r2, r4, r5)
            r7.h(r0, r2)
            r7 = 1
            goto L26
        L25:
            r7 = 0
        L26:
            evb r6 = r6.t0
            java.lang.Object r6 = r6.e(r0)
            x64 r6 = (defpackage.x64) r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z64.B1(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.u0, defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        super.C(t7dVar, u7dVar, j);
        int i = 0;
        if (u7dVar != u7d.F) {
            if (u7dVar != u7d.G || this.u0 == null || this.y0) {
                return;
            }
            List list = t7dVar.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                z7d z7dVar = (z7d) list.get(i2);
                if (z7dVar.l() && z7dVar != this.u0) {
                    E1(false);
                    return;
                }
            }
            return;
        }
        tp4 tp4Var = null;
        if (this.u0 == null) {
            if (x4h.g(t7dVar, true, false)) {
                z7d z7dVar2 = (z7d) t7dVar.a.get(0);
                z7dVar2.a();
                this.u0 = z7dVar2;
                if (this.Z) {
                    fkg fkgVar = this.w0;
                    if (fkgVar != null && fkgVar.c()) {
                        ((ovi) yb5.o(this, ve4.u)).getClass();
                        if (z7dVar2.k() - this.z0 < 40) {
                            this.A0 = true;
                            return;
                        }
                        this.x0 = true;
                        fkg fkgVar2 = this.w0;
                        if (fkgVar2 != null) {
                            fkgVar2.d(null);
                        }
                        this.w0 = null;
                    }
                    this.y0 = false;
                    y1(z7dVar2);
                    if (this.q0 != null) {
                        this.v0 = gb9.D(d1(), null, null, new y64(this, tp4Var, i), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean zK = ckk.k(t7dVar);
        List list2 = t7dVar.a;
        if (zK && !this.y0 && this.Z && this.q0 != null) {
            fkg fkgVar3 = this.v0;
            if (fkgVar3 != null) {
                fkgVar3.d(null);
            }
            this.v0 = null;
            zy7 zy7Var = this.q0;
            if (zy7Var != null) {
                zy7Var.a();
            }
            if (this.r0) {
                ((gf8) yb5.o(this, ve4.l)).a(0);
            }
            this.y0 = true;
        }
        if (this.y0) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!hvj.j((z7d) list2.get(i3))) {
                    int size3 = list2.size();
                    while (i < size3) {
                        ((z7d) list2.get(i)).a();
                        i++;
                    }
                    return;
                }
            }
            z7d z7dVar3 = (z7d) list2.get(0);
            z7dVar3.a();
            long jK = z7dVar3.k();
            z7d z7dVar4 = this.u0;
            z7dVar4.getClass();
            G1(jK, z7dVar4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!hvj.i((z7d) list2.get(i4))) {
                long jU1 = u1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    z7d z7dVar5 = (z7d) list2.get(i5);
                    if (z7dVar5.l() || hvj.l(z7dVar5, j, jU1)) {
                        E1(false);
                        return;
                    }
                }
                return;
            }
        }
        z7d z7dVar6 = (z7d) list2.get(0);
        z7dVar6.a();
        long jK2 = z7dVar6.k();
        z7d z7dVar7 = this.u0;
        z7dVar7.getClass();
        G1(jK2, z7dVar7);
    }

    @Override // defpackage.u0
    public final void C1(KeyEvent keyEvent) {
        long jI = ssj.i(keyEvent);
        evb evbVar = this.s0;
        boolean z = false;
        if (evbVar.e(jI) != null) {
            lf9 lf9Var = (lf9) evbVar.e(jI);
            if (lf9Var != null) {
                if (lf9Var.c()) {
                    lf9Var.d(null);
                } else {
                    z = true;
                }
            }
            evbVar.g(jI);
        }
        if (z) {
            return;
        }
        this.a0.a();
    }

    public final void E1(boolean z) {
        if (z) {
            this.B0 = null;
            fkg fkgVar = this.C0;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            this.C0 = null;
            fkg fkgVar2 = this.D0;
            if (fkgVar2 != null) {
                fkgVar2.d(null);
            }
            this.D0 = null;
            this.E0 = false;
            this.F0 = false;
            this.G0 = -1L;
            this.H0 = false;
        } else {
            this.u0 = null;
            fkg fkgVar3 = this.v0;
            if (fkgVar3 != null) {
                fkgVar3.d(null);
            }
            this.v0 = null;
            fkg fkgVar4 = this.w0;
            if (fkgVar4 != null) {
                fkgVar4.d(null);
            }
            this.w0 = null;
            this.x0 = false;
            this.y0 = false;
            this.z0 = -1L;
            this.A0 = false;
        }
        v1(z);
    }

    public final void F1(long j, m19 m19Var) {
        if (this.Z && !this.H0) {
            w1(m19Var.b(), true);
            this.G0 = j;
            if (!this.F0 && !this.E0) {
                this.a0.a();
            }
        }
        this.B0 = null;
        this.H0 = false;
        this.E0 = false;
        fkg fkgVar = this.C0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.C0 = null;
        this.F0 = false;
    }

    public final void G1(long j, z7d z7dVar) {
        if (this.Z && !this.A0) {
            w1(z7dVar.e(), false);
            this.z0 = j;
            if (!this.y0 && !this.x0) {
                this.a0.a();
            }
        }
        this.u0 = null;
        this.A0 = false;
        this.x0 = false;
        fkg fkgVar = this.v0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.v0 = null;
        this.y0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H1() {
        /*
            r24 = this;
            r0 = r24
            evb r1 = r0.s0
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            lf9 r10 = (defpackage.lf9) r10
            r10.d(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            evb r0 = r0.t0
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La7
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto La2
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto La0
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 >= 0) goto L9c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            x64 r10 = (defpackage.x64) r10
            lf9 r10 = r10.b()
            vf9 r10 = (defpackage.vf9) r10
            r10.d(r5)
        L9c:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        La0:
            if (r8 != r13) goto La7
        La2:
            if (r4 == r3) goto La7
            int r4 = r4 + 1
            goto L71
        La7:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z64.H1():void");
    }

    @Override // defpackage.u0, defpackage.d8d
    public final void R() {
        super.R();
        E1(false);
    }

    @Override // defpackage.hqb
    public final void j1() {
        H1();
    }

    @Override // defpackage.u0
    public final void s1(ekf ekfVar) {
        if (this.q0 != null) {
            ckf.j(ekfVar, this.p0, new p7(15, this));
        }
    }

    @Override // defpackage.u19
    public final void v0() {
        E1(true);
    }
}
