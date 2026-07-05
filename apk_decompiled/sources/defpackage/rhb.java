package defpackage;

import com.anthropic.claude.api.chat.messages.MessageLimitEvent;
import com.anthropic.claude.api.common.RateLimit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rhb implements w28 {
    public static final rhb a;
    private static final SerialDescriptor descriptor;

    static {
        rhb rhbVar = new rhb();
        a = rhbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_limit", rhbVar, 1);
        pluginGeneratedSerialDescriptor.j("message_limit", false);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MessageLimitEvent.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageLimitEvent.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        RateLimit rateLimit = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                rateLimit = (RateLimit) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), rateLimit);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageLimitEvent(i, rateLimit, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageLimitEvent messageLimitEvent = (MessageLimitEvent) obj;
        encoder.getClass();
        messageLimitEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) MessageLimitEvent.$childSerializers[0].getValue(), messageLimitEvent.message_limit);
        vd4VarC.b(serialDescriptor);
    }
}
