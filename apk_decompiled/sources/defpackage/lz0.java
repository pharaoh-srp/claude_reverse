package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lz0 {
    public jz0 a;
    public jz0 b;
    public jz0 c;
    public jz0 d;
    public jz0 e;

    public final jz0 a() {
        return this.b;
    }

    public final jz0 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lz0)) {
            return false;
        }
        lz0 lz0Var = (lz0) obj;
        return this.a == lz0Var.a && this.b == lz0Var.b && this.c == lz0Var.c && this.d == lz0Var.d && this.e == lz0Var.e;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            obj = obj;
        }
        int iHashCode = obj.hashCode() * 11;
        jz0 jz0Var = this.e;
        return ((jz0Var != null ? jz0Var : 0).hashCode() * 7) + iHashCode;
    }
}
