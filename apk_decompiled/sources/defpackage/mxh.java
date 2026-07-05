package defpackage;

import com.anthropic.claude.mcpapps.transport.ToolInputParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mxh implements w28 {
    public static final mxh a;
    private static final SerialDescriptor descriptor;

    static {
        mxh mxhVar = new mxh();
        a = mxhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.ToolInputParams", mxhVar, 1);
        pluginGeneratedSerialDescriptor.j("arguments", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        JsonObject jsonObject = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.l(serialDescriptor, 0, uh9.a, jsonObject);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ToolInputParams(i, jsonObject, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolInputParams toolInputParams = (ToolInputParams) obj;
        encoder.getClass();
        toolInputParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, uh9.a, toolInputParams.arguments);
        vd4VarC.b(serialDescriptor);
    }
}
