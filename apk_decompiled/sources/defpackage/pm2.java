package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.RenderingMode;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pm2 implements w28 {
    public static final pm2 a;
    private static final SerialDescriptor descriptor;

    static {
        pm2 pm2Var = new pm2();
        a = pm2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.ChatCompletionRequest", pm2Var, 13);
        pluginGeneratedSerialDescriptor.j("prompt", false);
        pluginGeneratedSerialDescriptor.j("timezone", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("attachments", true);
        pluginGeneratedSerialDescriptor.j("files", true);
        pluginGeneratedSerialDescriptor.j("rendering_mode", true);
        pluginGeneratedSerialDescriptor.j("input_mode", false);
        pluginGeneratedSerialDescriptor.j("tools", false);
        pluginGeneratedSerialDescriptor.j("parent_message_uuid", true);
        pluginGeneratedSerialDescriptor.j("create_conversation_params", true);
        pluginGeneratedSerialDescriptor.j("tool_states", true);
        pluginGeneratedSerialDescriptor.j("effort", true);
        pluginGeneratedSerialDescriptor.j("thinking_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatCompletionRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S((KSerializer) kw9VarArr[4].getValue()), mge.d, o49.d, kw9VarArr[7].getValue(), d4c.S(ehb.a), d4c.S(x55.a), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(zlh.a), d4c.S(emh.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatCompletionRequest.$childSerializers;
        Object obj = null;
        List list = null;
        CreateChatRequest createChatRequest = null;
        List list2 = null;
        String str = null;
        List list3 = null;
        List list4 = null;
        RenderingMode renderingMode = null;
        InputMode inputMode = null;
        String strV = null;
        String strM1057unboximpl = null;
        String strV2 = null;
        String strM1141unboximpl = null;
        String strM1149unboximpl = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    list3 = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    list4 = (List) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    renderingMode = (RenderingMode) ud4VarC.l(serialDescriptor, 5, mge.d, renderingMode);
                    i |= 32;
                    break;
                case 6:
                    inputMode = (InputMode) ud4VarC.l(serialDescriptor, 6, o49.d, inputMode);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 8, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    createChatRequest = (CreateChatRequest) ud4VarC.m(serialDescriptor, 9, x55.a, createChatRequest);
                    i |= 512;
                    break;
                case 10:
                    list2 = (List) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    ThinkingEffort thinkingEffort = (ThinkingEffort) ud4VarC.m(serialDescriptor, 11, zlh.a, strM1141unboximpl != null ? ThinkingEffort.m1135boximpl(strM1141unboximpl) : null);
                    strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                case 12:
                    ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.m(serialDescriptor, 12, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                    strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatCompletionRequest(i, strV, strV2, str, list3, list4, renderingMode, inputMode, list, strM1057unboximpl, createChatRequest, list2, strM1141unboximpl, strM1149unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatCompletionRequest chatCompletionRequest = (ChatCompletionRequest) obj;
        encoder.getClass();
        chatCompletionRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatCompletionRequest.write$Self$api(chatCompletionRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
