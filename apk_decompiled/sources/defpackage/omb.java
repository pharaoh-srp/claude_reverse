package defpackage;

import com.anthropic.claude.models.organization.configtypes.AlarmCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.CalendarSearchToolDescriptions;
import com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventDeleteInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventSearchInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectDataTypesInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MapDisplayInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MessageComposeInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.MobileAppUseToolConfig;
import com.anthropic.claude.models.organization.configtypes.TimerCreateInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.UserLocationInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.UserTimeToolDescriptions;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class omb implements w28 {
    public static final omb a;
    private static final SerialDescriptor descriptor;

    static {
        omb ombVar = new omb();
        a = ombVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.MobileAppUseToolConfig", ombVar, 15);
        pluginGeneratedSerialDescriptor.j("alarm_create_v0", false);
        pluginGeneratedSerialDescriptor.j("calendar_search_v0", false);
        pluginGeneratedSerialDescriptor.j("chart_display_v0", false);
        pluginGeneratedSerialDescriptor.j("event_create_v0", false);
        pluginGeneratedSerialDescriptor.j("event_create_v1", false);
        pluginGeneratedSerialDescriptor.j("event_delete_v0", false);
        pluginGeneratedSerialDescriptor.j("event_search_v0", false);
        pluginGeneratedSerialDescriptor.j("event_update_v0", false);
        pluginGeneratedSerialDescriptor.j("health_connect_data_types_v0", false);
        pluginGeneratedSerialDescriptor.j("health_connect_query_v0", false);
        pluginGeneratedSerialDescriptor.j("map_display_v0", false);
        pluginGeneratedSerialDescriptor.j("message_compose_v0", false);
        pluginGeneratedSerialDescriptor.j("timer_create_v0", false);
        pluginGeneratedSerialDescriptor.j("user_location_v0", false);
        pluginGeneratedSerialDescriptor.j("user_time_v0", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(os.a), d4c.S(x72.a), d4c.S(qj2.a), d4c.S(hv6.a), d4c.S(qw6.a), d4c.S(dy6.a), d4c.S(j07.a), d4c.S(j27.a), d4c.S(uh8.a), d4c.S(pi8.a), d4c.S(fra.a), d4c.S(teb.a), d4c.S(yqh.a), d4c.S(fni.a), d4c.S(toi.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        ChartDisplayInputDescriptions chartDisplayInputDescriptions;
        EventCreateInputDescriptions eventCreateInputDescriptions;
        MessageComposeInputDescriptions messageComposeInputDescriptions;
        EventCreateInputDescriptions eventCreateInputDescriptions2;
        AlarmCreateInputDescriptions alarmCreateInputDescriptions;
        EventCreateInputDescriptions eventCreateInputDescriptions3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        MessageComposeInputDescriptions messageComposeInputDescriptions2 = null;
        MapDisplayInputDescriptions mapDisplayInputDescriptions = null;
        HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions = null;
        TimerCreateInputDescriptions timerCreateInputDescriptions = null;
        HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions = null;
        int i = 0;
        UserLocationInputDescriptions userLocationInputDescriptions = null;
        UserTimeToolDescriptions userTimeToolDescriptions = null;
        ChartDisplayInputDescriptions chartDisplayInputDescriptions2 = null;
        EventCreateInputDescriptions eventCreateInputDescriptions4 = null;
        EventCreateV1InputDescriptions eventCreateV1InputDescriptions = null;
        EventDeleteInputDescriptions eventDeleteInputDescriptions = null;
        EventSearchInputDescriptions eventSearchInputDescriptions = null;
        EventUpdateInputDescriptions eventUpdateInputDescriptions = null;
        boolean z = true;
        AlarmCreateInputDescriptions alarmCreateInputDescriptions2 = null;
        CalendarSearchToolDescriptions calendarSearchToolDescriptions = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    messageComposeInputDescriptions = messageComposeInputDescriptions2;
                    eventCreateInputDescriptions2 = eventCreateInputDescriptions4;
                    alarmCreateInputDescriptions = alarmCreateInputDescriptions2;
                    z = false;
                    mapDisplayInputDescriptions = mapDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions2;
                    alarmCreateInputDescriptions2 = alarmCreateInputDescriptions;
                    messageComposeInputDescriptions2 = messageComposeInputDescriptions;
                    break;
                case 0:
                    messageComposeInputDescriptions = messageComposeInputDescriptions2;
                    eventCreateInputDescriptions2 = eventCreateInputDescriptions4;
                    alarmCreateInputDescriptions = (AlarmCreateInputDescriptions) ud4VarC.m(serialDescriptor, 0, os.a, alarmCreateInputDescriptions2);
                    i |= 1;
                    mapDisplayInputDescriptions = mapDisplayInputDescriptions;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions2;
                    alarmCreateInputDescriptions2 = alarmCreateInputDescriptions;
                    messageComposeInputDescriptions2 = messageComposeInputDescriptions;
                    break;
                case 1:
                    messageComposeInputDescriptions = messageComposeInputDescriptions2;
                    eventCreateInputDescriptions3 = eventCreateInputDescriptions4;
                    calendarSearchToolDescriptions = (CalendarSearchToolDescriptions) ud4VarC.m(serialDescriptor, 1, x72.a, calendarSearchToolDescriptions);
                    i |= 2;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions3;
                    messageComposeInputDescriptions2 = messageComposeInputDescriptions;
                    break;
                case 2:
                    messageComposeInputDescriptions = messageComposeInputDescriptions2;
                    eventCreateInputDescriptions3 = eventCreateInputDescriptions4;
                    chartDisplayInputDescriptions2 = (ChartDisplayInputDescriptions) ud4VarC.m(serialDescriptor, 2, qj2.a, chartDisplayInputDescriptions2);
                    i |= 4;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions3;
                    messageComposeInputDescriptions2 = messageComposeInputDescriptions;
                    break;
                case 3:
                    messageComposeInputDescriptions = messageComposeInputDescriptions2;
                    eventCreateInputDescriptions4 = (EventCreateInputDescriptions) ud4VarC.m(serialDescriptor, 3, hv6.a, eventCreateInputDescriptions4);
                    i |= 8;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions2;
                    messageComposeInputDescriptions2 = messageComposeInputDescriptions;
                    break;
                case 4:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    eventCreateV1InputDescriptions = (EventCreateV1InputDescriptions) ud4VarC.m(serialDescriptor, 4, qw6.a, eventCreateV1InputDescriptions);
                    i |= 16;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 5:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    eventDeleteInputDescriptions = (EventDeleteInputDescriptions) ud4VarC.m(serialDescriptor, 5, dy6.a, eventDeleteInputDescriptions);
                    i |= 32;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 6:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    eventSearchInputDescriptions = (EventSearchInputDescriptions) ud4VarC.m(serialDescriptor, 6, j07.a, eventSearchInputDescriptions);
                    i |= 64;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 7:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    eventUpdateInputDescriptions = (EventUpdateInputDescriptions) ud4VarC.m(serialDescriptor, 7, j27.a, eventUpdateInputDescriptions);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 8:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    healthConnectDataTypesInputDescriptions = (HealthConnectDataTypesInputDescriptions) ud4VarC.m(serialDescriptor, 8, uh8.a, healthConnectDataTypesInputDescriptions);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 9:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    healthConnectQueryInputDescriptions = (HealthConnectQueryInputDescriptions) ud4VarC.m(serialDescriptor, 9, pi8.a, healthConnectQueryInputDescriptions);
                    i |= 512;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 10:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    mapDisplayInputDescriptions = (MapDisplayInputDescriptions) ud4VarC.m(serialDescriptor, 10, fra.a, mapDisplayInputDescriptions);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 11:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    messageComposeInputDescriptions2 = (MessageComposeInputDescriptions) ud4VarC.m(serialDescriptor, 11, teb.a, messageComposeInputDescriptions2);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 12:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    timerCreateInputDescriptions = (TimerCreateInputDescriptions) ud4VarC.m(serialDescriptor, 12, yqh.a, timerCreateInputDescriptions);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 13:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    userLocationInputDescriptions = (UserLocationInputDescriptions) ud4VarC.m(serialDescriptor, 13, fni.a, userLocationInputDescriptions);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                case 14:
                    chartDisplayInputDescriptions = chartDisplayInputDescriptions2;
                    eventCreateInputDescriptions = eventCreateInputDescriptions4;
                    userTimeToolDescriptions = (UserTimeToolDescriptions) ud4VarC.m(serialDescriptor, 14, toi.a, userTimeToolDescriptions);
                    i |= 16384;
                    chartDisplayInputDescriptions2 = chartDisplayInputDescriptions;
                    eventCreateInputDescriptions4 = eventCreateInputDescriptions;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        MessageComposeInputDescriptions messageComposeInputDescriptions3 = messageComposeInputDescriptions2;
        EventCreateInputDescriptions eventCreateInputDescriptions5 = eventCreateInputDescriptions4;
        ud4VarC.b(serialDescriptor);
        return new MobileAppUseToolConfig(i, alarmCreateInputDescriptions2, calendarSearchToolDescriptions, chartDisplayInputDescriptions2, eventCreateInputDescriptions5, eventCreateV1InputDescriptions, eventDeleteInputDescriptions, eventSearchInputDescriptions, eventUpdateInputDescriptions, healthConnectDataTypesInputDescriptions, healthConnectQueryInputDescriptions, mapDisplayInputDescriptions, messageComposeInputDescriptions3, timerCreateInputDescriptions, userLocationInputDescriptions, userTimeToolDescriptions, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) obj;
        encoder.getClass();
        mobileAppUseToolConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseToolConfig.write$Self$models(mobileAppUseToolConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
