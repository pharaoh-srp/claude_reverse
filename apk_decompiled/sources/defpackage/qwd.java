package defpackage;

import com.anthropic.claude.api.artifacts.PublishedArtifact;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qwd implements w28 {
    public static final qwd a;
    private static final SerialDescriptor descriptor;

    static {
        qwd qwdVar = new qwd();
        a = qwdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.PublishedArtifact", qwdVar, 7);
        pluginGeneratedSerialDescriptor.j("artifact_identifier", false);
        pluginGeneratedSerialDescriptor.j("published_artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("code_language", true);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("deleted", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{kr0.a, swd.a, srgVar, d4c.S(srgVar), ehb.a, srgVar, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM970unboximpl = null;
        String strM1092unboximpl = null;
        String strV = null;
        String str = null;
        String strM1057unboximpl = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.l(serialDescriptor, 0, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                    strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    PublishedArtifactId publishedArtifactId = (PublishedArtifactId) ud4VarC.l(serialDescriptor, 1, swd.a, strM1092unboximpl != null ? PublishedArtifactId.m1086boximpl(strM1092unboximpl) : null);
                    strM1092unboximpl = publishedArtifactId != null ? publishedArtifactId.m1092unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 4, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    strV2 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PublishedArtifact(i, strM970unboximpl, strM1092unboximpl, strV, str, strM1057unboximpl, strV2, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PublishedArtifact publishedArtifact = (PublishedArtifact) obj;
        encoder.getClass();
        publishedArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PublishedArtifact.write$Self$api(publishedArtifact, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
