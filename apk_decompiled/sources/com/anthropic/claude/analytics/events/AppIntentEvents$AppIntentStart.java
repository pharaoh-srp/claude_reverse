package com.anthropic.claude.analytics.events;

import defpackage.b5;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.tj0;
import defpackage.uj0;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001a¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/AppIntentEvents$AppIntentStart", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "intent_type", "", "app_intent_session_id", "<init>", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentStart;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentStart;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentStart;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/AppIntentEvents$AppIntentType;", "getIntent_type", "Ljava/lang/String;", "getApp_intent_session_id", "getEventName", "eventName", "Companion", "tj0", "uj0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppIntentEvents$AppIntentStart implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String app_intent_session_id;
    private final AppIntentEvents$AppIntentType intent_type;
    public static final uj0 Companion = new uj0();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new b5(23)), null};

    public /* synthetic */ AppIntentEvents$AppIntentStart(int i, AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, tj0.a.getDescriptor());
            throw null;
        }
        this.intent_type = appIntentEvents$AppIntentType;
        this.app_intent_session_id = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppIntentEvents$AppIntentType.Companion.serializer();
    }

    public static /* synthetic */ AppIntentEvents$AppIntentStart copy$default(AppIntentEvents$AppIntentStart appIntentEvents$AppIntentStart, AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            appIntentEvents$AppIntentType = appIntentEvents$AppIntentStart.intent_type;
        }
        if ((i & 2) != 0) {
            str = appIntentEvents$AppIntentStart.app_intent_session_id;
        }
        return appIntentEvents$AppIntentStart.copy(appIntentEvents$AppIntentType, str);
    }

    public static final /* synthetic */ void write$Self$analytics(AppIntentEvents$AppIntentStart self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.intent_type);
        output.q(serialDesc, 1, self.app_intent_session_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppIntentEvents$AppIntentType getIntent_type() {
        return this.intent_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    public final AppIntentEvents$AppIntentStart copy(AppIntentEvents$AppIntentType intent_type, String app_intent_session_id) {
        intent_type.getClass();
        app_intent_session_id.getClass();
        return new AppIntentEvents$AppIntentStart(intent_type, app_intent_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppIntentEvents$AppIntentStart)) {
            return false;
        }
        AppIntentEvents$AppIntentStart appIntentEvents$AppIntentStart = (AppIntentEvents$AppIntentStart) other;
        return this.intent_type == appIntentEvents$AppIntentStart.intent_type && x44.r(this.app_intent_session_id, appIntentEvents$AppIntentStart.app_intent_session_id);
    }

    public final String getApp_intent_session_id() {
        return this.app_intent_session_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_app_intent_start";
    }

    public final AppIntentEvents$AppIntentType getIntent_type() {
        return this.intent_type;
    }

    public int hashCode() {
        return this.app_intent_session_id.hashCode() + (this.intent_type.hashCode() * 31);
    }

    public String toString() {
        return "AppIntentStart(intent_type=" + this.intent_type + ", app_intent_session_id=" + this.app_intent_session_id + ")";
    }

    public AppIntentEvents$AppIntentStart(AppIntentEvents$AppIntentType appIntentEvents$AppIntentType, String str) {
        appIntentEvents$AppIntentType.getClass();
        str.getClass();
        this.intent_type = appIntentEvents$AppIntentType;
        this.app_intent_session_id = str;
    }
}
