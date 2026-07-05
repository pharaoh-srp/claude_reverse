package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAppBridgeEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0b implements w28 {
    public static final s0b a;
    private static final SerialDescriptor descriptor;

    static {
        s0b s0bVar = new s0b();
        a = s0bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp_app.bridge_event", s0bVar, 7);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("server_uuid", true);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("event_type", false);
        pluginGeneratedSerialDescriptor.j("server_name", true);
        pluginGeneratedSerialDescriptor.j("redacted_url", true);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String strV2 = null;
        String str2 = null;
        String strV3 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpAppBridgeEvent(i, strV, str, strV2, str2, strV3, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpAppBridgeEvent mcpEvents$McpAppBridgeEvent = (McpEvents$McpAppBridgeEvent) obj;
        encoder.getClass();
        mcpEvents$McpAppBridgeEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpAppBridgeEvent.write$Self$analytics(mcpEvents$McpAppBridgeEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
