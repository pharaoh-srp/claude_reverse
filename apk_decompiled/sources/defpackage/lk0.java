package defpackage;

import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes.dex */
public final class lk0 extends vp4 {
    public ApiResult E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ok0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(ok0 ok0Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ok0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this);
    }
}
