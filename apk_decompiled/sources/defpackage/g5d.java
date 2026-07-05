package defpackage;

import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public final class g5d extends e5d {
    public g5d(Magnifier magnifier) {
        super(magnifier);
    }

    @Override // defpackage.e5d, defpackage.c5d
    public final void a(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
