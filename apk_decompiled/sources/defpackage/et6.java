package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class et6 {
    public final String a;
    public final String b;
    public final int c;

    public et6(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et6)) {
            return false;
        }
        et6 et6Var = (et6) obj;
        return x44.r(this.a, et6Var.a) && x44.r(this.b, et6Var.b) && this.c == et6Var.c;
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
}
