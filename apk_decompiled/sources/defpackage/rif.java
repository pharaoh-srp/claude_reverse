package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class rif {
    public final i5i a;
    public final yjh b;
    public final boolean c;
    public final float d;
    public final djd e;
    public final efh f;
    public final vif g;
    public long h;
    public d9j i;
    public final String j;

    public rif(i5i i5iVar, yjh yjhVar, boolean z, float f, djd djdVar) {
        this.a = i5iVar;
        this.b = yjhVar;
        this.c = z;
        this.d = f;
        this.e = djdVar;
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            efh efhVarD = i5iVar.d();
            this.f = efhVarD;
            this.g = (vif) i5iVar.e.getValue();
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            this.h = efhVarD.H;
            this.j = efhVarD.G.toString();
        } catch (Throwable th) {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            throw th;
        }
    }

    public final void A() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (4294967295L & j);
            yjh yjhVar = this.b;
            if (yjhVar != null) {
                qtb qtbVar = yjhVar.b;
                length = qtbVar.c(qtbVar.d(kkh.f(j)), true);
            } else {
                length = str.length();
            }
            long jC = cqk.c(length, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void B() {
        if (i()) {
            D();
        } else {
            A();
        }
    }

    public final void C() {
        if (i()) {
            A();
        } else {
            D();
        }
    }

    public final void D() {
        int iH;
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (4294967295L & j);
            yjh yjhVar = this.b;
            if (yjhVar != null) {
                iH = yjhVar.h(yjhVar.b.d(kkh.g(j)));
            } else {
                iH = 0;
            }
            long jC = cqk.c(iH, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void E() {
        yjh yjhVar = this.b;
        int iJ = yjhVar != null ? j(yjhVar, -1) : Integer.MIN_VALUE;
        if (iJ == Integer.MIN_VALUE) {
            this.e.a = Float.NaN;
        }
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            if (iJ < 0) {
                iJ = 0;
            }
            long jC = cqk.c(iJ, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void F() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(k(-1), i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void G() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            this.h = mwa.m(0, str.length());
        }
    }

    public final void H() {
        if (this.j.length() > 0) {
            long j = this.f.H;
            int i = kkh.c;
            this.h = mwa.m((int) (j >> 32), (int) (this.h & 4294967295L));
        }
    }

    public final void a(x2h x2hVar) {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            if (kkh.d(this.h)) {
                x2hVar.invoke(this);
                return;
            }
            boolean zI = i();
            long j = this.h;
            if (zI) {
                int iG = kkh.g(j);
                this.h = mwa.m(iG, iG);
            } else {
                int iF = kkh.f(j);
                this.h = mwa.m(iF, iF);
            }
        }
    }

    public final void b(x2h x2hVar) {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            if (kkh.d(this.h)) {
                x2hVar.invoke(this);
                return;
            }
            boolean zI = i();
            long j = this.h;
            if (zI) {
                int iF = kkh.f(j);
                this.h = mwa.m(iF, iF);
            } else {
                int iG = kkh.g(j);
                this.h = mwa.m(iG, iG);
            }
        }
    }

    public final void c() {
        if (this.j.length() > 0) {
            efh efhVar = this.f;
            boolean zD = kkh.d(efhVar.H);
            i5i i5iVar = this.a;
            if (zD) {
                i5i.i(i5iVar, "", mwa.m((int) (efhVar.H >> 32), (int) (this.h & 4294967295L)), !this.c, 4);
            } else {
                i5iVar.c();
            }
            this.h = this.a.d().H;
            this.i = d9j.E;
        }
    }

    public final void d() {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            this.h = mwa.m(i2, i2);
        }
    }

    public final efh e() {
        return this.f;
    }

    public final vif f() {
        return this.g;
    }

    public final long g() {
        return this.h;
    }

    public final d9j h() {
        return this.i;
    }

    public final boolean i() {
        yjh yjhVar = this.b;
        if (yjhVar == null) {
            return true;
        }
        long j = this.h;
        int i = kkh.c;
        return yjhVar.i((int) (j & 4294967295L)) == lne.E;
    }

    public final int j(yjh yjhVar, int i) {
        long j = this.h;
        int i2 = kkh.c;
        int i3 = (int) (j & 4294967295L);
        djd djdVar = this.e;
        if (Float.isNaN(djdVar.a)) {
            djdVar.a = yjhVar.c(i3).a;
        }
        qtb qtbVar = yjhVar.b;
        int iD = qtbVar.d(i3) + i;
        if (iD < 0) {
            return Integer.MIN_VALUE;
        }
        if (iD >= qtbVar.f) {
            return Integer.MAX_VALUE;
        }
        float fB = qtbVar.b(iD) - 1.0f;
        float f = djdVar.a;
        if ((i() && f >= yjhVar.g(iD)) || (!i() && f <= yjhVar.f(iD))) {
            return qtbVar.c(iD, true);
        }
        return qtbVar.g((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
    }

    public final int k(int i) {
        long j = this.f.H;
        int i2 = kkh.c;
        int i3 = (int) (j & 4294967295L);
        yjh yjhVar = this.b;
        if (yjhVar != null) {
            qtb qtbVar = yjhVar.b;
            float f = this.d;
            if (!Float.isNaN(f)) {
                l9e l9eVarL = yjhVar.c(i3).l(MTTypesetterKt.kLineSkipLimitMultiplier, f * i);
                float f2 = l9eVarL.b;
                float fB = qtbVar.b(qtbVar.e(f2));
                return Math.abs(f2 - fB) > Math.abs(l9eVarL.d - fB) ? qtbVar.g(l9eVarL.h()) : qtbVar.g(l9eVarL.d());
            }
        }
        return i3;
    }

    public final void l() {
        yjh yjhVar = this.b;
        int iJ = yjhVar != null ? j(yjhVar, 1) : Integer.MAX_VALUE;
        if (iJ == Integer.MAX_VALUE) {
            this.e.a = Float.NaN;
        }
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (iJ > length) {
                iJ = length;
            }
            long jC = cqk.c(iJ, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void m() {
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(k(1), i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void n() {
        if (i()) {
            s();
        } else {
            p();
        }
    }

    public final void o() {
        if (i()) {
            v();
        } else {
            r();
        }
    }

    public final void p() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(fik.i(i2, str), i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void q() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int iC = bik.c(kkh.f(j), str);
            if (iC == kkh.f(this.h) && iC != str.length()) {
                iC = bik.c(iC + 1, str);
            }
            long jC = cqk.c(iC, i, this.a);
            int i2 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i2 != i || !kkh.d(this.h)) {
                this.h = mwa.m(i2, i2);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void r() {
        int length;
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            yjh yjhVar = this.b;
            if (yjhVar != null) {
                int i3 = i2;
                while (true) {
                    efh efhVar = this.f;
                    if (i3 < efhVar.G.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long jK = yjhVar.k(length2);
                        int i4 = kkh.c;
                        int i5 = (int) (jK & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = efhVar.G.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jC = cqk.c(length, i2, this.a);
            int i6 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i6 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i6, i6);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void s() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(fik.j(i2, str), i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void t() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            int iOffsetByCodePoints = -1;
            if (i2 > 0) {
                gl6 gl6VarM = fik.m();
                if (gl6VarM != null) {
                    int iB = gl6VarM.b(i2 - 1, str);
                    if (iB >= 0) {
                        iOffsetByCodePoints = iB;
                    } else if (i2 > 0) {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                    }
                } else if (i2 > 0) {
                    iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                }
            }
            long jC = cqk.c(iOffsetByCodePoints, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void u() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = (int) (4294967295L & j);
            int iD = bik.d(kkh.g(j), str);
            if (iD == kkh.g(this.h) && iD != 0) {
                iD = bik.d(iD - 1, str);
            }
            long jC = cqk.c(iD, i, this.a);
            int i2 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i2 != i || !kkh.d(this.h)) {
                this.h = mwa.m(i2, i2);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void v() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            yjh yjhVar = this.b;
            if (yjhVar != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long jK = yjhVar.k(length);
                    int i5 = kkh.c;
                    int i6 = (int) (jK >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                    i4--;
                }
            }
            long jC = cqk.c(i3, i2, this.a);
            int i7 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i7 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i7, i7);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void w() {
        if (i()) {
            p();
        } else {
            s();
        }
    }

    public final void x() {
        if (i()) {
            r();
        } else {
            v();
        }
    }

    public final void y() {
        this.e.a = Float.NaN;
        String str = this.j;
        if (str.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(str.length(), i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }

    public final void z() {
        this.e.a = Float.NaN;
        if (this.j.length() > 0) {
            long j = this.h;
            int i = kkh.c;
            int i2 = (int) (j & 4294967295L);
            long jC = cqk.c(0, i2, this.a);
            int i3 = (int) (jC >> 32);
            d9j d9jVarD = kvk.d(jC);
            if (i3 != i2 || !kkh.d(this.h)) {
                this.h = mwa.m(i3, i3);
            }
            if (d9jVarD != null) {
                this.i = d9jVarD;
            }
        }
    }
}
