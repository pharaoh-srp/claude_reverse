package defpackage;

import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d5g extends rzf {
    public final /* synthetic */ wlg c;
    public final /* synthetic */ float d;
    public final /* synthetic */ List e;

    public d5g(z19 z19Var, float f, List list) {
        this.c = z19Var;
        this.d = f;
        this.e = list;
    }

    @Override // defpackage.rzf
    public final Shader c(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * ((Number) this.c.getValue()).floatValue();
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) * this.d;
        return usj.d(0, (((long) Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat + fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), this.e, null);
    }
}
