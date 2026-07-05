package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b67 extends e67 {
    public final psi a;
    public final psi b;

    public b67(psi psiVar, psi psiVar2) {
        this.a = psiVar;
        this.b = psiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b67)) {
            return false;
        }
        b67 b67Var = (b67) obj;
        return this.a.equals(b67Var.a) && this.b.equals(b67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SpeedTarget(minSpeed=" + this.a + ", maxSpeed=" + this.b + ')';
    }
}
