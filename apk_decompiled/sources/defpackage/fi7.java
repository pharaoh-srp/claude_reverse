package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fi7 {
    public final String a;
    public final String b;
    public final jj7 c;
    public final List d;

    public fi7(String str, String str2, jj7 jj7Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = jj7Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi7)) {
            return false;
        }
        fi7 fi7Var = (fi7) obj;
        return x44.r(this.a, fi7Var.a) && x44.r(this.b, fi7Var.b) && this.c == fi7Var.c && this.d.equals(fi7Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("FileDiff(oldPath=", this.a, ", newPath=", this.b, ", status=");
        sbR.append(this.c);
        sbR.append(", hunks=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
