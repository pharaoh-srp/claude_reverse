package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qpc extends vp4 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vpc G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpc(vpc vpcVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = vpcVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(0, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
