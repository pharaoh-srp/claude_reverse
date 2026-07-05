package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;

/* JADX INFO: loaded from: classes3.dex */
public final class zpd extends vp4 {
    public String E;
    public ProjectsEvents$ProjectDocumentSource F;
    public ProjectsEvents$ProjectUploadSource G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ wqd J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpd(wqd wqdVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = wqdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.d(null, null, 0, null, null, null, this);
    }
}
