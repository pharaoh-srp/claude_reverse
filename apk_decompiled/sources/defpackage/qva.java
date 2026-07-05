package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qva extends vp4 {
    public aae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ q28 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qva(q28 q28Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = q28Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
