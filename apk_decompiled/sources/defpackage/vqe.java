package defpackage;

import io.sentry.p1;

/* JADX INFO: loaded from: classes.dex */
public final class vqe extends vp4 {
    public p1 E;
    public of0 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jk5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqe(jk5 jk5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = jk5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.j(null, this);
    }
}
