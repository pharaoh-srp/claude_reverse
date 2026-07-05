package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.g9b;
import defpackage.glb;
import defpackage.gvj;
import defpackage.hlb;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0014\u00102\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010$¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCalendarFilterChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "selected_count", "total_count", "", "all_selected", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "change_source", "<init>", "(IIZLcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIZLcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCalendarFilterChanged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCalendarFilterChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Z", "component4", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "copy", "(IIZLcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUseCalendarFilterChanged;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSelected_count", "getTotal_count", "Z", "getAll_selected", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "getChange_source", "getEventName", "eventName", "Companion", "glb", "hlb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUseCalendarFilterChanged implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean all_selected;
    private final MobileAppUseEvents$MobileAppUsePermissionChangedSource change_source;
    private final int selected_count;
    private final int total_count;
    public static final hlb Companion = new hlb();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new g9b(28))};

    public /* synthetic */ MobileAppUseEvents$MobileAppUseCalendarFilterChanged(int i, int i2, int i3, boolean z, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, glb.a.getDescriptor());
            throw null;
        }
        this.selected_count = i2;
        this.total_count = i3;
        this.all_selected = z;
        this.change_source = mobileAppUseEvents$MobileAppUsePermissionChangedSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MobileAppUseEvents$MobileAppUsePermissionChangedSource.Companion.serializer();
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUseCalendarFilterChanged copy$default(MobileAppUseEvents$MobileAppUseCalendarFilterChanged mobileAppUseEvents$MobileAppUseCalendarFilterChanged, int i, int i2, boolean z, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mobileAppUseEvents$MobileAppUseCalendarFilterChanged.selected_count;
        }
        if ((i3 & 2) != 0) {
            i2 = mobileAppUseEvents$MobileAppUseCalendarFilterChanged.total_count;
        }
        if ((i3 & 4) != 0) {
            z = mobileAppUseEvents$MobileAppUseCalendarFilterChanged.all_selected;
        }
        if ((i3 & 8) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionChangedSource = mobileAppUseEvents$MobileAppUseCalendarFilterChanged.change_source;
        }
        return mobileAppUseEvents$MobileAppUseCalendarFilterChanged.copy(i, i2, z, mobileAppUseEvents$MobileAppUsePermissionChangedSource);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUseCalendarFilterChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.selected_count, serialDesc);
        output.l(1, self.total_count, serialDesc);
        output.p(serialDesc, 2, self.all_selected);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.change_source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelected_count() {
        return this.selected_count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal_count() {
        return this.total_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAll_selected() {
        return this.all_selected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionChangedSource getChange_source() {
        return this.change_source;
    }

    public final MobileAppUseEvents$MobileAppUseCalendarFilterChanged copy(int selected_count, int total_count, boolean all_selected, MobileAppUseEvents$MobileAppUsePermissionChangedSource change_source) {
        change_source.getClass();
        return new MobileAppUseEvents$MobileAppUseCalendarFilterChanged(selected_count, total_count, all_selected, change_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUseCalendarFilterChanged)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUseCalendarFilterChanged mobileAppUseEvents$MobileAppUseCalendarFilterChanged = (MobileAppUseEvents$MobileAppUseCalendarFilterChanged) other;
        return this.selected_count == mobileAppUseEvents$MobileAppUseCalendarFilterChanged.selected_count && this.total_count == mobileAppUseEvents$MobileAppUseCalendarFilterChanged.total_count && this.all_selected == mobileAppUseEvents$MobileAppUseCalendarFilterChanged.all_selected && this.change_source == mobileAppUseEvents$MobileAppUseCalendarFilterChanged.change_source;
    }

    public final boolean getAll_selected() {
        return this.all_selected;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionChangedSource getChange_source() {
        return this.change_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_calendar_filter_changed";
    }

    public final int getSelected_count() {
        return this.selected_count;
    }

    public final int getTotal_count() {
        return this.total_count;
    }

    public int hashCode() {
        return this.change_source.hashCode() + fsh.p(vb7.c(this.total_count, Integer.hashCode(this.selected_count) * 31, 31), 31, this.all_selected);
    }

    public String toString() {
        int i = this.selected_count;
        int i2 = this.total_count;
        boolean z = this.all_selected;
        MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource = this.change_source;
        StringBuilder sbV = vb7.v("MobileAppUseCalendarFilterChanged(selected_count=", ", total_count=", i, i2, ", all_selected=");
        sbV.append(z);
        sbV.append(", change_source=");
        sbV.append(mobileAppUseEvents$MobileAppUsePermissionChangedSource);
        sbV.append(")");
        return sbV.toString();
    }

    public MobileAppUseEvents$MobileAppUseCalendarFilterChanged(int i, int i2, boolean z, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource) {
        mobileAppUseEvents$MobileAppUsePermissionChangedSource.getClass();
        this.selected_count = i;
        this.total_count = i2;
        this.all_selected = z;
        this.change_source = mobileAppUseEvents$MobileAppUsePermissionChangedSource;
    }
}
