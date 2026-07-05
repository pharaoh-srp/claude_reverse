package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class pm8 extends vp4 {
    public h86 E;
    public Context F;
    public re9 G;
    public ne9 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ cm4 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm8(cm4 cm4Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = cm4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(null, null, this);
    }
}
