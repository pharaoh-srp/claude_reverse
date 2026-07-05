package defpackage;

import com.anthropic.claude.api.chat.messages.CompletionMessage;
import com.anthropic.claude.api.chat.messages.MessageStartEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sib implements w28 {
    public static final sib a;
    private static final SerialDescriptor descriptor;

    static {
        sib sibVar = new sib();
        a = sibVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_start", sibVar, 1);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f94.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CompletionMessage completionMessage = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                completionMessage = (CompletionMessage) ud4VarC.l(serialDescriptor, 0, f94.a, completionMessage);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageStartEvent(i, completionMessage, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageStartEvent messageStartEvent = (MessageStartEvent) obj;
        encoder.getClass();
        messageStartEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, f94.a, messageStartEvent.message);
        vd4VarC.b(serialDescriptor);
    }
}
