package defpackage;

import com.anthropic.claude.api.account.MemoryMode;

/* JADX INFO: loaded from: classes2.dex */
public final class a9 extends vp4 {
    public hcb E;
    public Boolean F;
    public Boolean G;
    public MemoryMode H;
    public /* synthetic */ Object I;
    public final /* synthetic */ f9 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(f9 f9Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = f9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.h(null, this);
    }
}
