package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteraction;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteractionType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ws0 implements w28 {
    public static final ws0 a;
    private static final SerialDescriptor descriptor;

    static {
        ws0 ws0Var = new ws0();
        a = ws0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_artifact_interaction", ws0Var, 3);
        pluginGeneratedSerialDescriptor.j("viewer_organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("interaction_type", false);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactSharingEvents$SharedArtifactInteraction.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactSharingEvents$SharedArtifactInteraction.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ArtifactSharingEvents$SharedArtifactInteractionType artifactSharingEvents$SharedArtifactInteractionType = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                artifactSharingEvents$SharedArtifactInteractionType = (ArtifactSharingEvents$SharedArtifactInteractionType) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), artifactSharingEvents$SharedArtifactInteractionType);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$SharedArtifactInteraction(i, strV, strV2, artifactSharingEvents$SharedArtifactInteractionType, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$SharedArtifactInteraction artifactSharingEvents$SharedArtifactInteraction = (ArtifactSharingEvents$SharedArtifactInteraction) obj;
        encoder.getClass();
        artifactSharingEvents$SharedArtifactInteraction.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$SharedArtifactInteraction.write$Self$analytics(artifactSharingEvents$SharedArtifactInteraction, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
