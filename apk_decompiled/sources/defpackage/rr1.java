package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class rr1 {
    public final long a;
    public final long b;
    public final long c;
    public final bz7 d;

    public rr1() {
        long jB = eve.B(6);
        long jB2 = eve.B(3);
        long jB3 = eve.B(6);
        hr0 hr0Var = hr0.H;
        this.a = jB;
        this.b = jB2;
        this.c = jB3;
        this.d = hr0Var;
    }

    public final void a(cte cteVar, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2046098125);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(this) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            long j = ((d54) this.d.invoke(new d54(bte.d(cteVar, e18Var)))).a;
            long j2 = this.a;
            boolean zE = e18Var.e(j2);
            long j3 = this.c;
            boolean zE2 = zE | e18Var.e(j3);
            long j4 = this.b;
            boolean zE3 = zE2 | e18Var.e(j4) | e18Var.e(j);
            Object objN = e18Var.N();
            if (zE3 || objN == jd4.a) {
                objN = yfd.p(b.t(gb9.N(fqb.E, cz5Var.D(j2), MTTypesetterKt.kLineSkipLimitMultiplier, cz5Var.D(j3), MTTypesetterKt.kLineSkipLimitMultiplier, 10), cz5Var.D(j4)), j, xve.a(50));
                e18Var.k0(objN);
            }
            dw1.a((iqb) objN, e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(this, cteVar, i, 6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr1)) {
            return false;
        }
        rr1 rr1Var = (rr1) obj;
        return clh.a(this.a, rr1Var.a) && clh.a(this.b, rr1Var.b) && clh.a(this.c, rr1Var.c) && x44.r(this.d, rr1Var.d);
    }

    public final int hashCode() {
        dlh[] dlhVarArr = clh.b;
        return this.d.hashCode() + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strD = clh.d(this.a);
        String strD2 = clh.d(this.b);
        String strD3 = clh.d(this.c);
        StringBuilder sbR = kgh.r("BarGutter(startMargin=", strD, ", barWidth=", strD2, ", endMargin=");
        sbR.append(strD3);
        sbR.append(", color=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
