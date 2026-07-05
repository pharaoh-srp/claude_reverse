package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i15 {
    public static final i15 d = new i15("{\"denied\":\"soft\"}", null, 4, true);
    public final boolean a;
    public final String b;
    public final String c;

    public i15(String str, String str2, int i, boolean z) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i15)) {
            return false;
        }
        i15 i15Var = (i15) obj;
        return this.a == i15Var.a && x44.r(this.b, i15Var.b) && x44.r(this.c, i15Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConwayToolResult(success=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", error=");
        return ij0.m(sb, this.c, ")");
    }
}
