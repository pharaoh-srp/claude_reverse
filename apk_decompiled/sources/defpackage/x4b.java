package defpackage;

import com.anthropic.claude.api.tasks.McpToolUseEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x4b implements w28 {
    public static final x4b a;
    private static final SerialDescriptor descriptor;

    static {
        x4b x4bVar = new x4b();
        a = x4bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp_tool_use", x4bVar, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("step_id", true);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("mcp_server_name", false);
        pluginGeneratedSerialDescriptor.j("input", true);
        pluginGeneratedSerialDescriptor.k(new gl0(12));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), srgVar, srgVar, srgVar, uh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        JsonObject jsonObject = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonObject = (JsonObject) ud4VarC.l(serialDescriptor, 5, uh9.a, jsonObject);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpToolUseEvent(i, str, str2, strV, strV2, strV3, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpToolUseEvent mcpToolUseEvent = (McpToolUseEvent) obj;
        encoder.getClass();
        mcpToolUseEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpToolUseEvent.write$Self$api(mcpToolUseEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
