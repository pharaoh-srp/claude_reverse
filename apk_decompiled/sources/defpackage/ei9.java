package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ei9 implements w28 {
    public static final ei9 a;
    private static final SerialDescriptor descriptor;

    static {
        ei9 ei9Var = new ei9();
        a = ei9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.JsonRpcError", ei9Var, 3);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, srg.a, d4c.S(uh9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        JsonObject jsonObject = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 2, uh9.a, jsonObject);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new JsonRpcError(i, iR, strV, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonRpcError jsonRpcError = (JsonRpcError) obj;
        encoder.getClass();
        jsonRpcError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        JsonRpcError.write$Self$Claude_mcpapp(jsonRpcError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
