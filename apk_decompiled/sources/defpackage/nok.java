package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class nok extends rok {
    @Override // defpackage.rok
    public final double B0(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.E).getLong(obj, j));
    }

    @Override // defpackage.rok
    public final float C0(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.E).getInt(obj, j));
    }

    @Override // defpackage.rok
    public final void D0(Object obj, long j, boolean z) {
        if (wok.g) {
            wok.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            wok.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.rok
    public final void E0(Object obj, long j, byte b) {
        if (wok.g) {
            wok.c(obj, j, b);
        } else {
            wok.d(obj, j, b);
        }
    }

    @Override // defpackage.rok
    public final void F0(Object obj, long j, double d) {
        ((Unsafe) this.E).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.rok
    public final void G0(Object obj, long j, float f) {
        ((Unsafe) this.E).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.rok
    public final boolean H0(long j, Object obj) {
        return wok.g ? wok.m(j, obj) : wok.n(j, obj);
    }
}
