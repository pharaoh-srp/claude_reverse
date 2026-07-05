package defpackage;

import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jqg implements w28 {
    public static final jqg a;
    private static final SerialDescriptor descriptor;

    static {
        jqg jqgVar = new jqg();
        a = jqgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.StreamSmoothingConfig", jqgVar, 5);
        pluginGeneratedSerialDescriptor.j("smoother_tick_interval_ms", true);
        pluginGeneratedSerialDescriptor.j("min_markdown_group_size_chars", true);
        pluginGeneratedSerialDescriptor.j("fade_in_tail_chars", true);
        pluginGeneratedSerialDescriptor.j("fade_in_duration_ms", true);
        pluginGeneratedSerialDescriptor.j("fade_in_settle_delay_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, e79Var, e79Var, e79Var};
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
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR3 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                iR4 = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                iR5 = ud4VarC.r(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StreamSmoothingConfig(i, iR, iR2, iR3, iR4, iR5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamSmoothingConfig streamSmoothingConfig = (StreamSmoothingConfig) obj;
        encoder.getClass();
        streamSmoothingConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamSmoothingConfig.write$Self$configs(streamSmoothingConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
