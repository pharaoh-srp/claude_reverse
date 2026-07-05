package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class cxh extends vp4 {
    public Context E;
    public wwh F;
    public qi3 G;
    public ewh H;
    public exh I;
    public /* synthetic */ Object J;
    public final /* synthetic */ dxh K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxh(dxh dxhVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = dxhVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.v(null, null, null, null, this);
    }
}
