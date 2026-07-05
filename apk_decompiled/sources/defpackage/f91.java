package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f91 {
    public final String a;
    public final long b;
    public final int c;

    public f91(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static s20 a() {
        s20 s20Var = new s20();
        s20Var.G = 0L;
        return s20Var;
    }

    public final int b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f91)) {
            return false;
        }
        f91 f91Var = (f91) obj;
        String str = f91Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != f91Var.b) {
            return false;
        }
        int i = f91Var.c;
        int i2 = this.c;
        return i2 == 0 ? i == 0 : sq6.c(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? sq6.F(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
