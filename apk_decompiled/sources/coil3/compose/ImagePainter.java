package coil3.compose;

import defpackage.bpc;
import defpackage.cv9;
import defpackage.efe;
import defpackage.fj0;
import defpackage.grc;
import defpackage.ib2;
import defpackage.jz;
import defpackage.mdj;
import defpackage.wv8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/ImagePainter;", "Lbpc;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class ImagePainter extends bpc {
    public final wv8 J;

    public ImagePainter(wv8 wv8Var) {
        this.J = wv8Var;
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        wv8 wv8Var = this.J;
        int iB = wv8Var.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = wv8Var.a();
        return (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        wv8 wv8Var = this.J;
        int iB = wv8Var.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (ib2Var.g() >> 32)) / iB : 1.0f;
        int iA = wv8Var.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)) / iA : 1.0f;
        fj0 fj0Var = ib2Var.F;
        long jW = fj0Var.w();
        fj0Var.p().g();
        try {
            ((efe) fj0Var.E).C(0L, fIntBitsToFloat, fIntBitsToFloat2);
            wv8Var.e(jz.b(ib2Var.F.p()));
        } finally {
            grc.y(fj0Var, jW);
        }
    }
}
