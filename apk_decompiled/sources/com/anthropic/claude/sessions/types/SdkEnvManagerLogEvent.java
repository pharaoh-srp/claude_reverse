package com.anthropic.claude.sessions.types;

import defpackage.dbf;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pbf;
import defpackage.srg;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 '2\u00020\u0001:\u0003()*B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;", "data", "session_id", "parent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;", "getData", "()Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;", "getSession_id", "getParent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "getMessage", "()Lcom/anthropic/claude/sessions/types/SdkMessage;", "Companion", "EnvManagerLogData", "com/anthropic/claude/sessions/types/s0", "dbf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkEnvManagerLogEvent implements SdkEvent {
    public static final dbf Companion = new dbf();
    private final EnvManagerLogData data;
    private final SdkMessage message;
    private final String parent_tool_use_id;
    private final String session_id;
    private final String type;
    private final String uuid;

    public /* synthetic */ SdkEnvManagerLogEvent(int i, String str, String str2, EnvManagerLogData envManagerLogData, String str3, String str4, SdkMessage sdkMessage, vnf vnfVar) {
        if (47 != (i & 47)) {
            gvj.f(i, 47, s0.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        this.data = envManagerLogData;
        this.session_id = str3;
        if ((i & 16) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
        this.message = sdkMessage;
    }

    public static final /* synthetic */ void write$Self$sessions(SdkEnvManagerLogEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        output.r(serialDesc, 2, t0.a, self.data);
        srg srgVar = srg.a;
        output.B(serialDesc, 3, srgVar, self.session_id);
        if (output.E(serialDesc) || self.getParent_tool_use_id() != null) {
            output.B(serialDesc, 4, srgVar, self.getParent_tool_use_id());
        }
        output.B(serialDesc, 5, pbf.c, self.message);
    }

    public final EnvManagerLogData getData() {
        return this.data;
    }

    public final SdkMessage getMessage() {
        return this.message;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public SdkEnvManagerLogEvent(String str, String str2, EnvManagerLogData envManagerLogData, String str3, String str4, SdkMessage sdkMessage) {
        str.getClass();
        str2.getClass();
        envManagerLogData.getClass();
        this.type = str;
        this.uuid = str2;
        this.data = envManagerLogData;
        this.session_id = str3;
        this.parent_tool_use_id = str4;
        this.message = sdkMessage;
    }

    public /* synthetic */ SdkEnvManagerLogEvent(String str, String str2, EnvManagerLogData envManagerLogData, String str3, String str4, SdkMessage sdkMessage, int i, mq5 mq5Var) {
        this(str, str2, envManagerLogData, str3, (i & 16) != 0 ? null : str4, sdkMessage);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;", "", "", "level", "category", "content", "timestamp", "Lkotlinx/serialization/json/JsonObject;", "extra", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/sessions/types/SdkEnvManagerLogEvent$EnvManagerLogData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLevel", "getCategory", "getContent", "getTimestamp", "Lkotlinx/serialization/json/JsonObject;", "getExtra", "Companion", "com/anthropic/claude/sessions/types/t0", "com/anthropic/claude/sessions/types/u0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class EnvManagerLogData {
        public static final u0 Companion = new u0();
        private final String category;
        private final String content;
        private final JsonObject extra;
        private final String level;
        private final String timestamp;

        public /* synthetic */ EnvManagerLogData(int i, String str, String str2, String str3, String str4, JsonObject jsonObject, vnf vnfVar) {
            if (5 != (i & 5)) {
                gvj.f(i, 5, t0.a.getDescriptor());
                throw null;
            }
            this.level = str;
            if ((i & 2) == 0) {
                this.category = null;
            } else {
                this.category = str2;
            }
            this.content = str3;
            if ((i & 8) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = str4;
            }
            if ((i & 16) == 0) {
                this.extra = null;
            } else {
                this.extra = jsonObject;
            }
        }

        public static /* synthetic */ EnvManagerLogData copy$default(EnvManagerLogData envManagerLogData, String str, String str2, String str3, String str4, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = envManagerLogData.level;
            }
            if ((i & 2) != 0) {
                str2 = envManagerLogData.category;
            }
            if ((i & 4) != 0) {
                str3 = envManagerLogData.content;
            }
            if ((i & 8) != 0) {
                str4 = envManagerLogData.timestamp;
            }
            if ((i & 16) != 0) {
                jsonObject = envManagerLogData.extra;
            }
            JsonObject jsonObject2 = jsonObject;
            String str5 = str3;
            return envManagerLogData.copy(str, str2, str5, str4, jsonObject2);
        }

        public static final /* synthetic */ void write$Self$sessions(EnvManagerLogData self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.level);
            if (output.E(serialDesc) || self.category != null) {
                output.B(serialDesc, 1, srg.a, self.category);
            }
            output.q(serialDesc, 2, self.content);
            if (output.E(serialDesc) || self.timestamp != null) {
                output.B(serialDesc, 3, srg.a, self.timestamp);
            }
            if (!output.E(serialDesc) && self.extra == null) {
                return;
            }
            output.B(serialDesc, 4, uh9.a, self.extra);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final JsonObject getExtra() {
            return this.extra;
        }

        public final EnvManagerLogData copy(String level, String category, String content, String timestamp, JsonObject extra) {
            level.getClass();
            content.getClass();
            return new EnvManagerLogData(level, category, content, timestamp, extra);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnvManagerLogData)) {
                return false;
            }
            EnvManagerLogData envManagerLogData = (EnvManagerLogData) other;
            return x44.r(this.level, envManagerLogData.level) && x44.r(this.category, envManagerLogData.category) && x44.r(this.content, envManagerLogData.content) && x44.r(this.timestamp, envManagerLogData.timestamp) && x44.r(this.extra, envManagerLogData.extra);
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getContent() {
            return this.content;
        }

        public final JsonObject getExtra() {
            return this.extra;
        }

        public final String getLevel() {
            return this.level;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = this.level.hashCode() * 31;
            String str = this.category;
            int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.content);
            String str2 = this.timestamp;
            int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
            JsonObject jsonObject = this.extra;
            return iHashCode2 + (jsonObject != null ? jsonObject.hashCode() : 0);
        }

        public String toString() {
            String str = this.level;
            String str2 = this.category;
            String str3 = this.content;
            String str4 = this.timestamp;
            JsonObject jsonObject = this.extra;
            StringBuilder sbR = kgh.r("EnvManagerLogData(level=", str, ", category=", str2, ", content=");
            kgh.u(sbR, str3, ", timestamp=", str4, ", extra=");
            sbR.append(jsonObject);
            sbR.append(")");
            return sbR.toString();
        }

        public EnvManagerLogData(String str, String str2, String str3, String str4, JsonObject jsonObject) {
            str.getClass();
            str3.getClass();
            this.level = str;
            this.category = str2;
            this.content = str3;
            this.timestamp = str4;
            this.extra = jsonObject;
        }

        public /* synthetic */ EnvManagerLogData(String str, String str2, String str3, String str4, JsonObject jsonObject, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : jsonObject);
        }
    }
}
