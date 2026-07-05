package defpackage;

import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a82 implements w28 {
    public static final a82 a;
    private static final SerialDescriptor descriptor;

    static {
        a82 a82Var = new a82();
        a = a82Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", a82Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d82.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CalendarSearchV0OutputCalendarSearchErrorErrorType calendarSearchV0OutputCalendarSearchErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                calendarSearchV0OutputCalendarSearchErrorErrorType = (CalendarSearchV0OutputCalendarSearchErrorErrorType) ud4VarC.l(serialDescriptor, 0, d82.d, calendarSearchV0OutputCalendarSearchErrorErrorType);
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
        return new CalendarSearchV0OutputCalendarSearchError(i, calendarSearchV0OutputCalendarSearchErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CalendarSearchV0OutputCalendarSearchError calendarSearchV0OutputCalendarSearchError = (CalendarSearchV0OutputCalendarSearchError) obj;
        encoder.getClass();
        calendarSearchV0OutputCalendarSearchError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CalendarSearchV0OutputCalendarSearchError.write$Self$Claude_tool_model(calendarSearchV0OutputCalendarSearchError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
