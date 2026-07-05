package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nla {
    public final yla a;

    public nla(yla ylaVar) {
        this.a = ylaVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        yla ylaVar = this.a;
        if (ylaVar != null) {
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(ylaVar.a, "width");
            qh9Var2.p(ylaVar.b, "height");
            qh9Var.o("viewport", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nla) && x44.r(this.a, ((nla) obj).a);
    }

    public final int hashCode() {
        yla ylaVar = this.a;
        if (ylaVar == null) {
            return 0;
        }
        return ylaVar.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.a + ")";
    }
}
