package defpackage;

import com.anthropic.claude.configs.GrowthBookExposureSampleRateConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jc8 implements w28 {
    public static final jc8 a;
    private static final SerialDescriptor descriptor;

    static {
        jc8 jc8Var = new jc8();
        a = jc8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.GrowthBookExposureSampleRateConfig", jc8Var, 4);
        pluginGeneratedSerialDescriptor.j("feature_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("experiment_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("unauthed_feature_sample_rate", true);
        pluginGeneratedSerialDescriptor.j("unauthed_experiment_sample_rate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        na6 na6Var = na6.a;
        return new KSerializer[]{na6Var, na6Var, na6Var, na6Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        double dZ = 0.0d;
        double dZ2 = 0.0d;
        double dZ3 = 0.0d;
        double dZ4 = 0.0d;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                dZ = ud4VarC.z(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                dZ2 = ud4VarC.z(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                dZ3 = ud4VarC.z(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                dZ4 = ud4VarC.z(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookExposureSampleRateConfig(i, dZ, dZ2, dZ3, dZ4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookExposureSampleRateConfig growthBookExposureSampleRateConfig = (GrowthBookExposureSampleRateConfig) obj;
        encoder.getClass();
        growthBookExposureSampleRateConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookExposureSampleRateConfig.write$Self$configs(growthBookExposureSampleRateConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
