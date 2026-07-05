package defpackage;

import com.anthropic.claude.configs.MobileObservabilityConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class smb implements w28 {
    public static final smb a;
    private static final SerialDescriptor descriptor;

    static {
        smb smbVar = new smb();
        a = smbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.MobileObservabilityConfig", smbVar, 4);
        pluginGeneratedSerialDescriptor.j("network_request_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("datadog_request_trace_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("datadog_rum_profiler_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("streaming_jank_sample_rate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        na6 na6Var = na6.a;
        return new KSerializer[]{d4c.S(na6Var), d4c.S(na6Var), d4c.S(na6Var), d4c.S(na6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                d = (Double) ud4VarC.m(serialDescriptor, 0, na6.a, d);
                i |= 1;
            } else if (iX == 1) {
                d2 = (Double) ud4VarC.m(serialDescriptor, 1, na6.a, d2);
                i |= 2;
            } else if (iX == 2) {
                d3 = (Double) ud4VarC.m(serialDescriptor, 2, na6.a, d3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                d4 = (Double) ud4VarC.m(serialDescriptor, 3, na6.a, d4);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileObservabilityConfig(i, d, d2, d3, d4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) obj;
        encoder.getClass();
        mobileObservabilityConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileObservabilityConfig.write$Self$configs(mobileObservabilityConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
