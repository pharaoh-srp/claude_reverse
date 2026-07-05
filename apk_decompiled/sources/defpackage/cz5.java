package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface cz5 {
    default float D(long j) {
        if (!dlh.a(clh.b(j), 4294967296L)) {
            d39.b("Only Sp can convert to Px");
        }
        float[] fArr = uu7.a;
        if (k0() < 1.03f) {
            return k0() * clh.c(j);
        }
        tu7 tu7VarA = uu7.a(k0());
        if (tu7VarA != null) {
            return tu7VarA.b(clh.c(j));
        }
        return k0() * clh.c(j);
    }

    default int E0(long j) {
        return Math.round(W0(j));
    }

    default int M0(float f) {
        float fQ0 = q0(f);
        if (Float.isInfinite(fQ0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fQ0);
    }

    default long T(int i) {
        return r(c0(i));
    }

    default long U0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fQ0 = q0(za6.d(j));
        float fQ02 = q0(za6.c(j));
        return (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(fQ02)) & 4294967295L);
    }

    default long W(float f) {
        return r(g0(f));
    }

    default float W0(long j) {
        if (!dlh.a(clh.b(j), 4294967296L)) {
            d39.b("Only Sp can convert to Px");
        }
        return q0(D(j));
    }

    default float c0(int i) {
        return i / getDensity();
    }

    default float g0(float f) {
        return f / getDensity();
    }

    float getDensity();

    float k0();

    default float q0(float f) {
        return getDensity() * f;
    }

    default long r(float f) {
        float[] fArr = uu7.a;
        if (k0() < 1.03f) {
            return eve.L(f / k0(), 4294967296L);
        }
        tu7 tu7VarA = uu7.a(k0());
        return eve.L(tu7VarA != null ? tu7VarA.a(f) : f / k0(), 4294967296L);
    }

    default long s(long j) {
        if (j != 9205357640488583168L) {
            return mpk.d(g0(Float.intBitsToFloat((int) (j >> 32))), g0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
