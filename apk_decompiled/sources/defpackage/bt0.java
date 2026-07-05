package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bt0 implements w28 {
    public static final bt0 a;
    private static final SerialDescriptor descriptor;

    static {
        bt0 bt0Var = new bt0();
        a = bt0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_artifact_viewed", bt0Var, 4);
        pluginGeneratedSerialDescriptor.j("viewer_organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("visibility", false);
        pluginGeneratedSerialDescriptor.j("load_time_ms", true);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactSharingEvents$SharedArtifactViewed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactSharingEvents$SharedArtifactViewed.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                artifactSharingEvents$ArtifactShareVisibility = (ArtifactSharingEvents$ArtifactShareVisibility) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), artifactSharingEvents$ArtifactShareVisibility);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$SharedArtifactViewed(i, strV, strV2, artifactSharingEvents$ArtifactShareVisibility, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$SharedArtifactViewed artifactSharingEvents$SharedArtifactViewed = (ArtifactSharingEvents$SharedArtifactViewed) obj;
        encoder.getClass();
        artifactSharingEvents$SharedArtifactViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$SharedArtifactViewed.write$Self$analytics(artifactSharingEvents$SharedArtifactViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
