package defpackage;

import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItem;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g82 implements w28 {
    public static final g82 a;
    private static final SerialDescriptor descriptor;

    static {
        g82 g82Var = new g82();
        a = g82Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItem", g82Var, 7);
        pluginGeneratedSerialDescriptor.j("access_level", true);
        pluginGeneratedSerialDescriptor.j("account_name", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("is_primary", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("owner_account", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(j82.d);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(srgVar), srgVar, d4c.S(zt1.a), srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel = null;
        String str = null;
        String str2 = null;
        String strV = null;
        Boolean bool = null;
        String strV2 = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel = (CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel) ud4VarC.m(serialDescriptor, 0, j82.d, calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    strV = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    strV2 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CalendarSearchV0OutputCalendarSearchResultCalendarsItem(i, calendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel, str, str2, strV, bool, strV2, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CalendarSearchV0OutputCalendarSearchResultCalendarsItem calendarSearchV0OutputCalendarSearchResultCalendarsItem = (CalendarSearchV0OutputCalendarSearchResultCalendarsItem) obj;
        encoder.getClass();
        calendarSearchV0OutputCalendarSearchResultCalendarsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CalendarSearchV0OutputCalendarSearchResultCalendarsItem.write$Self$Claude_tool_model(calendarSearchV0OutputCalendarSearchResultCalendarsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
