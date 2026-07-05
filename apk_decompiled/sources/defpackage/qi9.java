package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcError;
import com.anthropic.claude.mcpapps.transport.JsonRpcResponse;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qi9 implements w28 {
    public static final qi9 a;
    private static final SerialDescriptor descriptor;

    static {
        qi9 qi9Var = new qi9();
        a = qi9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.JsonRpcResponse", qi9Var, 4);
        pluginGeneratedSerialDescriptor.j("jsonrpc", true);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("result", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, yh9.a, d4c.S(uh9.a), d4c.S(ei9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        JsonPrimitive jsonPrimitive = null;
        JsonObject jsonObject = null;
        JsonRpcError jsonRpcError = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                jsonPrimitive = (JsonPrimitive) ud4VarC.l(serialDescriptor, 1, yh9.a, jsonPrimitive);
                i |= 2;
            } else if (iX == 2) {
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonRpcError = (JsonRpcError) ud4VarC.m(serialDescriptor, 3, ei9.a, jsonRpcError);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new JsonRpcResponse(i, strV, jsonPrimitive, jsonObject, jsonRpcError, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonRpcResponse jsonRpcResponse = (JsonRpcResponse) obj;
        encoder.getClass();
        jsonRpcResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        JsonRpcResponse.write$Self$Claude_mcpapp(jsonRpcResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
