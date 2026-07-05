package com.anthropic.claude.models.organization.configtypes;

import defpackage.dy6;
import defpackage.fni;
import defpackage.fra;
import defpackage.gvj;
import defpackage.hv6;
import defpackage.j07;
import defpackage.j27;
import defpackage.mdj;
import defpackage.omb;
import defpackage.onf;
import defpackage.os;
import defpackage.pi8;
import defpackage.pmb;
import defpackage.qj2;
import defpackage.qw6;
import defpackage.teb;
import defpackage.toi;
import defpackage.uh8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.x72;
import defpackage.yqh;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 w2\u00020\u0001:\u0002xyB\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!B±\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bC\u0010DJÄ\u0001\u0010E\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u00020M2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OJ'\u0010X\u001a\u00020U2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0001¢\u0006\u0004\bV\u0010WR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010[\u001a\u0004\b\\\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010]\u001a\u0004\b^\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010_\u001a\u0004\b`\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bb\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010c\u001a\u0004\bd\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010e\u001a\u0004\bf\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010g\u001a\u0004\bh\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010i\u001a\u0004\bj\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010k\u001a\u0004\bl\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010m\u001a\u0004\bn\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010o\u001a\u0004\bp\u0010>R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010q\u001a\u0004\br\u0010@R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010s\u001a\u0004\bt\u0010BR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010u\u001a\u0004\bv\u0010D¨\u0006z"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/MobileAppUseToolConfig;", "", "Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;", "alarm_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;", "calendar_search_v0", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;", "chart_display_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;", "event_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;", "event_create_v1", "Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;", "event_delete_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;", "event_search_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;", "event_update_v0", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;", "health_connect_data_types_v0", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;", "health_connect_query_v0", "Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;", "map_display_v0", "Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;", "message_compose_v0", "Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;", "timer_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;", "user_location_v0", "Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;", "user_time_v0", "<init>", "(Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;Lvnf;)V", "component1", "()Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;", "component3", "()Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;", "component4", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;", "component5", "()Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;", "component6", "()Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;", "component7", "()Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;", "component8", "()Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;", "component9", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;", "component10", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;", "component11", "()Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;", "component12", "()Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;", "component13", "()Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;", "component14", "()Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;", "component15", "()Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;", "copy", "(Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;)Lcom/anthropic/claude/models/organization/configtypes/MobileAppUseToolConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/MobileAppUseToolConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/models/organization/configtypes/AlarmCreateInputDescriptions;", "getAlarm_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/CalendarSearchToolDescriptions;", "getCalendar_search_v0", "Lcom/anthropic/claude/models/organization/configtypes/ChartDisplayInputDescriptions;", "getChart_display_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateInputDescriptions;", "getEvent_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventCreateV1InputDescriptions;", "getEvent_create_v1", "Lcom/anthropic/claude/models/organization/configtypes/EventDeleteInputDescriptions;", "getEvent_delete_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventSearchInputDescriptions;", "getEvent_search_v0", "Lcom/anthropic/claude/models/organization/configtypes/EventUpdateInputDescriptions;", "getEvent_update_v0", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;", "getHealth_connect_data_types_v0", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;", "getHealth_connect_query_v0", "Lcom/anthropic/claude/models/organization/configtypes/MapDisplayInputDescriptions;", "getMap_display_v0", "Lcom/anthropic/claude/models/organization/configtypes/MessageComposeInputDescriptions;", "getMessage_compose_v0", "Lcom/anthropic/claude/models/organization/configtypes/TimerCreateInputDescriptions;", "getTimer_create_v0", "Lcom/anthropic/claude/models/organization/configtypes/UserLocationInputDescriptions;", "getUser_location_v0", "Lcom/anthropic/claude/models/organization/configtypes/UserTimeToolDescriptions;", "getUser_time_v0", "Companion", "omb", "pmb", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseToolConfig {
    public static final int $stable = 0;
    public static final pmb Companion = new pmb();
    private final AlarmCreateInputDescriptions alarm_create_v0;
    private final CalendarSearchToolDescriptions calendar_search_v0;
    private final ChartDisplayInputDescriptions chart_display_v0;
    private final EventCreateInputDescriptions event_create_v0;
    private final EventCreateV1InputDescriptions event_create_v1;
    private final EventDeleteInputDescriptions event_delete_v0;
    private final EventSearchInputDescriptions event_search_v0;
    private final EventUpdateInputDescriptions event_update_v0;
    private final HealthConnectDataTypesInputDescriptions health_connect_data_types_v0;
    private final HealthConnectQueryInputDescriptions health_connect_query_v0;
    private final MapDisplayInputDescriptions map_display_v0;
    private final MessageComposeInputDescriptions message_compose_v0;
    private final TimerCreateInputDescriptions timer_create_v0;
    private final UserLocationInputDescriptions user_location_v0;
    private final UserTimeToolDescriptions user_time_v0;

    public /* synthetic */ MobileAppUseToolConfig(int i, AlarmCreateInputDescriptions alarmCreateInputDescriptions, CalendarSearchToolDescriptions calendarSearchToolDescriptions, ChartDisplayInputDescriptions chartDisplayInputDescriptions, EventCreateInputDescriptions eventCreateInputDescriptions, EventCreateV1InputDescriptions eventCreateV1InputDescriptions, EventDeleteInputDescriptions eventDeleteInputDescriptions, EventSearchInputDescriptions eventSearchInputDescriptions, EventUpdateInputDescriptions eventUpdateInputDescriptions, HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions, HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions, MapDisplayInputDescriptions mapDisplayInputDescriptions, MessageComposeInputDescriptions messageComposeInputDescriptions, TimerCreateInputDescriptions timerCreateInputDescriptions, UserLocationInputDescriptions userLocationInputDescriptions, UserTimeToolDescriptions userTimeToolDescriptions, vnf vnfVar) {
        if (32767 != (i & 32767)) {
            gvj.f(i, 32767, omb.a.getDescriptor());
            throw null;
        }
        this.alarm_create_v0 = alarmCreateInputDescriptions;
        this.calendar_search_v0 = calendarSearchToolDescriptions;
        this.chart_display_v0 = chartDisplayInputDescriptions;
        this.event_create_v0 = eventCreateInputDescriptions;
        this.event_create_v1 = eventCreateV1InputDescriptions;
        this.event_delete_v0 = eventDeleteInputDescriptions;
        this.event_search_v0 = eventSearchInputDescriptions;
        this.event_update_v0 = eventUpdateInputDescriptions;
        this.health_connect_data_types_v0 = healthConnectDataTypesInputDescriptions;
        this.health_connect_query_v0 = healthConnectQueryInputDescriptions;
        this.map_display_v0 = mapDisplayInputDescriptions;
        this.message_compose_v0 = messageComposeInputDescriptions;
        this.timer_create_v0 = timerCreateInputDescriptions;
        this.user_location_v0 = userLocationInputDescriptions;
        this.user_time_v0 = userTimeToolDescriptions;
    }

    public static final /* synthetic */ void write$Self$models(MobileAppUseToolConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.B(serialDesc, 0, os.a, self.alarm_create_v0);
        output.B(serialDesc, 1, x72.a, self.calendar_search_v0);
        output.B(serialDesc, 2, qj2.a, self.chart_display_v0);
        output.B(serialDesc, 3, hv6.a, self.event_create_v0);
        output.B(serialDesc, 4, qw6.a, self.event_create_v1);
        output.B(serialDesc, 5, dy6.a, self.event_delete_v0);
        output.B(serialDesc, 6, j07.a, self.event_search_v0);
        output.B(serialDesc, 7, j27.a, self.event_update_v0);
        output.B(serialDesc, 8, uh8.a, self.health_connect_data_types_v0);
        output.B(serialDesc, 9, pi8.a, self.health_connect_query_v0);
        output.B(serialDesc, 10, fra.a, self.map_display_v0);
        output.B(serialDesc, 11, teb.a, self.message_compose_v0);
        output.B(serialDesc, 12, yqh.a, self.timer_create_v0);
        output.B(serialDesc, 13, fni.a, self.user_location_v0);
        output.B(serialDesc, 14, toi.a, self.user_time_v0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AlarmCreateInputDescriptions getAlarm_create_v0() {
        return this.alarm_create_v0;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final HealthConnectQueryInputDescriptions getHealth_connect_query_v0() {
        return this.health_connect_query_v0;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MapDisplayInputDescriptions getMap_display_v0() {
        return this.map_display_v0;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final MessageComposeInputDescriptions getMessage_compose_v0() {
        return this.message_compose_v0;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TimerCreateInputDescriptions getTimer_create_v0() {
        return this.timer_create_v0;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final UserLocationInputDescriptions getUser_location_v0() {
        return this.user_location_v0;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final UserTimeToolDescriptions getUser_time_v0() {
        return this.user_time_v0;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CalendarSearchToolDescriptions getCalendar_search_v0() {
        return this.calendar_search_v0;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChartDisplayInputDescriptions getChart_display_v0() {
        return this.chart_display_v0;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EventCreateInputDescriptions getEvent_create_v0() {
        return this.event_create_v0;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EventCreateV1InputDescriptions getEvent_create_v1() {
        return this.event_create_v1;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EventDeleteInputDescriptions getEvent_delete_v0() {
        return this.event_delete_v0;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EventSearchInputDescriptions getEvent_search_v0() {
        return this.event_search_v0;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EventUpdateInputDescriptions getEvent_update_v0() {
        return this.event_update_v0;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HealthConnectDataTypesInputDescriptions getHealth_connect_data_types_v0() {
        return this.health_connect_data_types_v0;
    }

    public final MobileAppUseToolConfig copy(AlarmCreateInputDescriptions alarm_create_v0, CalendarSearchToolDescriptions calendar_search_v0, ChartDisplayInputDescriptions chart_display_v0, EventCreateInputDescriptions event_create_v0, EventCreateV1InputDescriptions event_create_v1, EventDeleteInputDescriptions event_delete_v0, EventSearchInputDescriptions event_search_v0, EventUpdateInputDescriptions event_update_v0, HealthConnectDataTypesInputDescriptions health_connect_data_types_v0, HealthConnectQueryInputDescriptions health_connect_query_v0, MapDisplayInputDescriptions map_display_v0, MessageComposeInputDescriptions message_compose_v0, TimerCreateInputDescriptions timer_create_v0, UserLocationInputDescriptions user_location_v0, UserTimeToolDescriptions user_time_v0) {
        return new MobileAppUseToolConfig(alarm_create_v0, calendar_search_v0, chart_display_v0, event_create_v0, event_create_v1, event_delete_v0, event_search_v0, event_update_v0, health_connect_data_types_v0, health_connect_query_v0, map_display_v0, message_compose_v0, timer_create_v0, user_location_v0, user_time_v0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseToolConfig)) {
            return false;
        }
        MobileAppUseToolConfig mobileAppUseToolConfig = (MobileAppUseToolConfig) other;
        return x44.r(this.alarm_create_v0, mobileAppUseToolConfig.alarm_create_v0) && x44.r(this.calendar_search_v0, mobileAppUseToolConfig.calendar_search_v0) && x44.r(this.chart_display_v0, mobileAppUseToolConfig.chart_display_v0) && x44.r(this.event_create_v0, mobileAppUseToolConfig.event_create_v0) && x44.r(this.event_create_v1, mobileAppUseToolConfig.event_create_v1) && x44.r(this.event_delete_v0, mobileAppUseToolConfig.event_delete_v0) && x44.r(this.event_search_v0, mobileAppUseToolConfig.event_search_v0) && x44.r(this.event_update_v0, mobileAppUseToolConfig.event_update_v0) && x44.r(this.health_connect_data_types_v0, mobileAppUseToolConfig.health_connect_data_types_v0) && x44.r(this.health_connect_query_v0, mobileAppUseToolConfig.health_connect_query_v0) && x44.r(this.map_display_v0, mobileAppUseToolConfig.map_display_v0) && x44.r(this.message_compose_v0, mobileAppUseToolConfig.message_compose_v0) && x44.r(this.timer_create_v0, mobileAppUseToolConfig.timer_create_v0) && x44.r(this.user_location_v0, mobileAppUseToolConfig.user_location_v0) && x44.r(this.user_time_v0, mobileAppUseToolConfig.user_time_v0);
    }

    public final AlarmCreateInputDescriptions getAlarm_create_v0() {
        return this.alarm_create_v0;
    }

    public final CalendarSearchToolDescriptions getCalendar_search_v0() {
        return this.calendar_search_v0;
    }

    public final ChartDisplayInputDescriptions getChart_display_v0() {
        return this.chart_display_v0;
    }

    public final EventCreateInputDescriptions getEvent_create_v0() {
        return this.event_create_v0;
    }

    public final EventCreateV1InputDescriptions getEvent_create_v1() {
        return this.event_create_v1;
    }

    public final EventDeleteInputDescriptions getEvent_delete_v0() {
        return this.event_delete_v0;
    }

    public final EventSearchInputDescriptions getEvent_search_v0() {
        return this.event_search_v0;
    }

    public final EventUpdateInputDescriptions getEvent_update_v0() {
        return this.event_update_v0;
    }

    public final HealthConnectDataTypesInputDescriptions getHealth_connect_data_types_v0() {
        return this.health_connect_data_types_v0;
    }

    public final HealthConnectQueryInputDescriptions getHealth_connect_query_v0() {
        return this.health_connect_query_v0;
    }

    public final MapDisplayInputDescriptions getMap_display_v0() {
        return this.map_display_v0;
    }

    public final MessageComposeInputDescriptions getMessage_compose_v0() {
        return this.message_compose_v0;
    }

    public final TimerCreateInputDescriptions getTimer_create_v0() {
        return this.timer_create_v0;
    }

    public final UserLocationInputDescriptions getUser_location_v0() {
        return this.user_location_v0;
    }

    public final UserTimeToolDescriptions getUser_time_v0() {
        return this.user_time_v0;
    }

    public int hashCode() {
        AlarmCreateInputDescriptions alarmCreateInputDescriptions = this.alarm_create_v0;
        int iHashCode = (alarmCreateInputDescriptions == null ? 0 : alarmCreateInputDescriptions.hashCode()) * 31;
        CalendarSearchToolDescriptions calendarSearchToolDescriptions = this.calendar_search_v0;
        int iHashCode2 = (iHashCode + (calendarSearchToolDescriptions == null ? 0 : calendarSearchToolDescriptions.hashCode())) * 31;
        ChartDisplayInputDescriptions chartDisplayInputDescriptions = this.chart_display_v0;
        int iHashCode3 = (iHashCode2 + (chartDisplayInputDescriptions == null ? 0 : chartDisplayInputDescriptions.hashCode())) * 31;
        EventCreateInputDescriptions eventCreateInputDescriptions = this.event_create_v0;
        int iHashCode4 = (iHashCode3 + (eventCreateInputDescriptions == null ? 0 : eventCreateInputDescriptions.hashCode())) * 31;
        EventCreateV1InputDescriptions eventCreateV1InputDescriptions = this.event_create_v1;
        int iHashCode5 = (iHashCode4 + (eventCreateV1InputDescriptions == null ? 0 : eventCreateV1InputDescriptions.hashCode())) * 31;
        EventDeleteInputDescriptions eventDeleteInputDescriptions = this.event_delete_v0;
        int iHashCode6 = (iHashCode5 + (eventDeleteInputDescriptions == null ? 0 : eventDeleteInputDescriptions.hashCode())) * 31;
        EventSearchInputDescriptions eventSearchInputDescriptions = this.event_search_v0;
        int iHashCode7 = (iHashCode6 + (eventSearchInputDescriptions == null ? 0 : eventSearchInputDescriptions.hashCode())) * 31;
        EventUpdateInputDescriptions eventUpdateInputDescriptions = this.event_update_v0;
        int iHashCode8 = (iHashCode7 + (eventUpdateInputDescriptions == null ? 0 : eventUpdateInputDescriptions.hashCode())) * 31;
        HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions = this.health_connect_data_types_v0;
        int iHashCode9 = (iHashCode8 + (healthConnectDataTypesInputDescriptions == null ? 0 : healthConnectDataTypesInputDescriptions.hashCode())) * 31;
        HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions = this.health_connect_query_v0;
        int iHashCode10 = (iHashCode9 + (healthConnectQueryInputDescriptions == null ? 0 : healthConnectQueryInputDescriptions.hashCode())) * 31;
        MapDisplayInputDescriptions mapDisplayInputDescriptions = this.map_display_v0;
        int iHashCode11 = (iHashCode10 + (mapDisplayInputDescriptions == null ? 0 : mapDisplayInputDescriptions.hashCode())) * 31;
        MessageComposeInputDescriptions messageComposeInputDescriptions = this.message_compose_v0;
        int iHashCode12 = (iHashCode11 + (messageComposeInputDescriptions == null ? 0 : messageComposeInputDescriptions.hashCode())) * 31;
        TimerCreateInputDescriptions timerCreateInputDescriptions = this.timer_create_v0;
        int iHashCode13 = (iHashCode12 + (timerCreateInputDescriptions == null ? 0 : timerCreateInputDescriptions.hashCode())) * 31;
        UserLocationInputDescriptions userLocationInputDescriptions = this.user_location_v0;
        int iHashCode14 = (iHashCode13 + (userLocationInputDescriptions == null ? 0 : userLocationInputDescriptions.hashCode())) * 31;
        UserTimeToolDescriptions userTimeToolDescriptions = this.user_time_v0;
        return iHashCode14 + (userTimeToolDescriptions != null ? userTimeToolDescriptions.hashCode() : 0);
    }

    public String toString() {
        return "MobileAppUseToolConfig(alarm_create_v0=" + this.alarm_create_v0 + ", calendar_search_v0=" + this.calendar_search_v0 + ", chart_display_v0=" + this.chart_display_v0 + ", event_create_v0=" + this.event_create_v0 + ", event_create_v1=" + this.event_create_v1 + ", event_delete_v0=" + this.event_delete_v0 + ", event_search_v0=" + this.event_search_v0 + ", event_update_v0=" + this.event_update_v0 + ", health_connect_data_types_v0=" + this.health_connect_data_types_v0 + ", health_connect_query_v0=" + this.health_connect_query_v0 + ", map_display_v0=" + this.map_display_v0 + ", message_compose_v0=" + this.message_compose_v0 + ", timer_create_v0=" + this.timer_create_v0 + ", user_location_v0=" + this.user_location_v0 + ", user_time_v0=" + this.user_time_v0 + ")";
    }

    public MobileAppUseToolConfig(AlarmCreateInputDescriptions alarmCreateInputDescriptions, CalendarSearchToolDescriptions calendarSearchToolDescriptions, ChartDisplayInputDescriptions chartDisplayInputDescriptions, EventCreateInputDescriptions eventCreateInputDescriptions, EventCreateV1InputDescriptions eventCreateV1InputDescriptions, EventDeleteInputDescriptions eventDeleteInputDescriptions, EventSearchInputDescriptions eventSearchInputDescriptions, EventUpdateInputDescriptions eventUpdateInputDescriptions, HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions, HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions, MapDisplayInputDescriptions mapDisplayInputDescriptions, MessageComposeInputDescriptions messageComposeInputDescriptions, TimerCreateInputDescriptions timerCreateInputDescriptions, UserLocationInputDescriptions userLocationInputDescriptions, UserTimeToolDescriptions userTimeToolDescriptions) {
        this.alarm_create_v0 = alarmCreateInputDescriptions;
        this.calendar_search_v0 = calendarSearchToolDescriptions;
        this.chart_display_v0 = chartDisplayInputDescriptions;
        this.event_create_v0 = eventCreateInputDescriptions;
        this.event_create_v1 = eventCreateV1InputDescriptions;
        this.event_delete_v0 = eventDeleteInputDescriptions;
        this.event_search_v0 = eventSearchInputDescriptions;
        this.event_update_v0 = eventUpdateInputDescriptions;
        this.health_connect_data_types_v0 = healthConnectDataTypesInputDescriptions;
        this.health_connect_query_v0 = healthConnectQueryInputDescriptions;
        this.map_display_v0 = mapDisplayInputDescriptions;
        this.message_compose_v0 = messageComposeInputDescriptions;
        this.timer_create_v0 = timerCreateInputDescriptions;
        this.user_location_v0 = userLocationInputDescriptions;
        this.user_time_v0 = userTimeToolDescriptions;
    }
}
