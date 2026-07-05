package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class joe {
    public final koe a;
    public final int b;

    public joe(koe koeVar, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = koeVar;
        this.b = i;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9 qh9Var2 = new qh9();
        qh9Var2.r("id", this.a.a);
        qh9Var.o("view", qh9Var2);
        qh9Var.o("source", new vh9(grc.h(this.b)));
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joe)) {
            return false;
        }
        joe joeVar = (joe) obj;
        return this.a.equals(joeVar.a) && this.b == joeVar.b;
    }

    public final int hashCode() {
        return sq6.F(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.a + ", source=" + grc.D(this.b) + ")";
    }
}
