package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f81 {
    public final int a;
    public final String b;
    public final String c;

    public f81(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f81)) {
            return false;
        }
        f81 f81Var = (f81) obj;
        return this.a == f81Var.a && x44.r(this.b, f81Var.b) && x44.r(this.c, f81Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoScrollSnapshot(totalItemsCount=");
        sb.append(this.a);
        sb.append(", oldestId=");
        sb.append(this.b);
        sb.append(", newestId=");
        return ij0.m(sb, this.c, ")");
    }
}
