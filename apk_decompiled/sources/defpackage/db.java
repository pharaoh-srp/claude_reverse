package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class db {
    public final long a;
    public final ca b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final aa h;
    public final int i;
    public final ba j;
    public final bb k;
    public final w9 l;
    public final ga m;
    public final qa n;
    public final za o;
    public final ea p;
    public final va q;
    public final pa r;
    public final la s;
    public final ja t;
    public final ha u;
    public final x9 v;

    public db(long j, ca caVar, String str, String str2, String str3, String str4, String str5, aa aaVar, int i, ba baVar, bb bbVar, w9 w9Var, ga gaVar, qa qaVar, za zaVar, ea eaVar, va vaVar, pa paVar, la laVar, ja jaVar, ha haVar, x9 x9Var) {
        this.a = j;
        this.b = caVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = aaVar;
        this.i = i;
        this.j = baVar;
        this.k = bbVar;
        this.l = w9Var;
        this.m = gaVar;
        this.n = qaVar;
        this.o = zaVar;
        this.p = eaVar;
        this.q = vaVar;
        this.r = paVar;
        this.s = laVar;
        this.t = jaVar;
        this.u = haVar;
        this.v = x9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return this.a == dbVar.a && this.b.equals(dbVar.b) && x44.r(this.c, dbVar.c) && x44.r(this.d, dbVar.d) && x44.r(this.e, dbVar.e) && x44.r(this.f, dbVar.f) && x44.r(this.g, dbVar.g) && this.h.equals(dbVar.h) && this.i == dbVar.i && this.j.equals(dbVar.j) && x44.r(this.k, dbVar.k) && x44.r(this.l, dbVar.l) && x44.r(this.m, dbVar.m) && x44.r(this.n, dbVar.n) && x44.r(this.o, dbVar.o) && x44.r(this.p, dbVar.p) && x44.r(this.q, dbVar.q) && x44.r(this.r, dbVar.r) && this.s.equals(dbVar.s) && x44.r(this.t, dbVar.t) && x44.r(this.u, dbVar.u) && this.v.equals(dbVar.v);
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
        bb bbVar = this.k;
        int iHashCode8 = (iHashCode7 + (bbVar == null ? 0 : bbVar.hashCode())) * 31;
        w9 w9Var = this.l;
        int iHashCode9 = (iHashCode8 + (w9Var == null ? 0 : w9Var.hashCode())) * 31;
        ga gaVar = this.m;
        int iHashCode10 = (iHashCode9 + (gaVar == null ? 0 : gaVar.hashCode())) * 31;
        qa qaVar = this.n;
        int iHashCode11 = (iHashCode10 + (qaVar == null ? 0 : qaVar.hashCode())) * 31;
        za zaVar = this.o;
        int iHashCode12 = (iHashCode11 + (zaVar == null ? 0 : zaVar.hashCode())) * 31;
        ea eaVar = this.p;
        int iHashCode13 = (iHashCode12 + (eaVar == null ? 0 : eaVar.a.hashCode())) * 31;
        va vaVar = this.q;
        int iHashCode14 = (iHashCode13 + (vaVar == null ? 0 : vaVar.hashCode())) * 31;
        pa paVar = this.r;
        int iHashCode15 = (this.s.hashCode() + ((iHashCode14 + (paVar == null ? 0 : paVar.hashCode())) * 31)) * 31;
        ja jaVar = this.t;
        int iHashCode16 = (iHashCode15 + (jaVar == null ? 0 : jaVar.a.hashCode())) * 31;
        ha haVar = this.u;
        return this.v.hashCode() + ((iHashCode16 + (haVar != null ? haVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionEvent(date=");
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
        sb.append(sq6.G(this.i));
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
        sb.append(", container=");
        sb.append(this.u);
        sb.append(", action=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
