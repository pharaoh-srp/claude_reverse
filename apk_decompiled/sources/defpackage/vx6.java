package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItemError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx6 implements w28 {
    public static final vx6 a;
    private static final SerialDescriptor descriptor;

    static {
        vx6 vx6Var = new vx6();
        a = vx6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItemError", vx6Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar)};
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
        String str = null;
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
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV1OutputEventCreateV1ResultCreateResultsItemError(i, strV, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1OutputEventCreateV1ResultCreateResultsItemError eventCreateV1OutputEventCreateV1ResultCreateResultsItemError = (EventCreateV1OutputEventCreateV1ResultCreateResultsItemError) obj;
        encoder.getClass();
        eventCreateV1OutputEventCreateV1ResultCreateResultsItemError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1OutputEventCreateV1ResultCreateResultsItemError.write$Self$Claude_tool_model(eventCreateV1OutputEventCreateV1ResultCreateResultsItemError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
