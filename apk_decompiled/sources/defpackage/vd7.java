package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vd7 {
    public final q68 a;
    public final q68 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ vd7(q68 q68Var, int i) {
        int i2 = i & 2;
        o68 o68Var = o68.a;
        this(o68Var, i2 != 0 ? o68Var : q68Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd7)) {
            return false;
        }
        vd7 vd7Var = (vd7) obj;
        return x44.r(this.a, vd7Var.a) && x44.r(this.b, vd7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.a + ", nonSizeOrCornerModifiers=" + this.b + ')';
    }

    public vd7(q68 q68Var, q68 q68Var2) {
        this.a = q68Var;
        this.b = q68Var2;
    }
}
