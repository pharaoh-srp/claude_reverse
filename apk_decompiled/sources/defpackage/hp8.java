package defpackage;

import com.anthropic.claude.mcpapps.transport.HostUpdateModelContextCapability;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp8 implements w28 {
    public static final hp8 a;
    private static final SerialDescriptor descriptor;

    static {
        hp8 hp8Var = new hp8();
        a = hp8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.HostUpdateModelContextCapability", hp8Var, 2);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{d4c.S(uh9Var), d4c.S(uh9Var)};
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
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 0, uh9.a, jsonObject);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 1, uh9.a, jsonObject2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HostUpdateModelContextCapability(i, jsonObject, jsonObject2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HostUpdateModelContextCapability hostUpdateModelContextCapability = (HostUpdateModelContextCapability) obj;
        encoder.getClass();
        hostUpdateModelContextCapability.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HostUpdateModelContextCapability.write$Self$Claude_mcpapp(hostUpdateModelContextCapability, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
