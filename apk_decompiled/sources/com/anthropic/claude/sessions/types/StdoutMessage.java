package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.cq4;
import defpackage.fbf;
import defpackage.gng;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdoutMessage;", "", "", "getKind", "()Ljava/lang/String;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "Companion", "SdkMessage", "ControlResponse", "Unknown", "gng", "Lcom/anthropic/claude/sessions/types/StdoutMessage$ControlResponse;", "Lcom/anthropic/claude/sessions/types/StdoutMessage$SdkMessage;", "Lcom/anthropic/claude/sessions/types/StdoutMessage$Unknown;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = x1.class)
public interface StdoutMessage {
    public static final gng Companion = gng.a;

    String getKind();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdoutMessage$Unknown;", "Lcom/anthropic/claude/sessions/types/StdoutMessage;", "", VerifyResponse.AuthenticationState.DISCRIMINATOR, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/StdoutMessage$Unknown;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKind", "Companion", "com/anthropic/claude/sessions/types/w1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf(with = y1.class)
    public static final /* data */ class Unknown implements StdoutMessage {
        public static final w1 Companion = new w1();
        private final String kind;

        public /* synthetic */ Unknown(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "unknown" : str);
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.kind;
            }
            return unknown.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        public final Unknown copy(String kind) {
            kind.getClass();
            return new Unknown(kind);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && x44.r(this.kind, ((Unknown) other).kind);
        }

        @Override // com.anthropic.claude.sessions.types.StdoutMessage
        public String getKind() {
            return this.kind;
        }

        public int hashCode() {
            return this.kind.hashCode();
        }

        public String toString() {
            return ij0.j("Unknown(kind=", this.kind, ")");
        }

        public Unknown(String str) {
            str.getClass();
            this.kind = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdoutMessage$ControlResponse;", "Lcom/anthropic/claude/sessions/types/StdoutMessage;", "", VerifyResponse.AuthenticationState.DISCRIMINATOR, "Lcom/anthropic/claude/sessions/types/ControlResponseData;", "response", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/StdoutMessage$ControlResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/ControlResponseData;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ControlResponseData;)Lcom/anthropic/claude/sessions/types/StdoutMessage$ControlResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKind", "Lcom/anthropic/claude/sessions/types/ControlResponseData;", "getResponse", "Companion", "com/anthropic/claude/sessions/types/s1", "com/anthropic/claude/sessions/types/t1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ControlResponse implements StdoutMessage {
        public static final t1 Companion = new t1();
        private final String kind;
        private final ControlResponseData response;

        public /* synthetic */ ControlResponse(int i, String str, ControlResponseData controlResponseData, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, s1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.kind = "control_response";
            } else {
                this.kind = str;
            }
            this.response = controlResponseData;
        }

        public static /* synthetic */ ControlResponse copy$default(ControlResponse controlResponse, String str, ControlResponseData controlResponseData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = controlResponse.kind;
            }
            if ((i & 2) != 0) {
                controlResponseData = controlResponse.response;
            }
            return controlResponse.copy(str, controlResponseData);
        }

        public static final /* synthetic */ void write$Self$sessions(ControlResponse self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getKind(), "control_response")) {
                output.q(serialDesc, 0, self.getKind());
            }
            output.r(serialDesc, 1, cq4.a, self.response);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ControlResponseData getResponse() {
            return this.response;
        }

        public final ControlResponse copy(String kind, ControlResponseData response) {
            kind.getClass();
            response.getClass();
            return new ControlResponse(kind, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ControlResponse)) {
                return false;
            }
            ControlResponse controlResponse = (ControlResponse) other;
            return x44.r(this.kind, controlResponse.kind) && x44.r(this.response, controlResponse.response);
        }

        @Override // com.anthropic.claude.sessions.types.StdoutMessage
        public String getKind() {
            return this.kind;
        }

        public final ControlResponseData getResponse() {
            return this.response;
        }

        public int hashCode() {
            return this.response.hashCode() + (this.kind.hashCode() * 31);
        }

        public String toString() {
            return "ControlResponse(kind=" + this.kind + ", response=" + this.response + ")";
        }

        public ControlResponse(String str, ControlResponseData controlResponseData) {
            str.getClass();
            controlResponseData.getClass();
            this.kind = str;
            this.response = controlResponseData;
        }

        public /* synthetic */ ControlResponse(String str, ControlResponseData controlResponseData, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "control_response" : str, controlResponseData);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/StdoutMessage$SdkMessage;", "Lcom/anthropic/claude/sessions/types/StdoutMessage;", "", VerifyResponse.AuthenticationState.DISCRIMINATOR, "Lcom/anthropic/claude/sessions/types/SdkEvent;", "message", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkEvent;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/SdkEvent;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/StdoutMessage$SdkMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/SdkEvent;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkEvent;)Lcom/anthropic/claude/sessions/types/StdoutMessage$SdkMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKind", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "getMessage", "Companion", "com/anthropic/claude/sessions/types/u1", "com/anthropic/claude/sessions/types/v1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SdkMessage implements StdoutMessage {
        public static final v1 Companion = new v1();
        private final String kind;
        private final SdkEvent message;

        public /* synthetic */ SdkMessage(int i, String str, SdkEvent sdkEvent, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, u1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.kind = "sdk_message";
            } else {
                this.kind = str;
            }
            this.message = sdkEvent;
        }

        public static /* synthetic */ SdkMessage copy$default(SdkMessage sdkMessage, String str, SdkEvent sdkEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sdkMessage.kind;
            }
            if ((i & 2) != 0) {
                sdkEvent = sdkMessage.message;
            }
            return sdkMessage.copy(str, sdkEvent);
        }

        public static final /* synthetic */ void write$Self$sessions(SdkMessage self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getKind(), "sdk_message")) {
                output.q(serialDesc, 0, self.getKind());
            }
            output.r(serialDesc, 1, fbf.c, self.message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SdkEvent getMessage() {
            return this.message;
        }

        public final SdkMessage copy(String kind, SdkEvent message) {
            kind.getClass();
            message.getClass();
            return new SdkMessage(kind, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SdkMessage)) {
                return false;
            }
            SdkMessage sdkMessage = (SdkMessage) other;
            return x44.r(this.kind, sdkMessage.kind) && x44.r(this.message, sdkMessage.message);
        }

        @Override // com.anthropic.claude.sessions.types.StdoutMessage
        public String getKind() {
            return this.kind;
        }

        public final SdkEvent getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.kind.hashCode() * 31);
        }

        public String toString() {
            return "SdkMessage(kind=" + this.kind + ", message=" + this.message + ")";
        }

        public SdkMessage(String str, SdkEvent sdkEvent) {
            str.getClass();
            sdkEvent.getClass();
            this.kind = str;
            this.message = sdkEvent;
        }

        public /* synthetic */ SdkMessage(String str, SdkEvent sdkEvent, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "sdk_message" : str, sdkEvent);
        }
    }
}
