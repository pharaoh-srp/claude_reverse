package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactVisibilityChanged;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class us0 implements w28 {
    public static final us0 a;
    private static final SerialDescriptor descriptor;

    static {
        us0 us0Var = new us0();
        a = us0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_artifact_visibility_changed", us0Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("from_visibility", false);
        pluginGeneratedSerialDescriptor.j("to_visibility", false);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactSharingEvents$ArtifactVisibilityChanged.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, kw9VarArr[4].getValue(), kw9VarArr[5].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactSharingEvents$ArtifactVisibilityChanged.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = null;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    artifactSharingEvents$ArtifactShareVisibility = (ArtifactSharingEvents$ArtifactShareVisibility) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), artifactSharingEvents$ArtifactShareVisibility);
                    i |= 16;
                    break;
                case 5:
                    artifactSharingEvents$ArtifactShareVisibility2 = (ArtifactSharingEvents$ArtifactShareVisibility) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), artifactSharingEvents$ArtifactShareVisibility2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$ArtifactVisibilityChanged(i, strV, strV2, strV3, strV4, artifactSharingEvents$ArtifactShareVisibility, artifactSharingEvents$ArtifactShareVisibility2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$ArtifactVisibilityChanged artifactSharingEvents$ArtifactVisibilityChanged = (ArtifactSharingEvents$ArtifactVisibilityChanged) obj;
        encoder.getClass();
        artifactSharingEvents$ArtifactVisibilityChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$ArtifactVisibilityChanged.write$Self$analytics(artifactSharingEvents$ArtifactVisibilityChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
