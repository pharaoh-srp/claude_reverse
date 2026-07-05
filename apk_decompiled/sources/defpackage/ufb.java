package defpackage;

import com.anthropic.claude.api.chat.messages.MessageDelta;
import com.anthropic.claude.api.chat.messages.MessageDeltaEvent;
import com.anthropic.claude.api.chat.messages.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ufb implements w28 {
    public static final ufb a;
    private static final SerialDescriptor descriptor;

    static {
        ufb ufbVar = new ufb();
        a = ufbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_delta", ufbVar, 1);
        pluginGeneratedSerialDescriptor.j("delta", true);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(d.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MessageDelta messageDelta = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                messageDelta = (MessageDelta) ud4VarC.m(serialDescriptor, 0, d.a, messageDelta);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageDeltaEvent(i, messageDelta, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageDeltaEvent messageDeltaEvent = (MessageDeltaEvent) obj;
        encoder.getClass();
        messageDeltaEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageDeltaEvent.write$Self$api(messageDeltaEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
