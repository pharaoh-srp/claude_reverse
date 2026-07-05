package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class g8f extends vp4 {
    public View E;
    public Canvas F;
    public Bitmap G;
    public float H;
    public float I;
    public /* synthetic */ Object J;
    public final /* synthetic */ j8f K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8f(j8f j8fVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = j8fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
