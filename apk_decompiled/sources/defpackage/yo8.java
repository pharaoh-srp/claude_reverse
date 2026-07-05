package defpackage;

import com.anthropic.claude.mcpapps.transport.HostCapabilities;
import com.anthropic.claude.mcpapps.transport.HostMessageCapability;
import com.anthropic.claude.mcpapps.transport.HostUpdateModelContextCapability;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yo8 implements w28 {
    public static final yo8 a;
    private static final SerialDescriptor descriptor;

    static {
        yo8 yo8Var = new yo8();
        a = yo8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.HostCapabilities", yo8Var, 6);
        pluginGeneratedSerialDescriptor.j("openLinks", true);
        pluginGeneratedSerialDescriptor.j("serverTools", true);
        pluginGeneratedSerialDescriptor.j("serverResources", true);
        pluginGeneratedSerialDescriptor.j("logging", true);
        pluginGeneratedSerialDescriptor.j("updateModelContext", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{d4c.S(uh9Var), d4c.S(uh9Var), d4c.S(uh9Var), d4c.S(uh9Var), d4c.S(hp8.a), d4c.S(fp8.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
        JsonObject jsonObject3 = null;
        JsonObject jsonObject4 = null;
        HostUpdateModelContextCapability hostUpdateModelContextCapability = null;
        HostMessageCapability hostMessageCapability = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 0, uh9.a, jsonObject);
                    i |= 1;
                    break;
                case 1:
                    jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 1, uh9.a, jsonObject2);
                    i |= 2;
                    break;
                case 2:
                    jsonObject3 = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject3);
                    i |= 4;
                    break;
                case 3:
                    jsonObject4 = (JsonObject) ud4VarC.m(serialDescriptor, 3, uh9.a, jsonObject4);
                    i |= 8;
                    break;
                case 4:
                    hostUpdateModelContextCapability = (HostUpdateModelContextCapability) ud4VarC.m(serialDescriptor, 4, hp8.a, hostUpdateModelContextCapability);
                    i |= 16;
                    break;
                case 5:
                    hostMessageCapability = (HostMessageCapability) ud4VarC.m(serialDescriptor, 5, fp8.a, hostMessageCapability);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HostCapabilities(i, jsonObject, jsonObject2, jsonObject3, jsonObject4, hostUpdateModelContextCapability, hostMessageCapability, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HostCapabilities hostCapabilities = (HostCapabilities) obj;
        encoder.getClass();
        hostCapabilities.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HostCapabilities.write$Self$Claude_mcpapp(hostCapabilities, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
