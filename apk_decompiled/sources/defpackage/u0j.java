package defpackage;

import com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0j implements w28 {
    public static final u0j a;
    private static final SerialDescriptor descriptor;

    static {
        u0j u0jVar = new u0j();
        a = u0jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig", u0jVar, 5);
        pluginGeneratedSerialDescriptor.j("max_gain", true);
        pluginGeneratedSerialDescriptor.j("target_rms", true);
        pluginGeneratedSerialDescriptor.j("noise_floor_rms", true);
        pluginGeneratedSerialDescriptor.j("attack", true);
        pluginGeneratedSerialDescriptor.j(BuildConfig.BUILD_TYPE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uo7 uo7Var = uo7.a;
        return new KSerializer[]{uo7Var, uo7Var, uo7Var, uo7Var, uo7Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        float fD = 0.0f;
        float fD2 = 0.0f;
        float fD3 = 0.0f;
        float fD4 = 0.0f;
        float fD5 = 0.0f;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                fD = ud4VarC.D(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                fD2 = ud4VarC.D(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                fD3 = ud4VarC.D(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                fD4 = ud4VarC.D(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                fD5 = ud4VarC.D(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceAdaptiveGainConfig(i, fD, fD2, fD3, fD4, fD5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceAdaptiveGainConfig voiceAdaptiveGainConfig = (VoiceAdaptiveGainConfig) obj;
        encoder.getClass();
        voiceAdaptiveGainConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceAdaptiveGainConfig.write$Self$configs(voiceAdaptiveGainConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
