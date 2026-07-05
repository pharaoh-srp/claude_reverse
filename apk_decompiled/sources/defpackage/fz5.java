package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fz5 implements cz5 {
    public final float E;
    public final float F;

    public fz5(float f, float f2) {
        this.E = f;
        this.F = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz5)) {
            return false;
        }
        fz5 fz5Var = (fz5) obj;
        return Float.compare(this.E, fz5Var.E) == 0 && Float.compare(this.F, fz5Var.F) == 0;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E;
    }

    public final int hashCode() {
        return Float.hashCode(this.F) + (Float.hashCode(this.E) * 31);
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.E);
        sb.append(", fontScale=");
        return ebh.o(sb, this.F, ')');
    }
}
