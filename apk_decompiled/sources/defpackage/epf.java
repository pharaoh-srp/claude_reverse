package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class epf extends vp4 {
    public Context E;
    public bz7 F;
    public sy1 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ wm0 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epf(wm0 wm0Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = wm0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.d(null, null, this);
    }
}
