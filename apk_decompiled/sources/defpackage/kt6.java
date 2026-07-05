package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kt6 {
    public final long a;
    public final fs6 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ws6 h;
    public final int i;
    public final xs6 j;
    public final it6 k;
    public final ds6 l;
    public final ls6 m;
    public final us6 n;
    public final gt6 o;
    public final js6 p;
    public final bt6 q;
    public final ts6 r;
    public final rs6 s;
    public final ps6 t;
    public final es6 u;
    public final ns6 v;
    public final vs6 w;
    public final ys6 x;
    public final ps6 y;

    public /* synthetic */ kt6(long j, fs6 fs6Var, String str, String str2, String str3, String str4, String str5, ws6 ws6Var, int i, xs6 xs6Var, it6 it6Var, ds6 ds6Var, ls6 ls6Var, gt6 gt6Var, bt6 bt6Var, ts6 ts6Var, rs6 rs6Var, ps6 ps6Var, es6 es6Var, vs6 vs6Var, ps6 ps6Var2, int i2) {
        this(j, fs6Var, str, str2, (i2 & 16) != 0 ? null : str3, str4, str5, ws6Var, i, xs6Var, it6Var, ds6Var, ls6Var, null, (i2 & 16384) != 0 ? null : gt6Var, null, bt6Var, ts6Var, rs6Var, ps6Var, (1048576 & i2) != 0 ? null : es6Var, null, vs6Var, null, (i2 & 16777216) != 0 ? null : ps6Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt6)) {
            return false;
        }
        kt6 kt6Var = (kt6) obj;
        return this.a == kt6Var.a && x44.r(this.b, kt6Var.b) && x44.r(this.c, kt6Var.c) && x44.r(this.d, kt6Var.d) && x44.r(this.e, kt6Var.e) && x44.r(this.f, kt6Var.f) && x44.r(this.g, kt6Var.g) && x44.r(this.h, kt6Var.h) && this.i == kt6Var.i && x44.r(this.j, kt6Var.j) && x44.r(this.k, kt6Var.k) && x44.r(this.l, kt6Var.l) && x44.r(this.m, kt6Var.m) && x44.r(this.n, kt6Var.n) && x44.r(this.o, kt6Var.o) && x44.r(this.p, kt6Var.p) && x44.r(this.q, kt6Var.q) && x44.r(this.r, kt6Var.r) && x44.r(this.s, kt6Var.s) && x44.r(this.t, kt6Var.t) && x44.r(this.u, kt6Var.u) && x44.r(this.v, kt6Var.v) && x44.r(this.w, kt6Var.w) && x44.r(this.x, kt6Var.x) && x44.r(this.y, kt6Var.y);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (this.h.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        int i = this.i;
        int iHashCode7 = (this.j.hashCode() + ((iHashCode6 + (i == 0 ? 0 : sq6.F(i))) * 31)) * 31;
        it6 it6Var = this.k;
        int iHashCode8 = (iHashCode7 + (it6Var == null ? 0 : it6Var.hashCode())) * 31;
        ds6 ds6Var = this.l;
        int iHashCode9 = (iHashCode8 + (ds6Var == null ? 0 : ds6Var.hashCode())) * 31;
        ls6 ls6Var = this.m;
        int iHashCode10 = (iHashCode9 + (ls6Var == null ? 0 : ls6Var.hashCode())) * 31;
        us6 us6Var = this.n;
        int iHashCode11 = (iHashCode10 + (us6Var == null ? 0 : us6Var.hashCode())) * 31;
        gt6 gt6Var = this.o;
        int iHashCode12 = (iHashCode11 + (gt6Var == null ? 0 : gt6Var.hashCode())) * 31;
        js6 js6Var = this.p;
        int iHashCode13 = (iHashCode12 + (js6Var == null ? 0 : js6Var.hashCode())) * 31;
        bt6 bt6Var = this.q;
        int iHashCode14 = (iHashCode13 + (bt6Var == null ? 0 : bt6Var.hashCode())) * 31;
        ts6 ts6Var = this.r;
        int iHashCode15 = (this.s.hashCode() + ((iHashCode14 + (ts6Var == null ? 0 : ts6Var.hashCode())) * 31)) * 31;
        ps6 ps6Var = this.t;
        int iHashCode16 = (iHashCode15 + (ps6Var == null ? 0 : ps6Var.hashCode())) * 31;
        es6 es6Var = this.u;
        int iHashCode17 = (iHashCode16 + (es6Var == null ? 0 : es6Var.hashCode())) * 31;
        ns6 ns6Var = this.v;
        int iHashCode18 = (this.w.hashCode() + ((iHashCode17 + (ns6Var == null ? 0 : ns6Var.hashCode())) * 31)) * 31;
        ys6 ys6Var = this.x;
        int iHashCode19 = (iHashCode18 + (ys6Var == null ? 0 : ys6Var.hashCode())) * 31;
        ps6 ps6Var2 = this.y;
        return iHashCode19 + (ps6Var2 != null ? ps6Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorEvent(date=");
        sb.append(this.a);
        sb.append(", application=");
        sb.append(this.b);
        kgh.u(sb, ", service=", this.c, ", version=", this.d);
        kgh.u(sb, ", buildVersion=", this.e, ", buildId=", this.f);
        sb.append(", ddtags=");
        sb.append(this.g);
        sb.append(", session=");
        sb.append(this.h);
        sb.append(", source=");
        sb.append(ms6.B(this.i));
        sb.append(", view=");
        sb.append(this.j);
        sb.append(", usr=");
        sb.append(this.k);
        sb.append(", account=");
        sb.append(this.l);
        sb.append(", connectivity=");
        sb.append(this.m);
        sb.append(", display=");
        sb.append(this.n);
        sb.append(", synthetics=");
        sb.append(this.o);
        sb.append(", ciTest=");
        sb.append(this.p);
        sb.append(", os=");
        sb.append(this.q);
        sb.append(", device=");
        sb.append(this.r);
        sb.append(", dd=");
        sb.append(this.s);
        sb.append(", context=");
        sb.append(this.t);
        sb.append(", action=");
        sb.append(this.u);
        sb.append(", container=");
        sb.append(this.v);
        sb.append(", error=");
        sb.append(this.w);
        sb.append(", freeze=");
        sb.append(this.x);
        sb.append(", featureFlags=");
        sb.append(this.y);
        sb.append(")");
        return sb.toString();
    }

    public kt6(long j, fs6 fs6Var, String str, String str2, String str3, String str4, String str5, ws6 ws6Var, int i, xs6 xs6Var, it6 it6Var, ds6 ds6Var, ls6 ls6Var, us6 us6Var, gt6 gt6Var, js6 js6Var, bt6 bt6Var, ts6 ts6Var, rs6 rs6Var, ps6 ps6Var, es6 es6Var, ns6 ns6Var, vs6 vs6Var, ys6 ys6Var, ps6 ps6Var2) {
        this.a = j;
        this.b = fs6Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = ws6Var;
        this.i = i;
        this.j = xs6Var;
        this.k = it6Var;
        this.l = ds6Var;
        this.m = ls6Var;
        this.n = us6Var;
        this.o = gt6Var;
        this.p = js6Var;
        this.q = bt6Var;
        this.r = ts6Var;
        this.s = rs6Var;
        this.t = ps6Var;
        this.u = es6Var;
        this.v = ns6Var;
        this.w = vs6Var;
        this.x = ys6Var;
        this.y = ps6Var2;
    }
}
