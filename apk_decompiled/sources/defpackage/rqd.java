package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.result.ApiResult;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class rqd extends vp4 {
    public String E;
    public Project F;
    public Date G;
    public ApiResult H;
    public nf0 I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ wqd L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.u(this, null, false);
    }
}
