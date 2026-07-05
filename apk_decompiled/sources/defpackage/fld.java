package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes3.dex */
public final class fld extends vp4 {
    public Project E;
    public ild F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ild H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fld(ild ildVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = ildVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return ild.R(this.H, this);
    }
}
