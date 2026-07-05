package defpackage;

import com.anthropic.claude.mcpapps.transport.LogParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qfa implements w28 {
    public static final qfa a;
    private static final SerialDescriptor descriptor;

    static {
        qfa qfaVar = new qfa();
        a = qfaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.LogParams", qfaVar, 2);
        pluginGeneratedSerialDescriptor.j("level", false);
        pluginGeneratedSerialDescriptor.j("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, eh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        JsonElement jsonElement = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                jsonElement = (JsonElement) ud4VarC.l(serialDescriptor, 1, eh9.a, jsonElement);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LogParams(i, strV, jsonElement, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LogParams logParams = (LogParams) obj;
        encoder.getClass();
        logParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LogParams.write$Self$Claude_mcpapp(logParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
