package defpackage;

import com.anthropic.claude.configs.flags.PollingRecoveryConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n8d implements w28 {
    public static final n8d a;
    private static final SerialDescriptor descriptor;

    static {
        n8d n8dVar = new n8d();
        a = n8dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.PollingRecoveryConfig", n8dVar, 7);
        pluginGeneratedSerialDescriptor.j("response_budget_sec", true);
        pluginGeneratedSerialDescriptor.j("poll_interval_ms", true);
        pluginGeneratedSerialDescriptor.j("max_poll_interval_ms", true);
        pluginGeneratedSerialDescriptor.j("resume_refresh_debounce_sec", true);
        pluginGeneratedSerialDescriptor.j("max_consecutive_fetch_failed", true);
        pluginGeneratedSerialDescriptor.j("skip_conversation_load_polling", true);
        pluginGeneratedSerialDescriptor.j("skip_known_terminal_error_polling", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        xka xkaVar = xka.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{e79Var, xkaVar, xkaVar, e79Var, e79Var, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        boolean zU = false;
        boolean zU2 = false;
        long j = 0;
        long j2 = 0;
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
                    j2 = ud4VarC.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR3 = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU2 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PollingRecoveryConfig(i, iR, j, j2, iR2, iR3, zU, zU2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PollingRecoveryConfig pollingRecoveryConfig = (PollingRecoveryConfig) obj;
        encoder.getClass();
        pollingRecoveryConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PollingRecoveryConfig.write$Self$configs(pollingRecoveryConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
