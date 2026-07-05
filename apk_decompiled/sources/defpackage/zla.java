package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zla {
    public final long a;
    public final cla b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final qla h;
    public final int i;
    public final rla j;
    public final xla k;
    public final ala l;
    public final gla m;
    public final nla n;
    public final wla o;
    public final ela p;
    public final sla q;
    public final mla r;
    public final kla s;
    public final jla t;
    public final bla u;
    public final hla v;
    public final pla w;

    public zla(long j, cla claVar, String str, String str2, String str3, String str4, String str5, qla qlaVar, int i, rla rlaVar, xla xlaVar, ala alaVar, gla glaVar, nla nlaVar, wla wlaVar, ela elaVar, sla slaVar, mla mlaVar, kla klaVar, jla jlaVar, bla blaVar, hla hlaVar, pla plaVar) {
        this.a = j;
        this.b = claVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = qlaVar;
        this.i = i;
        this.j = rlaVar;
        this.k = xlaVar;
        this.l = alaVar;
        this.m = glaVar;
        this.n = nlaVar;
        this.o = wlaVar;
        this.p = elaVar;
        this.q = slaVar;
        this.r = mlaVar;
        this.s = klaVar;
        this.t = jlaVar;
        this.u = blaVar;
        this.v = hlaVar;
        this.w = plaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zla)) {
            return false;
        }
        zla zlaVar = (zla) obj;
        return this.a == zlaVar.a && this.b.equals(zlaVar.b) && x44.r(this.c, zlaVar.c) && x44.r(this.d, zlaVar.d) && x44.r(this.e, zlaVar.e) && x44.r(this.f, zlaVar.f) && x44.r(this.g, zlaVar.g) && this.h.equals(zlaVar.h) && this.i == zlaVar.i && this.j.equals(zlaVar.j) && x44.r(this.k, zlaVar.k) && x44.r(this.l, zlaVar.l) && x44.r(this.m, zlaVar.m) && x44.r(this.n, zlaVar.n) && x44.r(this.o, zlaVar.o) && x44.r(this.p, zlaVar.p) && x44.r(this.q, zlaVar.q) && x44.r(this.r, zlaVar.r) && this.s.equals(zlaVar.s) && x44.r(this.t, zlaVar.t) && x44.r(this.u, zlaVar.u) && x44.r(this.v, zlaVar.v) && this.w.equals(zlaVar.w);
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
        xla xlaVar = this.k;
        int iHashCode8 = (iHashCode7 + (xlaVar == null ? 0 : xlaVar.hashCode())) * 31;
        ala alaVar = this.l;
        int iHashCode9 = (iHashCode8 + (alaVar == null ? 0 : alaVar.hashCode())) * 31;
        gla glaVar = this.m;
        int iHashCode10 = (iHashCode9 + (glaVar == null ? 0 : glaVar.hashCode())) * 31;
        nla nlaVar = this.n;
        int iHashCode11 = (iHashCode10 + (nlaVar == null ? 0 : nlaVar.hashCode())) * 31;
        wla wlaVar = this.o;
        int iHashCode12 = (iHashCode11 + (wlaVar == null ? 0 : wlaVar.hashCode())) * 31;
        ela elaVar = this.p;
        int iHashCode13 = (iHashCode12 + (elaVar == null ? 0 : elaVar.hashCode())) * 31;
        sla slaVar = this.q;
        int iHashCode14 = (iHashCode13 + (slaVar == null ? 0 : slaVar.hashCode())) * 31;
        mla mlaVar = this.r;
        int iHashCode15 = (this.s.hashCode() + ((iHashCode14 + (mlaVar == null ? 0 : mlaVar.hashCode())) * 31)) * 31;
        jla jlaVar = this.t;
        int iHashCode16 = (iHashCode15 + (jlaVar == null ? 0 : jlaVar.hashCode())) * 31;
        bla blaVar = this.u;
        int iHashCode17 = (iHashCode16 + (blaVar == null ? 0 : blaVar.hashCode())) * 31;
        hla hlaVar = this.v;
        return this.w.hashCode() + ((iHashCode17 + (hlaVar != null ? hlaVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongTaskEvent(date=");
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
        sb.append(y6a.A(this.i));
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
        sb.append(", longTask=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
