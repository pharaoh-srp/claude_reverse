package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateError;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n37 implements w28 {
    public static final n37 a;
    private static final SerialDescriptor descriptor;

    static {
        n37 n37Var = new n37();
        a = n37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", n37Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q37.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        EventUpdateV0OutputEventUpdateErrorErrorType eventUpdateV0OutputEventUpdateErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventUpdateV0OutputEventUpdateErrorErrorType = (EventUpdateV0OutputEventUpdateErrorErrorType) ud4VarC.l(serialDescriptor, 0, q37.d, eventUpdateV0OutputEventUpdateErrorErrorType);
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
        return new EventUpdateV0OutputEventUpdateError(i, eventUpdateV0OutputEventUpdateErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateError eventUpdateV0OutputEventUpdateError = (EventUpdateV0OutputEventUpdateError) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateError.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
