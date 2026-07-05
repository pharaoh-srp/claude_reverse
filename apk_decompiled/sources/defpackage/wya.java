package defpackage;

import com.anthropic.claude.api.mcp.McpAppToolResult;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wya implements w28 {
    public static final wya a;
    private static final SerialDescriptor descriptor;

    static {
        wya wyaVar = new wya();
        a = wyaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.McpAppToolResult", wyaVar, 4);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("isError", true);
        pluginGeneratedSerialDescriptor.j("structuredContent", true);
        pluginGeneratedSerialDescriptor.j("meta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{McpAppToolResult.$childSerializers[0].getValue(), zt1.a, d4c.S(uh9Var), d4c.S(uh9Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpAppToolResult.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        JsonObject jsonObject = null;
        JsonObject jsonObject2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 3, uh9.a, jsonObject2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpAppToolResult(i, list, zU, jsonObject, jsonObject2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpAppToolResult mcpAppToolResult = (McpAppToolResult) obj;
        encoder.getClass();
        mcpAppToolResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpAppToolResult.write$Self$api(mcpAppToolResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
