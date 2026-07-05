package defpackage;

import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e82 implements w28 {
    public static final e82 a;
    private static final SerialDescriptor descriptor;

    static {
        e82 e82Var = new e82();
        a = e82Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("success", e82Var, 1);
        pluginGeneratedSerialDescriptor.j("calendars", false);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CalendarSearchV0OutputCalendarSearchResult.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CalendarSearchV0OutputCalendarSearchResult.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CalendarSearchV0OutputCalendarSearchResult(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CalendarSearchV0OutputCalendarSearchResult calendarSearchV0OutputCalendarSearchResult = (CalendarSearchV0OutputCalendarSearchResult) obj;
        encoder.getClass();
        calendarSearchV0OutputCalendarSearchResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) CalendarSearchV0OutputCalendarSearchResult.$childSerializers[0].getValue(), calendarSearchV0OutputCalendarSearchResult.calendars);
        vd4VarC.b(serialDescriptor);
    }
}
