package defpackage;

import com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yq4 implements w28 {
    public static final yq4 a;
    private static final SerialDescriptor descriptor;

    static {
        yq4 yq4Var = new yq4();
        a = yq4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactResponse", yq4Var, 3);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_version_uuid", false);
        pluginGeneratedSerialDescriptor.j("published_artifact_uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ir0.a, d4c.S(swd.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strM963unboximpl = null;
        String strM1092unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                ArtifactId artifactId = (ArtifactId) ud4VarC.l(serialDescriptor, 1, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                PublishedArtifactId publishedArtifactId = (PublishedArtifactId) ud4VarC.m(serialDescriptor, 2, swd.a, strM1092unboximpl != null ? PublishedArtifactId.m1086boximpl(strM1092unboximpl) : null);
                strM1092unboximpl = publishedArtifactId != null ? publishedArtifactId.m1092unboximpl() : null;
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConvertWiggleToArtifactResponse(i, strV, strM963unboximpl, strM1092unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConvertWiggleToArtifactResponse convertWiggleToArtifactResponse = (ConvertWiggleToArtifactResponse) obj;
        encoder.getClass();
        convertWiggleToArtifactResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConvertWiggleToArtifactResponse.write$Self$api(convertWiggleToArtifactResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
