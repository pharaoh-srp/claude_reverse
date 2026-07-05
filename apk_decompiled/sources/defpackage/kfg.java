package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kfg {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Number g;
    public final Boolean h;

    public kfg(int i, String str, String str2, String str3, String str4, Integer num, Number number, Boolean bool) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = number;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfg)) {
            return false;
        }
        kfg kfgVar = (kfg) obj;
        return this.a == kfgVar.a && x44.r(this.b, kfgVar.b) && x44.r(this.c, kfgVar.c) && x44.r(this.d, kfgVar.d) && x44.r(this.e, kfgVar.e) && this.f.equals(kfgVar.f) && x44.r(this.g, kfgVar.g) && x44.r(this.h, kfgVar.h);
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
        int iHashCode4 = (this.f.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 1742810335)) * 31;
        Number number = this.g;
        int iHashCode5 = (iHashCode4 + (number == null ? 0 : number.hashCode())) * 31;
        Boolean bool = this.h;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
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
        sb.append(this.e);
        sb.append(", locale=null, locales=null, timeZone=null, batteryLevel=null, powerSavingMode=null, brightnessLevel=null, logicalCpuCount=");
        sb.append(this.f);
        sb.append(", totalRam=");
        sb.append(this.g);
        sb.append(", isLowRam=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
