package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class uo1 implements tt {
    public final float a;

    public uo1(float f) {
        this.a = f;
    }

    @Override // defpackage.tt
    public final long a(long j, long j2, fu9 fu9Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = (1.0f + this.a) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((((int) (j3 & 4294967295L)) / 2.0f) * MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L) | (((long) Math.round(f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo1) && Float.compare(this.a, ((uo1) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
