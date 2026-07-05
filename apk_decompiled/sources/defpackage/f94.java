package defpackage;

import com.anthropic.claude.api.chat.messages.CompletionMessage;
import com.anthropic.claude.types.strings.MessageId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f94 implements w28 {
    public static final f94 a;
    private static final SerialDescriptor descriptor;

    static {
        f94 f94Var = new f94();
        a = f94Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.messages.CompletionMessage", f94Var, 2);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("parent_uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        ehb ehbVar = ehb.a;
        return new KSerializer[]{d4c.S(ehbVar), d4c.S(ehbVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1057unboximpl = null;
        String strM1057unboximpl2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 0, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                MessageId messageId2 = (MessageId) ud4VarC.m(serialDescriptor, 1, ehb.a, strM1057unboximpl2 != null ? MessageId.m1051boximpl(strM1057unboximpl2) : null);
                strM1057unboximpl2 = messageId2 != null ? messageId2.m1057unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CompletionMessage(i, strM1057unboximpl, strM1057unboximpl2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CompletionMessage completionMessage = (CompletionMessage) obj;
        encoder.getClass();
        completionMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CompletionMessage.write$Self$api(completionMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
