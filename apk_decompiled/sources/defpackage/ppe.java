package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ppe {
    public final long a;
    public final doe b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final hpe h;
    public final int i;
    public final ipe j;
    public final mpe k;
    public final boe l;
    public final ioe m;
    public final poe n;
    public final lpe o;
    public final foe p;
    public final xoe q;
    public final ooe r;
    public final moe s;
    public final loe t;
    public final coe u;
    public final joe v;
    public final gpe w;

    public ppe(long j, doe doeVar, String str, String str2, String str3, String str4, String str5, hpe hpeVar, int i, ipe ipeVar, mpe mpeVar, boe boeVar, ioe ioeVar, poe poeVar, lpe lpeVar, foe foeVar, xoe xoeVar, ooe ooeVar, moe moeVar, loe loeVar, coe coeVar, joe joeVar, gpe gpeVar) {
        this.a = j;
        this.b = doeVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = hpeVar;
        this.i = i;
        this.j = ipeVar;
        this.k = mpeVar;
        this.l = boeVar;
        this.m = ioeVar;
        this.n = poeVar;
        this.o = lpeVar;
        this.p = foeVar;
        this.q = xoeVar;
        this.r = ooeVar;
        this.s = moeVar;
        this.t = loeVar;
        this.u = coeVar;
        this.v = joeVar;
        this.w = gpeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe)) {
            return false;
        }
        ppe ppeVar = (ppe) obj;
        return this.a == ppeVar.a && this.b.equals(ppeVar.b) && x44.r(this.c, ppeVar.c) && x44.r(this.d, ppeVar.d) && x44.r(this.e, ppeVar.e) && x44.r(this.f, ppeVar.f) && x44.r(this.g, ppeVar.g) && this.h.equals(ppeVar.h) && this.i == ppeVar.i && this.j.equals(ppeVar.j) && x44.r(this.k, ppeVar.k) && x44.r(this.l, ppeVar.l) && x44.r(this.m, ppeVar.m) && x44.r(this.n, ppeVar.n) && x44.r(this.o, ppeVar.o) && x44.r(this.p, ppeVar.p) && x44.r(this.q, ppeVar.q) && x44.r(this.r, ppeVar.r) && this.s.equals(ppeVar.s) && x44.r(this.t, ppeVar.t) && x44.r(this.u, ppeVar.u) && x44.r(this.v, ppeVar.v) && this.w.equals(ppeVar.w);
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
        mpe mpeVar = this.k;
        int iHashCode8 = (iHashCode7 + (mpeVar == null ? 0 : mpeVar.hashCode())) * 31;
        boe boeVar = this.l;
        int iHashCode9 = (iHashCode8 + (boeVar == null ? 0 : boeVar.hashCode())) * 31;
        ioe ioeVar = this.m;
        int iHashCode10 = (iHashCode9 + (ioeVar == null ? 0 : ioeVar.hashCode())) * 31;
        poe poeVar = this.n;
        int iHashCode11 = (iHashCode10 + (poeVar == null ? 0 : poeVar.hashCode())) * 31;
        lpe lpeVar = this.o;
        int iHashCode12 = (iHashCode11 + (lpeVar == null ? 0 : lpeVar.hashCode())) * 31;
        foe foeVar = this.p;
        int iHashCode13 = (iHashCode12 + (foeVar == null ? 0 : foeVar.hashCode())) * 31;
        xoe xoeVar = this.q;
        int iHashCode14 = (iHashCode13 + (xoeVar == null ? 0 : xoeVar.hashCode())) * 31;
        ooe ooeVar = this.r;
        int iHashCode15 = (this.s.hashCode() + ((iHashCode14 + (ooeVar == null ? 0 : ooeVar.hashCode())) * 31)) * 31;
        loe loeVar = this.t;
        int iHashCode16 = (iHashCode15 + (loeVar == null ? 0 : loeVar.a.hashCode())) * 31;
        coe coeVar = this.u;
        int iHashCode17 = (iHashCode16 + (coeVar == null ? 0 : coeVar.a.hashCode())) * 31;
        joe joeVar = this.v;
        return this.w.hashCode() + ((iHashCode17 + (joeVar != null ? joeVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceEvent(date=");
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
        sb.append(grc.D(this.i));
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
        sb.append(", resource=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
