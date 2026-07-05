package defpackage;

import com.anthropic.claude.analytics.events.ScreenSource;

/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends vp4 {
    public bz7 E;
    public String F;
    public ScreenSource G;
    public l3 H;
    public /* synthetic */ Object I;
    public final /* synthetic */ pt2 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt2(pt2 pt2Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = pt2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.c(null, null, null, null, this);
    }
}
