package defpackage;

import anthropic.claude.usercontent.sandbox.wire_format.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class tq0 extends vp4 {
    public t4f E;
    public Request F;
    public dae G;
    public dae H;
    public long I;
    public long J;
    public boolean K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ xq0 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(xq0 xq0Var, vp4 vp4Var) {
        super(vp4Var);
        this.N = xq0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.O(null, this);
    }
}
