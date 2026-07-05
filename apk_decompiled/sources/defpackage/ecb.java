package defpackage;

import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.memory.MemorySettingsResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ecb implements w28 {
    public static final ecb a;
    private static final SerialDescriptor descriptor;

    static {
        ecb ecbVar = new ecb();
        a = ecbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.memory.MemorySettingsResponse", ecbVar, 4);
        pluginGeneratedSerialDescriptor.j("enabled_melange", true);
        pluginGeneratedSerialDescriptor.j("enabled_saffron", true);
        pluginGeneratedSerialDescriptor.j("enabled_saffron_search", true);
        pluginGeneratedSerialDescriptor.j("memory_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(xbb.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        MemoryMode memoryMode = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else if (iX == 1) {
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool2);
                i |= 2;
            } else if (iX == 2) {
                bool3 = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                memoryMode = (MemoryMode) ud4VarC.m(serialDescriptor, 3, xbb.d, memoryMode);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MemorySettingsResponse(i, bool, bool2, bool3, memoryMode, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MemorySettingsResponse memorySettingsResponse = (MemorySettingsResponse) obj;
        encoder.getClass();
        memorySettingsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MemorySettingsResponse.write$Self$api(memorySettingsResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
