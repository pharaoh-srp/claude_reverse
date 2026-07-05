package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class yx extends vp4 {
    public float E;
    public aae F;
    public /* synthetic */ Object G;
    public int H;

    public yx(vp4 vp4Var) {
        super(vp4Var);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.H |= Integer.MIN_VALUE;
        return fy.f(null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, this);
    }
}
