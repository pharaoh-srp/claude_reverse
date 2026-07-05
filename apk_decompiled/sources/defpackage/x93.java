package defpackage;

import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x93 implements w28 {
    public static final x93 a;
    private static final SerialDescriptor descriptor;

    static {
        x93 x93Var = new x93();
        a = x93Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.ChatScreenParams", x93Var, 8);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("createdAsNewChat", false);
        pluginGeneratedSerialDescriptor.j("initialPrompt", true);
        pluginGeneratedSerialDescriptor.j("artifactIdentifierToOpen", true);
        pluginGeneratedSerialDescriptor.j("initialModel", true);
        pluginGeneratedSerialDescriptor.j("isRootScreen", true);
        pluginGeneratedSerialDescriptor.j("restoreDraft", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(emd.a);
        KSerializer kSerializerS2 = d4c.S(srg.a);
        KSerializer kSerializerS3 = d4c.S(kr0.a);
        KSerializer kSerializerS4 = d4c.S(vnb.a);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{vs2.a, kSerializerS, zt1Var, kSerializerS2, kSerializerS3, kSerializerS4, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        ModelId modelId = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        String strM984unboximpl = null;
        String strM1085unboximpl = null;
        String str = null;
        String strM970unboximpl = null;
        String strM1064unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 1, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.m(serialDescriptor, 4, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                    strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    ModelId modelId2 = (ModelId) ud4VarC.m(serialDescriptor, 5, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : modelId);
                    strM1064unboximpl = modelId2 != null ? modelId2.m1064unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    zU2 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    zU3 = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return modelId;
            }
            modelId = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenParams(i, strM984unboximpl, strM1085unboximpl, zU, str, strM970unboximpl, strM1064unboximpl, zU2, zU3, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenParams chatScreenParams = (ChatScreenParams) obj;
        encoder.getClass();
        chatScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenParams.write$Self$chat(chatScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
