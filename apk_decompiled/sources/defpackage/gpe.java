package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gpe {
    public final String a;
    public final int b;
    public final int c;
    public String d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final int k;
    public final ope l;
    public final dpe m;
    public final qoe n;
    public final hoe o;
    public final kpe p;
    public final toe q;
    public final roe r;
    public final String s;
    public final int t;
    public final cpe u;
    public final epe v;
    public final jpe w;
    public final uoe x;

    public gpe(String str, int i, int i2, String str2, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, int i3, ope opeVar, dpe dpeVar, qoe qoeVar, hoe hoeVar, kpe kpeVar, toe toeVar, roe roeVar, String str3, int i4, cpe cpeVar, epe epeVar, jpe jpeVar, uoe uoeVar) {
        sq6.a(i);
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = l5;
        this.j = l6;
        this.k = i3;
        this.l = opeVar;
        this.m = dpeVar;
        this.n = qoeVar;
        this.o = hoeVar;
        this.p = kpeVar;
        this.q = toeVar;
        this.r = roeVar;
        this.s = str3;
        this.t = i4;
        this.u = cpeVar;
        this.v = epeVar;
        this.w = jpeVar;
        this.x = uoeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe)) {
            return false;
        }
        gpe gpeVar = (gpe) obj;
        return x44.r(this.a, gpeVar.a) && this.b == gpeVar.b && this.c == gpeVar.c && x44.r(this.d, gpeVar.d) && x44.r(this.e, gpeVar.e) && x44.r(this.f, gpeVar.f) && x44.r(this.g, gpeVar.g) && x44.r(this.h, gpeVar.h) && x44.r(this.i, gpeVar.i) && x44.r(this.j, gpeVar.j) && this.k == gpeVar.k && x44.r(this.l, gpeVar.l) && x44.r(this.m, gpeVar.m) && x44.r(this.n, gpeVar.n) && x44.r(this.o, gpeVar.o) && x44.r(this.p, gpeVar.p) && x44.r(this.q, gpeVar.q) && x44.r(this.r, gpeVar.r) && x44.r(this.s, gpeVar.s) && this.t == gpeVar.t && x44.r(this.u, gpeVar.u) && x44.r(this.v, gpeVar.v) && x44.r(this.w, gpeVar.w) && x44.r(this.x, gpeVar.x);
    }

    public final int hashCode() {
        String str = this.a;
        int iC = qy1.c(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        int i = this.c;
        int iL = kgh.l((iC + (i == 0 ? 0 : sq6.F(i))) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode = (iL + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.h;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.i;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.j;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        int i2 = this.k;
        int iF = (iHashCode6 + (i2 == 0 ? 0 : sq6.F(i2))) * 31;
        ope opeVar = this.l;
        int iHashCode7 = (iF + (opeVar == null ? 0 : opeVar.hashCode())) * 31;
        dpe dpeVar = this.m;
        int iHashCode8 = (iHashCode7 + (dpeVar == null ? 0 : dpeVar.hashCode())) * 31;
        qoe qoeVar = this.n;
        int iHashCode9 = (iHashCode8 + (qoeVar == null ? 0 : qoeVar.hashCode())) * 31;
        hoe hoeVar = this.o;
        int iHashCode10 = (iHashCode9 + (hoeVar == null ? 0 : hoeVar.hashCode())) * 31;
        kpe kpeVar = this.p;
        int iHashCode11 = (iHashCode10 + (kpeVar == null ? 0 : kpeVar.hashCode())) * 31;
        toe toeVar = this.q;
        int iHashCode12 = (iHashCode11 + (toeVar == null ? 0 : toeVar.hashCode())) * 31;
        roe roeVar = this.r;
        int iHashCode13 = (iHashCode12 + (roeVar == null ? 0 : roeVar.hashCode())) * 31;
        String str2 = this.s;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i3 = this.t;
        int iF2 = (iHashCode14 + (i3 == 0 ? 0 : sq6.F(i3))) * 31;
        cpe cpeVar = this.u;
        int iHashCode15 = (iF2 + (cpeVar == null ? 0 : cpeVar.hashCode())) * 31;
        epe epeVar = this.v;
        int iHashCode16 = (iHashCode15 + (epeVar == null ? 0 : epeVar.hashCode())) * 31;
        jpe jpeVar = this.w;
        int iHashCode17 = (iHashCode16 + (jpeVar == null ? 0 : jpeVar.hashCode())) * 31;
        uoe uoeVar = this.x;
        return iHashCode17 + (uoeVar != null ? uoeVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = this.d;
        StringBuilder sbX = sq6.x("Resource(id=", this.a, ", type=");
        String str3 = "null";
        switch (this.b) {
            case 1:
                str = "DOCUMENT";
                break;
            case 2:
                str = "XHR";
                break;
            case 3:
                str = "BEACON";
                break;
            case 4:
                str = "FETCH";
                break;
            case 5:
                str = "CSS";
                break;
            case 6:
                str = "JS";
                break;
            case 7:
                str = "IMAGE";
                break;
            case 8:
                str = "FONT";
                break;
            case 9:
                str = "MEDIA";
                break;
            case 10:
                str = "OTHER";
                break;
            case 11:
                str = "NATIVE";
                break;
            default:
                str = "null";
                break;
        }
        sbX.append(str);
        sbX.append(", method=");
        switch (this.c) {
            case 1:
                str3 = "POST";
                break;
            case 2:
                str3 = "GET";
                break;
            case 3:
                str3 = "HEAD";
                break;
            case 4:
                str3 = "PUT";
                break;
            case 5:
                str3 = "DELETE";
                break;
            case 6:
                str3 = "PATCH";
                break;
            case 7:
                str3 = "TRACE";
                break;
            case 8:
                str3 = "OPTIONS";
                break;
            case 9:
                str3 = "CONNECT";
                break;
        }
        sbX.append(str3);
        sbX.append(", url=");
        sbX.append(str2);
        sbX.append(", statusCode=");
        sbX.append(this.e);
        sbX.append(", duration=");
        sbX.append(this.f);
        sbX.append(", size=");
        sbX.append(this.g);
        sbX.append(", encodedBodySize=");
        sbX.append(this.h);
        sbX.append(", decodedBodySize=");
        sbX.append(this.i);
        sbX.append(", transferSize=");
        sbX.append(this.j);
        sbX.append(", renderBlockingStatus=");
        sbX.append(gid.A(this.k));
        sbX.append(", worker=");
        sbX.append(this.l);
        sbX.append(", redirect=");
        sbX.append(this.m);
        sbX.append(", dns=");
        sbX.append(this.n);
        sbX.append(", connect=");
        sbX.append(this.o);
        sbX.append(", ssl=");
        sbX.append(this.p);
        sbX.append(", firstByte=");
        sbX.append(this.q);
        sbX.append(", download=");
        sbX.append(this.r);
        sbX.append(", protocol=");
        sbX.append(this.s);
        sbX.append(", deliveryType=");
        sbX.append(gid.w(this.t));
        sbX.append(", provider=");
        sbX.append(this.u);
        sbX.append(", request=");
        sbX.append(this.v);
        sbX.append(", response=");
        sbX.append(this.w);
        sbX.append(", graphql=");
        sbX.append(this.x);
        sbX.append(")");
        return sbX.toString();
    }
}
