package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes3.dex */
public final class eqd extends vp4 {
    public z9e E;
    public of0 F;
    public Project G;
    public /* synthetic */ Object H;
    public final /* synthetic */ wqd I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.i(null, this);
    }
}
