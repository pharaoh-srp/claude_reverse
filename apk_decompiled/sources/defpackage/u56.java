package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class u56 {
    public final zb0 a;
    public final zb0 b;
    public final String c;

    public u56(zb0 zb0Var, zb0 zb0Var2, String str) {
        this.a = zb0Var;
        this.b = zb0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u56)) {
            return false;
        }
        u56 u56Var = (u56) obj;
        return this.a.equals(u56Var.a) && x44.r(this.b, u56Var.b) && x44.r(this.c, u56Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zb0 zb0Var = this.b;
        int iHashCode2 = (iHashCode + (zb0Var == null ? 0 : zb0Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclaimerText(firstLine=");
        sb.append((Object) this.a);
        sb.append(", secondLine=");
        sb.append((Object) this.b);
        sb.append(", url=");
        return ij0.m(sb, this.c, ")");
    }
}
