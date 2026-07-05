package defpackage;

import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class awd implements w28 {
    public static final awd a;
    private static final SerialDescriptor descriptor;

    static {
        awd awdVar = new awd();
        a = awdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.dialog.PublishArtifactParams", awdVar, 6);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("artifactMetadata", false);
        pluginGeneratedSerialDescriptor.j("artifactBody", false);
        pluginGeneratedSerialDescriptor.j("conversationUuid", false);
        pluginGeneratedSerialDescriptor.j("artifactVersionIndex", false);
        pluginGeneratedSerialDescriptor.j("isWiggleArtifact", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ehb.a, pr0.a, srg.a, vs2.a, e79.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        String strM1057unboximpl = null;
        ArtifactMetadata artifactMetadata = null;
        String strV = null;
        String strM984unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 0, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    artifactMetadata = (ArtifactMetadata) ud4VarC.l(serialDescriptor, 1, pr0.a, artifactMetadata);
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 3, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    iR = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PublishArtifactParams(i, strM1057unboximpl, artifactMetadata, strV, strM984unboximpl, iR, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PublishArtifactParams publishArtifactParams = (PublishArtifactParams) obj;
        encoder.getClass();
        publishArtifactParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PublishArtifactParams.write$Self$artifact(publishArtifactParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
