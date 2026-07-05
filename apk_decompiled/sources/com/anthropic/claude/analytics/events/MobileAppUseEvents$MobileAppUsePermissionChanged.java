package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.ulb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xlb;
import defpackage.yb5;
import defpackage.ylb;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(JN\u0010)\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010(R\u0014\u0010?\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010&¨\u0006C"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "tool_category", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;", "previous_state", "new_state", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "change_source", "", "tool_name", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;", "permission_type", "<init>", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChanged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "component2", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;", "copy", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "getTool_category", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionState;", "getPrevious_state", "getNew_state", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionChangedSource;", "getChange_source", "Ljava/lang/String;", "getTool_name", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionType;", "getPermission_type", "getEventName", "eventName", "Companion", "xlb", "ylb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUsePermissionChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ylb Companion = new ylb();
    private final MobileAppUseEvents$MobileAppUsePermissionChangedSource change_source;
    private final MobileAppUseEvents$MobileAppUsePermissionState new_state;
    private final MobileAppUseEvents$MobileAppUsePermissionType permission_type;
    private final MobileAppUseEvents$MobileAppUsePermissionState previous_state;
    private final MobileAppUseEvents$MobileAppUsePermissionCategory tool_category;
    private final String tool_name;

    static {
        ulb ulbVar = new ulb(2);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ulbVar), yb5.w(w1aVar, new ulb(3)), yb5.w(w1aVar, new ulb(4)), yb5.w(w1aVar, new ulb(5)), null, yb5.w(w1aVar, new ulb(6))};
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionChanged(int i, MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, String str, MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType, vnf vnfVar) {
        if (47 != (i & 47)) {
            gvj.f(i, 47, xlb.a.getDescriptor());
            throw null;
        }
        this.tool_category = mobileAppUseEvents$MobileAppUsePermissionCategory;
        this.previous_state = mobileAppUseEvents$MobileAppUsePermissionState;
        this.new_state = mobileAppUseEvents$MobileAppUsePermissionState2;
        this.change_source = mobileAppUseEvents$MobileAppUsePermissionChangedSource;
        if ((i & 16) == 0) {
            this.tool_name = null;
        } else {
            this.tool_name = str;
        }
        this.permission_type = mobileAppUseEvents$MobileAppUsePermissionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MobileAppUseEvents$MobileAppUsePermissionCategory.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MobileAppUseEvents$MobileAppUsePermissionState.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return MobileAppUseEvents$MobileAppUsePermissionState.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return MobileAppUseEvents$MobileAppUsePermissionChangedSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return MobileAppUseEvents$MobileAppUsePermissionType.Companion.serializer();
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionChanged copy$default(MobileAppUseEvents$MobileAppUsePermissionChanged mobileAppUseEvents$MobileAppUsePermissionChanged, MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, String str, MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionCategory = mobileAppUseEvents$MobileAppUsePermissionChanged.tool_category;
        }
        if ((i & 2) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionState = mobileAppUseEvents$MobileAppUsePermissionChanged.previous_state;
        }
        if ((i & 4) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionState2 = mobileAppUseEvents$MobileAppUsePermissionChanged.new_state;
        }
        if ((i & 8) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionChangedSource = mobileAppUseEvents$MobileAppUsePermissionChanged.change_source;
        }
        if ((i & 16) != 0) {
            str = mobileAppUseEvents$MobileAppUsePermissionChanged.tool_name;
        }
        if ((i & 32) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionType = mobileAppUseEvents$MobileAppUsePermissionChanged.permission_type;
        }
        String str2 = str;
        MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType2 = mobileAppUseEvents$MobileAppUsePermissionType;
        return mobileAppUseEvents$MobileAppUsePermissionChanged.copy(mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionState, mobileAppUseEvents$MobileAppUsePermissionState2, mobileAppUseEvents$MobileAppUsePermissionChangedSource, str2, mobileAppUseEvents$MobileAppUsePermissionType2);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUsePermissionChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.tool_category);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.previous_state);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.new_state);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.change_source);
        if (output.E(serialDesc) || self.tool_name != null) {
            output.B(serialDesc, 4, srg.a, self.tool_name);
        }
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.permission_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionCategory getTool_category() {
        return this.tool_category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionState getPrevious_state() {
        return this.previous_state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionState getNew_state() {
        return this.new_state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionChangedSource getChange_source() {
        return this.change_source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionType getPermission_type() {
        return this.permission_type;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionChanged copy(MobileAppUseEvents$MobileAppUsePermissionCategory tool_category, MobileAppUseEvents$MobileAppUsePermissionState previous_state, MobileAppUseEvents$MobileAppUsePermissionState new_state, MobileAppUseEvents$MobileAppUsePermissionChangedSource change_source, String tool_name, MobileAppUseEvents$MobileAppUsePermissionType permission_type) {
        tool_category.getClass();
        previous_state.getClass();
        new_state.getClass();
        change_source.getClass();
        permission_type.getClass();
        return new MobileAppUseEvents$MobileAppUsePermissionChanged(tool_category, previous_state, new_state, change_source, tool_name, permission_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUsePermissionChanged)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUsePermissionChanged mobileAppUseEvents$MobileAppUsePermissionChanged = (MobileAppUseEvents$MobileAppUsePermissionChanged) other;
        return this.tool_category == mobileAppUseEvents$MobileAppUsePermissionChanged.tool_category && this.previous_state == mobileAppUseEvents$MobileAppUsePermissionChanged.previous_state && this.new_state == mobileAppUseEvents$MobileAppUsePermissionChanged.new_state && this.change_source == mobileAppUseEvents$MobileAppUsePermissionChanged.change_source && x44.r(this.tool_name, mobileAppUseEvents$MobileAppUsePermissionChanged.tool_name) && this.permission_type == mobileAppUseEvents$MobileAppUsePermissionChanged.permission_type;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionChangedSource getChange_source() {
        return this.change_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_permission_changed";
    }

    public final MobileAppUseEvents$MobileAppUsePermissionState getNew_state() {
        return this.new_state;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionType getPermission_type() {
        return this.permission_type;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionState getPrevious_state() {
        return this.previous_state;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionCategory getTool_category() {
        return this.tool_category;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        int iHashCode = (this.change_source.hashCode() + ((this.new_state.hashCode() + ((this.previous_state.hashCode() + (this.tool_category.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.tool_name;
        return this.permission_type.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "MobileAppUsePermissionChanged(tool_category=" + this.tool_category + ", previous_state=" + this.previous_state + ", new_state=" + this.new_state + ", change_source=" + this.change_source + ", tool_name=" + this.tool_name + ", permission_type=" + this.permission_type + ")";
    }

    public MobileAppUseEvents$MobileAppUsePermissionChanged(MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, String str, MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType) {
        mobileAppUseEvents$MobileAppUsePermissionCategory.getClass();
        mobileAppUseEvents$MobileAppUsePermissionState.getClass();
        mobileAppUseEvents$MobileAppUsePermissionState2.getClass();
        mobileAppUseEvents$MobileAppUsePermissionChangedSource.getClass();
        mobileAppUseEvents$MobileAppUsePermissionType.getClass();
        this.tool_category = mobileAppUseEvents$MobileAppUsePermissionCategory;
        this.previous_state = mobileAppUseEvents$MobileAppUsePermissionState;
        this.new_state = mobileAppUseEvents$MobileAppUsePermissionState2;
        this.change_source = mobileAppUseEvents$MobileAppUsePermissionChangedSource;
        this.tool_name = str;
        this.permission_type = mobileAppUseEvents$MobileAppUsePermissionType;
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUsePermissionChanged(MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState, MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, String str, MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType, int i, mq5 mq5Var) {
        this(mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionState, mobileAppUseEvents$MobileAppUsePermissionState2, mobileAppUseEvents$MobileAppUsePermissionChangedSource, (i & 16) != 0 ? null : str, mobileAppUseEvents$MobileAppUsePermissionType);
    }
}
