package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareScreenOpened;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.analytics.events.ScreenSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ps0 implements w28 {
    public static final ps0 a;
    private static final SerialDescriptor descriptor;

    static {
        ps0 ps0Var = new ps0();
        a = ps0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_artifact_share_screen_opened", ps0Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("current_visibility", false);
        pluginGeneratedSerialDescriptor.j("screen_source", true);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactSharingEvents$ArtifactShareScreenOpened.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, kw9VarArr[4].getValue(), d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactSharingEvents$ArtifactShareScreenOpened.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = null;
        ScreenSource screenSource = null;
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
                    screenSource = (ScreenSource) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), screenSource);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$ArtifactShareScreenOpened(i, strV, strV2, strV3, strV4, artifactSharingEvents$ArtifactShareVisibility, screenSource, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$ArtifactShareScreenOpened artifactSharingEvents$ArtifactShareScreenOpened = (ArtifactSharingEvents$ArtifactShareScreenOpened) obj;
        encoder.getClass();
        artifactSharingEvents$ArtifactShareScreenOpened.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$ArtifactShareScreenOpened.write$Self$analytics(artifactSharingEvents$ArtifactShareScreenOpened, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
