package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fhg implements hhg {
    public final pt6 a;
    public final String b;

    public fhg(pt6 pt6Var, String str) {
        this.a = pt6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhg)) {
            return false;
        }
        fhg fhgVar = (fhg) obj;
        return this.a.equals(fhgVar.a) && this.b.equals(fhgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(errorMessage=" + this.a + ", partialText=" + this.b + ")";
    }
}
