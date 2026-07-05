package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class egi extends qgi {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egi(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.qgi
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (vgi.g) {
                    if (vgi.h(j, obj) == 0) {
                    }
                } else if (vgi.i(j, obj) == 0) {
                }
                break;
            default:
                if (vgi.g) {
                    if (vgi.h(j, obj) == 0) {
                    }
                } else if (vgi.i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.qgi
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!vgi.g) {
                }
                break;
            default:
                if (!vgi.g) {
                }
                break;
        }
        return vgi.i(j, obj);
    }

    @Override // defpackage.qgi
    public final double e(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.qgi
    public final float f(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.qgi
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!vgi.g) {
                    vgi.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    vgi.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!vgi.g) {
                    vgi.m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    vgi.l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.qgi
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!vgi.g) {
                    vgi.m(obj, j, b);
                } else {
                    vgi.l(obj, j, b);
                }
                break;
            default:
                if (!vgi.g) {
                    vgi.m(obj, j, b);
                } else {
                    vgi.l(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.qgi
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

    @Override // defpackage.qgi
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

    @Override // defpackage.qgi
    public final boolean s() {
        switch (this.b) {
        }
        return false;
    }
}
