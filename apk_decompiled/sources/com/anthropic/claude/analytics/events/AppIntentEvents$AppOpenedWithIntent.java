package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wj0;
import defpackage.x44;
import defpackage.xj0;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0014\u0010/\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001e¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppOpenedWithIntent", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "intent_type", "", "phone_locked", "", "conversation_uuid", "<init>", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;ZLjava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppOpenedWithIntent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppOpenedWithIntent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;ZLjava/lang/String;)Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppOpenedWithIntent;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "getIntent_type", "Z", "getPhone_locked", "Ljava/lang/String;", "getConversation_uuid", "getEventName", "eventName", "Companion", "wj0", "xj0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppIntentEvents$AppOpenedWithIntent implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String conversation_uuid;
    private final AppIntentEvents$AppIntentType intent_type;
    private final boolean phone_locked;
    public static final xj0 Companion = new xj0();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new b5(25)), null, null};

    public /* synthetic */ AppIntentEvents$AppOpenedWithIntent(int i, AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, boolean z, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, wj0.a.getDescriptor());
            throw null;
        }
        this.intent_type = appIntentEvents$AppIntentType;
        this.phone_locked = z;
        if ((i & 4) == 0) {
            this.conversation_uuid = null;
        } else {
            this.conversation_uuid = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppIntentEvents$AppIntentType.Companion.serializer();
    }

    public static /* synthetic */ AppIntentEvents$AppOpenedWithIntent copy$default(AppIntentEvents$AppOpenedWithIntent appIntentEvents$AppOpenedWithIntent, AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            appIntentEvents$AppIntentType = appIntentEvents$AppOpenedWithIntent.intent_type;
        }
        if ((i & 2) != 0) {
            z = appIntentEvents$AppOpenedWithIntent.phone_locked;
        }
        if ((i & 4) != 0) {
            str = appIntentEvents$AppOpenedWithIntent.conversation_uuid;
        }
        return appIntentEvents$AppOpenedWithIntent.copy(appIntentEvents$AppIntentType, z, str);
    }

    public static final /* synthetic */ void write$Self$analytics(AppIntentEvents$AppOpenedWithIntent self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.intent_type);
        output.p(serialDesc, 1, self.phone_locked);
        if (!output.E(serialDesc) && self.conversation_uuid == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.conversation_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppIntentEvents$AppIntentType getIntent_type() {
        return this.intent_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPhone_locked() {
        return this.phone_locked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final AppIntentEvents$AppOpenedWithIntent copy(AppIntentEvents$AppIntentType intent_type, boolean phone_locked, String conversation_uuid) {
        intent_type.getClass();
        return new AppIntentEvents$AppOpenedWithIntent(intent_type, phone_locked, conversation_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIntentEvents$AppOpenedWithIntent)) {
            return false;
        }
        AppIntentEvents$AppOpenedWithIntent appIntentEvents$AppOpenedWithIntent = (AppIntentEvents$AppOpenedWithIntent) other;
        return this.intent_type == appIntentEvents$AppOpenedWithIntent.intent_type && this.phone_locked == appIntentEvents$AppOpenedWithIntent.phone_locked && x44.r(this.conversation_uuid, appIntentEvents$AppOpenedWithIntent.conversation_uuid);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_opened_with_intent";
    }

    public final AppIntentEvents$AppIntentType getIntent_type() {
        return this.intent_type;
    }

    public final boolean getPhone_locked() {
        return this.phone_locked;
    }

    public int hashCode() {
        int iP = fsh.p(this.intent_type.hashCode() * 31, 31, this.phone_locked);
        String str = this.conversation_uuid;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        AppIntentEvents$AppIntentType appIntentEvents$AppIntentType = this.intent_type;
        boolean z = this.phone_locked;
        String str = this.conversation_uuid;
        StringBuilder sb = new StringBuilder("AppOpenedWithIntent(intent_type=");
        sb.append(appIntentEvents$AppIntentType);
        sb.append(", phone_locked=");
        sb.append(z);
        sb.append(", conversation_uuid=");
        return ij0.m(sb, str, ")");
    }

    public AppIntentEvents$AppOpenedWithIntent(AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, boolean z, String str) {
        appIntentEvents$AppIntentType.getClass();
        this.intent_type = appIntentEvents$AppIntentType;
        this.phone_locked = z;
        this.conversation_uuid = str;
    }

    public /* synthetic */ AppIntentEvents$AppOpenedWithIntent(AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, boolean z, String str, int i, mq5 mq5Var) {
        this(appIntentEvents$AppIntentType, z, (i & 4) != 0 ? null : str);
    }
}
