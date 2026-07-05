package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k29 {
    public final String a;
    public final l29 b;
    public final int c;
    public final String d;
    public final String e;

    public k29(String str, l29 l29Var, int i, String str2, String str3) {
        str.getClass();
        l29Var.getClass();
        this.a = str;
        this.b = l29Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k29)) {
            return false;
        }
        k29 k29Var = (k29) obj;
        return x44.r(this.a, k29Var.a) && this.b == k29Var.b && this.c == k29Var.c && x44.r(this.d, k29Var.d) && x44.r(this.e, k29Var.e);
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitStep(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", detailCount=");
        sb.append(this.c);
        sb.append(", output=");
        sb.append(this.d);
        sb.append(", backendLabel=");
        return ij0.m(sb, this.e, ")");
    }
}
