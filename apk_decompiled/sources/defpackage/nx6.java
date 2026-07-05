package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Error;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nx6 implements w28 {
    public static final nx6 a;
    private static final SerialDescriptor descriptor;

    static {
        nx6 nx6Var = new nx6();
        a = nx6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", nx6Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qx6.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        EventCreateV1OutputEventCreateV1ErrorErrorType eventCreateV1OutputEventCreateV1ErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventCreateV1OutputEventCreateV1ErrorErrorType = (EventCreateV1OutputEventCreateV1ErrorErrorType) ud4VarC.l(serialDescriptor, 0, qx6.d, eventCreateV1OutputEventCreateV1ErrorErrorType);
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
        return new EventCreateV1OutputEventCreateV1Error(i, eventCreateV1OutputEventCreateV1ErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1OutputEventCreateV1Error eventCreateV1OutputEventCreateV1Error = (EventCreateV1OutputEventCreateV1Error) obj;
        encoder.getClass();
        eventCreateV1OutputEventCreateV1Error.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1OutputEventCreateV1Error.write$Self$Claude_tool_model(eventCreateV1OutputEventCreateV1Error, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
