package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes3.dex */
public final class ij5 extends vp4 {
    public Project E;
    public /* synthetic */ Object F;
    public final /* synthetic */ jj5 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij5(jj5 jj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = jj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(null, this);
    }
}
