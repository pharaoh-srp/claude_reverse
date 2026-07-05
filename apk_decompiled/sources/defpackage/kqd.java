package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes3.dex */
public final class kqd extends vp4 {
    public Project E;
    public /* synthetic */ Object F;
    public final /* synthetic */ wqd G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.l(null, this);
    }
}
