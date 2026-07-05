package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class au9 extends vp4 {
    public Context E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ cm4 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au9(cm4 cm4Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = cm4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.i(null, 0, this);
    }
}
