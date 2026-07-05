package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s1j implements u1j {
    public final String a;
    public final zy7 b;

    public s1j(zy7 zy7Var, String str) {
        str.getClass();
        zy7Var.getClass();
        this.a = str;
        this.b = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1j)) {
            return false;
        }
        s1j s1jVar = (s1j) obj;
        return x44.r(this.a, s1jVar.a) && x44.r(this.b, s1jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Informational(message=" + this.a + ", onDismiss=" + this.b + ")";
    }
}
