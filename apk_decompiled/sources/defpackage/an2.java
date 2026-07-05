package defpackage;

import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class an2 implements w28 {
    public static final an2 a;
    private static final SerialDescriptor descriptor;

    static {
        an2 an2Var = new an2();
        a = an2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.ChatConversationWithNestedMessage", an2Var, 12);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("summary", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("settings", false);
        pluginGeneratedSerialDescriptor.j("is_starred", true);
        pluginGeneratedSerialDescriptor.j("project_uuid", true);
        pluginGeneratedSerialDescriptor.j("chat_messages", true);
        pluginGeneratedSerialDescriptor.j("is_temporary", true);
        pluginGeneratedSerialDescriptor.j("current_leaf_message_uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatConversationWithNestedMessage.$childSerializers;
        KSerializer kSerializerS = d4c.S(vnb.a);
        KSerializer kSerializerS2 = d4c.S(emd.a);
        KSerializer kSerializerS3 = d4c.S((KSerializer) kw9VarArr[9].getValue());
        KSerializer kSerializerS4 = d4c.S(ehb.a);
        bc9 bc9Var = bc9.a;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{vs2.a, bc9Var, bc9Var, srgVar, srgVar, kSerializerS, ym2.a, zt1Var, kSerializerS2, kSerializerS3, zt1Var, kSerializerS4};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatConversationWithNestedMessage.$childSerializers;
        Object obj = null;
        List list = null;
        String strM984unboximpl = null;
        Date date = null;
        Date date2 = null;
        String strV = null;
        String strV2 = null;
        String strM1064unboximpl = null;
        ChatConversationSettings chatConversationSettings = null;
        String strM1085unboximpl = null;
        String strM1057unboximpl = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    i |= 1;
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    break;
                case 1:
                    date = (Date) ud4VarC.l(serialDescriptor, 1, bc9.a, date);
                    i |= 2;
                    break;
                case 2:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 2, bc9.a, date2);
                    i |= 4;
                    break;
                case 3:
                    strV = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    ModelId modelId = (ModelId) ud4VarC.m(serialDescriptor, 5, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                    strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    chatConversationSettings = (ChatConversationSettings) ud4VarC.l(serialDescriptor, 6, ym2.a, chatConversationSettings);
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 8, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    list = (List) ud4VarC.m(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    zU2 = ud4VarC.u(serialDescriptor, 10);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 11, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatConversationWithNestedMessage(i, strM984unboximpl, date, date2, strV, strV2, strM1064unboximpl, chatConversationSettings, zU, strM1085unboximpl, list, zU2, strM1057unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatConversationWithNestedMessage chatConversationWithNestedMessage = (ChatConversationWithNestedMessage) obj;
        encoder.getClass();
        chatConversationWithNestedMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatConversationWithNestedMessage.write$Self$api(chatConversationWithNestedMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
