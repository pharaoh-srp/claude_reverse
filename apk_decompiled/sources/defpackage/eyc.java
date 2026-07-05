package defpackage;

import com.anthropic.claude.configs.PersistedFeatureOverrides;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eyc implements w28 {
    public static final eyc a;
    private static final SerialDescriptor descriptor;

    static {
        eyc eycVar = new eyc();
        a = eycVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.PersistedFeatureOverrides", eycVar, 1);
        pluginGeneratedSerialDescriptor.j("overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h3a.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 0, h3a.a, map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PersistedFeatureOverrides(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PersistedFeatureOverrides persistedFeatureOverrides = (PersistedFeatureOverrides) obj;
        encoder.getClass();
        persistedFeatureOverrides.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PersistedFeatureOverrides.write$Self$configs(persistedFeatureOverrides, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
