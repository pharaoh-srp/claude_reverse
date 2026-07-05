package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class igi extends sgi {
    @Override // defpackage.sgi
    public final boolean c(long j, Object obj) {
        return xgi.g ? xgi.b(j, obj) : xgi.c(j, obj);
    }

    @Override // defpackage.sgi
    public final double d(long j, Object obj) {
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.sgi
    public final float e(long j, Object obj) {
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.sgi
    public final void j(Object obj, long j, boolean z) {
        if (xgi.g) {
            xgi.k(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            xgi.l(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.sgi
    public final void k(Object obj, long j, byte b) {
        if (xgi.g) {
            xgi.k(obj, j, b);
        } else {
            xgi.l(obj, j, b);
        }
    }

    @Override // defpackage.sgi
    public final void l(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.sgi
    public final void m(Object obj, long j, float f) {
        n(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.sgi
    public final boolean r() {
        return false;
    }
}
