package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yzi {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final Float h;
    public final Boolean i;
    public final Number j;
    public final Integer k;
    public final Number l;
    public final Boolean m;

    public yzi(int i, String str, String str2, String str3, String str4, List list, String str5, Float f, Boolean bool, Number number, Integer num, Number number2, Boolean bool2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = f;
        this.i = bool;
        this.j = number;
        this.k = num;
        this.l = number2;
        this.m = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzi)) {
            return false;
        }
        yzi yziVar = (yzi) obj;
        return this.a == yziVar.a && x44.r(this.b, yziVar.b) && x44.r(this.c, yziVar.c) && x44.r(this.d, yziVar.d) && x44.r(this.e, yziVar.e) && x44.r(this.f, yziVar.f) && x44.r(this.g, yziVar.g) && x44.r(this.h, yziVar.h) && x44.r(this.i, yziVar.i) && x44.r(this.j, yziVar.j) && this.k.equals(yziVar.k) && x44.r(this.l, yziVar.l) && x44.r(this.m, yziVar.m);
    }

    public final int hashCode() {
        int i = this.a;
        int iF = (i == 0 ? 0 : sq6.F(i)) * 31;
        String str = this.b;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 961;
        List list = this.f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.h;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Number number = this.j;
        int iHashCode9 = (this.k.hashCode() + ((iHashCode8 + (number == null ? 0 : number.hashCode())) * 31)) * 31;
        Number number2 = this.l;
        int iHashCode10 = (iHashCode9 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Boolean bool2 = this.m;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Device(type=");
        switch (this.a) {
            case 1:
                str = "MOBILE";
                break;
            case 2:
                str = "DESKTOP";
                break;
            case 3:
                str = "TABLET";
                break;
            case 4:
                str = "TV";
                break;
            case 5:
                str = "GAMING_CONSOLE";
                break;
            case 6:
                str = "BOT";
                break;
            case 7:
                str = "OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", model=");
        kgh.u(sb, this.c, ", brand=", this.d, ", architecture=");
        qy1.p(this.e, ", locale=null, locales=", ", timeZone=", sb, this.f);
        sb.append(this.g);
        sb.append(", batteryLevel=");
        sb.append(this.h);
        sb.append(", powerSavingMode=");
        sb.append(this.i);
        sb.append(", brightnessLevel=");
        sb.append(this.j);
        sb.append(", logicalCpuCount=");
        sb.append(this.k);
        sb.append(", totalRam=");
        sb.append(this.l);
        sb.append(", isLowRam=");
        return qy1.h(sb, this.m, ")");
    }
}
