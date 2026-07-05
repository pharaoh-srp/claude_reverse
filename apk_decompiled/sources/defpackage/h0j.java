package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h0j {
    public final long a;
    public final rzi b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final f0j h;
    public final int i;
    public final g0j j;
    public final d0j k;
    public final uzi l;
    public final c0j m;
    public final a0j n;
    public final yzi o;
    public final wzi p;
    public final vzi q;
    public final e0j r;

    public h0j(long j, rzi rziVar, String str, String str2, String str3, String str4, String str5, f0j f0jVar, int i, g0j g0jVar, d0j d0jVar, qzi qziVar, uzi uziVar, c0j c0jVar, a0j a0jVar, yzi yziVar, wzi wziVar, vzi vziVar, e0j e0jVar) {
        this.a = j;
        this.b = rziVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = f0jVar;
        this.i = i;
        this.j = g0jVar;
        this.k = d0jVar;
        this.l = uziVar;
        this.m = c0jVar;
        this.n = a0jVar;
        this.o = yziVar;
        this.p = wziVar;
        this.q = vziVar;
        this.r = e0jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0j)) {
            return false;
        }
        h0j h0jVar = (h0j) obj;
        return this.a == h0jVar.a && this.b.equals(h0jVar.b) && x44.r(this.c, h0jVar.c) && x44.r(this.d, h0jVar.d) && x44.r(this.e, h0jVar.e) && x44.r(this.f, h0jVar.f) && x44.r(this.g, h0jVar.g) && this.h.equals(h0jVar.h) && this.i == h0jVar.i && this.j.equals(h0jVar.j) && x44.r(this.k, h0jVar.k) && x44.r(null, null) && x44.r(this.l, h0jVar.l) && x44.r(this.m, h0jVar.m) && x44.r(this.n, h0jVar.n) && x44.r(this.o, h0jVar.o) && this.p.equals(h0jVar.p) && x44.r(this.q, h0jVar.q) && this.r.equals(h0jVar.r);
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
        d0j d0jVar = this.k;
        int iHashCode8 = (iHashCode7 + (d0jVar == null ? 0 : d0jVar.hashCode())) * 961;
        uzi uziVar = this.l;
        int iHashCode9 = (iHashCode8 + (uziVar == null ? 0 : uziVar.hashCode())) * 961;
        c0j c0jVar = this.m;
        int iHashCode10 = (iHashCode9 + (c0jVar == null ? 0 : c0jVar.hashCode())) * 961;
        a0j a0jVar = this.n;
        int iHashCode11 = (iHashCode10 + (a0jVar == null ? 0 : a0jVar.hashCode())) * 31;
        yzi yziVar = this.o;
        int iHashCode12 = (this.p.hashCode() + ((iHashCode11 + (yziVar == null ? 0 : yziVar.hashCode())) * 31)) * 31;
        vzi vziVar = this.q;
        return this.r.hashCode() + ((iHashCode12 + (vziVar != null ? vziVar.a.hashCode() : 0)) * 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("VitalAppLaunchEvent(date=");
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
        switch (this.i) {
            case 1:
                str = "ANDROID";
                break;
            case 2:
                str = "IOS";
                break;
            case 3:
                str = "BROWSER";
                break;
            case 4:
                str = "FLUTTER";
                break;
            case 5:
                str = "REACT_NATIVE";
                break;
            case 6:
                str = "ROKU";
                break;
            case 7:
                str = "UNITY";
                break;
            case 8:
                str = "KOTLIN_MULTIPLATFORM";
                break;
            case 9:
                str = "ELECTRON";
                break;
            case 10:
                str = "RUM_CPP";
                break;
            case 11:
                str = "MAUI";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", view=");
        sb.append(this.j);
        sb.append(", usr=");
        sb.append(this.k);
        sb.append(", account=");
        sb.append((Object) null);
        sb.append(", connectivity=");
        sb.append(this.l);
        sb.append(", display=null, synthetics=");
        sb.append(this.m);
        sb.append(", ciTest=null, os=");
        sb.append(this.n);
        sb.append(", device=");
        sb.append(this.o);
        sb.append(", dd=");
        sb.append(this.p);
        sb.append(", context=");
        sb.append(this.q);
        sb.append(", container=null, vital=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
