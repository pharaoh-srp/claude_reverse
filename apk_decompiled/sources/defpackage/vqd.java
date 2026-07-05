package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;

/* JADX INFO: loaded from: classes3.dex */
public final class vqd extends vp4 {
    public String E;
    public ProjectsEvents$ProjectFileSource F;
    public ProjectsEvents$ProjectUploadSource G;
    public int H;
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ wqd K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.y(null, null, 0, null, false, null, this);
    }
}
