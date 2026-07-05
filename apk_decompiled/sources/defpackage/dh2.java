package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dh2 {
    public final tt a;
    public final bz7 b;
    public final kl7 c;

    public dh2(tt ttVar, kl7 kl7Var, bz7 bz7Var) {
        this.a = ttVar;
        this.b = bz7Var;
        this.c = kl7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh2)) {
            return false;
        }
        dh2 dh2Var = (dh2) obj;
        return x44.r(this.a, dh2Var.a) && this.b.equals(dh2Var.b) && x44.r(this.c, dh2Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + qy1.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
