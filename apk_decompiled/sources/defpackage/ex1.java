package defpackage;

import com.anthropic.claude.sessions.types.BridgeEnvironmentInfo;
import com.anthropic.claude.sessions.types.BridgeSpawnMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex1 implements w28 {
    public static final ex1 a;
    private static final SerialDescriptor descriptor;

    static {
        ex1 ex1Var = new ex1();
        a = ex1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.BridgeEnvironmentInfo", ex1Var, 7);
        pluginGeneratedSerialDescriptor.j("max_sessions", true);
        pluginGeneratedSerialDescriptor.j("machine_name", true);
        pluginGeneratedSerialDescriptor.j("directory", true);
        pluginGeneratedSerialDescriptor.j("branch", true);
        pluginGeneratedSerialDescriptor.j("git_repo_url", true);
        pluginGeneratedSerialDescriptor.j("online", true);
        pluginGeneratedSerialDescriptor.j("spawn_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(e79.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a), d4c.S(hx1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        BridgeSpawnMode bridgeSpawnMode = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                case 6:
                    bridgeSpawnMode = (BridgeSpawnMode) ud4VarC.m(serialDescriptor, 6, hx1.a, bridgeSpawnMode);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BridgeEnvironmentInfo(i, num, str, str2, str3, str4, bool, bridgeSpawnMode, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BridgeEnvironmentInfo bridgeEnvironmentInfo = (BridgeEnvironmentInfo) obj;
        encoder.getClass();
        bridgeEnvironmentInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BridgeEnvironmentInfo.write$Self$sessions(bridgeEnvironmentInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
