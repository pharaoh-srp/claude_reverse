package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class om extends vp4 {
    public String E;
    public String F;
    public Set G;
    public String H;
    public String I;
    public /* synthetic */ Object J;
    public final /* synthetic */ vm K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om(vm vmVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = vmVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.o(null, this);
    }
}
