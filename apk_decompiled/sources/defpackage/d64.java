package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d64 extends vp4 {
    public e64 E;
    public uub F;
    public /* synthetic */ Object G;
    public final /* synthetic */ e64 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d64(e64 e64Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = e64Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return e64.k(this.H, null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
