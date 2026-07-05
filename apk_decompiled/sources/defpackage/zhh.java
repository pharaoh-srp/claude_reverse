package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class zhh {
    public final xhh A;
    public final i99 B;
    public boolean C;
    public final aei a;
    public m2a d;
    public zy7 g;
    public op3 h;
    public l45 i;
    public p5d j;
    public wkh k;
    public gf8 l;
    public bt7 m;
    public final lsc n;
    public final lsc o;
    public long p;
    public kkh q;
    public long r;
    public final lsc s;
    public final lsc t;
    public int u;
    public cjh v;
    public d8g w;
    public kkh x;
    public final lsc y;
    public final o1i z;
    public occ b = qqi.a;
    public bz7 c = new fg7(27);
    public final lsc e = mpk.P(new cjh((String) null, 0, 7));
    public pzi f = dd8.O;

    public zhh(aei aeiVar) {
        this.a = aeiVar;
        Boolean bool = Boolean.TRUE;
        this.n = mpk.P(bool);
        this.o = mpk.P(bool);
        this.p = 0L;
        this.r = 0L;
        this.s = mpk.P(null);
        this.t = mpk.P(null);
        this.u = -1;
        this.v = new cjh((String) null, 0L, 7);
        this.y = mpk.P(Boolean.FALSE);
        this.z = new o1i();
        this.A = new xhh(this);
        i99 i99Var = new i99();
        i99Var.G = this;
        i99Var.E = true;
        this.B = i99Var;
    }

    public static final cpc a(zhh zhhVar) {
        String str;
        kkh kkhVar;
        zb0 zb0VarS = zhhVar.s();
        if (zb0VarS == null || (str = zb0VarS.F) == null || (kkhVar = zhhVar.x) == null) {
            return null;
        }
        long j = kkhVar.a;
        return new cpc(str, new kkh(mwa.m(zhhVar.b.D((int) (j >> 32)), zhhVar.b.D((int) (j & 4294967295L)))));
    }

    public static final void b(zhh zhhVar, kkh kkhVar) {
        zb0 zb0VarS;
        String str;
        l45 l45Var;
        if (kkhVar == null) {
            return;
        }
        long j = kkhVar.a;
        p5d p5dVar = zhhVar.j;
        if (p5dVar == null || (zb0VarS = zhhVar.s()) == null || (str = zb0VarS.F) == null) {
            return;
        }
        occ occVar = zhhVar.b;
        long jM = mwa.m(occVar.D((int) (j >> 32)), occVar.D((int) (j & 4294967295L)));
        if (str.length() <= 0 || kkh.d(jM) || (l45Var = zhhVar.i) == null) {
            return;
        }
        gb9.D(l45Var, null, null, new un4(p5dVar, str, jM, kkhVar, zhhVar, occVar, (tp4) null), 3);
    }

    public static final long c(zhh zhhVar, cjh cjhVar, long j, boolean z, boolean z2, phf phfVar, boolean z3, hf8 hf8Var) {
        zjh zjhVarD;
        char c;
        gf8 gf8Var;
        m2a m2aVar = zhhVar.d;
        if (m2aVar == null || (zjhVarD = m2aVar.d()) == null) {
            return kkh.b;
        }
        occ occVar = zhhVar.b;
        long j2 = cjhVar.b;
        zb0 zb0Var = cjhVar.a;
        int i = kkh.c;
        long jM = mwa.m(occVar.D((int) (j2 >> 32)), zhhVar.b.D((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iB = zjhVarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jM >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jM & 4294967295L);
        d8g d8gVar = zhhVar.w;
        int i4 = -1;
        if (z || d8gVar == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = zhhVar.u;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        d8g d8gVarF = dwk.f(zjhVarD.a, i2, i3, i4, jM, z, z2);
        if (d8gVarF.l(d8gVar)) {
            zhhVar.w = d8gVarF;
            zhhVar.u = iB;
            ohf ohfVarA = phfVar.a(d8gVarF);
            long jM2 = mwa.m(zhhVar.b.l(ohfVarA.c().a()), zhhVar.b.l(ohfVarA.b().a()));
            if (!kkh.c(jM2, j2)) {
                boolean z5 = kkh.h(jM2) != kkh.h(j2) && kkh.c(mwa.m((int) (4294967295L & jM2), (int) (jM2 >> c)), j2);
                boolean z6 = kkh.d(jM2) && kkh.d(j2);
                if (z3 && zb0Var.F.length() > 0 && !z5 && !z6 && hf8Var != null && (gf8Var = zhhVar.l) != null) {
                    gf8Var.a(hf8Var.c());
                }
                zhhVar.c.invoke(j(zb0Var, jM2));
                zhhVar.x = new kkh(jM2);
                if (!z3) {
                    zhhVar.A(!kkh.d(jM2));
                }
                m2a m2aVar2 = zhhVar.d;
                if (m2aVar2 != null) {
                    m2aVar2.q.setValue(Boolean.valueOf(z3));
                }
                m2a m2aVar3 = zhhVar.d;
                if (m2aVar3 != null) {
                    m2aVar3.m.setValue(Boolean.valueOf(!kkh.d(jM2) && vok.o(zhhVar, true)));
                }
                m2a m2aVar4 = zhhVar.d;
                if (m2aVar4 != null) {
                    m2aVar4.n.setValue(Boolean.valueOf(!kkh.d(jM2) && vok.o(zhhVar, false)));
                }
                m2a m2aVar5 = zhhVar.d;
                if (m2aVar5 != null) {
                    if (kkh.d(jM2) && vok.o(zhhVar, true)) {
                        z4 = true;
                    }
                    m2aVar5.o.setValue(Boolean.valueOf(z4));
                }
                return jM2;
            }
        }
        return j2;
    }

    public static cjh j(zb0 zb0Var, long j) {
        return new cjh(zb0Var, j, (kkh) null);
    }

    public final void A(boolean z) {
        m2a m2aVar = this.d;
        if (m2aVar != null) {
            m2aVar.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            y();
        } else {
            u();
        }
    }

    public final boolean d() {
        return p() && kkh.d(t().b);
    }

    public final boolean e() {
        return (kkh.d(t().b) || (this.f instanceof muc) || this.h == null) ? false : true;
    }

    public final boolean f() {
        return (kkh.d(t().b) || !p() || (this.f instanceof muc) || this.h == null) ? false : true;
    }

    public final boolean g() {
        return p() && ((Boolean) this.y.getValue()).booleanValue() && this.h != null;
    }

    public final boolean h() {
        return kkh.e(t().b) != t().a.F.length();
    }

    public final fkg i(boolean z) {
        l45 l45Var = this.i;
        tp4 tp4Var = null;
        if (l45Var == null) {
            return null;
        }
        return gb9.D(l45Var, null, o45.H, new m61(this, z, tp4Var, 9), 1);
    }

    public final void k() {
        l45 l45Var = this.i;
        if (l45Var != null) {
            gb9.D(l45Var, null, o45.H, new shh(this, null, 1), 1);
        }
    }

    public final void l(fcc fccVar) {
        if (!kkh.d(t().b)) {
            m2a m2aVar = this.d;
            zjh zjhVarD = m2aVar != null ? m2aVar.d() : null;
            int iF = (fccVar == null || zjhVarD == null) ? kkh.f(t().b) : this.b.l(zjhVarD.b(fccVar.a, true));
            cjh cjhVarA = cjh.a(t(), null, mwa.m(iF, iF), 5);
            this.c.invoke(cjhVarA);
            this.x = new kkh(cjhVarA.b);
        }
        x((fccVar == null || t().a.F.length() <= 0) ? we8.E : we8.G);
        A(false);
    }

    public final void m(boolean z) {
        bt7 bt7Var;
        m2a m2aVar = this.d;
        if (m2aVar != null && !m2aVar.b() && (bt7Var = this.m) != null) {
            bt7.a(bt7Var);
        }
        this.v = t();
        A(z);
        x(we8.F);
    }

    public final l9e n() {
        char c;
        long j;
        float fIntBitsToFloat;
        cu9 cu9VarC;
        cu9 cu9VarC2;
        cu9 cu9VarC3;
        cu9 cu9VarC4;
        m2a m2aVar = this.d;
        if (m2aVar != null) {
            if (m2aVar.p) {
                m2aVar = null;
            }
            if (m2aVar != null) {
                occ occVar = this.b;
                long j2 = t().b;
                int i = kkh.c;
                int iD = occVar.D((int) (j2 >> 32));
                int iD2 = this.b.D((int) (t().b & 4294967295L));
                m2a m2aVar2 = this.d;
                long jK = 0;
                long jK2 = (m2aVar2 == null || (cu9VarC4 = m2aVar2.c()) == null) ? 0L : cu9VarC4.K(r(true));
                m2a m2aVar3 = this.d;
                if (m2aVar3 != null && (cu9VarC3 = m2aVar3.c()) != null) {
                    jK = cu9VarC3.K(r(false));
                }
                m2a m2aVar4 = this.d;
                float fIntBitsToFloat2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (m2aVar4 == null || (cu9VarC2 = m2aVar4.c()) == null) {
                    c = ' ';
                    j = jK;
                    fIntBitsToFloat = 0.0f;
                } else {
                    zjh zjhVarD = m2aVar.d();
                    c = ' ';
                    j = jK;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (cu9VarC2.K((((long) Float.floatToRawIntBits(zjhVarD != null ? zjhVarD.a.c(iD).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32)) & 4294967295L));
                }
                m2a m2aVar5 = this.d;
                if (m2aVar5 != null && (cu9VarC = m2aVar5.c()) != null) {
                    zjh zjhVarD2 = m2aVar.d();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (cu9VarC.K((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << c) | (((long) Float.floatToRawIntBits(zjhVarD2 != null ? zjhVarD2.a.c(iD2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                }
                int i2 = (int) (jK2 >> c);
                int i3 = (int) (j >> c);
                return new l9e(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), (m2aVar.a.g.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jK2 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
            }
        }
        return l9e.e;
    }

    public final fcc o() {
        return (fcc) this.t.getValue();
    }

    public final boolean p() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public final long r(boolean z) {
        zjh zjhVarD;
        long j;
        m2a m2aVar = this.d;
        if (m2aVar == null || (zjhVarD = m2aVar.d()) == null) {
            return 9205357640488583168L;
        }
        yjh yjhVar = zjhVarD.a;
        zb0 zb0VarS = s();
        if (zb0VarS == null) {
            return 9205357640488583168L;
        }
        if (!x44.r(zb0VarS.F, yjhVar.a.a.F)) {
            return 9205357640488583168L;
        }
        cjh cjhVarT = t();
        if (z) {
            long j2 = cjhVarT.b;
            int i = kkh.c;
            j = j2 >> 32;
        } else {
            long j3 = cjhVarT.b;
            int i2 = kkh.c;
            j = j3 & 4294967295L;
        }
        return dqk.f(yjhVar, this.b.D((int) j), z, kkh.h(t().b));
    }

    public final zb0 s() {
        m2a m2aVar = this.d;
        if (m2aVar != null) {
            return m2aVar.a.a;
        }
        return null;
    }

    public final cjh t() {
        return (cjh) this.e.getValue();
    }

    public final void u() {
        wkh wkhVar;
        fkg fkgVar;
        if (!knk.j) {
            wkh wkhVar2 = this.k;
            if ((wkhVar2 != null ? wkhVar2.e() : null) != zkh.E || (wkhVar = this.k) == null) {
                return;
            }
            wkhVar.c();
            return;
        }
        peh pehVar = this.z.a;
        if (pehVar == null || (fkgVar = pehVar.Y) == null) {
            return;
        }
        fkgVar.d(null);
        pehVar.Y = null;
    }

    public final void v() {
        l45 l45Var = this.i;
        if (l45Var != null) {
            gb9.D(l45Var, null, o45.H, new shh(this, null, 2), 1);
        }
    }

    public final void w() {
        cjh cjhVarJ = j(t().a, mwa.m(0, t().a.F.length()));
        this.c.invoke(cjhVarJ);
        long j = cjhVarJ.b;
        this.x = new kkh(j);
        this.v = cjh.a(this.v, null, j, 5);
        m(true);
    }

    public final void x(we8 we8Var) {
        m2a m2aVar = this.d;
        if (m2aVar != null) {
            if (m2aVar.a() == we8Var) {
                m2aVar = null;
            }
            if (m2aVar != null) {
                m2aVar.k.setValue(we8Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r5 = this;
            rcg r0 = defpackage.fd9.Z()
            r1 = 0
            if (r0 == 0) goto Lc
            bz7 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            rcg r3 = defpackage.fd9.k0(r0)
            boolean r4 = r5.q()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L4a
            m2a r4 = r5.d     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L2a
            lsc r4 = r4.q     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L48
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L2a
            goto L4a
        L2a:
            defpackage.fd9.s0(r0, r3, r2)
            boolean r0 = defpackage.knk.j
            if (r0 == 0) goto L37
            o1i r5 = r5.z
            r5.a()
            return
        L37:
            l45 r0 = r5.i
            if (r0 == 0) goto L47
            shh r2 = new shh
            r3 = 3
            r2.<init>(r5, r1, r3)
            r5 = 1
            o45 r3 = defpackage.o45.H
            defpackage.gb9.D(r0, r1, r3, r2, r5)
        L47:
            return
        L48:
            r5 = move-exception
            goto L4e
        L4a:
            defpackage.fd9.s0(r0, r3, r2)
            return
        L4e:
            defpackage.fd9.s0(r0, r3, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhh.y():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yhh
            if (r0 == 0) goto L13
            r0 = r5
            yhh r0 = (defpackage.yhh) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            yhh r0 = new yhh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zhh r4 = r0.E
            defpackage.sf5.h0(r5)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            op3 r5 = r4.h
            if (r5 == 0) goto L4c
            r0.E = r4
            r0.H = r2
            java.lang.Boolean r5 = defpackage.vok.n(r4)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L42
            return r0
        L42:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            lsc r4 = r4.y
            r4.setValue(r5)
        L4c:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhh.z(vp4):java.lang.Object");
    }
}
