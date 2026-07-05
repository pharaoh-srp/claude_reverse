package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class poe {
    public final npe a;

    public poe(npe npeVar) {
        this.a = npeVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        npe npeVar = this.a;
        if (npeVar != null) {
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(npeVar.a, "width");
            qh9Var2.p(npeVar.b, "height");
            qh9Var.o("viewport", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof poe) && x44.r(this.a, ((poe) obj).a);
    }

    public final int hashCode() {
        npe npeVar = this.a;
        if (npeVar == null) {
            return 0;
        }
        return npeVar.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.a + ")";
    }
}
