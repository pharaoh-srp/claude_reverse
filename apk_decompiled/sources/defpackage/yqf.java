package defpackage;

import com.anthropic.claude.sessions.types.EventListResponse;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yqf extends vp4 {
    public String E;
    public EventListResponse F;
    public List G;
    public dae H;
    public bae I;
    public List J;
    public String K;
    public int L;
    public int M;
    public boolean N;
    public /* synthetic */ Object O;
    public final /* synthetic */ jrf P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.P = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.u(null, this);
    }
}
