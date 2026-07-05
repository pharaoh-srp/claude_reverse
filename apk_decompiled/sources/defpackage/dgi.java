package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class dgi extends pgi {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dgi(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.pgi
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (ugi.g) {
                    if (ugi.h(j, obj) == 0) {
                    }
                } else if (ugi.i(j, obj) == 0) {
                }
                break;
            default:
                if (ugi.g) {
                    if (ugi.h(j, obj) == 0) {
                    }
                } else if (ugi.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.pgi
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!ugi.g) {
                }
                break;
            default:
                if (!ugi.g) {
                }
                break;
        }
        return ugi.i(j, obj);
    }

    @Override // defpackage.pgi
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.pgi
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.pgi
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!ugi.g) {
                    ugi.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ugi.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!ugi.g) {
                    ugi.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ugi.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.pgi
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!ugi.g) {
                    ugi.m(obj, j, b);
                } else {
                    ugi.l(obj, j, b);
                }
                break;
            default:
                if (!ugi.g) {
                    ugi.m(obj, j, b);
                } else {
                    ugi.l(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.pgi
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.pgi
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.pgi
    public final boolean s() {
        switch (this.b) {
        }
        return false;
    }
}
