package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v37 implements w28 {
    public static final v37 a;
    private static final SerialDescriptor descriptor;

    static {
        v37 v37Var = new v37();
        a = v37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemError", v37Var, 2);
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
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemError(i, strV, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemError) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateResultUpdateResultsItemError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemError.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
