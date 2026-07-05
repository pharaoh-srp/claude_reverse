package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s9g {
    public final bz7 a;
    public final kl7 b;

    public s9g(kl7 kl7Var, bz7 bz7Var) {
        this.a = bz7Var;
        this.b = kl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9g)) {
            return false;
        }
        s9g s9gVar = (s9g) obj;
        return this.a.equals(s9gVar.a) && x44.r(this.b, s9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
