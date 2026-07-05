package com.anthropic.claude.sessions.types;

import defpackage.aq4;
import defpackage.fng;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.orf;
import defpackage.sf0;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y1g;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \b2\u00020\u0001:\u0004\t\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdinMessage;", "", "", "getType", "()Ljava/lang/String;", "type", "getUuid", "uuid", "Companion", "SdkUserMessage", "ControlRequest", "ControlResponse", "fng", "Lcom/anthropic/claude/sessions/types/StdinMessage$ControlRequest;", "Lcom/anthropic/claude/sessions/types/StdinMessage$ControlResponse;", "Lcom/anthropic/claude/sessions/types/StdinMessage$SdkUserMessage;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = r1.class)
public interface StdinMessage {
    public static final fng Companion = fng.a;

    String getType();

    String getUuid();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/sessions/types/StdinMessage$ControlResponse;", "Lcom/anthropic/claude/sessions/types/StdinMessage;", "", "type", "uuid", "Lcom/anthropic/claude/sessions/types/ControlResponseBody;", "response", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseBody;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseBody;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/StdinMessage$ControlResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/sessions/types/ControlResponseBody;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseBody;)Lcom/anthropic/claude/sessions/types/StdinMessage$ControlResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getUuid", "Lcom/anthropic/claude/sessions/types/ControlResponseBody;", "getResponse", "Companion", "com/anthropic/claude/sessions/types/n1", "com/anthropic/claude/sessions/types/o1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ControlResponse implements StdinMessage {
        public static final o1 Companion = new o1();
        private final ControlResponseBody response;
        private final String type;
        private final String uuid;

        public /* synthetic */ ControlResponse(int i, String str, String str2, ControlResponseBody controlResponseBody, vnf vnfVar) {
            if (4 != (i & 4)) {
                gvj.f(i, 4, n1.a.getDescriptor());
                throw null;
            }
            this.type = (i & 1) == 0 ? "control_response" : str;
            if ((i & 2) == 0) {
                this.uuid = fng.a(StdinMessage.Companion);
            } else {
                this.uuid = str2;
            }
            this.response = controlResponseBody;
        }

        public static /* synthetic */ ControlResponse copy$default(ControlResponse controlResponse, String str, String str2, ControlResponseBody controlResponseBody, int i, Object obj) {
            if ((i & 1) != 0) {
                str = controlResponse.type;
            }
            if ((i & 2) != 0) {
                str2 = controlResponse.uuid;
            }
            if ((i & 4) != 0) {
                controlResponseBody = controlResponse.response;
            }
            return controlResponse.copy(str, str2, controlResponseBody);
        }

