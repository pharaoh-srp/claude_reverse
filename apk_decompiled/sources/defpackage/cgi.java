package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class cgi extends ogi {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgi(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.ogi
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!tgi.g) {
                }
                break;
            default:
                if (!tgi.g) {
                }
                break;
        }
        return tgi.c(j, obj);
    }

    @Override // defpackage.ogi
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.ogi
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.ogi
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!tgi.g) {
                    tgi.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    tgi.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!tgi.g) {
                    tgi.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    tgi.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.ogi
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!tgi.g) {
                    tgi.l(obj, j, b);
                } else {
                    tgi.k(obj, j, b);
                }
                break;
            default:
                if (!tgi.g) {
                    tgi.l(obj, j, b);
                } else {
                    tgi.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.ogi
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.ogi
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(j, obj, Float.floatToIntBits(f));
                break;
            default:
                n(j, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.ogi
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
