package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jpe {
    public final fpe a;

    public jpe(fpe fpeVar) {
        this.a = fpeVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        fpe fpeVar = this.a;
        if (fpeVar != null) {
            qh9Var.o("headers", fpeVar.a());
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpe) && x44.r(this.a, ((jpe) obj).a);
    }

    public final int hashCode() {
        fpe fpeVar = this.a;
        if (fpeVar == null) {
            return 0;
        }
        return fpeVar.a.hashCode();
    }

    public final String toString() {
        return "Response(headers=" + this.a + ")";
    }
}
