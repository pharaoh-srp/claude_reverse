package defpackage;

import com.anthropic.claude.mcpapps.transport.CancelledParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class db2 implements w28 {
    public static final db2 a;
    private static final SerialDescriptor descriptor;

    static {
        db2 db2Var = new db2();
        a = db2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.CancelledParams", db2Var, 2);
        pluginGeneratedSerialDescriptor.j("requestId", false);
        pluginGeneratedSerialDescriptor.j("reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yh9.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        JsonPrimitive jsonPrimitive = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonPrimitive = (JsonPrimitive) ud4VarC.l(serialDescriptor, 0, yh9.a, jsonPrimitive);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CancelledParams(i, jsonPrimitive, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CancelledParams cancelledParams = (CancelledParams) obj;
        encoder.getClass();
        cancelledParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CancelledParams.write$Self$Claude_mcpapp(cancelledParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
