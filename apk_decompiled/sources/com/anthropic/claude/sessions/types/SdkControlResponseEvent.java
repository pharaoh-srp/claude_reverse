package com.anthropic.claude.sessions.types;

import defpackage.abf;
import defpackage.eh9;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pbf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 '2\u00020\u0001:\u0003()*BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;", "response", "session_id", "parent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;", "getResponse", "()Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;", "getSession_id", "getParent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "getMessage", "()Lcom/anthropic/claude/sessions/types/SdkMessage;", "Companion", "Response", "com/anthropic/claude/sessions/types/p0", "abf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkControlResponseEvent implements SdkEvent {
    public static final abf Companion = new abf();
    private final SdkMessage message;
    private final String parent_tool_use_id;
    private final Response response;
    private final String session_id;
    private final String type;
    private final String uuid;

    public /* synthetic */ SdkControlResponseEvent(int i, String str, String str2, Response response, String str3, String str4, SdkMessage sdkMessage, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, p0.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i & 4) == 0) {
            this.response = null;
        } else {
            this.response = response;
        }
        if ((i & 8) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str3;
        }
        if ((i & 16) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
        if ((i & 32) == 0) {
            this.message = null;
        } else {
            this.message = sdkMessage;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkControlResponseEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        if (output.E(serialDesc) || self.uuid != null) {
            output.B(serialDesc, 1, srg.a, self.uuid);
        }
        if (output.E(serialDesc) || self.response != null) {
            output.B(serialDesc, 2, q0.a, self.response);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 3, srg.a, self.session_id);
        }
        if (output.E(serialDesc) || self.getParent_tool_use_id() != null) {
            output.B(serialDesc, 4, srg.a, self.getParent_tool_use_id());
        }
        if (!output.E(serialDesc) && self.message == null) {
            return;
        }
        output.B(serialDesc, 5, pbf.c, self.message);
    }

    public final SdkMessage getMessage() {
        return this.message;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final Response getResponse() {
        return this.response;
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;", "", "", "request_id", "subtype", "error", "Lkotlinx/serialization/json/JsonElement;", "response", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/sessions/types/SdkControlResponseEvent$Response;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequest_id", "getSubtype", "getError", "Lkotlinx/serialization/json/JsonElement;", "getResponse", "Companion", "com/anthropic/claude/sessions/types/q0", "com/anthropic/claude/sessions/types/r0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Response {
        public static final r0 Companion = new r0();
        private final String error;
        private final String request_id;
        private final JsonElement response;
        private final String subtype;

        public /* synthetic */ Response(int i, String str, String str2, String str3, JsonElement jsonElement, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, q0.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.request_id = null;
            } else {
                this.request_id = str;
            }
            this.subtype = str2;
            if ((i & 4) == 0) {
                this.error = null;
            } else {
                this.error = str3;
            }
            if ((i & 8) == 0) {
                this.response = null;
            } else {
                this.response = jsonElement;
            }
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = response.request_id;
            }
            if ((i & 2) != 0) {
                str2 = response.subtype;
            }
            if ((i & 4) != 0) {
                str3 = response.error;
            }
            if ((i & 8) != 0) {
                jsonElement = response.response;
            }
            return response.copy(str, str2, str3, jsonElement);
        }

        public static final /* synthetic */ void write$Self$sessions(Response self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.request_id != null) {
                output.B(serialDesc, 0, srg.a, self.request_id);
            }
            output.q(serialDesc, 1, self.subtype);
            if (output.E(serialDesc) || self.error != null) {
                output.B(serialDesc, 2, srg.a, self.error);
            }
            if (!output.E(serialDesc) && self.response == null) {
                return;
            }
            output.B(serialDesc, 3, eh9.a, self.response);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequest_id() {
            return this.request_id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final JsonElement getResponse() {
            return this.response;
        }

        public final Response copy(String request_id, String subtype, String error, JsonElement response) {
            subtype.getClass();
            return new Response(request_id, subtype, error, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return x44.r(this.request_id, response.request_id) && x44.r(this.subtype, response.subtype) && x44.r(this.error, response.error) && x44.r(this.response, response.response);
        }

        public final String getError() {
            return this.error;
        }

        public final String getRequest_id() {
            return this.request_id;
        }

        public final JsonElement getResponse() {
            return this.response;
        }

        public final String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            String str = this.request_id;
            int iL = kgh.l((str == null ? 0 : str.hashCode()) * 31, 31, this.subtype);
            String str2 = this.error;
            int iHashCode = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
            JsonElement jsonElement = this.response;
            return iHashCode + (jsonElement != null ? jsonElement.hashCode() : 0);
        }

        public String toString() {
            String str = this.request_id;
            String str2 = this.subtype;
            String str3 = this.error;
            JsonElement jsonElement = this.response;
            StringBuilder sbR = kgh.r("Response(request_id=", str, ", subtype=", str2, ", error=");
            sbR.append(str3);
            sbR.append(", response=");
            sbR.append(jsonElement);
            sbR.append(")");
            return sbR.toString();
        }

        public Response(String str, String str2, String str3, JsonElement jsonElement) {
            str2.getClass();
            this.request_id = str;
            this.subtype = str2;
            this.error = str3;
            this.response = jsonElement;
        }

        public /* synthetic */ Response(String str, String str2, String str3, JsonElement jsonElement, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : jsonElement);
        }
    }

    public SdkControlResponseEvent(String str, String str2, Response response, String str3, String str4, SdkMessage sdkMessage) {
        str.getClass();
        this.type = str;
        this.uuid = str2;
        this.response = response;
        this.session_id = str3;
        this.parent_tool_use_id = str4;
        this.message = sdkMessage;
    }

    public /* synthetic */ SdkControlResponseEvent(String str, String str2, Response response, String str3, String str4, SdkMessage sdkMessage, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : response, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : sdkMessage);
    }
}
