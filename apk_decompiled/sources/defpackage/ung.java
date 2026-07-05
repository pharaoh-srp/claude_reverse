package defpackage;

import com.anthropic.claude.models.organization.configtypes.StickyConfig;
import com.anthropic.claude.models.organization.configtypes.StickySelectionConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ung implements w28 {
    public static final ung a;
    private static final SerialDescriptor descriptor;

    static {
        ung ungVar = new ung();
        a = ungVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.StickySelectionConfig", ungVar, 1);
        pluginGeneratedSerialDescriptor.j("model_selector", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(png.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        StickyConfig stickyConfig = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                stickyConfig = (StickyConfig) ud4VarC.m(serialDescriptor, 0, png.a, stickyConfig);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StickySelectionConfig(i, stickyConfig, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) obj;
        encoder.getClass();
        stickySelectionConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StickySelectionConfig.write$Self$models(stickySelectionConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
