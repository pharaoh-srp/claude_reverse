package defpackage;

import com.anthropic.claude.configs.flags.MessageQueueConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jib implements w28 {
    public static final jib a;
    private static final SerialDescriptor descriptor;

    static {
        jib jibVar = new jib();
        a = jibVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.MessageQueueConfig", jibVar, 2);
        pluginGeneratedSerialDescriptor.j("ttl_hours", true);
        pluginGeneratedSerialDescriptor.j("max_active", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new MessageQueueConfig(i, iR, iR2, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageQueueConfig messageQueueConfig = (MessageQueueConfig) obj;
        encoder.getClass();
        messageQueueConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageQueueConfig.write$Self$configs(messageQueueConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
