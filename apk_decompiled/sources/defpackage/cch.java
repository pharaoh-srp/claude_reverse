package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cch {
    public final int a;
    public final String b;
    public final String c;

    public cch(String str, int i, String str2) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cch)) {
            return false;
        }
        cch cchVar = (cch) obj;
        return this.a == cchVar.a && x44.r(this.b, cchVar.b) && x44.r(this.c, cchVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(sq6.F(this.a) * 31, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryEventId(type=");
        switch (this.a) {
            case 1:
                str = "DEBUG";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "CONFIGURATION";
                break;
            case 4:
                str = "INTERCEPTOR_SETUP";
                break;
            case 5:
                str = "API_USAGE";
                break;
            case 6:
                str = "METRIC";
                break;
            case 7:
                str = "RESOURCE_HEADERS_SETUP";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", kind=");
        return ij0.m(sb, this.c, ")");
    }
}
