package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactVisibilityChanged;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class owd extends xzg implements pz7 {
    public final /* synthetic */ pwd E;
    public final /* synthetic */ String F;
    public final /* synthetic */ ArtifactVisibility G;
    public final /* synthetic */ ArtifactVisibility H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owd(pwd pwdVar, String str, ArtifactVisibility artifactVisibility, ArtifactVisibility artifactVisibility2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = pwdVar;
        this.F = str;
        this.G = artifactVisibility;
        this.H = artifactVisibility2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new owd(this.E, this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        owd owdVar = (owd) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        owdVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String mimeType;
        sf5.h0(obj);
        pwd pwdVar = this.E;
        qi3 qi3Var = pwdVar.g;
        String str = pwdVar.d.e;
        PublishArtifactParams publishArtifactParams = pwdVar.c;
        String strM531getConversationUuidRjYBDck = publishArtifactParams.m531getConversationUuidRjYBDck();
        ArtifactType type = publishArtifactParams.getArtifactMetadata().getType();
        if (type == null || (mimeType = type.getMimeType()) == null) {
            mimeType = ArtifactType.Text.INSTANCE.getMimeType();
        }
        qi3Var.e(new ArtifactSharingEvents$ArtifactVisibilityChanged(str, strM531getConversationUuidRjYBDck, this.F, mimeType, pwd.R(pwdVar, this.G), pwd.R(pwdVar, this.H)), ArtifactSharingEvents$ArtifactVisibilityChanged.Companion.serializer());
        return iei.a;
    }
}
