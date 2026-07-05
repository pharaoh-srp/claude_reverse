package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zld extends vp4 {
    public ProjectsEvents$ProjectFileSource E;
    public si7 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ amd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zld(amd amdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = amdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.d(null, null, this);
    }
}
