package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xo1 implements tt {
    public final float a;
    public final float b;

    public xo1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.tt
    public final long a(long j, long j2, fu9 fu9Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        fu9 fu9Var2 = fu9.E;
        float f3 = this.a;
        if (fu9Var != fu9Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo1)) {
            return false;
        }
        xo1 xo1Var = (xo1) obj;
        return Float.compare(this.a, xo1Var.a) == 0 && Float.compare(this.b, xo1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return ebh.o(sb, this.b, ')');
    }
}
