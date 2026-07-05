package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class yve implements x35 {
    public static final yve E = new yve();
    public static final RectF F = new RectF();

    @Override // defpackage.x35
    public final void a(Path path, v35 v35Var, float f, float f2, float f3, float f4) {
        float f5;
        path.getClass();
        int iOrdinal = v35Var.ordinal();
        RectF rectF = F;
        if (iOrdinal == 0) {
            rectF.set(f, f4, (f3 * 2.0f) - f, (2.0f * f2) - f4);
            f5 = 180.0f;
        } else if (iOrdinal == 1) {
            rectF.set((f * 2.0f) - f3, f2, f3, (2.0f * f4) - f2);
            f5 = 270.0f;
        } else if (iOrdinal == 2) {
            rectF.set((f3 * 2.0f) - f, (2.0f * f2) - f4, f, f4);
            f5 = MTTypesetterKt.kLineSkipLimitMultiplier;
        } else if (iOrdinal != 3) {
            wg6.i();
            return;
        } else {
            rectF.set(f3, (f4 * 2.0f) - f2, (2.0f * f) - f3, f2);
            f5 = 90.0f;
        }
        path.arcTo(rectF, f5, 90.0f);
    }
}
