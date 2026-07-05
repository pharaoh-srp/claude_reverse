package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g43 extends vp4 {
    public boolean E;
    public boolean F;
    public bz7 G;
    public List H;
    public t53 I;
    public /* synthetic */ Object J;
    public final /* synthetic */ t53 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g43(t53 t53Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.o0(false, false, null, this);
    }
}
