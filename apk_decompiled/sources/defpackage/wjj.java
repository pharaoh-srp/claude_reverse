package defpackage;

import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wjj implements zjj {
    @Override // defpackage.zjj
    public final float a(ge2 ge2Var, oub oubVar, RectF rectF) {
        ge2Var.getClass();
        oubVar.getClass();
        rectF.getClass();
        float fC = oubVar.c(ge2Var);
        if (fC == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 1.0f;
        }
        return (rectF.width() - (oubVar.d + oubVar.e)) / fC;
    }
}
