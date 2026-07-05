package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class op9 {
    public final String a;
    public final int b;
    public final wpg c;
    public final Long d;

    public op9(String str, int i, wpg wpgVar, Long l) {
        wpgVar.getClass();
        this.a = str;
        this.b = i;
        this.c = wpgVar;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op9)) {
            return false;
        }
        op9 op9Var = (op9) obj;
        return this.a.equals(op9Var.a) && this.b == op9Var.b && x44.r(this.c, op9Var.c) && x44.r(this.d, op9Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + vb7.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        Long l = this.d;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = ij0.p("KeyedEntry(key=", this.a, this.b, ", idx=", ", entry=");
        sbP.append(this.c);
        sbP.append(", prevTs=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
