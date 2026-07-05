package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactVisibility;

/* JADX INFO: loaded from: classes2.dex */
public final class nwd extends vp4 {
    public boolean E;
    public String F;
    public ArtifactVisibility G;
    public ArtifactVisibility H;
    public /* synthetic */ Object I;
    public final /* synthetic */ pwd J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwd(pwd pwdVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = pwdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.W(this, null, false);
    }
}
