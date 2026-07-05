package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mhh {
    public final zb0 a;
    public final long b;
    public final yjh c;
    public final occ d;
    public final jkh e;
    public long f;
    public final zb0 g;
    public final cjh h;
    public final zjh i;

    public mhh(cjh cjhVar, occ occVar, zjh zjhVar, jkh jkhVar) {
        zb0 zb0Var = cjhVar.a;
        long j = cjhVar.b;
        yjh yjhVar = zjhVar != null ? zjhVar.a : null;
        this.a = zb0Var;
        this.b = j;
        this.c = yjhVar;
        this.d = occVar;
        this.e = jkhVar;
        this.f = j;
        this.g = zb0Var;
        this.h = cjhVar;
        this.i = zjhVar;
    }

    public final void A() {
        Integer numD;
        this.e.a = null;
        if (this.g.F.length() <= 0 || (numD = d()) == null) {
            return;
        }
        int iIntValue = numD.intValue();
        E(iIntValue, iIntValue);
    }

    public final void B() {
        yjh yjhVar;
        if (this.g.F.length() <= 0 || (yjhVar = this.c) == null) {
            return;
        }
        int iK = k(yjhVar, -1);
        E(iK, iK);
    }

    public final void C() {
        zjh zjhVar;
        if (this.g.F.length() <= 0 || (zjhVar = this.i) == null) {
            return;
        }
        int iL = l(zjhVar, -1);
        E(iL, iL);
    }

    public final void D() {
        if (this.g.F.length() > 0) {
            int i = kkh.c;
            this.f = mwa.m((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void E(int i, int i2) {
        this.f = mwa.m(i, i2);
    }

    public final int F() {
        long j = this.f;
        int i = kkh.c;
        return this.d.D((int) (j & 4294967295L));
    }

    public final List a(bz7 bz7Var) {
        if (!kkh.d(this.f)) {
            return x44.X(new n74("", 0), new wwf(kkh.g(this.f), kkh.g(this.f)));
        }
        ij6 ij6Var = (ij6) bz7Var.invoke(this);
        if (ij6Var != null) {
            return x44.W(ij6Var);
        }
        return null;
    }

    public final zb0 b() {
        return this.g;
    }

    public final Integer c() {
        yjh yjhVar = this.c;
        if (yjhVar == null) {
            return null;
        }
        qtb qtbVar = yjhVar.b;
        int iF = kkh.f(this.f);
        occ occVar = this.d;
        return Integer.valueOf(occVar.l(qtbVar.c(qtbVar.d(occVar.D(iF)), true)));
    }

    public final Integer d() {
        yjh yjhVar = this.c;
        if (yjhVar == null) {
            return null;
        }
        int iG = kkh.g(this.f);
        occ occVar = this.d;
        return Integer.valueOf(occVar.l(yjhVar.h(yjhVar.b.d(occVar.D(iG)))));
    }

    public final int e() {
        String str = this.g.F;
        long j = this.f;
        int i = kkh.c;
        return fik.i((int) (j & 4294967295L), str);
    }

    public final Integer f() {
        int length;
        yjh yjhVar = this.c;
        if (yjhVar == null) {
            return null;
        }
        int iF = F();
        while (true) {
            zb0 zb0Var = this.a;
            if (iF < zb0Var.F.length()) {
                int length2 = this.g.F.length() - 1;
                if (iF <= length2) {
                    length2 = iF;
                }
                long jK = yjhVar.k(length2);
                int i = kkh.c;
                int i2 = (int) (jK & 4294967295L);
                if (i2 > iF) {
                    length = this.d.l(i2);
                    break;
                }
                iF++;
            } else {
                length = zb0Var.F.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer g() {
        int iL;
        yjh yjhVar = this.c;
        if (yjhVar == null) {
            return null;
        }
        int iF = F();
        while (true) {
            if (iF <= 0) {
                iL = 0;
                break;
            }
            int length = this.g.F.length() - 1;
            if (iF <= length) {
                length = iF;
            }
            long jK = yjhVar.k(length);
            int i = kkh.c;
            int i2 = (int) (jK >> 32);
            if (i2 < iF) {
                iL = this.d.l(i2);
                break;
            }
            iF--;
        }
        return Integer.valueOf(iL);
    }

    public final long h() {
        return this.f;
    }

    public final cjh i() {
        return cjh.a(this.h, this.g, this.f, 4);
    }

    public final boolean j() {
        yjh yjhVar = this.c;
        return (yjhVar != null ? yjhVar.i(F()) : null) != lne.F;
    }

    public final int k(yjh yjhVar, int i) {
        int iF = F();
        jkh jkhVar = this.e;
        if (jkhVar.a == null) {
            jkhVar.a = Float.valueOf(yjhVar.c(iF).a);
        }
        qtb qtbVar = yjhVar.b;
        int iD = qtbVar.d(iF) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= qtbVar.f) {
            return this.g.F.length();
        }
        float fB = qtbVar.b(iD) - 1.0f;
        Float f = jkhVar.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((j() && fFloatValue >= yjhVar.g(iD)) || (!j() && fFloatValue <= yjhVar.f(iD))) {
            return qtbVar.c(iD, true);
        }
        return this.d.l(qtbVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(defpackage.zjh r9, int r10) {
        /*
            r8 = this;
            cu9 r0 = r9.b
            yjh r1 = r9.a
            if (r0 == 0) goto L13
            cu9 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            l9e r9 = r9.J(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            l9e r9 = defpackage.l9e.e
        L15:
            cjh r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.kkh.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            occ r8 = r8.d
            int r0 = r8.D(r0)
            l9e r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.g()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            qtb r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.l(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhh.l(zjh, int):int");
    }

    public final void m() {
        yjh yjhVar;
        if (this.g.F.length() <= 0 || (yjhVar = this.c) == null) {
            return;
        }
        int iK = k(yjhVar, 1);
        E(iK, iK);
    }

    public final void n() {
        zjh zjhVar;
        if (this.g.F.length() <= 0 || (zjhVar = this.i) == null) {
            return;
        }
        int iL = l(zjhVar, 1);
        E(iL, iL);
    }

    public final void o() {
        int iE;
        jkh jkhVar = this.e;
        jkhVar.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            if (j()) {
                r();
                return;
            }
            jkhVar.a = null;
            if (zb0Var.F.length() <= 0 || (iE = e()) == -1) {
                return;
            }
            E(iE, iE);
        }
    }

    public final void p() {
        Integer numF;
        Integer numG;
        jkh jkhVar = this.e;
        jkhVar.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            if (j()) {
                jkhVar.a = null;
                if (zb0Var.F.length() <= 0 || (numG = g()) == null) {
                    return;
                }
                int iIntValue = numG.intValue();
                E(iIntValue, iIntValue);
                return;
            }
            jkhVar.a = null;
            if (zb0Var.F.length() <= 0 || (numF = f()) == null) {
                return;
            }
            int iIntValue2 = numF.intValue();
            E(iIntValue2, iIntValue2);
        }
    }

    public final void q() {
        this.e.a = null;
        zb0 zb0Var = this.g;
        String str = zb0Var.F;
        String str2 = zb0Var.F;
        if (str.length() > 0) {
            int iC = bik.c(kkh.f(this.f), str2);
            if (iC == kkh.f(this.f) && iC != str2.length()) {
                iC = bik.c(iC + 1, str2);
            }
            E(iC, iC);
        }
    }

    public final void r() {
        this.e.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            String str = zb0Var.F;
            long j = this.f;
            int i = kkh.c;
            int iJ = fik.j((int) (j & 4294967295L), str);
            if (iJ != -1) {
                E(iJ, iJ);
            }
        }
    }

    public final void s() {
        this.e.a = null;
        zb0 zb0Var = this.g;
        String str = zb0Var.F;
        String str2 = zb0Var.F;
        if (str.length() > 0) {
            int iD = bik.d(kkh.g(this.f), str2);
            if (iD == kkh.g(this.f) && iD != 0) {
                iD = bik.d(iD - 1, str2);
            }
            E(iD, iD);
        }
    }

    public final void t() {
        int iE;
        jkh jkhVar = this.e;
        jkhVar.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            if (!j()) {
                r();
                return;
            }
            jkhVar.a = null;
            if (zb0Var.F.length() <= 0 || (iE = e()) == -1) {
                return;
            }
            E(iE, iE);
        }
    }

    public final void u() {
        Integer numG;
        Integer numF;
        jkh jkhVar = this.e;
        jkhVar.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            if (j()) {
                jkhVar.a = null;
                if (zb0Var.F.length() <= 0 || (numF = f()) == null) {
                    return;
                }
                int iIntValue = numF.intValue();
                E(iIntValue, iIntValue);
                return;
            }
            jkhVar.a = null;
            if (zb0Var.F.length() <= 0 || (numG = g()) == null) {
                return;
            }
            int iIntValue2 = numG.intValue();
            E(iIntValue2, iIntValue2);
        }
    }

    public final void v() {
        this.e.a = null;
        zb0 zb0Var = this.g;
        if (zb0Var.F.length() > 0) {
            int length = zb0Var.F.length();
            E(length, length);
        }
    }

    public final void w() {
        this.e.a = null;
        if (this.g.F.length() > 0) {
            E(0, 0);
        }
    }

    public final void x() {
        Integer numC;
        this.e.a = null;
        if (this.g.F.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        E(iIntValue, iIntValue);
    }

    public final void y() {
        this.e.a = null;
        if (this.g.F.length() > 0) {
            if (j()) {
                A();
            } else {
                x();
            }
        }
    }

    public final void z() {
        this.e.a = null;
        if (this.g.F.length() > 0) {
            if (j()) {
                x();
            } else {
                A();
            }
        }
    }
}
