package defpackage;

import com.anthropic.claude.configs.FlexibleUpdateConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn7 implements w28 {
    public static final wn7 a;
    private static final SerialDescriptor descriptor;

    static {
        wn7 wn7Var = new wn7();
        a = wn7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.FlexibleUpdateConfig", wn7Var, 3);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("min_staleness_days", true);
        pluginGeneratedSerialDescriptor.j("dismiss_cooldown_days", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{zt1.a, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        int iR2 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR2 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FlexibleUpdateConfig(i, zU, iR, iR2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FlexibleUpdateConfig flexibleUpdateConfig = (FlexibleUpdateConfig) obj;
        encoder.getClass();
        flexibleUpdateConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FlexibleUpdateConfig.write$Self$configs(flexibleUpdateConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
