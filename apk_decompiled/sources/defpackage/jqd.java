package defpackage;

import com.anthropic.claude.api.project.PaginatedProjectsResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class jqd extends vp4 {
    public gnd E;
    public tnd F;
    public dae G;
    public of0 H;
    public PaginatedProjectsResponse I;
    public int J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ wqd M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.j(null, 0, this);
    }
}
