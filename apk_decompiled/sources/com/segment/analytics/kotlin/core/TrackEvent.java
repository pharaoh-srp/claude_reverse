package com.segment.analytics.kotlin.core;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0091\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u000f\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0007\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J(\u0010%\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010$J(\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÇ\u0001¢\u0006\u0004\b.\u0010/R&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\"\"\u0004\b2\u00103R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010$\"\u0004\b6\u00107R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\r\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\r\u00104\u001a\u0004\b=\u0010$\"\u0004\b>\u00107R\"\u0010\u000e\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000e\u00104\u001a\u0004\b?\u0010$\"\u0004\b@\u00107R&\u0010\u0010\u001a\u00060\u0002j\u0002`\u000f8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\bA\u0010\"\"\u0004\bB\u00103R&\u0010\u0012\u001a\u00060\u0002j\u0002`\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u00100\u001a\u0004\bC\u0010\"\"\u0004\bD\u00103R\"\u0010\u0013\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bE\u0010$\"\u0004\bF\u00107R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u0016\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0016\u00104\u001a\u0004\bL\u0010$\"\u0004\bM\u00107¨\u0006P"}, d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent;", "Lcom/segment/analytics/kotlin/core/BaseEvent;", "Lkotlinx/serialization/json/JsonObject;", "Lcom/segment/analytics/kotlin/core/Properties;", "properties", "", "event", "<init>", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;)V", "", "seen1", "Lcom/segment/analytics/kotlin/core/EventType;", "type", "messageId", "anonymousId", "Lcom/segment/analytics/kotlin/core/Integrations;", "integrations", "Lcom/segment/analytics/kotlin/core/AnalyticsContext;", "context", "userId", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "_metadata", "timestamp", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/EventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/DestinationMetadata;Ljava/lang/String;Lvnf;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "()Ljava/lang/String;", "copy", "(Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;)Lcom/segment/analytics/kotlin/core/TrackEvent;", "toString", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/TrackEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "getProperties", "setProperties", "(Lkotlinx/serialization/json/JsonObject;)V", "Ljava/lang/String;", "getEvent", "setEvent", "(Ljava/lang/String;)V", "Lcom/segment/analytics/kotlin/core/EventType;", "getType", "()Lcom/segment/analytics/kotlin/core/EventType;", "setType", "(Lcom/segment/analytics/kotlin/core/EventType;)V", "getMessageId", "setMessageId", "getAnonymousId", "setAnonymousId", "getIntegrations", "setIntegrations", "getContext", "setContext", "getUserId", "setUserId", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "get_metadata", "()Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "set_metadata", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "getTimestamp", "setTimestamp", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class TrackEvent extends BaseEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private DestinationMetadata _metadata;
    public String anonymousId;
    public JsonObject context;
    private String event;
    public JsonObject integrations;
    public String messageId;
    private JsonObject properties;
    public String timestamp;
    private EventType type;
    private String userId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/TrackEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/TrackEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return TrackEvent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @lz5
    public /* synthetic */ TrackEvent(int i, JsonObject jsonObject, String str, EventType eventType, String str2, String str3, JsonObject jsonObject2, JsonObject jsonObject3, String str4, DestinationMetadata destinationMetadata, String str5, vnf vnfVar) {
        mq5 mq5Var = null;
        if (635 != (i & 635)) {
            gvj.f(i, 635, TrackEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(mq5Var);
        this.properties = jsonObject;
        this.event = str;
        if ((i & 4) == 0) {
            this.type = EventType.Track;
        } else {
            this.type = eventType;
        }
        this.messageId = str2;
        this.anonymousId = str3;
        this.integrations = jsonObject2;
        this.context = jsonObject3;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.userId = "";
        } else {
            this.userId = str4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
        } else {
            this._metadata = destinationMetadata;
        }
        this.timestamp = str5;
    }

    public static /* synthetic */ TrackEvent copy$default(TrackEvent trackEvent, JsonObject jsonObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = trackEvent.properties;
        }
        if ((i & 2) != 0) {
            str = trackEvent.event;
        }
        return trackEvent.copy(jsonObject, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.segment.analytics.kotlin.core.TrackEvent r7, defpackage.vd4 r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r7.getClass()
            r8.getClass()
            r9.getClass()
            uh9 r0 = defpackage.uh9.a
            kotlinx.serialization.json.JsonObject r1 = r7.properties
            r2 = 0
            r8.r(r9, r2, r0, r1)
            r1 = 1
            java.lang.String r2 = r7.event
            r8.q(r9, r1, r2)
            boolean r1 = r8.E(r9)
            if (r1 == 0) goto L1e
            goto L26
        L1e:
            com.segment.analytics.kotlin.core.EventType r1 = r7.getType()
            com.segment.analytics.kotlin.core.EventType r2 = com.segment.analytics.kotlin.core.EventType.Track
            if (r1 == r2) goto L36
        L26:
            com.segment.analytics.kotlin.core.EventType$Companion r1 = com.segment.analytics.kotlin.core.EventType.INSTANCE
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            znf r1 = (defpackage.znf) r1
            com.segment.analytics.kotlin.core.EventType r2 = r7.getType()
            r3 = 2
            r8.r(r9, r3, r1, r2)
        L36:
            r1 = 3
            java.lang.String r2 = r7.getMessageId()
            r8.q(r9, r1, r2)
            r1 = 4
            java.lang.String r2 = r7.getAnonymousId()
            r8.q(r9, r1, r2)
            r1 = 5
            kotlinx.serialization.json.JsonObject r2 = r7.getIntegrations()
            r8.r(r9, r1, r0, r2)
            r1 = 6
            kotlinx.serialization.json.JsonObject r2 = r7.getContext()
            r8.r(r9, r1, r0, r2)
            boolean r0 = r8.E(r9)
            if (r0 == 0) goto L5d
            goto L69
        L5d:
            java.lang.String r0 = r7.getUserId()
            java.lang.String r1 = ""
            boolean r0 = defpackage.x44.r(r0, r1)
            if (r0 != 0) goto L71
        L69:
            java.lang.String r0 = r7.getUserId()
            r1 = 7
            r8.q(r9, r1, r0)
        L71:
            boolean r0 = r8.E(r9)
            if (r0 == 0) goto L78
            goto L8c
        L78:
            com.segment.analytics.kotlin.core.DestinationMetadata r0 = r7.get_metadata()
            com.segment.analytics.kotlin.core.DestinationMetadata r1 = new com.segment.analytics.kotlin.core.DestinationMetadata
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r0 = defpackage.x44.r(r0, r1)
            if (r0 != 0) goto L97
        L8c:
            com.segment.analytics.kotlin.core.DestinationMetadata$$serializer r0 = com.segment.analytics.kotlin.core.DestinationMetadata$$serializer.INSTANCE
            com.segment.analytics.kotlin.core.DestinationMetadata r1 = r7.get_metadata()
            r2 = 8
            r8.r(r9, r2, r0, r1)
        L97:
            r0 = 9
            java.lang.String r7 = r7.getTimestamp()
            r8.q(r9, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.kotlin.core.TrackEvent.write$Self(com.segment.analytics.kotlin.core.TrackEvent, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getProperties() {
        return this.properties;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public final TrackEvent copy(JsonObject properties, String event) {
        properties.getClass();
        event.getClass();
        return new TrackEvent(properties, event);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TrackEvent.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        other.getClass();
        TrackEvent trackEvent = (TrackEvent) other;
        return x44.r(this.properties, trackEvent.properties) && x44.r(this.event, trackEvent.event);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public String getAnonymousId() {
        String str = this.anonymousId;
        if (str != null) {
            return str;
        }
        x44.o0("anonymousId");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public JsonObject getContext() {
        JsonObject jsonObject = this.context;
        if (jsonObject != null) {
            return jsonObject;
        }
        x44.o0("context");
        throw null;
    }

    public final String getEvent() {
        return this.event;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public JsonObject getIntegrations() {
        JsonObject jsonObject = this.integrations;
        if (jsonObject != null) {
            return jsonObject;
        }
        x44.o0("integrations");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public String getMessageId() {
        String str = this.messageId;
        if (str != null) {
            return str;
        }
        x44.o0("messageId");
        throw null;
    }

    public final JsonObject getProperties() {
        return this.properties;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public String getTimestamp() {
        String str = this.timestamp;
        if (str != null) {
            return str;
        }
        x44.o0("timestamp");
        throw null;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public EventType getType() {
        return this.type;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public String getUserId() {
        return this.userId;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public DestinationMetadata get_metadata() {
        return this._metadata;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public int hashCode() {
        return this.event.hashCode() + ((this.properties.hashCode() + (super.hashCode() * 31)) * 31);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setAnonymousId(String str) {
        str.getClass();
        this.anonymousId = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setContext(JsonObject jsonObject) {
        jsonObject.getClass();
        this.context = jsonObject;
    }

    public final void setEvent(String str) {
        str.getClass();
        this.event = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setIntegrations(JsonObject jsonObject) {
        jsonObject.getClass();
        this.integrations = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setMessageId(String str) {
        str.getClass();
        this.messageId = str;
    }

    public final void setProperties(JsonObject jsonObject) {
        jsonObject.getClass();
        this.properties = jsonObject;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setTimestamp(String str) {
        str.getClass();
        this.timestamp = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setType(EventType eventType) {
        eventType.getClass();
        this.type = eventType;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setUserId(String str) {
        str.getClass();
        this.userId = str;
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void set_metadata(DestinationMetadata destinationMetadata) {
        destinationMetadata.getClass();
        this._metadata = destinationMetadata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackEvent(properties=");
        sb.append(this.properties);
        sb.append(", event=");
        return vb7.s(sb, this.event, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackEvent(JsonObject jsonObject, String str) {
        super(null);
        jsonObject.getClass();
        str.getClass();
        this.properties = jsonObject;
        this.event = str;
        this.type = EventType.Track;
        this.userId = "";
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }
}
