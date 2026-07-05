package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpAppError;
import com.anthropic.claude.analytics.events.McpEvents$McpAppErrorPhase;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u0b implements w28 {
    public static final u0b a;
    private static final SerialDescriptor descriptor;

    static {
        u0b u0bVar = new u0b();
        a = u0bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mcp_app.error", u0bVar, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("server_uuid", true);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("error_message", false);
        pluginGeneratedSerialDescriptor.j("server_name", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_phase", true);
        pluginGeneratedSerialDescriptor.j("redacted_url", true);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.k(new pi(25));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = McpEvents$McpAppError.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = McpEvents$McpAppError.$childSerializers;
        Long l = null;
        String str = null;
        boolean z = true;
        McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase = null;
        int i = 0;
        String strV = null;
        String str2 = null;
        String strV2 = null;
        String str3 = null;
        String strV3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    mcpEvents$McpAppErrorPhase = (McpEvents$McpAppErrorPhase) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), mcpEvents$McpAppErrorPhase);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    l = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new McpEvents$McpAppError(i, strV, str2, strV2, str3, strV3, str4, str5, mcpEvents$McpAppErrorPhase, str, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpEvents$McpAppError mcpEvents$McpAppError = (McpEvents$McpAppError) obj;
        encoder.getClass();
        mcpEvents$McpAppError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpEvents$McpAppError.write$Self$analytics(mcpEvents$McpAppError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
