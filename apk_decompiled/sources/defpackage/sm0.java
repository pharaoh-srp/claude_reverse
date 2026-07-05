package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class sm0 extends vp4 {
    public Object E;
    public Context F;
    public zk6 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ wm0 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(wm0 wm0Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = wm0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return wm0.b(this.I, null, null, this);
    }
}
