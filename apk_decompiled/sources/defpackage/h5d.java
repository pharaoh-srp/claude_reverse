package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class h5d implements d5d {
    public static final h5d a = new h5d();

    @Override // defpackage.d5d
    public final boolean a() {
        return true;
    }

    @Override // defpackage.d5d
    public final c5d b(View view, boolean z, long j, float f, float f2, boolean z2, cz5 cz5Var, float f3) {
        if (z) {
            return new g5d(new Magnifier(view));
        }
        long jU0 = cz5Var.U0(j);
        float fQ0 = cz5Var.q0(f);
        float fQ02 = cz5Var.q0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jU0 != 9205357640488583168L) {
            builder.setSize(mwa.L(Float.intBitsToFloat((int) (jU0 >> 32))), mwa.L(Float.intBitsToFloat((int) (jU0 & 4294967295L))));
        }
        if (!Float.isNaN(fQ0)) {
            builder.setCornerRadius(fQ0);
        }
        if (!Float.isNaN(fQ02)) {
            builder.setElevation(fQ02);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new g5d(builder.build());
    }
}
