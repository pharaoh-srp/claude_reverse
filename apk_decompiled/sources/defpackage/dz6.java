package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dz6 implements w28 {
    public static final dz6 a;
    private static final SerialDescriptor descriptor;

    static {
        dz6 dz6Var = new dz6();
        a = dz6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError", dz6Var, 2);
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
        return new EventDeleteV0OutputEventDeleteResultDeleteResultsItemError(i, strV, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteV0OutputEventDeleteResultDeleteResultsItemError eventDeleteV0OutputEventDeleteResultDeleteResultsItemError = (EventDeleteV0OutputEventDeleteResultDeleteResultsItemError) obj;
        encoder.getClass();
        eventDeleteV0OutputEventDeleteResultDeleteResultsItemError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteV0OutputEventDeleteResultDeleteResultsItemError.write$Self$Claude_tool_model(eventDeleteV0OutputEventDeleteResultDeleteResultsItemError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
