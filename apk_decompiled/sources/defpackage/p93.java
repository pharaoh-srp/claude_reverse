package defpackage;

import com.anthropic.claude.api.model.ThinkingState;

/* JADX INFO: loaded from: classes2.dex */
public final class p93 extends vp4 {
    public ThinkingState E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ r93 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p93(r93 r93Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = r93Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.k(null, this);
    }
}
