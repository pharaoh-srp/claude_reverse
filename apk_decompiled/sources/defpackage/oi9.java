package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oi9 implements w28 {
    public static final oi9 a;
    private static final SerialDescriptor descriptor;

    static {
        oi9 oi9Var = new oi9();
        a = oi9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.JsonRpcRequest", oi9Var, 4);
        pluginGeneratedSerialDescriptor.j("jsonrpc", true);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(uh9.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, yh9.a, srgVar, kSerializerS};
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
        String strV2 = null;
        JsonObject jsonObject = null;
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
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 3, uh9.a, jsonObject);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new JsonRpcRequest(i, strV, jsonPrimitive, strV2, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) obj;
        encoder.getClass();
        jsonRpcRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        JsonRpcRequest.write$Self$Claude_mcpapp(jsonRpcRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
