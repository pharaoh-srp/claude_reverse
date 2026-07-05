package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vla {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Number d;
    public final Number e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    public final int j;
    public final String k;

    public vla(Long l, Long l2, Long l3, Number number, Number number2, String str, String str2, Long l4, String str3, int i, String str4) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = number;
        this.e = number2;
        this.f = str;
        this.g = str2;
        this.h = l4;
        this.i = str3;
        this.j = i;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vla)) {
            return false;
        }
        vla vlaVar = (vla) obj;
        return x44.r(this.a, vlaVar.a) && x44.r(this.b, vlaVar.b) && x44.r(this.c, vlaVar.c) && x44.r(this.d, vlaVar.d) && x44.r(this.e, vlaVar.e) && x44.r(this.f, vlaVar.f) && x44.r(this.g, vlaVar.g) && x44.r(this.h, vlaVar.h) && x44.r(this.i, vlaVar.i) && this.j == vlaVar.j && x44.r(this.k, vlaVar.k);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Number number = this.d;
        int iHashCode4 = (iHashCode3 + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.e;
        int iHashCode5 = (iHashCode4 + (number2 == null ? 0 : number2.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.h;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.j;
        int iF = (iHashCode9 + (i == 0 ? 0 : sq6.F(i))) * 31;
        String str4 = this.k;
        return iF + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Script(duration=");
        sb.append(this.a);
        sb.append(", pauseDuration=");
        sb.append(this.b);
        sb.append(", forcedStyleAndLayoutDuration=");
        sb.append(this.c);
        sb.append(", startTime=");
        sb.append(this.d);
        sb.append(", executionStart=");
        sb.append(this.e);
        sb.append(", sourceUrl=");
        sb.append(this.f);
        sb.append(", sourceFunctionName=");
        sb.append(this.g);
        sb.append(", sourceCharPosition=");
        sb.append(this.h);
        sb.append(", invoker=");
        sb.append(this.i);
        sb.append(", invokerType=");
        switch (this.j) {
            case 1:
                str = "USER_CALLBACK";
                break;
            case 2:
                str = "EVENT_LISTENER";
                break;
            case 3:
                str = "RESOLVE_PROMISE";
                break;
            case 4:
                str = "REJECT_PROMISE";
                break;
            case 5:
                str = "CLASSIC_SCRIPT";
                break;
            case 6:
                str = "MODULE_SCRIPT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", windowAttribution=");
        return ij0.m(sb, this.k, ")");
    }
}
