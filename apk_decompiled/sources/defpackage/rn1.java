package defpackage;

import com.anthropic.claude.bell.api.BellApiData;

/* JADX INFO: loaded from: classes2.dex */
public final class rn1 extends vp4 {
    public BellApiData E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ sn1 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(sn1 sn1Var, tp4 tp4Var) {
        super(tp4Var);
        this.H = sn1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
