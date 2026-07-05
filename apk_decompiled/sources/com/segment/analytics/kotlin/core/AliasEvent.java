package com.segment.analytics.kotlin.core;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh9;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0081\u0001\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0005\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÇ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J$\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010(\"\u0004\b/\u00100R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010-\u001a\u0004\b1\u0010(\"\u0004\b2\u00100R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b8\u0010(\"\u0004\b9\u00100R\"\u0010\f\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\f\u0010-\u001a\u0004\b:\u0010(\"\u0004\b;\u00100R&\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R&\u0010\u0011\u001a\u00060\rj\u0002`\u00108\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0011\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010\u0012\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010-\u001a\u0004\bC\u0010(\"\u0004\bD\u00100R\"\u0010\u0014\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/segment/analytics/kotlin/core/AliasEvent;", "Lcom/segment/analytics/kotlin/core/BaseEvent;", "", "userId", "previousId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lcom/segment/analytics/kotlin/core/EventType;", "type", "messageId", "anonymousId", "Lkotlinx/serialization/json/JsonObject;", "Lcom/segment/analytics/kotlin/core/Integrations;", "integrations", "Lcom/segment/analytics/kotlin/core/AnalyticsContext;", "context", "timestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "_metadata", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/EventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/DestinationMetadata;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/AliasEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/segment/analytics/kotlin/core/AliasEvent;", "toString", "Ljava/lang/String;", "getUserId", "setUserId", "(Ljava/lang/String;)V", "getPreviousId", "setPreviousId", "Lcom/segment/analytics/kotlin/core/EventType;", "getType", "()Lcom/segment/analytics/kotlin/core/EventType;", "setType", "(Lcom/segment/analytics/kotlin/core/EventType;)V", "getMessageId", "setMessageId", "getAnonymousId", "setAnonymousId", "Lkotlinx/serialization/json/JsonObject;", "getIntegrations", "()Lkotlinx/serialization/json/JsonObject;", "setIntegrations", "(Lkotlinx/serialization/json/JsonObject;)V", "getContext", "setContext", "getTimestamp", "setTimestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "get_metadata", "()Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "set_metadata", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class AliasEvent extends BaseEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private DestinationMetadata _metadata;
    public String anonymousId;
    public JsonObject context;
    public JsonObject integrations;
    public String messageId;
    private String previousId;
    public String timestamp;
    private EventType type;
    private String userId;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/AliasEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/AliasEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return AliasEvent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @lz5
    public /* synthetic */ AliasEvent(int i, String str, String str2, EventType eventType, String str3, String str4, JsonObject jsonObject, JsonObject jsonObject2, String str5, DestinationMetadata destinationMetadata, vnf vnfVar) {
        super(null);
        if (251 != (i & 251)) {
            gvj.f(i, 251, AliasEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.userId = str;
        this.previousId = str2;
        if ((i & 4) == 0) {
            this.type = EventType.Alias;
        } else {
            this.type = eventType;
        }
        this.messageId = str3;
        this.anonymousId = str4;
        this.integrations = jsonObject;
        this.context = jsonObject2;
        this.timestamp = str5;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            this._metadata = destinationMetadata;
            return;
        }
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }

    public static /* synthetic */ AliasEvent copy$default(AliasEvent aliasEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aliasEvent.getUserId();
        }
        if ((i & 2) != 0) {
            str2 = aliasEvent.previousId;
        }
        return aliasEvent.copy(str, str2);
    }

    public static final void write$Self(AliasEvent self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        output.q(serialDesc, 0, self.getUserId());
        output.q(serialDesc, 1, self.previousId);
        if (output.E(serialDesc) || self.getType() != EventType.Alias) {
            output.r(serialDesc, 2, EventType.INSTANCE.serializer(), self.getType());
        }
        output.q(serialDesc, 3, self.getMessageId());
        output.q(serialDesc, 4, self.getAnonymousId());
        uh9 uh9Var = uh9.a;
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
    public final String getPreviousId() {
        return this.previousId;
    }

    public final AliasEvent copy(String userId, String previousId) {
        userId.getClass();
        previousId.getClass();
        return new AliasEvent(userId, previousId);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AliasEvent.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        other.getClass();
        return x44.r(this.previousId, ((AliasEvent) other).previousId);
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

    public final String getPreviousId() {
        return this.previousId;
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
        return this.previousId.hashCode() + (super.hashCode() * 31);
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

    public final void setPreviousId(String str) {
        str.getClass();
        this.previousId = str;
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
        StringBuilder sb = new StringBuilder("AliasEvent(userId=");
        sb.append(getUserId());
        sb.append(", previousId=");
        return vb7.s(sb, this.previousId, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliasEvent(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.userId = str;
        this.previousId = str2;
        this.type = EventType.Alias;
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }
}
