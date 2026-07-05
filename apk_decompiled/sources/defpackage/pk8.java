package defpackage;

import com.anthropic.claude.models.organization.configtypes.ConsentConfigAndroid;
import com.anthropic.claude.models.organization.configtypes.HealthConsentConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pk8 implements w28 {
    public static final pk8 a;
    private static final SerialDescriptor descriptor;

    static {
        pk8 pk8Var = new pk8();
        a = pk8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.HealthConsentConfig", pk8Var, 1);
        pluginGeneratedSerialDescriptor.j("consent_config_android", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zk4.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ConsentConfigAndroid consentConfigAndroid = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                consentConfigAndroid = (ConsentConfigAndroid) ud4VarC.l(serialDescriptor, 0, zk4.a, consentConfigAndroid);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConsentConfig(i, consentConfigAndroid, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConsentConfig healthConsentConfig = (HealthConsentConfig) obj;
        encoder.getClass();
        healthConsentConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, zk4.a, healthConsentConfig.consent_config_android);
        vd4VarC.b(serialDescriptor);
    }
}
