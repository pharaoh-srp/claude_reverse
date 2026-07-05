package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class li5 extends vp4 {
    public kq4 E;
    public kwb F;
    public rcg G;
    public rcg H;
    public Iterator I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ bj5 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li5(bj5 bj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.L = bj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return bj5.w(this.L, null, this);
    }
}
