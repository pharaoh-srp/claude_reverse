package com.segment.analytics.kotlin.core;

import defpackage.bz7;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.onf;
import defpackage.rff;
import defpackage.s47;
import defpackage.sff;
import defpackage.x44;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 D2\u00020\u0001:\u0001DB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\u00072\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R:\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\tR\u001c\u0010#\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010)\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010,\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010/\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R \u00106\u001a\u000600j\u0002`18&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u0010:\u001a\u000600j\u0002`78&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001c\u0010=\u001a\u00020$8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001c\u0010C\u001a\u00020>8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u0082\u0001\u0005EFGHI\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/segment/analytics/kotlin/core/BaseEvent;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/segment/analytics/kotlin/core/EnrichmentClosure;", "enrichment", "Liei;", "applyBaseData$core", "(Lbz7;)V", "applyBaseData", "Llpg;", "store", "applyBaseEventData$core", "(Llpg;Ltp4;)Ljava/lang/Object;", "applyBaseEventData", "T", "copy", "()Lcom/segment/analytics/kotlin/core/BaseEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lbz7;", "getEnrichment", "()Lbz7;", "setEnrichment", "Lcom/segment/analytics/kotlin/core/EventType;", "getType", "()Lcom/segment/analytics/kotlin/core/EventType;", "setType", "(Lcom/segment/analytics/kotlin/core/EventType;)V", "type", "", "getAnonymousId", "()Ljava/lang/String;", "setAnonymousId", "(Ljava/lang/String;)V", "anonymousId", "getMessageId", "setMessageId", "messageId", "getTimestamp", "setTimestamp", "timestamp", "Lkotlinx/serialization/json/JsonObject;", "Lcom/segment/analytics/kotlin/core/AnalyticsContext;", "getContext", "()Lkotlinx/serialization/json/JsonObject;", "setContext", "(Lkotlinx/serialization/json/JsonObject;)V", "context", "Lcom/segment/analytics/kotlin/core/Integrations;", "getIntegrations", "setIntegrations", "integrations", "getUserId", "setUserId", "userId", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "get_metadata", "()Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "set_metadata", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "_metadata", "Companion", "Lcom/segment/analytics/kotlin/core/AliasEvent;", "Lcom/segment/analytics/kotlin/core/GroupEvent;", "Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lcom/segment/analytics/kotlin/core/TrackEvent;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf(with = a.class)
public abstract class BaseEvent {
    public static final String ALL_INTEGRATIONS_KEY = "All";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private bz7 enrichment;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/segment/analytics/kotlin/core/BaseEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/BaseEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "ALL_INTEGRATIONS_KEY", "Ljava/lang/String;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return a.c;
        }
    }

    public /* synthetic */ BaseEvent(mq5 mq5Var) {
        this();
    }

    public final void applyBaseData$core(bz7 enrichment) {
        this.enrichment = enrichment;
        sff.Companion.getClass();
        setTimestamp(rff.a());
        setContext(s47.a);
        String string = UUID.randomUUID().toString();
        string.getClass();
        setMessageId(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyBaseEventData$core(defpackage.lpg r5, defpackage.tp4<? super defpackage.iei> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.be1
            if (r0 == 0) goto L13
            r0 = r6
            be1 r0 = (defpackage.be1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            be1 r0 = new be1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            com.segment.analytics.kotlin.core.BaseEvent r4 = r0.E
            defpackage.sf5.h0(r6)
            goto L46
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r6)
            java.lang.Class<wmi> r6 = defpackage.wmi.class
            kce r1 = defpackage.jce.a
            pl9 r6 = r1.b(r6)
            r0.E = r4
            r0.H = r2
            java.lang.Object r6 = r5.a(r6, r0)
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L46
            return r5
        L46:
            wmi r6 = (defpackage.wmi) r6
            iei r5 = defpackage.iei.a
            if (r6 != 0) goto L4d
            goto L6a
        L4d:
            java.lang.String r0 = r6.a
            r4.setAnonymousId(r0)
            kotlinx.serialization.json.JsonObject r0 = defpackage.s47.a
            r4.setIntegrations(r0)
            java.lang.String r0 = r4.getUserId()
            boolean r0 = defpackage.bsg.I0(r0)
            if (r0 == 0) goto L6a
            java.lang.String r6 = r6.b
            if (r6 != 0) goto L67
            java.lang.String r6 = ""
        L67:
            r4.setUserId(r6)
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.BaseEvent.applyBaseEventData$core(lpg, tp4):java.lang.Object");
    }

    public final <T extends BaseEvent> T copy() {
        T trackEvent;
        if (this instanceof AliasEvent) {
            trackEvent = new AliasEvent(getUserId(), ((AliasEvent) this).getPreviousId());
        } else if (this instanceof GroupEvent) {
            GroupEvent groupEvent = (GroupEvent) this;
            trackEvent = new GroupEvent(groupEvent.getGroupId(), groupEvent.getTraits());
        } else if (this instanceof IdentifyEvent) {
            trackEvent = new IdentifyEvent(getUserId(), ((IdentifyEvent) this).getTraits());
        } else if (this instanceof ScreenEvent) {
            ScreenEvent screenEvent = (ScreenEvent) this;
            trackEvent = new ScreenEvent(screenEvent.getName(), screenEvent.getCategory(), screenEvent.getProperties());
        } else {
            if (!(this instanceof TrackEvent)) {
                mr9.b();
                return null;
            }
            TrackEvent trackEvent2 = (TrackEvent) this;
            trackEvent = new TrackEvent(trackEvent2.getProperties(), trackEvent2.getEvent());
        }
        trackEvent.setAnonymousId(getAnonymousId());
        trackEvent.setMessageId(getMessageId());
        trackEvent.setTimestamp(getTimestamp());
        trackEvent.setContext(getContext());
        trackEvent.setIntegrations(getIntegrations());
        trackEvent.setUserId(getUserId());
        trackEvent.set_metadata(get_metadata());
        trackEvent.enrichment = this.enrichment;
        return trackEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        BaseEvent baseEvent = (BaseEvent) other;
        return getType() == baseEvent.getType() && x44.r(getAnonymousId(), baseEvent.getAnonymousId()) && x44.r(getMessageId(), baseEvent.getMessageId()) && x44.r(getTimestamp(), baseEvent.getTimestamp()) && x44.r(getContext(), baseEvent.getContext()) && x44.r(getIntegrations(), baseEvent.getIntegrations()) && x44.r(getUserId(), baseEvent.getUserId()) && x44.r(get_metadata(), baseEvent.get_metadata());
    }

    public abstract String getAnonymousId();

    public abstract JsonObject getContext();

    public final bz7 getEnrichment() {
        return this.enrichment;
    }

    public abstract JsonObject getIntegrations();

    public abstract String getMessageId();

    public abstract String getTimestamp();

    public abstract EventType getType();

    public abstract String getUserId();

    public abstract DestinationMetadata get_metadata();

    public int hashCode() {
        return get_metadata().hashCode() + ((getUserId().hashCode() + ((getIntegrations().hashCode() + ((getContext().hashCode() + ((getTimestamp().hashCode() + ((getMessageId().hashCode() + ((getAnonymousId().hashCode() + (getType().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public abstract void setAnonymousId(String str);

    public abstract void setContext(JsonObject jsonObject);

    public final void setEnrichment(bz7 bz7Var) {
        this.enrichment = bz7Var;
    }

    public abstract void setIntegrations(JsonObject jsonObject);

    public abstract void setMessageId(String str);

    public abstract void setTimestamp(String str);

    public abstract void setType(EventType eventType);

    public abstract void setUserId(String str);

    public abstract void set_metadata(DestinationMetadata destinationMetadata);

    private BaseEvent() {
    }
}
