package defpackage;

import com.anthropic.claude.api.chat.ProjectReference;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.result.ApiResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ld3 extends vp4 {
    public Project E;
    public ApiResult F;
    public ProjectReference G;
    public Iterator H;
    public String I;
    public dae J;
    public /* synthetic */ Object K;
    public final /* synthetic */ vd3 L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.L = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.n(null, null, this);
    }
}
