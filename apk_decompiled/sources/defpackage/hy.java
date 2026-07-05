package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class hy extends vp4 {
    public aae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ky G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(ky kyVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = kyVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return ky.K1(this.G, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