        public static final /* synthetic */ void write$Self$sessions(ControlResponse self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getType(), "control_response")) {
                output.q(serialDesc, 0, self.getType());
            }
            if (output.E(serialDesc) || !x44.r(self.getUuid(), fng.a(StdinMessage.Companion))) {
                output.q(serialDesc, 1, self.getUuid());
            }
            output.r(serialDesc, 2, aq4.a, self.response);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ControlResponseBody getResponse() {
            return this.response;
        }

        public final ControlResponse copy(String type, String uuid, ControlResponseBody response) {
            type.getClass();
            uuid.getClass();
            response.getClass();
            return new ControlResponse(type, uuid, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControlResponse)) {
                return false;
            }
            ControlResponse controlResponse = (ControlResponse) other;
            return x44.r(this.type, controlResponse.type) && x44.r(this.uuid, controlResponse.uuid) && x44.r(this.response, controlResponse.response);
        }

        public final ControlResponseBody getResponse() {
            return this.response;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getType() {
            return this.type;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.response.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.uuid);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.uuid;
            ControlResponseBody controlResponseBody = this.response;
            StringBuilder sbR = kgh.r("ControlResponse(type=", str, ", uuid=", str2, ", response=");
            sbR.append(controlResponseBody);
            sbR.append(")");
            return sbR.toString();
        }

        public ControlResponse(String str, String str2, ControlResponseBody controlResponseBody) {
            str.getClass();
            str2.getClass();
            controlResponseBody.getClass();
            this.type = str;
            this.uuid = str2;
            this.response = controlResponseBody;
        }

        public /* synthetic */ ControlResponse(String str, String str2, ControlResponseBody controlResponseBody, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "control_response" : str, (i & 2) != 0 ? fng.a(StdinMessage.Companion) : str2, controlResponseBody);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdinMessage$ControlRequest;", "Lcom/anthropic/claude/sessions/types/StdinMessage;", "", "type", "uuid", "request_id", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlRequestBody;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlRequestBody;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/StdinMessage$ControlRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlRequestBody;)Lcom/anthropic/claude/sessions/types/StdinMessage$ControlRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getUuid", "getRequest_id", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "getRequest", "Companion", "com/anthropic/claude/sessions/types/l1", "com/anthropic/claude/sessions/types/m1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ControlRequest implements StdinMessage {
        public static final m1 Companion = new m1();
        private final ControlRequestBody request;
        private final String request_id;
        private final String type;
        private final String uuid;

        public /* synthetic */ ControlRequest(int i, String str, String str2, String str3, ControlRequestBody controlRequestBody, vnf vnfVar) {
            if (12 != (i & 12)) {
                gvj.f(i, 12, l1.a.getDescriptor());
                throw null;
            }
            this.type = (i & 1) == 0 ? "control_request" : str;
            if ((i & 2) == 0) {
                this.uuid = fng.a(StdinMessage.Companion);
            } else {
                this.uuid = str2;
            }
            this.request_id = str3;
            this.request = controlRequestBody;
        }

        public static /* synthetic */ ControlRequest copy$default(ControlRequest controlRequest, String str, String str2, String str3, ControlRequestBody controlRequestBody, int i, Object obj) {
            if ((i & 1) != 0) {
                str = controlRequest.type;
            }
            if ((i & 2) != 0) {
                str2 = controlRequest.uuid;
            }
            if ((i & 4) != 0) {
                str3 = controlRequest.request_id;
            }
            if ((i & 8) != 0) {
                controlRequestBody = controlRequest.request;
            }
            return controlRequest.copy(str, str2, str3, controlRequestBody);
        }

        public static final /* synthetic */ void write$Self$sessions(ControlRequest self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getType(), "control_request")) {
                output.q(serialDesc, 0, self.getType());
            }
            if (output.E(serialDesc) || !x44.r(self.getUuid(), fng.a(StdinMessage.Companion))) {
                output.q(serialDesc, 1, self.getUuid());
            }
            output.q(serialDesc, 2, self.request_id);
            output.r(serialDesc, 3, z.c, self.request);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRequest_id() {
            return this.request_id;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ControlRequestBody getRequest() {
            return this.request;
        }

        public final ControlRequest copy(String type, String uuid, String request_id, ControlRequestBody request) {
            type.getClass();
            uuid.getClass();
            request_id.getClass();
            request.getClass();
            return new ControlRequest(type, uuid, request_id, request);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControlRequest)) {
                return false;
            }
            ControlRequest controlRequest = (ControlRequest) other;
            return x44.r(this.type, controlRequest.type) && x44.r(this.uuid, controlRequest.uuid) && x44.r(this.request_id, controlRequest.request_id) && x44.r(this.request, controlRequest.request);
        }

        public final ControlRequestBody getRequest() {
            return this.request;
        }

        public final String getRequest_id() {
            return this.request_id;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getType() {
            return this.type;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            return this.request.hashCode() + kgh.l(kgh.l(this.type.hashCode() * 31, 31, this.uuid), 31, this.request_id);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.uuid;
            String str3 = this.request_id;
            ControlRequestBody controlRequestBody = this.request;
            StringBuilder sbR = kgh.r("ControlRequest(type=", str, ", uuid=", str2, ", request_id=");
            sbR.append(str3);
            sbR.append(", request=");
            sbR.append(controlRequestBody);
            sbR.append(")");
            return sbR.toString();
        }

        public ControlRequest(String str, String str2, String str3, ControlRequestBody controlRequestBody) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            controlRequestBody.getClass();
            this.type = str;
            this.uuid = str2;
            this.request_id = str3;
            this.request = controlRequestBody;
        }

        public /* synthetic */ ControlRequest(String str, String str2, String str3, ControlRequestBody controlRequestBody, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "control_request" : str, (i & 2) != 0 ? fng.a(StdinMessage.Companion) : str2, str3, controlRequestBody);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00068"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdinMessage$SdkUserMessage;", "Lcom/anthropic/claude/sessions/types/StdinMessage;", "", "type", "uuid", "Lcom/anthropic/claude/sessions/types/ApiUserMessage;", "message", "parent_tool_use_id", "", "Lcom/anthropic/claude/sessions/types/SessionFileAttachment;", "file_attachments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ApiUserMessage;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ApiUserMessage;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/StdinMessage$SdkUserMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/sessions/types/ApiUserMessage;", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ApiUserMessage;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/sessions/types/StdinMessage$SdkUserMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getUuid", "Lcom/anthropic/claude/sessions/types/ApiUserMessage;", "getMessage", "getParent_tool_use_id", "Ljava/util/List;", "getFile_attachments", "Companion", "com/anthropic/claude/sessions/types/p1", "com/anthropic/claude/sessions/types/q1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SdkUserMessage implements StdinMessage {
        private final List<SessionFileAttachment> file_attachments;
        private final ApiUserMessage message;
        private final String parent_tool_use_id;
        private final String type;
        private final String uuid;
        public static final q1 Companion = new q1();
        private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new y1g(18))};

        public /* synthetic */ SdkUserMessage(int i, String str, String str2, ApiUserMessage apiUserMessage, String str3, List list, vnf vnfVar) {
            if (6 != (i & 6)) {
                gvj.f(i, 6, p1.a.getDescriptor());
                throw null;
            }
            this.type = (i & 1) == 0 ? "user" : str;
            this.uuid = str2;
            this.message = apiUserMessage;
            if ((i & 8) == 0) {
                this.parent_tool_use_id = null;
            } else {
                this.parent_tool_use_id = str3;
            }
            if ((i & 16) == 0) {
                this.file_attachments = null;
            } else {
                this.file_attachments = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(orf.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SdkUserMessage copy$default(SdkUserMessage sdkUserMessage, String str, String str2, ApiUserMessage apiUserMessage, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sdkUserMessage.type;
            }
            if ((i & 2) != 0) {
                str2 = sdkUserMessage.uuid;
            }
            if ((i & 4) != 0) {
                apiUserMessage = sdkUserMessage.message;
            }
            if ((i & 8) != 0) {
                str3 = sdkUserMessage.parent_tool_use_id;
            }
            if ((i & 16) != 0) {
                list = sdkUserMessage.file_attachments;
            }
            List list2 = list;
            ApiUserMessage apiUserMessage2 = apiUserMessage;
            return sdkUserMessage.copy(str, str2, apiUserMessage2, str3, list2);
        }

        public static final /* synthetic */ void write$Self$sessions(SdkUserMessage self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || !x44.r(self.getType(), "user")) {
                output.q(serialDesc, 0, self.getType());
            }
            output.q(serialDesc, 1, self.getUuid());
            output.r(serialDesc, 2, sf0.a, self.message);
            if (output.E(serialDesc) || self.parent_tool_use_id != null) {
                output.B(serialDesc, 3, srg.a, self.parent_tool_use_id);
            }
            if (!output.E(serialDesc) && self.file_attachments == null) {
                return;
            }
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.file_attachments);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ApiUserMessage getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getParent_tool_use_id() {
            return this.parent_tool_use_id;
        }

        public final List<SessionFileAttachment> component5() {
            return this.file_attachments;
        }

        public final SdkUserMessage copy(String type, String uuid, ApiUserMessage message, String parent_tool_use_id, List<SessionFileAttachment> file_attachments) {
            type.getClass();
            uuid.getClass();
            message.getClass();
            return new SdkUserMessage(type, uuid, message, parent_tool_use_id, file_attachments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkUserMessage)) {
                return false;
            }
            SdkUserMessage sdkUserMessage = (SdkUserMessage) other;
            return x44.r(this.type, sdkUserMessage.type) && x44.r(this.uuid, sdkUserMessage.uuid) && x44.r(this.message, sdkUserMessage.message) && x44.r(this.parent_tool_use_id, sdkUserMessage.parent_tool_use_id) && x44.r(this.file_attachments, sdkUserMessage.file_attachments);
        }

        public final List<SessionFileAttachment> getFile_attachments() {
            return this.file_attachments;
        }

        public final ApiUserMessage getMessage() {
            return this.message;
        }

        public final String getParent_tool_use_id() {
            return this.parent_tool_use_id;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getType() {
            return this.type;
        }

        @Override // com.anthropic.claude.sessions.types.StdinMessage
        public String getUuid() {
            return this.uuid;
        }

        public int hashCode() {
            int iHashCode = (this.message.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.uuid)) * 31;
            String str = this.parent_tool_use_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<SessionFileAttachment> list = this.file_attachments;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.uuid;
            ApiUserMessage apiUserMessage = this.message;
            String str3 = this.parent_tool_use_id;
            List<SessionFileAttachment> list = this.file_attachments;
            StringBuilder sbR = kgh.r("SdkUserMessage(type=", str, ", uuid=", str2, ", message=");
            sbR.append(apiUserMessage);
            sbR.append(", parent_tool_use_id=");
            sbR.append(str3);
            sbR.append(", file_attachments=");
            return gid.q(sbR, list, ")");
        }

        public SdkUserMessage(String str, String str2, ApiUserMessage apiUserMessage, String str3, List<SessionFileAttachment> list) {
            str.getClass();
            str2.getClass();
            apiUserMessage.getClass();
            this.type = str;
            this.uuid = str2;
            this.message = apiUserMessage;
            this.parent_tool_use_id = str3;
            this.file_attachments = list;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ SdkUserMessage(java.lang.String r2, java.lang.String r3, com.anthropic.claude.sessions.types.ApiUserMessage r4, java.lang.String r5, java.util.List r6, int r7, defpackage.mq5 r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = "user"
            L6:
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto Lc
                r5 = r0
            Lc:
                r7 = r7 & 16
                if (r7 == 0) goto L17
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L1d
            L17:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L1d:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.StdinMessage.SdkUserMessage.<init>(java.lang.String, java.lang.String, com.anthropic.claude.sessions.types.ApiUserMessage, java.lang.String, java.util.List, int, mq5):void");
        }
    }
}
