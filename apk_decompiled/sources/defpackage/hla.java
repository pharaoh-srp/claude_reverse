package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hla {
    public final ila a;
    public final int b;

    public hla(ila ilaVar, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = ilaVar;
        this.b = i;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9 qh9Var2 = new qh9();
        qh9Var2.r("id", this.a.a);
        qh9Var.o("view", qh9Var2);
        qh9Var.o("source", y6a.a(this.b));
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hla)) {
            return false;
        }
        hla hlaVar = (hla) obj;
        return this.a.equals(hlaVar.a) && this.b == hlaVar.b;
    }

    public final int hashCode() {
        return sq6.F(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.a + ", source=" + y6a.A(this.b) + ")";
    }
}
