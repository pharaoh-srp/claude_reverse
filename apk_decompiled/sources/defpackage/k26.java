package defpackage;

import com.anthropic.claude.mcpapps.transport.DeviceCapabilities;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k26 implements w28 {
    public static final k26 a;
    private static final SerialDescriptor descriptor;

    static {
        k26 k26Var = new k26();
        a = k26Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.DeviceCapabilities", k26Var, 2);
        pluginGeneratedSerialDescriptor.j("touch", true);
        pluginGeneratedSerialDescriptor.j("hover", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DeviceCapabilities(i, bool, bool2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DeviceCapabilities deviceCapabilities = (DeviceCapabilities) obj;
        encoder.getClass();
        deviceCapabilities.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DeviceCapabilities.write$Self$Claude_mcpapp(deviceCapabilities, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
