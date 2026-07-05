package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fq3 implements gq3 {
    public final float E;
    public final float F;

    public fq3(float f, float f2) {
        this.E = f;
        this.F = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gq3
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.hq3
    public final Comparable e() {
        return Float.valueOf(this.E);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fq3)) {
            return false;
        }
        float f = this.E;
        float f2 = this.F;
        if (f > f2) {
            fq3 fq3Var = (fq3) obj;
            if (fq3Var.E > fq3Var.F) {
                return true;
            }
        }
        fq3 fq3Var2 = (fq3) obj;
        return f == fq3Var2.E && f2 == fq3Var2.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return Float.valueOf(this.F);
    }

    public final int hashCode() {
        float f = this.E;
        float f2 = this.F;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    @Override // defpackage.hq3
    public final boolean isEmpty() {
        return this.E > this.F;
    }

    public final String toString() {
        return this.E + ".." + this.F;
    }
}
