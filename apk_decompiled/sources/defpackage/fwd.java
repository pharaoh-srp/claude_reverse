package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareScreenOpened;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public final class fwd extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ pwd F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwd(pwd pwdVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = pwdVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new fwd(this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((fwd) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String mimeType;
        pwd pwdVar = this.F;
        PublishArtifactParams publishArtifactParams = pwdVar.c;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            Object objO = pwd.O(pwdVar, this);
            m45 m45Var = m45.E;
            if (objO == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        qi3 qi3Var = pwdVar.g;
        String str = pwdVar.d.e;
        String strM531getConversationUuidRjYBDck = publishArtifactParams.m531getConversationUuidRjYBDck();
        String strM538getVersionUuidQssJVS4 = publishArtifactParams.getArtifactMetadata().m538getVersionUuidQssJVS4();
        ArtifactType type = publishArtifactParams.getArtifactMetadata().getType();
        if (type == null || (mimeType = type.getMimeType()) == null) {
            mimeType = ArtifactType.Text.INSTANCE.getMimeType();
        }
        qi3Var.e(new ArtifactSharingEvents$ArtifactShareScreenOpened(str, strM531getConversationUuidRjYBDck, strM538getVersionUuidQssJVS4, mimeType, pwd.R(pwdVar, (ArtifactVisibility) pwdVar.m.getValue()), ScreenSource.CHAT_SCREEN), ArtifactSharingEvents$ArtifactShareScreenOpened.Companion.serializer());
        return iei.a;
    }
}
