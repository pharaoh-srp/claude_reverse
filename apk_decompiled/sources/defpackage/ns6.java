package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ns6 {
    public final os6 a;
    public final int b;

    public ns6(os6 os6Var, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = os6Var;
        this.b = i;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9 qh9Var2 = new qh9();
        qh9Var2.r("id", this.a.a);
        qh9Var.o("view", qh9Var2);
        qh9Var.o("source", ms6.b(this.b));
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns6)) {
            return false;
        }
        ns6 ns6Var = (ns6) obj;
        return this.a.equals(ns6Var.a) && this.b == ns6Var.b;
    }

    public final int hashCode() {
        return sq6.F(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.a + ", source=" + ms6.B(this.b) + ")";
    }
}
