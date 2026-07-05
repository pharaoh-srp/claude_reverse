package com.segment.analytics.kotlin.core;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0087\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u000f\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0007\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0014\u0010*\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J(\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010)R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010)\"\u0004\b1\u00102R&\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010+\"\u0004\b5\u00106R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\r\u0010/\u001a\u0004\b<\u0010)\"\u0004\b=\u00102R\"\u0010\u000e\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000e\u0010/\u001a\u0004\b>\u0010)\"\u0004\b?\u00102R&\u0010\u0010\u001a\u00060\u0004j\u0002`\u000f8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0010\u00103\u001a\u0004\b@\u0010+\"\u0004\bA\u00106R&\u0010\u0012\u001a\u00060\u0004j\u0002`\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\bB\u0010+\"\u0004\bC\u00106R\"\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\bD\u0010)\"\u0004\bE\u00102R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "Lcom/segment/analytics/kotlin/core/BaseEvent;", "", "userId", "Lkotlinx/serialization/json/JsonObject;", "Lcom/segment/analytics/kotlin/core/Traits;", "traits", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen1", "Lcom/segment/analytics/kotlin/core/EventType;", "type", "messageId", "anonymousId", "Lcom/segment/analytics/kotlin/core/Integrations;", "integrations", "Lcom/segment/analytics/kotlin/core/AnalyticsContext;", "context", "timestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "_metadata", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lcom/segment/analytics/kotlin/core/EventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/DestinationMetadata;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/IdentifyEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "toString", "Ljava/lang/String;", "getUserId", "setUserId", "(Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonObject;", "getTraits", "setTraits", "(Lkotlinx/serialization/json/JsonObject;)V", "Lcom/segment/analytics/kotlin/core/EventType;", "getType", "()Lcom/segment/analytics/kotlin/core/EventType;", "setType", "(Lcom/segment/analytics/kotlin/core/EventType;)V", "getMessageId", "setMessageId", "getAnonymousId", "setAnonymousId", "getIntegrations", "setIntegrations", "getContext", "setContext", "getTimestamp", "setTimestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "get_metadata", "()Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "set_metadata", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class IdentifyEvent extends BaseEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private DestinationMetadata _metadata;
    public String anonymousId;
    public JsonObject context;
    public JsonObject integrations;
    public String messageId;
    public String timestamp;
    private JsonObject traits;
    private EventType type;
    private String userId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/IdentifyEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/IdentifyEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return IdentifyEvent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @lz5
    public /* synthetic */ IdentifyEvent(int i, String str, JsonObject jsonObject, EventType eventType, String str2, String str3, JsonObject jsonObject2, JsonObject jsonObject3, String str4, DestinationMetadata destinationMetadata, vnf vnfVar) {
        super(null);
        if (251 != (i & 251)) {
            gvj.f(i, 251, IdentifyEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.traits = jsonObject;
        if ((i & 4) == 0) {
            this.type = EventType.Identify;
        } else {
            this.type = eventType;
        }
        this.messageId = str2;
        this.anonymousId = str3;
        this.integrations = jsonObject2;
        this.context = jsonObject3;
        this.timestamp = str4;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            this._metadata = destinationMetadata;
            return;
        }
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }

    public static /* synthetic */ IdentifyEvent copy$default(IdentifyEvent identifyEvent, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identifyEvent.getUserId();
        }
        if ((i & 2) != 0) {
            jsonObject = identifyEvent.traits;
        }
        return identifyEvent.copy(str, jsonObject);
    }

    public static final void write$Self(IdentifyEvent self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        output.q(serialDesc, 0, self.getUserId());
        uh9 uh9Var = uh9.a;
        output.r(serialDesc, 1, uh9Var, self.traits);
        if (output.E(serialDesc) || self.getType() != EventType.Identify) {
            output.r(serialDesc, 2, EventType.INSTANCE.serializer(), self.getType());
        }
        output.q(serialDesc, 3, self.getMessageId());
        output.q(serialDesc, 4, self.getAnonymousId());
        output.r(serialDesc, 5, uh9Var, self.getIntegrations());
        output.r(serialDesc, 6, uh9Var, self.getContext());
        output.q(serialDesc, 7, self.getTimestamp());
        if (!output.E(serialDesc)) {
            if (x44.r(self.get_metadata(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null))) {
                return;
            }
        }
        output.r(serialDesc, 8, DestinationMetadata$$serializer.INSTANCE, self.get_metadata());
    }

    public final String component1() {
        return getUserId();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getTraits() {
        return this.traits;
    }

    public final IdentifyEvent copy(String userId, JsonObject traits) {
        userId.getClass();
        traits.getClass();
        return new IdentifyEvent(userId, traits);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!IdentifyEvent.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        other.getClass();
        return x44.r(this.traits, ((IdentifyEvent) other).traits);
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

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public String getTimestamp() {
        String str = this.timestamp;
        if (str != null) {
            return str;
        }
        x44.o0("timestamp");
        throw null;
    }

    public final JsonObject getTraits() {
        return this.traits;
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
        return this.traits.hashCode() + (super.hashCode() * 31);
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

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setTimestamp(String str) {
        str.getClass();
        this.timestamp = str;
    }

    public final void setTraits(JsonObject jsonObject) {
        jsonObject.getClass();
        this.traits = jsonObject;
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
        return "IdentifyEvent(userId=" + getUserId() + ", traits=" + this.traits + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifyEvent(String str, JsonObject jsonObject) {
        super(null);
        str.getClass();
        jsonObject.getClass();
        this.userId = str;
        this.traits = jsonObject;
        this.type = EventType.Identify;
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }
}
