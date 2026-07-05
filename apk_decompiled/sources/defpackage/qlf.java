package defpackage;

import com.anthropic.claude.configs.flags.SendRetryConfig;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qlf implements w28 {
    public static final qlf a;
    private static final SerialDescriptor descriptor;

    static {
        qlf qlfVar = new qlf();
        a = qlfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.SendRetryConfig", qlfVar, 6);
        pluginGeneratedSerialDescriptor.j("max_attempts", true);
        pluginGeneratedSerialDescriptor.j("initial_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("delay_multiplier", true);
        pluginGeneratedSerialDescriptor.j("max_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("retry_on_io_exception", true);
        pluginGeneratedSerialDescriptor.j("retry_on_http_codes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SendRetryConfig.$childSerializers;
        xka xkaVar = xka.a;
        return new KSerializer[]{e79.a, xkaVar, na6.a, xkaVar, zt1.a, kw9VarArr[5].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SendRetryConfig.$childSerializers;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        long j = 0;
        long j2 = 0;
        double dZ = 0.0d;
        List list = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = ud4VarC.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    dZ = ud4VarC.z(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j2 = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SendRetryConfig(i, iR, j, dZ, j2, zU, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SendRetryConfig sendRetryConfig = (SendRetryConfig) obj;
        encoder.getClass();
        sendRetryConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SendRetryConfig.write$Self$configs(sendRetryConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
