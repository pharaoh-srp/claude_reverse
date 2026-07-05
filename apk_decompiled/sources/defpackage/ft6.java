package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ft6 {
    public final int a;
    public final long b;
    public final String c;
    public final et6 d;

    public ft6(int i, long j, String str, et6 et6Var) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = et6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft6)) {
            return false;
        }
        ft6 ft6Var = (ft6) obj;
        return this.a == ft6Var.a && this.b == ft6Var.b && x44.r(this.c, ft6Var.c) && x44.r(this.d, ft6Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(vb7.e(sq6.F(this.a) * 31, 31, this.b), 31, this.c);
        et6 et6Var = this.d;
        return iL + (et6Var == null ? 0 : et6Var.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Resource(method=");
        switch (this.a) {
            case 1:
                str = "POST";
                break;
            case 2:
                str = "GET";
                break;
            case 3:
                str = "HEAD";
                break;
            case 4:
                str = "PUT";
                break;
            case 5:
                str = "DELETE";
                break;
            case 6:
                str = "PATCH";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "OPTIONS";
                break;
            case 9:
                str = "CONNECT";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", statusCode=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", provider=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
