package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class fgi extends rgi {
    public fgi(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.rgi
    public final boolean c(long j, Object obj) {
        return wgi.g ? wgi.h(j, obj) != 0 : wgi.i(j, obj) != 0;
    }

    @Override // defpackage.rgi
    public final byte d(long j, Object obj) {
        return wgi.g ? wgi.h(j, obj) : wgi.i(j, obj);
    }

    @Override // defpackage.rgi
    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.rgi
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.rgi
    public final void k(Object obj, long j, boolean z) {
        if (wgi.g) {
            wgi.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            wgi.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.rgi
    public final void l(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.rgi
    public final void m(Object obj, long j, float f) {
        n(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.rgi
    public final boolean r() {
        return false;
    }
}
