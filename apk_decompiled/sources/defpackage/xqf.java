package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xqf extends vp4 {
    public String E;
    public List F;
    public Serializable G;
    public Serializable H;
    public dae I;
    public dae J;
    public /* synthetic */ Object K;
    public final /* synthetic */ jrf L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return jrf.q(this.L, null, this);
    }
}
