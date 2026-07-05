package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a51 {
    public static final a51 d = new z41().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a51(z41 z41Var) {
        this.a = z41Var.a;
        this.b = z41Var.b;
        this.c = z41Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a51.class != obj.getClass()) {
            return false;
        }
        a51 a51Var = (a51) obj;
        return this.a == a51Var.a && this.b == a51Var.b && this.c == a51Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
