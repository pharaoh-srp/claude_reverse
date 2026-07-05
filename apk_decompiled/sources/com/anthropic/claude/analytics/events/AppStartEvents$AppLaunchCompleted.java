package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.j7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qk0;
import defpackage.rk0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%JF\u0010&\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010%R\u0014\u0010=\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010*¨\u0006A"}, d2 = {"com/anthropic/claude/analytics/events/AppStartEvents$AppLaunchCompleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;", "start_type", "", "duration_ms", "app_on_create_ms", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;", "destination", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "initial_tab", "<init>", "(Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;JLjava/lang/Long;Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;JLjava/lang/Long;Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchCompleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchCompleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;", "component2", "()J", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;", "component5", "()Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "copy", "(Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;JLjava/lang/Long;Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;)Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchCompleted;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchStartType;", "getStart_type", "J", "getDuration_ms", "Ljava/lang/Long;", "getApp_on_create_ms", "Lcom/anthropic/claude/analytics/events/AppStartEvents$AppLaunchDestination;", "getDestination", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "getInitial_tab", "getEventName", "eventName", "Companion", "qk0", "rk0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppStartEvents$AppLaunchCompleted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final rk0 Companion = new rk0();
    private final Long app_on_create_ms;
    private final AppStartEvents$AppLaunchDestination destination;
    private final long duration_ms;
    private final DrawerEvents$DrawerItem initial_tab;
    private final AppStartEvents$AppLaunchStartType start_type;

    static {
        j7 j7Var = new j7(17);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, j7Var), null, null, yb5.w(w1aVar, new j7(18)), yb5.w(w1aVar, new j7(19))};
    }

    public /* synthetic */ AppStartEvents$AppLaunchCompleted(int i, AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType, long j, Long l, AppStartEvents$AppLaunchDestination appStartEvents$AppLaunchDestination, DrawerEvents$DrawerItem drawerEvents$DrawerItem, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, qk0.a.getDescriptor());
            throw null;
        }
        this.start_type = appStartEvents$AppLaunchStartType;
        this.duration_ms = j;
        if ((i & 4) == 0) {
            this.app_on_create_ms = null;
        } else {
            this.app_on_create_ms = l;
        }
        this.destination = appStartEvents$AppLaunchDestination;
        if ((i & 16) == 0) {
            this.initial_tab = null;
        } else {
            this.initial_tab = drawerEvents$DrawerItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppStartEvents$AppLaunchStartType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return AppStartEvents$AppLaunchDestination.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return DrawerEvents$DrawerItem.Companion.serializer();
    }

    public static /* synthetic */ AppStartEvents$AppLaunchCompleted copy$default(AppStartEvents$AppLaunchCompleted appStartEvents$AppLaunchCompleted, AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType, long j, Long l, AppStartEvents$AppLaunchDestination appStartEvents$AppLaunchDestination, DrawerEvents$DrawerItem drawerEvents$DrawerItem, int i, Object obj) {
        if ((i & 1) != 0) {
            appStartEvents$AppLaunchStartType = appStartEvents$AppLaunchCompleted.start_type;
        }
        if ((i & 2) != 0) {
            j = appStartEvents$AppLaunchCompleted.duration_ms;
        }
        if ((i & 4) != 0) {
            l = appStartEvents$AppLaunchCompleted.app_on_create_ms;
        }
        if ((i & 8) != 0) {
            appStartEvents$AppLaunchDestination = appStartEvents$AppLaunchCompleted.destination;
        }
        if ((i & 16) != 0) {
            drawerEvents$DrawerItem = appStartEvents$AppLaunchCompleted.initial_tab;
        }
        DrawerEvents$DrawerItem drawerEvents$DrawerItem2 = drawerEvents$DrawerItem;
        Long l2 = l;
        return appStartEvents$AppLaunchCompleted.copy(appStartEvents$AppLaunchStartType, j, l2, appStartEvents$AppLaunchDestination, drawerEvents$DrawerItem2);
    }

    public static final /* synthetic */ void write$Self$analytics(AppStartEvents$AppLaunchCompleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.start_type);
        output.D(serialDesc, 1, self.duration_ms);
        if (output.E(serialDesc) || self.app_on_create_ms != null) {
            output.B(serialDesc, 2, xka.a, self.app_on_create_ms);
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.destination);
        if (!output.E(serialDesc) && self.initial_tab == null) {
            return;
        }
        output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.initial_tab);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppStartEvents$AppLaunchStartType getStart_type() {
        return this.start_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getApp_on_create_ms() {
        return this.app_on_create_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppStartEvents$AppLaunchDestination getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DrawerEvents$DrawerItem getInitial_tab() {
        return this.initial_tab;
    }

    public final AppStartEvents$AppLaunchCompleted copy(AppStartEvents$AppLaunchStartType start_type, long duration_ms, Long app_on_create_ms, AppStartEvents$AppLaunchDestination destination, DrawerEvents$DrawerItem initial_tab) {
        start_type.getClass();
        destination.getClass();
        return new AppStartEvents$AppLaunchCompleted(start_type, duration_ms, app_on_create_ms, destination, initial_tab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStartEvents$AppLaunchCompleted)) {
            return false;
        }
        AppStartEvents$AppLaunchCompleted appStartEvents$AppLaunchCompleted = (AppStartEvents$AppLaunchCompleted) other;
        return this.start_type == appStartEvents$AppLaunchCompleted.start_type && this.duration_ms == appStartEvents$AppLaunchCompleted.duration_ms && x44.r(this.app_on_create_ms, appStartEvents$AppLaunchCompleted.app_on_create_ms) && this.destination == appStartEvents$AppLaunchCompleted.destination && this.initial_tab == appStartEvents$AppLaunchCompleted.initial_tab;
    }

    public final Long getApp_on_create_ms() {
        return this.app_on_create_ms;
    }

    public final AppStartEvents$AppLaunchDestination getDestination() {
        return this.destination;
    }

    public final long getDuration_ms() {
        return this.duration_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.app_start.launch_completed";
    }

    public final DrawerEvents$DrawerItem getInitial_tab() {
        return this.initial_tab;
    }

    public final AppStartEvents$AppLaunchStartType getStart_type() {
        return this.start_type;
    }

    public int hashCode() {
        int iE = vb7.e(this.start_type.hashCode() * 31, 31, this.duration_ms);
        Long l = this.app_on_create_ms;
        int iHashCode = (this.destination.hashCode() + ((iE + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        DrawerEvents$DrawerItem drawerEvents$DrawerItem = this.initial_tab;
        return iHashCode + (drawerEvents$DrawerItem != null ? drawerEvents$DrawerItem.hashCode() : 0);
    }

    public String toString() {
        return "AppLaunchCompleted(start_type=" + this.start_type + ", duration_ms=" + this.duration_ms + ", app_on_create_ms=" + this.app_on_create_ms + ", destination=" + this.destination + ", initial_tab=" + this.initial_tab + ")";
    }

    public AppStartEvents$AppLaunchCompleted(AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType, long j, Long l, AppStartEvents$AppLaunchDestination appStartEvents$AppLaunchDestination, DrawerEvents$DrawerItem drawerEvents$DrawerItem) {
        appStartEvents$AppLaunchStartType.getClass();
        appStartEvents$AppLaunchDestination.getClass();
        this.start_type = appStartEvents$AppLaunchStartType;
        this.duration_ms = j;
        this.app_on_create_ms = l;
        this.destination = appStartEvents$AppLaunchDestination;
        this.initial_tab = drawerEvents$DrawerItem;
    }

    public /* synthetic */ AppStartEvents$AppLaunchCompleted(AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType, long j, Long l, AppStartEvents$AppLaunchDestination appStartEvents$AppLaunchDestination, DrawerEvents$DrawerItem drawerEvents$DrawerItem, int i, mq5 mq5Var) {
        this(appStartEvents$AppLaunchStartType, j, (i & 4) != 0 ? null : l, appStartEvents$AppLaunchDestination, (i & 16) != 0 ? null : drawerEvents$DrawerItem);
    }
}
