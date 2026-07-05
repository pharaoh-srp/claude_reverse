package defpackage;

import androidx.work.OverwritingInputMerger;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class tgj {
    public final String a;
    public zfj b;
    public final String c;
    public final String d;
    public pf5 e;
    public final pf5 f;
    public long g;
    public final long h;
    public final long i;
    public ql4 j;
    public final int k;
    public jc1 l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public xkc r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;
    public static final String z = nga.e("WorkSpec");
    public static final pmf A = new pmf(27);

    public /* synthetic */ tgj(String str, zfj zfjVar, String str2, String str3, pf5 pf5Var, pf5 pf5Var2, long j, long j2, long j3, ql4 ql4Var, int i, jc1 jc1Var, long j4, long j5, long j6, long j7, boolean z2, xkc xkcVar, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? zfj.E : zfjVar, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? pf5.b : pf5Var, (i5 & 32) != 0 ? pf5.b : pf5Var2, (i5 & 64) != 0 ? 0L : j, (i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? 0L : j2, (i5 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 0L : j3, (i5 & 512) != 0 ? ql4.j : ql4Var, (i5 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? 0 : i, (i5 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? jc1.E : jc1Var, (i5 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? 30000L : j4, (i5 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? xkc.E : xkcVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public final long a() {
        return vlk.b(this.b == zfj.E && this.k > 0, this.k, this.l, this.m, this.n, this.s, j(), this.g, this.i, this.h, this.u);
    }

    public final Boolean b() {
        return this.y;
    }

    public final int c() {
        return this.t;
    }

    public final long d() {
        return this.u;
    }

    public final int e() {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgj)) {
            return false;
        }
        tgj tgjVar = (tgj) obj;
        return x44.r(this.a, tgjVar.a) && this.b == tgjVar.b && x44.r(this.c, tgjVar.c) && x44.r(this.d, tgjVar.d) && x44.r(this.e, tgjVar.e) && x44.r(this.f, tgjVar.f) && this.g == tgjVar.g && this.h == tgjVar.h && this.i == tgjVar.i && x44.r(this.j, tgjVar.j) && this.k == tgjVar.k && this.l == tgjVar.l && this.m == tgjVar.m && this.n == tgjVar.n && this.o == tgjVar.o && this.p == tgjVar.p && this.q == tgjVar.q && this.r == tgjVar.r && this.s == tgjVar.s && this.t == tgjVar.t && this.u == tgjVar.u && this.v == tgjVar.v && this.w == tgjVar.w && x44.r(this.x, tgjVar.x) && x44.r(this.y, tgjVar.y);
    }

    public final int f() {
        return this.s;
    }

    public final int g() {
        return this.w;
    }

    public final String h() {
        return this.x;
    }

    public final int hashCode() {
        int iC = vb7.c(this.w, vb7.c(this.v, vb7.e(vb7.c(this.t, vb7.c(this.s, (this.r.hashCode() + fsh.p(vb7.e(vb7.e(vb7.e(vb7.e((this.l.hashCode() + vb7.c(this.k, (this.j.hashCode() + vb7.e(vb7.e(vb7.e((this.f.hashCode() + ((this.e.hashCode() + kgh.l(kgh.l((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean i() {
        return !x44.r(ql4.j, this.j);
    }

    public final boolean j() {
        return this.h != 0;
    }

    public final String toString() {
        return vb7.s(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public tgj(String str, zfj zfjVar, String str2, String str3, pf5 pf5Var, pf5 pf5Var2, long j, long j2, long j3, ql4 ql4Var, int i, jc1 jc1Var, long j4, long j5, long j6, long j7, boolean z2, xkc xkcVar, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        zfjVar.getClass();
        str2.getClass();
        str3.getClass();
        pf5Var.getClass();
        pf5Var2.getClass();
        ql4Var.getClass();
        jc1Var.getClass();
        xkcVar.getClass();
        this.a = str;
        this.b = zfjVar;
        this.c = str2;
        this.d = str3;
        this.e = pf5Var;
        this.f = pf5Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = ql4Var;
        this.k = i;
        this.l = jc1Var;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = xkcVar;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
