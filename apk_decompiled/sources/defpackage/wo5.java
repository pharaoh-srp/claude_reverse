package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo5 {
    public static volatile wo5 d = new wo5(vo5.E, false, true);
    public final boolean a;
    public final boolean b;
    public final bz7 c;

    public wo5(bz7 bz7Var, boolean z, boolean z2) {
        bz7Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = bz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo5)) {
            return false;
        }
        wo5 wo5Var = (wo5) obj;
        return this.a == wo5Var.a && this.b == wo5Var.b && x44.r(this.c, wo5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "DecomposeSettings(duplicateConfigurationsEnabled=" + this.a + ", mainThreadCheckEnabled=" + this.b + ", onDecomposeError=" + this.c + ')';
    }
}
