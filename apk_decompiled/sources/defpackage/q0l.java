package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class q0l extends r0l {
    public q0l(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.r0l
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(k(j, obj));
    }

    @Override // defpackage.r0l
    public final void c(Object obj, long j, byte b) {
        if (t0l.g) {
            t0l.g(obj, j, b);
        } else {
            t0l.h(obj, j, b);
        }
    }

    @Override // defpackage.r0l
    public final void d(Object obj, long j, double d) {
        f(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.r0l
    public final void e(Object obj, long j, float f) {
        b(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.r0l
    public final void g(Object obj, long j, boolean z) {
        if (t0l.g) {
            t0l.g(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            t0l.h(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.r0l
    public final float h(long j, Object obj) {
        return Float.intBitsToFloat(j(j, obj));
    }

    @Override // defpackage.r0l
    public final boolean i(long j, Object obj) {
        if (t0l.g) {
            return ((byte) (t0l.c.j((-4) & j, obj) >>> ((int) (((~j) & 3) << 3)))) != 0;
        }
        return ((byte) (t0l.c.j((-4) & j, obj) >>> ((int) ((j & 3) << 3)))) != 0;
    }
}
