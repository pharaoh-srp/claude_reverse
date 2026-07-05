package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r81 {
    public final String a;
    public final String b;
    public final String c;
    public final f91 d;
    public final int e;

    public r81(String str, String str2, String str3, f91 f91Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f91Var;
        this.e = i;
    }

    public static f4i a() {
        return new f4i();
    }

    public final f91 b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r81)) {
            return false;
        }
        r81 r81Var = (r81) obj;
        String str = r81Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = r81Var.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = r81Var.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        f91 f91Var = r81Var.d;
        f91 f91Var2 = this.d;
        if (f91Var2 == null) {
            if (f91Var != null) {
                return false;
            }
        } else if (!f91Var2.equals(f91Var)) {
            return false;
        }
        int i = r81Var.e;
        int i2 = this.e;
        return i2 == 0 ? i == 0 : sq6.c(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f91 f91Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (f91Var == null ? 0 : f91Var.hashCode())) * 1000003;
        int i = this.e;
        return iHashCode4 ^ (i != 0 ? sq6.F(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
