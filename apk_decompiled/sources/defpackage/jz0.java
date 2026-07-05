package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jz0 {
    public final nz0 a;
    public final lz0 b;

    public jz0(nz0 nz0Var, lz0 lz0Var) {
        this.a = nz0Var;
        this.b = lz0Var;
    }

    public final lz0 a() {
        return this.b;
    }

    public final nz0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz0)) {
            return false;
        }
        jz0 jz0Var = (jz0) obj;
        return this.a.equals(jz0Var.a) && this.b.equals(jz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
