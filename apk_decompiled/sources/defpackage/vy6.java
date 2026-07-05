package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vy6 implements w28 {
    public static final vy6 a;
    private static final SerialDescriptor descriptor;

    static {
        vy6 vy6Var = new vy6();
        a = vy6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", vy6Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yy6.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        EventDeleteV0OutputEventDeleteErrorErrorType eventDeleteV0OutputEventDeleteErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventDeleteV0OutputEventDeleteErrorErrorType = (EventDeleteV0OutputEventDeleteErrorErrorType) ud4VarC.l(serialDescriptor, 0, yy6.d, eventDeleteV0OutputEventDeleteErrorErrorType);
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
        return new EventDeleteV0OutputEventDeleteError(i, eventDeleteV0OutputEventDeleteErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteV0OutputEventDeleteError eventDeleteV0OutputEventDeleteError = (EventDeleteV0OutputEventDeleteError) obj;
        encoder.getClass();
        eventDeleteV0OutputEventDeleteError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteV0OutputEventDeleteError.write$Self$Claude_tool_model(eventDeleteV0OutputEventDeleteError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
