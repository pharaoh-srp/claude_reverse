package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteraction;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteractionType;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;

/* JADX INFO: loaded from: classes2.dex */
public final class wq0 extends xzg implements pz7 {
    public final /* synthetic */ xq0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq0(xq0 xq0Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = xq0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new wq0(this.E, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        wq0 wq0Var = (wq0) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        wq0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        xq0 xq0Var = this.E;
        xq0Var.g.e(new ArtifactSharingEvents$SharedArtifactInteraction(xq0Var.e.e, ((ArtifactFullScreenParams.PublishedArtifactFullScreenParams) xq0Var.b).getUuidValue(), ArtifactSharingEvents$SharedArtifactInteractionType.REPORT), ArtifactSharingEvents$SharedArtifactInteraction.Companion.serializer());
        return iei.a;
    }
}
