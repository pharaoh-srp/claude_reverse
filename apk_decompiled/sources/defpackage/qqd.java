package defpackage;

import com.anthropic.claude.api.project.PaginatedProjectsResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class qqd extends vp4 {
    public gnd E;
    public tnd F;
    public dae G;
    public of0 H;
    public PaginatedProjectsResponse I;
    public /* synthetic */ Object J;
    public final /* synthetic */ wqd K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.t(null, null, this);
    }
}
