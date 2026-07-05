package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class vm1 extends vp4 {
    public dhg E;
    public float F;
    public /* synthetic */ Object G;
    public final /* synthetic */ xm1 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm1(xm1 xm1Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = xm1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b(null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
