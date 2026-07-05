package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gcg extends vp4 {
    public bz7 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ kcg G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcg(kcg kcgVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = kcgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(null, MTTypesetterKt.kLineSkipLimitMultiplier, null, this);
    }
}
