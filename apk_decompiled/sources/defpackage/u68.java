package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class u68 extends vp4 {
    public Context E;
    public fw9 F;
    public String G;
    public jxb H;
    public /* synthetic */ Object I;
    public final /* synthetic */ y68 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u68(y68 y68Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = y68Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, null, null, this);
    }
}
