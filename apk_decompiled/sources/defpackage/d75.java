package defpackage;

import com.anthropic.claude.api.mcp.CreateMcpRemoteServerResponse;
import com.anthropic.claude.types.strings.McpServerId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d75 implements w28 {
    public static final d75 a;
    private static final SerialDescriptor descriptor;

    static {
        d75 d75Var = new d75();
        a = d75Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.CreateMcpRemoteServerResponse", d75Var, 3);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{p3b.a, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateMcpRemoteServerResponse(i, strM1035unboximpl, strV, strV2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateMcpRemoteServerResponse createMcpRemoteServerResponse = (CreateMcpRemoteServerResponse) obj;
        encoder.getClass();
        createMcpRemoteServerResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateMcpRemoteServerResponse.write$Self$api(createMcpRemoteServerResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
