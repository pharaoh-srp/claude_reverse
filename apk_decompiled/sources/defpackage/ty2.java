package defpackage;

import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.MessageSender;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ty2 implements w28 {
    public static final ty2 a;
    private static final SerialDescriptor descriptor;

    static {
        ty2 ty2Var = new ty2();
        a = ty2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.ChatMessage", ty2Var, 15);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("parent_message_uuid", true);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", true);
        pluginGeneratedSerialDescriptor.j("edited_at", true);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("sender", false);
        pluginGeneratedSerialDescriptor.j("attachments", false);
        pluginGeneratedSerialDescriptor.j("files", true);
        pluginGeneratedSerialDescriptor.j("input_mode", true);
        pluginGeneratedSerialDescriptor.j("is_edited", true);
        pluginGeneratedSerialDescriptor.j("chat_feedback", true);
        pluginGeneratedSerialDescriptor.j("stop_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatMessage.$childSerializers;
        ehb ehbVar = ehb.a;
        bc9 bc9Var = bc9.a;
        srg srgVar = srg.a;
        return new KSerializer[]{ehbVar, d4c.S(ehbVar), e79.a, bc9Var, d4c.S(bc9Var), d4c.S(bc9Var), srgVar, d4c.S((KSerializer) kw9VarArr[7].getValue()), kw9VarArr[8].getValue(), kw9VarArr[9].getValue(), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(o49.d), d4c.S(zt1.a), d4c.S(wr2.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatMessage.$childSerializers;
        ChatFeedback chatFeedback = null;
        Boolean bool = null;
        InputMode inputMode = null;
        List list = null;
        String str4 = null;
        List list2 = null;
        int i = 0;
        String strM1057unboximpl = null;
        String strM1057unboximpl2 = null;
        MessageSender messageSender = null;
        Date date = null;
        Date date2 = null;
        Date date3 = null;
        List list3 = null;
        boolean z = true;
        int iR = 0;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    chatFeedback = chatFeedback;
                    break;
                case 0:
                    ChatFeedback chatFeedback2 = chatFeedback;
                    String str5 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 0, ehb.a, str5 != null ? MessageId.m1051boximpl(str5) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 1;
                    chatFeedback = chatFeedback2;
                    strM1057unboximpl2 = str;
                    break;
                case 1:
                    str3 = strM1057unboximpl;
                    String str6 = strM1057unboximpl2;
                    ChatFeedback chatFeedback3 = chatFeedback;
                    MessageId messageId2 = (MessageId) ud4VarC.m(serialDescriptor, 1, ehb.a, str6 != null ? MessageId.m1051boximpl(str6) : null);
                    strM1057unboximpl2 = messageId2 != null ? messageId2.m1057unboximpl() : null;
                    i |= 2;
                    chatFeedback = chatFeedback3;
                    strM1057unboximpl = str3;
                    break;
                case 2:
                    str3 = strM1057unboximpl;
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    strM1057unboximpl = str3;
                    break;
                case 3:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    date = (Date) ud4VarC.l(serialDescriptor, 3, bc9.a, date);
                    i |= 8;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 4:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    date2 = (Date) ud4VarC.m(serialDescriptor, 4, bc9.a, date2);
                    i |= 16;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 5:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    date3 = (Date) ud4VarC.m(serialDescriptor, 5, bc9.a, date3);
                    i |= 32;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 6:
                    str3 = strM1057unboximpl;
                    strV = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    strM1057unboximpl = str3;
                    break;
                case 7:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    list2 = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 8:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    messageSender = (MessageSender) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), messageSender);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 9:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    list3 = (List) ud4VarC.l(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), list3);
                    i |= 512;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 10:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    list = (List) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 11:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    inputMode = (InputMode) ud4VarC.m(serialDescriptor, 11, o49.d, inputMode);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 12:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 12, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 13:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    chatFeedback = (ChatFeedback) ud4VarC.m(serialDescriptor, 13, wr2.a, chatFeedback);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                case 14:
                    str2 = strM1057unboximpl;
                    str = strM1057unboximpl2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str4);
                    i |= 16384;
                    strM1057unboximpl = str2;
                    strM1057unboximpl2 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatMessage(i, strM1057unboximpl, strM1057unboximpl2, iR, date, date2, date3, strV, list2, messageSender, list3, list, inputMode, bool, chatFeedback, str4, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        encoder.getClass();
        chatMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatMessage.write$Self$api(chatMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
