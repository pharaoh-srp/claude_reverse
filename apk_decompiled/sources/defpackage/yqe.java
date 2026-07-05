package defpackage;

import io.sentry.p1;

/* JADX INFO: loaded from: classes3.dex */
public final class yqe extends vp4 {
    public p1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ jk5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqe(jk5 jk5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = jk5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.m(null, this);
    }
}
