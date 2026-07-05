package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactViewFailed;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactViewed;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;

/* JADX INFO: loaded from: classes2.dex */
public final class uq0 extends xzg implements pz7 {
    public final /* synthetic */ xq0 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ dae H;
    public final /* synthetic */ dae I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(xq0 xq0Var, boolean z, long j, dae daeVar, dae daeVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = xq0Var;
        this.F = z;
        this.G = j;
        this.H = daeVar;
        this.I = daeVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new uq0(this.E, this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        uq0 uq0Var = (uq0) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        uq0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility;
        sf5.h0(obj);
        String str = (String) this.H.E;
        String str2 = (String) this.I.E;
        xq0 xq0Var = this.E;
        koi koiVar = xq0Var.e;
        ArtifactFullScreenParams artifactFullScreenParams = xq0Var.b;
        if (!(artifactFullScreenParams instanceof ArtifactFullScreenParams.LoadedArtifactFullScreenParams)) {
            qi3 qi3Var = xq0Var.g;
            boolean z = this.F;
            long j = this.G;
            if (z) {
                String str3 = koiVar.e;
                String uuidValue = artifactFullScreenParams.getUuidValue();
                if (artifactFullScreenParams instanceof ArtifactFullScreenParams.PublishedArtifactFullScreenParams) {
                    artifactSharingEvents$ArtifactShareVisibility = ArtifactSharingEvents$ArtifactShareVisibility.PUBLIC;
                } else if (artifactFullScreenParams instanceof ArtifactFullScreenParams.SharedArtifactFullScreenParams) {
                    artifactSharingEvents$ArtifactShareVisibility = ArtifactSharingEvents$ArtifactShareVisibility.ORGANIZATION;
                } else if (!(artifactFullScreenParams instanceof ArtifactFullScreenParams.LoadedArtifactFullScreenParams)) {
                    wg6.i();
                    return null;
                }
                qi3Var.e(new ArtifactSharingEvents$SharedArtifactViewed(str3, uuidValue, artifactSharingEvents$ArtifactShareVisibility, Long.valueOf(j)), ArtifactSharingEvents$SharedArtifactViewed.Companion.serializer());
            } else {
                if (str == null) {
                    str = "unknown_error";
                }
                String str4 = koiVar.e;
                qi3Var.e(new ArtifactSharingEvents$SharedArtifactViewFailed(artifactFullScreenParams.getUuidValue(), str4, str, str2, (String) null, (Integer) null, Long.valueOf(j), 48, (mq5) null), ArtifactSharingEvents$SharedArtifactViewFailed.Companion.serializer());
            }
        }
        return iei.a;
    }
}
