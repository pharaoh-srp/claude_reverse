package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wqf extends vp4 {
    public String E;
    public List F;
    public String G;
    public String H;
    public bae I;
    public /* synthetic */ Object J;
    public final /* synthetic */ jrf K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return jrf.p(this.K, null, null, this);
    }
}
