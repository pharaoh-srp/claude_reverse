package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cpe {
    public final String a;
    public final String b;
    public final int c;

    public cpe(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("domain", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            qh9Var.r("name", str2);
        }
        int i = this.c;
        if (i != 0) {
            qh9Var.o("type", new vh9(gid.k(i)));
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpe)) {
            return false;
        }
        cpe cpeVar = (cpe) obj;
        return x44.r(this.a, cpeVar.a) && x44.r(this.b, cpeVar.b) && this.c == cpeVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        int i = this.c;
        return iHashCode2 + (i != 0 ? sq6.F(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sbR = kgh.r("Provider(domain=", this.a, ", name=", this.b, ", type=");
        switch (this.c) {
            case 1:
                str = "AD";
                break;
            case 2:
                str = "ADVERTISING";
                break;
            case 3:
                str = "ANALYTICS";
                break;
            case 4:
                str = "CDN";
                break;
            case 5:
                str = "CONTENT";
                break;
            case 6:
                str = "CUSTOMER_SUCCESS";
                break;
            case 7:
                str = "FIRST_PARTY";
                break;
            case 8:
                str = "HOSTING";
                break;
            case 9:
                str = "MARKETING";
                break;
            case 10:
                str = "OTHER";
                break;
            case 11:
                str = "SOCIAL";
                break;
            case 12:
                str = "TAG_MANAGER";
                break;
            case 13:
                str = "UTILITY";
                break;
            case 14:
                str = "VIDEO";
                break;
            default:
                str = "null";
                break;
        }
        sbR.append(str);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ cpe(String str) {
        this(str, null, 7);
    }
}
