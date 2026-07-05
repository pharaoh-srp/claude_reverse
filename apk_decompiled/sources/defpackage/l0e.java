package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l0e implements w28 {
    public static final l0e a;
    private static final SerialDescriptor descriptor;

    static {
        l0e l0eVar = new l0e();
        a = l0eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.input.draft.QueuedSendRequest", l0eVar, 8);
        pluginGeneratedSerialDescriptor.j("request", false);
        pluginGeneratedSerialDescriptor.j("expectedLeafMessageId", false);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        pluginGeneratedSerialDescriptor.j("ttl", true);
        pluginGeneratedSerialDescriptor.j("inputFiles", true);
        pluginGeneratedSerialDescriptor.j("editMessageParentId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = QueuedSendRequest.$childSerializers;
        ehb ehbVar = ehb.a;
        return new KSerializer[]{pm2.a, d4c.S(ehbVar), z7.a, fkc.a, g69.a, yh6.a, kw9VarArr[6].getValue(), d4c.S(ehbVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = QueuedSendRequest.$childSerializers;
        MessageId messageIdM1051boximpl = null;
        boolean z = true;
        ChatCompletionRequest chatCompletionRequest = null;
        String strM1057unboximpl = null;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        c69 c69Var = null;
        uh6 uh6Var = null;
        List list = null;
        String strM1057unboximpl2 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    chatCompletionRequest = (ChatCompletionRequest) ud4VarC.l(serialDescriptor, 0, pm2.a, chatCompletionRequest);
                    i |= 1;
                    break;
                case 1:
                    MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 1, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 2, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                    strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 3, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    c69Var = (c69) ud4VarC.l(serialDescriptor, 4, g69.a, c69Var);
                    i |= 16;
                    break;
                case 5:
                    uh6Var = (uh6) ud4VarC.l(serialDescriptor, 5, yh6.a, uh6Var);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    ehb ehbVar = ehb.a;
                    if (strM1057unboximpl2 != null) {
                        messageIdM1051boximpl = MessageId.m1051boximpl(strM1057unboximpl2);
                    }
                    MessageId messageId2 = (MessageId) ud4VarC.m(serialDescriptor, 7, ehbVar, messageIdM1051boximpl);
                    strM1057unboximpl2 = messageId2 != null ? messageId2.m1057unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return messageIdM1051boximpl;
            }
            messageIdM1051boximpl = null;
        }
        ud4VarC.b(serialDescriptor);
        return new QueuedSendRequest(i, chatCompletionRequest, strM1057unboximpl, strM949unboximpl, strM1071unboximpl, c69Var, uh6Var, list, strM1057unboximpl2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        QueuedSendRequest queuedSendRequest = (QueuedSendRequest) obj;
        encoder.getClass();
        queuedSendRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        QueuedSendRequest.write$Self$input(queuedSendRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
