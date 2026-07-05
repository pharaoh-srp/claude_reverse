package defpackage;

import com.anthropic.claude.models.organization.configtypes.ModelFallbacksConfig;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rnb implements w28 {
    public static final rnb a;
    private static final SerialDescriptor descriptor;

    static {
        rnb rnbVar = new rnb();
        a = rnbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ModelFallbacksConfig", rnbVar, 2);
        pluginGeneratedSerialDescriptor.j("modelFallbacks", true);
        pluginGeneratedSerialDescriptor.j("cyberModelFallbacks", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ModelFallbacksConfig.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelFallbacksConfig.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        Map map2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                map = (Map) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                map2 = (Map) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), map2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelFallbacksConfig(i, map, map2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) obj;
        encoder.getClass();
        modelFallbacksConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelFallbacksConfig.write$Self$models(modelFallbacksConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
