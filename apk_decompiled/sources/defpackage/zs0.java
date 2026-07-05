package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactViewFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zs0 implements w28 {
    public static final zs0 a;
    private static final SerialDescriptor descriptor;

    static {
        zs0 zs0Var = new zs0();
        a = zs0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_shared_artifact_view_failed", zs0Var, 7);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", true);
        pluginGeneratedSerialDescriptor.j("viewer_organization_uuid", true);
        pluginGeneratedSerialDescriptor.j("cause", false);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_http_code", true);
        pluginGeneratedSerialDescriptor.j("time_to_failure_ms", true);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strV = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) ud4VarC.m(serialDescriptor, 6, xka.a, l);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$SharedArtifactViewFailed(i, str, str2, strV, str3, str4, num, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$SharedArtifactViewFailed artifactSharingEvents$SharedArtifactViewFailed = (ArtifactSharingEvents$SharedArtifactViewFailed) obj;
        encoder.getClass();
        artifactSharingEvents$SharedArtifactViewFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$SharedArtifactViewFailed.write$Self$analytics(artifactSharingEvents$SharedArtifactViewFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
