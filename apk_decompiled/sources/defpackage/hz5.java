package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class hz5 implements cz5 {
    public final float E;
    public final float F;
    public final tu7 G;

    public hz5(float f, float f2, tu7 tu7Var) {
        this.E = f;
        this.F = f2;
        this.G = tu7Var;
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        if (dlh.a(clh.b(j), 4294967296L)) {
            return this.G.b(clh.c(j));
        }
        sz6.j("Only Sp can convert to Px");
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz5)) {
            return false;
        }
        hz5 hz5Var = (hz5) obj;
        return Float.compare(this.E, hz5Var.E) == 0 && Float.compare(this.F, hz5Var.F) == 0 && this.G.equals(hz5Var.G);
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E;
    }

    public final int hashCode() {
        return this.G.hashCode() + vb7.b(this.F, Float.hashCode(this.E) * 31, 31);
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.F;
    }

    @Override // defpackage.cz5
    public final long r(float f) {
        return eve.L(this.G.a(f), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.E + ", fontScale=" + this.F + ", converter=" + this.G + ')';
    }
}
