package defpackage;

import com.anthropic.claude.api.account.MemoryMode;

/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends vp4 {
    public MemoryMode E;
    public Boolean F;
    public Boolean G;
    public nf0 H;
    public icb I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ f9 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(f9 f9Var, vp4 vp4Var) {
        super(vp4Var);
        this.L = f9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return f9.a(this.L, null, null, null, null, null, this);
    }
}
