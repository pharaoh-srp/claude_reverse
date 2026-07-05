package defpackage;

import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareFailed;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ms0 implements w28 {
    public static final ms0 a;
    private static final SerialDescriptor descriptor;

    static {
        ms0 ms0Var = new ms0();
        a = ms0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_artifact_share_failed", ms0Var, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("visibility", false);
        pluginGeneratedSerialDescriptor.j("cause", false);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_http_code", true);
        pluginGeneratedSerialDescriptor.j("time_to_failure_ms", true);
        pluginGeneratedSerialDescriptor.k(new pi(7));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactSharingEvents$ArtifactShareFailed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, kw9VarArr[4].getValue(), srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = ArtifactSharingEvents$ArtifactShareFailed.$childSerializers;
        Long l = null;
        Integer num = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        ArtifactSharingEvents$ArtifactShareVisibility artifactSharingEvents$ArtifactShareVisibility = null;
        String strV5 = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    artifactSharingEvents$ArtifactShareVisibility = (ArtifactSharingEvents$ArtifactShareVisibility) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), artifactSharingEvents$ArtifactShareVisibility);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    strV5 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str2);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    l = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactSharingEvents$ArtifactShareFailed(i, strV, strV2, strV3, strV4, artifactSharingEvents$ArtifactShareVisibility, strV5, str2, str, num, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactSharingEvents$ArtifactShareFailed artifactSharingEvents$ArtifactShareFailed = (ArtifactSharingEvents$ArtifactShareFailed) obj;
        encoder.getClass();
        artifactSharingEvents$ArtifactShareFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactSharingEvents$ArtifactShareFailed.write$Self$analytics(artifactSharingEvents$ArtifactShareFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
