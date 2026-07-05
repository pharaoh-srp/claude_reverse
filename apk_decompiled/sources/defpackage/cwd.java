package defpackage;

import com.anthropic.claude.api.artifacts.PublishArtifactRequest;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cwd implements w28 {
    public static final cwd a;
    private static final SerialDescriptor descriptor;

    static {
        cwd cwdVar = new cwd();
        a = cwdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.PublishArtifactRequest", cwdVar, 8);
        pluginGeneratedSerialDescriptor.j("artifact_identifier", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("artifact_version_uuid", false);
        pluginGeneratedSerialDescriptor.j("code_language", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{kr0.a, srgVar, d4c.S(ir0.a), d4c.S(srgVar), srgVar, vs2.a, ehb.a, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        MessageId messageId = null;
        boolean z = true;
        int i = 0;
        String strM970unboximpl = null;
        String strV = null;
        String strM963unboximpl = null;
        String str = null;
        String strV2 = null;
        String strM984unboximpl = null;
        String strM1057unboximpl = null;
        String strV3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.l(serialDescriptor, 0, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                    strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    ArtifactId artifactId = (ArtifactId) ud4VarC.m(serialDescriptor, 2, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                    strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 5, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    MessageId messageId2 = (MessageId) ud4VarC.l(serialDescriptor, 6, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : messageId);
                    strM1057unboximpl = messageId2 != null ? messageId2.m1057unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    strV3 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return messageId;
            }
            messageId = null;
        }
        ud4VarC.b(serialDescriptor);
        return new PublishArtifactRequest(i, strM970unboximpl, strV, strM963unboximpl, str, strV2, strM984unboximpl, strM1057unboximpl, strV3, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PublishArtifactRequest publishArtifactRequest = (PublishArtifactRequest) obj;
        encoder.getClass();
        publishArtifactRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PublishArtifactRequest.write$Self$api(publishArtifactRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
