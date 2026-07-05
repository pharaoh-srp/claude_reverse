package defpackage;

import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX INFO: loaded from: classes2.dex */
public final class d9 extends vp4 {
    public VillageWeaverConsentState E;
    public VillageWeaverConsentState F;
    public Object G;
    public long H;
    public /* synthetic */ Object I;
    public final /* synthetic */ f9 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(f9 f9Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = f9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.j(null, this);
    }
}
