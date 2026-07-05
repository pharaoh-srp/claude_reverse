package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class erc {
    public final b40 a;
    public final int b;
    public final int c;

    public erc(b40 b40Var, int i, int i2) {
        this.a = b40Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof erc) {
            erc ercVar = (erc) obj;
            if (this.a == ercVar.a && this.b == ercVar.b && this.c == ercVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return vb7.r(sb, this.c, ')');
    }
}
