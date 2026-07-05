package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l01 extends vp4 {
    public List E;
    public k20 F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ n01 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(n01 n01Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = n01Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.a(this);
    }
}
