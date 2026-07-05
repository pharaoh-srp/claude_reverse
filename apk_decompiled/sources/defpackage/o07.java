package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o07 implements w28 {
    public static final o07 a;
    private static final SerialDescriptor descriptor;

    static {
        o07 o07Var = new o07();
        a = o07Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", o07Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r07.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        EventSearchV0OutputEventSearchErrorErrorType eventSearchV0OutputEventSearchErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventSearchV0OutputEventSearchErrorErrorType = (EventSearchV0OutputEventSearchErrorErrorType) ud4VarC.l(serialDescriptor, 0, r07.d, eventSearchV0OutputEventSearchErrorErrorType);
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
        return new EventSearchV0OutputEventSearchError(i, eventSearchV0OutputEventSearchErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventSearchV0OutputEventSearchError eventSearchV0OutputEventSearchError = (EventSearchV0OutputEventSearchError) obj;
        encoder.getClass();
        eventSearchV0OutputEventSearchError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventSearchV0OutputEventSearchError.write$Self$Claude_tool_model(eventSearchV0OutputEventSearchError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
