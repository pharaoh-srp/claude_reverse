package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class xx4 extends vp4 {
    public String E;
    public String F;
    public dae G;
    public dae H;
    public dae I;
    public /* synthetic */ Object J;
    public final /* synthetic */ f K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx4(f fVar, tp4 tp4Var) {
        super(tp4Var);
        this.K = fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return f.Y(this.K, null, null, this);
    }
}
