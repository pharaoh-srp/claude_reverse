package defpackage;

import com.anthropic.claude.api.memory.MemorySettingsRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ccb implements w28 {
    public static final ccb a;
    private static final SerialDescriptor descriptor;

    static {
        ccb ccbVar = new ccb();
        a = ccbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MemorySettingsRequest", ccbVar, 2);
        pluginGeneratedSerialDescriptor.j("enabled_melange", true);
        pluginGeneratedSerialDescriptor.j("enabled_saffron", true);
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
        return new MemorySettingsRequest(i, bool, bool2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MemorySettingsRequest memorySettingsRequest = (MemorySettingsRequest) obj;
        encoder.getClass();
        memorySettingsRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MemorySettingsRequest.write$Self$api(memorySettingsRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
