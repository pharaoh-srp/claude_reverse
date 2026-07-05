package defpackage;

import com.anthropic.claude.api.artifacts.UserArtifact;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hmi implements w28 {
    public static final hmi a;
    private static final SerialDescriptor descriptor;

    static {
        hmi hmiVar = new hmi();
        a = hmiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.UserArtifact", hmiVar, 10);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_identifier", false);
        pluginGeneratedSerialDescriptor.j("latest_published_artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("code_language", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("chat_conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("preview", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(swd.a);
        srg srgVar = srg.a;
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S(srgVar);
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{ir0.a, kr0.a, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, bc9Var, bc9Var, vs2.a, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        ChatId chatIdM978boximpl = null;
        boolean z = true;
        String strM963unboximpl = null;
        String strM970unboximpl = null;
        String strM1092unboximpl = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Date date = null;
        Date date2 = null;
        String strM984unboximpl = null;
        String strV = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ArtifactId artifactId = (ArtifactId) ud4VarC.l(serialDescriptor, 0, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                    strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.l(serialDescriptor, 1, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                    strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    PublishedArtifactId publishedArtifactId = (PublishedArtifactId) ud4VarC.m(serialDescriptor, 2, swd.a, strM1092unboximpl != null ? PublishedArtifactId.m1086boximpl(strM1092unboximpl) : null);
                    strM1092unboximpl = publishedArtifactId != null ? publishedArtifactId.m1092unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    date = (Date) ud4VarC.l(serialDescriptor, 6, bc9.a, date);
                    i |= 64;
                    break;
                case 7:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 7, bc9.a, date2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    vs2 vs2Var = vs2.a;
                    if (strM984unboximpl != null) {
                        chatIdM978boximpl = ChatId.m978boximpl(strM984unboximpl);
                    }
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 8, vs2Var, chatIdM978boximpl);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    strV = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    sz6.e(iX);
                    return chatIdM978boximpl;
            }
            chatIdM978boximpl = null;
        }
        ud4VarC.b(serialDescriptor);
        return new UserArtifact(i, strM963unboximpl, strM970unboximpl, strM1092unboximpl, str, str2, str3, date, date2, strM984unboximpl, strV, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserArtifact userArtifact = (UserArtifact) obj;
        encoder.getClass();
        userArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserArtifact.write$Self$api(userArtifact, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
