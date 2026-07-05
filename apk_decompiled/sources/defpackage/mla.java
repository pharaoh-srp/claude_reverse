package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mla {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final Number i;
    public final Boolean j;
    public final Number k;
    public final Number l;
    public final Number m;
    public final Boolean n;

    public mla(int i, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, Number number, Boolean bool, Number number2, Number number3, Number number4, Boolean bool2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = arrayList;
        this.h = str6;
        this.i = number;
        this.j = bool;
        this.k = number2;
        this.l = number3;
        this.m = number4;
        this.n = bool2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        int i = this.a;
        if (i != 0) {
            qh9Var.o("type", new vh9(y6a.c(i)));
        }
        String str = this.b;
        if (str != null) {
            qh9Var.r("name", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            qh9Var.r("model", str2);
        }
        String str3 = this.d;
        if (str3 != null) {
            qh9Var.r("brand", str3);
        }
        String str4 = this.e;
        if (str4 != null) {
            qh9Var.r("architecture", str4);
        }
        String str5 = this.f;
        if (str5 != null) {
            qh9Var.r("locale", str5);
        }
        List list = this.g;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ig9Var.p((String) it.next());
            }
            qh9Var.o("locales", ig9Var);
        }
        String str6 = this.h;
        if (str6 != null) {
            qh9Var.r("time_zone", str6);
        }
        Number number = this.i;
        if (number != null) {
            qh9Var.p(number, "battery_level");
        }
        Boolean bool = this.j;
        if (bool != null) {
            qh9Var.q("power_saving_mode", bool);
        }
        Number number2 = this.k;
        if (number2 != null) {
            qh9Var.p(number2, "brightness_level");
        }
        Number number3 = this.l;
        if (number3 != null) {
            qh9Var.p(number3, "logical_cpu_count");
        }
        Number number4 = this.m;
        if (number4 != null) {
            qh9Var.p(number4, "total_ram");
        }
        Boolean bool2 = this.n;
        if (bool2 != null) {
            qh9Var.q("is_low_ram", bool2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mla)) {
            return false;
        }
        mla mlaVar = (mla) obj;
        return this.a == mlaVar.a && x44.r(this.b, mlaVar.b) && x44.r(this.c, mlaVar.c) && x44.r(this.d, mlaVar.d) && x44.r(this.e, mlaVar.e) && x44.r(this.f, mlaVar.f) && x44.r(this.g, mlaVar.g) && x44.r(this.h, mlaVar.h) && x44.r(this.i, mlaVar.i) && x44.r(this.j, mlaVar.j) && x44.r(this.k, mlaVar.k) && x44.r(this.l, mlaVar.l) && x44.r(this.m, mlaVar.m) && x44.r(this.n, mlaVar.n);
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
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.g;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Number number = this.i;
        int iHashCode8 = (iHashCode7 + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Number number2 = this.k;
        int iHashCode10 = (iHashCode9 + (number2 == null ? 0 : number2.hashCode())) * 31;
        Number number3 = this.l;
        int iHashCode11 = (iHashCode10 + (number3 == null ? 0 : number3.hashCode())) * 31;
        Number number4 = this.m;
        int iHashCode12 = (iHashCode11 + (number4 == null ? 0 : number4.hashCode())) * 31;
        Boolean bool2 = this.n;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
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
        kgh.u(sb, this.e, ", locale=", this.f, ", locales=");
        ms6.x(", timeZone=", this.h, ", batteryLevel=", sb, this.g);
        sb.append(this.i);
        sb.append(", powerSavingMode=");
        sb.append(this.j);
        sb.append(", brightnessLevel=");
        sb.append(this.k);
        sb.append(", logicalCpuCount=");
        sb.append(this.l);
        sb.append(", totalRam=");
        sb.append(this.m);
        sb.append(", isLowRam=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
