package com.segment.analytics.kotlin.core;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tB\u009b\u0001\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0010\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\b\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0014\u0010%\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J2\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010#J(\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-HÇ\u0001¢\u0006\u0004\b0\u00101R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010#\"\u0004\b4\u00105R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b6\u0010#\"\u0004\b7\u00105R&\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010&\"\u0004\b:\u0010;R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u000e\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000e\u00102\u001a\u0004\bA\u0010#\"\u0004\bB\u00105R\"\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\bC\u0010#\"\u0004\bD\u00105R&\u0010\u0011\u001a\u00060\u0005j\u0002`\u00108\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\bE\u0010&\"\u0004\bF\u0010;R&\u0010\u0013\u001a\u00060\u0005j\u0002`\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\bG\u0010&\"\u0004\bH\u0010;R\"\u0010\u0014\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u00102\u001a\u0004\bI\u0010#\"\u0004\bJ\u00105R\"\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0015\u00102\u001a\u0004\bK\u0010#\"\u0004\bL\u00105R\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lcom/segment/analytics/kotlin/core/BaseEvent;", "", "name", "category", "Lkotlinx/serialization/json/JsonObject;", "Lcom/segment/analytics/kotlin/core/Properties;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen1", "Lcom/segment/analytics/kotlin/core/EventType;", "type", "messageId", "anonymousId", "Lcom/segment/analytics/kotlin/core/AnalyticsContext;", "context", "Lcom/segment/analytics/kotlin/core/Integrations;", "integrations", "userId", "timestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "_metadata", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lcom/segment/analytics/kotlin/core/EventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Lcom/segment/analytics/kotlin/core/DestinationMetadata;Lvnf;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/segment/analytics/kotlin/core/ScreenEvent;", "toString", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/ScreenEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getCategory", "setCategory", "Lkotlinx/serialization/json/JsonObject;", "getProperties", "setProperties", "(Lkotlinx/serialization/json/JsonObject;)V", "Lcom/segment/analytics/kotlin/core/EventType;", "getType", "()Lcom/segment/analytics/kotlin/core/EventType;", "setType", "(Lcom/segment/analytics/kotlin/core/EventType;)V", "getMessageId", "setMessageId", "getAnonymousId", "setAnonymousId", "getContext", "setContext", "getIntegrations", "setIntegrations", "getUserId", "setUserId", "getTimestamp", "setTimestamp", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "get_metadata", "()Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "set_metadata", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class ScreenEvent extends BaseEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private DestinationMetadata _metadata;
    public String anonymousId;
    private String category;
    public JsonObject context;
    public JsonObject integrations;
    public String messageId;
    private String name;
    private JsonObject properties;
    public String timestamp;
    private EventType type;
    private String userId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/ScreenEvent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return ScreenEvent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @lz5
    public /* synthetic */ ScreenEvent(int i, String str, String str2, JsonObject jsonObject, EventType eventType, String str3, String str4, JsonObject jsonObject2, JsonObject jsonObject3, String str5, String str6, DestinationMetadata destinationMetadata, vnf vnfVar) {
        mq5 mq5Var = null;
        if (759 != (i & 759)) {
            gvj.f(i, 759, ScreenEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        super(mq5Var);
        this.name = str;
        this.category = str2;
        this.properties = jsonObject;
        if ((i & 8) == 0) {
            this.type = EventType.Screen;
        } else {
            this.type = eventType;
        }
        this.messageId = str3;
        this.anonymousId = str4;
        this.context = jsonObject2;
        this.integrations = jsonObject3;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.userId = "";
        } else {
            this.userId = str5;
        }
        this.timestamp = str6;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            this._metadata = destinationMetadata;
            return;
        }
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }

    public static /* synthetic */ ScreenEvent copy$default(ScreenEvent screenEvent, String str, String str2, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screenEvent.name;
        }
        if ((i & 2) != 0) {
            str2 = screenEvent.category;
        }
        if ((i & 4) != 0) {
            jsonObject = screenEvent.properties;
        }
        return screenEvent.copy(str, str2, jsonObject);
    }

    public static final void write$Self(ScreenEvent self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.category);
        uh9 uh9Var = uh9.a;
        output.r(serialDesc, 2, uh9Var, self.properties);
        if (output.E(serialDesc) || self.getType() != EventType.Screen) {
            output.r(serialDesc, 3, EventType.INSTANCE.serializer(), self.getType());
        }
        output.q(serialDesc, 4, self.getMessageId());
        output.q(serialDesc, 5, self.getAnonymousId());
        output.r(serialDesc, 6, uh9Var, self.getContext());
        output.r(serialDesc, 7, uh9Var, self.getIntegrations());
        if (output.E(serialDesc) || !x44.r(self.getUserId(), "")) {
            output.q(serialDesc, 8, self.getUserId());
        }
        output.q(serialDesc, 9, self.getTimestamp());
        if (!output.E(serialDesc)) {
            if (x44.r(self.get_metadata(), new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null))) {
                return;
            }
        }
        output.r(serialDesc, 10, DestinationMetadata$$serializer.INSTANCE, self.get_metadata());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getProperties() {
        return this.properties;
    }

    public final ScreenEvent copy(String name, String category, JsonObject properties) {
        name.getClass();
        category.getClass();
        properties.getClass();
        return new ScreenEvent(name, category, properties);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ScreenEvent.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        other.getClass();
        ScreenEvent screenEvent = (ScreenEvent) other;
        return x44.r(this.name, screenEvent.name) && x44.r(this.category, screenEvent.category) && x44.r(this.properties, screenEvent.properties);
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

    public final String getCategory() {
        return this.category;
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

    public final String getName() {
        return this.name;
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
        return this.properties.hashCode() + kgh.l(kgh.l(super.hashCode() * 31, 31, this.name), 31, this.category);
    }

    @Override // com.segment.analytics.kotlin.core.BaseEvent
    public void setAnonymousId(String str) {
        str.getClass();
        this.anonymousId = str;
    }

    public final void setCategory(String str) {
        str.getClass();
        this.category = str;
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

    public final void setName(String str) {
        str.getClass();
        this.name = str;
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
        return "ScreenEvent(name=" + this.name + ", category=" + this.category + ", properties=" + this.properties + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenEvent(String str, String str2, JsonObject jsonObject) {
        super(null);
        str.getClass();
        str2.getClass();
        jsonObject.getClass();
        this.name = str;
        this.category = str2;
        this.properties = jsonObject;
        this.type = EventType.Screen;
        this.userId = "";
        this._metadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
    }
}
