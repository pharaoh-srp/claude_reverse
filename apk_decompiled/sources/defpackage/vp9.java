package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vp9 {
    public final Float a;
    public vi6 b;

    public vp9(Float f, vi6 vi6Var) {
        this.a = f;
        this.b = vi6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vp9)) {
            return false;
        }
        vp9 vp9Var = (vp9) obj;
        return vp9Var.a.equals(this.a) && x44.r(vp9Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + vb7.c(0, this.a.hashCode() * 31, 31);
    }
}
