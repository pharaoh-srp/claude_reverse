package com.anthropic.claude.analytics.events;

import defpackage.cmb;
import defpackage.dmb;
import defpackage.gvj;
import defpackage.ij0;
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
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001e¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePromptAction", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "tool_category", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;", "action", "", "tool_name", "<init>", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePromptAction;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePromptAction;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "component2", "()Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePromptAction;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionCategory;", "getTool_category", "Lcom/anthropic/claude/analytics/events/MobileAppUseEvents$MobileAppUsePermissionAction;", "getAction", "Ljava/lang/String;", "getTool_name", "getEventName", "eventName", "Companion", "cmb", "dmb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppUseEvents$MobileAppUsePromptAction implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final dmb Companion = new dmb();
    private final MobileAppUseEvents$MobileAppUsePermissionAction action;
    private final MobileAppUseEvents$MobileAppUsePermissionCategory tool_category;
    private final String tool_name;

    static {
        ulb ulbVar = new ulb(10);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ulbVar), yb5.w(w1aVar, new ulb(11)), null};
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUsePromptAction(int i, MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, cmb.a.getDescriptor());
            throw null;
        }
        this.tool_category = mobileAppUseEvents$MobileAppUsePermissionCategory;
        this.action = mobileAppUseEvents$MobileAppUsePermissionAction;
        if ((i & 4) == 0) {
            this.tool_name = null;
        } else {
            this.tool_name = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MobileAppUseEvents$MobileAppUsePermissionCategory.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MobileAppUseEvents$MobileAppUsePermissionAction.Companion.serializer();
    }

    public static /* synthetic */ MobileAppUseEvents$MobileAppUsePromptAction copy$default(MobileAppUseEvents$MobileAppUsePromptAction mobileAppUseEvents$MobileAppUsePromptAction, MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionCategory = mobileAppUseEvents$MobileAppUsePromptAction.tool_category;
        }
        if ((i & 2) != 0) {
            mobileAppUseEvents$MobileAppUsePermissionAction = mobileAppUseEvents$MobileAppUsePromptAction.action;
        }
        if ((i & 4) != 0) {
            str = mobileAppUseEvents$MobileAppUsePromptAction.tool_name;
        }
        return mobileAppUseEvents$MobileAppUsePromptAction.copy(mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionAction, str);
    }

    public static final /* synthetic */ void write$Self$analytics(MobileAppUseEvents$MobileAppUsePromptAction self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.tool_category);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.action);
        if (!output.E(serialDesc) && self.tool_name == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.tool_name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionCategory getTool_category() {
        return this.tool_category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MobileAppUseEvents$MobileAppUsePermissionAction getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTool_name() {
        return this.tool_name;
    }

    public final MobileAppUseEvents$MobileAppUsePromptAction copy(MobileAppUseEvents$MobileAppUsePermissionCategory tool_category, MobileAppUseEvents$MobileAppUsePermissionAction action, String tool_name) {
        tool_category.getClass();
        action.getClass();
        return new MobileAppUseEvents$MobileAppUsePromptAction(tool_category, action, tool_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppUseEvents$MobileAppUsePromptAction)) {
            return false;
        }
        MobileAppUseEvents$MobileAppUsePromptAction mobileAppUseEvents$MobileAppUsePromptAction = (MobileAppUseEvents$MobileAppUsePromptAction) other;
        return this.tool_category == mobileAppUseEvents$MobileAppUsePromptAction.tool_category && this.action == mobileAppUseEvents$MobileAppUsePromptAction.action && x44.r(this.tool_name, mobileAppUseEvents$MobileAppUsePromptAction.tool_name);
    }

    public final MobileAppUseEvents$MobileAppUsePermissionAction getAction() {
        return this.action;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_use_prompt_action";
    }

    public final MobileAppUseEvents$MobileAppUsePermissionCategory getTool_category() {
        return this.tool_category;
    }

    public final String getTool_name() {
        return this.tool_name;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.tool_category.hashCode() * 31)) * 31;
        String str = this.tool_name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory = this.tool_category;
        MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction = this.action;
        String str = this.tool_name;
        StringBuilder sb = new StringBuilder("MobileAppUsePromptAction(tool_category=");
        sb.append(mobileAppUseEvents$MobileAppUsePermissionCategory);
        sb.append(", action=");
        sb.append(mobileAppUseEvents$MobileAppUsePermissionAction);
        sb.append(", tool_name=");
        return ij0.m(sb, str, ")");
    }

    public MobileAppUseEvents$MobileAppUsePromptAction(MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction, String str) {
        mobileAppUseEvents$MobileAppUsePermissionCategory.getClass();
        mobileAppUseEvents$MobileAppUsePermissionAction.getClass();
        this.tool_category = mobileAppUseEvents$MobileAppUsePermissionCategory;
        this.action = mobileAppUseEvents$MobileAppUsePermissionAction;
        this.tool_name = str;
    }

    public /* synthetic */ MobileAppUseEvents$MobileAppUsePromptAction(MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategory, MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction, String str, int i, mq5 mq5Var) {
        this(mobileAppUseEvents$MobileAppUsePermissionCategory, mobileAppUseEvents$MobileAppUsePermissionAction, (i & 4) != 0 ? null : str);
    }
}
