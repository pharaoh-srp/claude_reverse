package defpackage;

import io.sentry.p1;

/* JADX INFO: loaded from: classes.dex */
public final class dca extends vp4 {
    public p1 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ fca G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dca(fca fcaVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = fcaVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return fca.P(this.G, null, null, null, this);
    }
}
