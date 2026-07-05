package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareSuccess;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class jwd extends xzg implements pz7 {
    public final /* synthetic */ pwd E;
    public final /* synthetic */ ArtifactVisibility F;
    public final /* synthetic */ long G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwd(pwd pwdVar, ArtifactVisibility artifactVisibility, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = pwdVar;
        this.F = artifactVisibility;
        this.G = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new jwd(this.E, this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        jwd jwdVar = (jwd) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        jwdVar.invokeSuspend(ieiVar);
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
        String strM538getVersionUuidQssJVS4 = publishArtifactParams.getArtifactMetadata().m538getVersionUuidQssJVS4();
        ArtifactType type = publishArtifactParams.getArtifactMetadata().getType();
        if (type == null || (mimeType = type.getMimeType()) == null) {
            mimeType = ArtifactType.Text.INSTANCE.getMimeType();
        }
        qi3Var.e(new ArtifactSharingEvents$ArtifactShareSuccess(str, strM531getConversationUuidRjYBDck, strM538getVersionUuidQssJVS4, mimeType, pwd.R(pwdVar, this.F), new Long(System.currentTimeMillis() - this.G)), ArtifactSharingEvents$ArtifactShareSuccess.Companion.serializer());
        return iei.a;
    }
}
