package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class kxd extends vp4 {
    public float E;
    public /* synthetic */ Object F;
    public final /* synthetic */ lxd G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxd(lxd lxdVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = lxdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.w1(MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
