package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a1c {
    public final int a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;

    public /* synthetic */ a1c(int i, String str, Long l, Long l2, Long l3, Long l4, String str2, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1c)) {
            return false;
        }
        a1c a1cVar = (a1c) obj;
        return this.a == a1cVar.a && x44.r(this.b, a1cVar.b) && x44.r(this.c, a1cVar.c) && x44.r(this.d, a1cVar.d) && x44.r(this.e, a1cVar.e) && x44.r(this.f, a1cVar.f) && x44.r(this.g, a1cVar.g);
    }

    public final int hashCode() {
        int iF = sq6.F(this.a) * 31;
        String str = this.b;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkInfo(connectivity=");
        switch (this.a) {
            case 1:
                str = "NETWORK_NOT_CONNECTED";
                break;
            case 2:
                str = "NETWORK_ETHERNET";
                break;
            case 3:
                str = "NETWORK_WIFI";
                break;
            case 4:
                str = "NETWORK_WIMAX";
                break;
            case 5:
                str = "NETWORK_BLUETOOTH";
                break;
            case 6:
                str = "NETWORK_2G";
                break;
            case 7:
                str = "NETWORK_3G";
                break;
            case 8:
                str = "NETWORK_4G";
                break;
            case 9:
                str = "NETWORK_5G";
                break;
            case 10:
                str = "NETWORK_MOBILE_OTHER";
                break;
            case 11:
                str = "NETWORK_CELLULAR";
                break;
            case 12:
                str = "NETWORK_OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", carrierName=");
        sb.append(this.b);
        sb.append(", carrierId=");
        sb.append(this.c);
        sb.append(", upKbps=");
        sb.append(this.d);
        sb.append(", downKbps=");
        sb.append(this.e);
        sb.append(", strength=");
        sb.append(this.f);
        sb.append(", cellularTechnology=");
        return ij0.m(sb, this.g, ")");
    }

    public a1c(int i, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        sq6.a(i);
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str2;
    }
}
