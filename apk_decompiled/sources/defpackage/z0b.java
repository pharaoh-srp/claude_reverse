package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAppInitialized;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0b implements w28 {
    public static final z0b a;
    private static final SerialDescriptor descriptor;

    static {
        z0b z0bVar = new z0b();
        a = z0bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp_app.initialized", z0bVar, 8);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("server_uuid", true);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("time_to_initialized_ms", false);
        pluginGeneratedSerialDescriptor.j("was_reinitialized", false);
        pluginGeneratedSerialDescriptor.j("server_name", true);
        pluginGeneratedSerialDescriptor.j("redacted_url", true);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), xka.a, zt1.a, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        String str = null;
        String strV = null;
        String str2 = null;
        String strV2 = null;
        String str3 = null;
        long j = 0;
        int i = 0;
        boolean zU = false;
        boolean z = true;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpAppInitialized(i, strV, str2, strV2, str3, j, zU, str4, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpAppInitialized mcpEvents$McpAppInitialized = (McpEvents$McpAppInitialized) obj;
        encoder.getClass();
        mcpEvents$McpAppInitialized.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpAppInitialized.write$Self$analytics(mcpEvents$McpAppInitialized, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
