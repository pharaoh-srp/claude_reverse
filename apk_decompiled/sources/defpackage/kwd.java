package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareFailed;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class kwd extends xzg implements pz7 {
    public final /* synthetic */ nf0 E;
    public final /* synthetic */ pwd F;
    public final /* synthetic */ ArtifactVisibility G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwd(nf0 nf0Var, pwd pwdVar, ArtifactVisibility artifactVisibility, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = nf0Var;
        this.F = pwdVar;
        this.G = artifactVisibility;
        this.H = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new kwd(this.E, this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        kwd kwdVar = (kwd) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        kwdVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String mimeType;
        String message;
        pwd pwdVar = this.F;
        PublishArtifactParams publishArtifactParams = pwdVar.c;
        sf5.h0(obj);
        nf0 nf0Var = this.E;
        lf0 lf0Var = nf0Var instanceof lf0 ? (lf0) nf0Var : null;
        mf0 mf0Var = nf0Var instanceof mf0 ? (mf0) nf0Var : null;
        qi3 qi3Var = pwdVar.g;
        String str = pwdVar.d.e;
        String strM531getConversationUuidRjYBDck = publishArtifactParams.m531getConversationUuidRjYBDck();
        String strM538getVersionUuidQssJVS4 = publishArtifactParams.getArtifactMetadata().m538getVersionUuidQssJVS4();
        ArtifactType type = publishArtifactParams.getArtifactMetadata().getType();
        if (type == null || (mimeType = type.getMimeType()) == null) {
            mimeType = ArtifactType.Text.INSTANCE.getMimeType();
        }
        String str2 = mimeType;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibilityR = pwd.R(pwdVar, this.G);
        if (lf0Var == null || (message = lf0Var.b.getD()) == null) {
            message = mf0Var != null ? mf0Var.a.getMessage() : null;
            if (message == null) {
                message = "unknown";
            }
        }
        qi3Var.e(new ArtifactSharingEvents$ArtifactShareFailed(str, strM531getConversationUuidRjYBDck, strM538getVersionUuidQssJVS4, str2, artifactSharingEvents$ArtifactShareVisibilityR, message, lf0Var != null ? lf0Var.b.getD() : null, lf0Var != null ? lf0Var.b.getC() : null, lf0Var != null ? lf0Var.b.getE() : null, new Long(System.currentTimeMillis() - this.H)), ArtifactSharingEvents$ArtifactShareFailed.Companion.serializer());
        return iei.a;
    }
}
