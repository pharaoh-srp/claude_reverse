package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cb6 implements w28 {
    public static final cb6 a;
    private static final SerialDescriptor descriptor;

    static {
        cb6 cb6Var = new cb6();
        a = cb6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.input.draft.DraftMessage", cb6Var, 9);
        pluginGeneratedSerialDescriptor.j("chat_id", false);
        pluginGeneratedSerialDescriptor.j("project_id", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("files", false);
        pluginGeneratedSerialDescriptor.j("attachments", false);
        pluginGeneratedSerialDescriptor.j("inputMode", false);
        pluginGeneratedSerialDescriptor.j("editMessageParentId", false);
        pluginGeneratedSerialDescriptor.j("prefill_source", true);
        pluginGeneratedSerialDescriptor.j("queuedSendRequest", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = DraftMessage.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(vs2.a), d4c.S(emd.a), srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(o49.d), d4c.S(ehb.a), d4c.S(srgVar), d4c.S(l0e.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DraftMessage.$childSerializers;
        Object obj = null;
        boolean z = true;
        String str = null;
        String strM984unboximpl = null;
        String strM1085unboximpl = null;
        QueuedSendRequest queuedSendRequest = null;
        List list = null;
        List list2 = null;
        InputMode inputMode = null;
        String strM1057unboximpl = null;
        String strV = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ChatId chatId = (ChatId) ud4VarC.m(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    i |= 1;
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    break;
                case 1:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 1, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    inputMode = (InputMode) ud4VarC.m(serialDescriptor, 5, o49.d, inputMode);
                    i |= 32;
                    break;
                case 6:
                    MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 6, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    str = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    queuedSendRequest = (QueuedSendRequest) ud4VarC.m(serialDescriptor, 8, l0e.a, queuedSendRequest);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new DraftMessage(i, strM984unboximpl, strM1085unboximpl, strV, list, list2, inputMode, strM1057unboximpl, str, queuedSendRequest, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DraftMessage draftMessage = (DraftMessage) obj;
        encoder.getClass();
        draftMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DraftMessage.write$Self$input(draftMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
