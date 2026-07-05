package defpackage;

import com.anthropic.claude.mcpapps.transport.McpServerCapabilities;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m3b implements w28 {
    public static final m3b a;
    private static final SerialDescriptor descriptor;

    static {
        m3b m3bVar = new m3b();
        a = m3bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.McpServerCapabilities", m3bVar, 3);
        pluginGeneratedSerialDescriptor.j("tools", true);
        pluginGeneratedSerialDescriptor.j("resources", true);
        pluginGeneratedSerialDescriptor.j("prompts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{d4c.S(uh9Var), d4c.S(uh9Var), d4c.S(uh9Var)};
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
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 0, uh9.a, jsonObject);
                i |= 1;
            } else if (iX == 1) {
                jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 1, uh9.a, jsonObject2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject3 = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject3);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpServerCapabilities(i, jsonObject, jsonObject2, jsonObject3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpServerCapabilities mcpServerCapabilities = (McpServerCapabilities) obj;
        encoder.getClass();
        mcpServerCapabilities.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpServerCapabilities.write$Self$Claude_mcpapp(mcpServerCapabilities, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
