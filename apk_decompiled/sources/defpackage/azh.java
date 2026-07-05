package defpackage;

import com.anthropic.claude.mcpapps.transport.ToolResultParams;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class azh implements w28 {
    public static final azh a;
    private static final SerialDescriptor descriptor;

    static {
        azh azhVar = new azh();
        a = azhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.ToolResultParams", azhVar, 4);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("isError", true);
        pluginGeneratedSerialDescriptor.j("structuredContent", true);
        pluginGeneratedSerialDescriptor.j("_meta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{ToolResultParams.$childSerializers[0].getValue(), d4c.S(zt1.a), d4c.S(uh9Var), d4c.S(uh9Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ToolResultParams.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
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
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
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
        return new ToolResultParams(i, list, bool, jsonObject, jsonObject2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolResultParams toolResultParams = (ToolResultParams) obj;
        encoder.getClass();
        toolResultParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolResultParams.write$Self$Claude_mcpapp(toolResultParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
