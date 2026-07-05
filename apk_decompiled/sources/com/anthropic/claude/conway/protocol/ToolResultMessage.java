package com.anthropic.claude.conway.protocol;

import defpackage.eh9;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yyh;
import defpackage.zyh;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b3\u0010\u001b¨\u00067"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ToolResultMessage;", "", "", "type", "requestId", "", "success", "Lkotlinx/serialization/json/JsonElement;", "result", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ToolResultMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lkotlinx/serialization/json/JsonElement;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ToolResultMessage;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getRequestId", "getRequestId$annotations", "()V", "Z", "getSuccess", "Lkotlinx/serialization/json/JsonElement;", "getResult", "getError", "Companion", "yyh", "zyh", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolResultMessage {
    public static final int $stable = 8;
    public static final zyh Companion = new zyh();
    private final String error;
    private final String requestId;
    private final JsonElement result;
    private final boolean success;
    private final String type;

    public /* synthetic */ ToolResultMessage(int i, String str, String str2, boolean z, JsonElement jsonElement, String str3, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, yyh.a.getDescriptor());
            throw null;
        }
        this.type = (i & 1) == 0 ? "tool_result" : str;
        this.requestId = str2;
        this.success = z;
        if ((i & 8) == 0) {
            this.result = null;
        } else {
            this.result = jsonElement;
        }
        if ((i & 16) == 0) {
            this.error = null;
        } else {
            this.error = str3;
        }
    }

    public static /* synthetic */ ToolResultMessage copy$default(ToolResultMessage toolResultMessage, String str, String str2, boolean z, JsonElement jsonElement, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolResultMessage.type;
        }
        if ((i & 2) != 0) {
            str2 = toolResultMessage.requestId;
        }
        if ((i & 4) != 0) {
            z = toolResultMessage.success;
        }
        if ((i & 8) != 0) {
            jsonElement = toolResultMessage.result;
        }
        if ((i & 16) != 0) {
            str3 = toolResultMessage.error;
        }
        String str4 = str3;
        boolean z2 = z;
        return toolResultMessage.copy(str, str2, z2, jsonElement, str4);
    }

    public static /* synthetic */ void getRequestId$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ToolResultMessage self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.type, "tool_result")) {
            output.q(serialDesc, 0, self.type);
        }
        output.q(serialDesc, 1, self.requestId);
        output.p(serialDesc, 2, self.success);
        if (output.E(serialDesc) || self.result != null) {
            output.B(serialDesc, 3, eh9.a, self.result);
        }
        if (!output.E(serialDesc) && self.error == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.error);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonElement getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ToolResultMessage copy(String type, String requestId, boolean success, JsonElement result, String error) {
        type.getClass();
        requestId.getClass();
        return new ToolResultMessage(type, requestId, success, result, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToolResultMessage)) {
            return false;
        }
        ToolResultMessage toolResultMessage = (ToolResultMessage) other;
        return x44.r(this.type, toolResultMessage.type) && x44.r(this.requestId, toolResultMessage.requestId) && this.success == toolResultMessage.success && x44.r(this.result, toolResultMessage.result) && x44.r(this.error, toolResultMessage.error);
    }

    public final String getError() {
        return this.error;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final JsonElement getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iP = fsh.p(kgh.l(this.type.hashCode() * 31, 31, this.requestId), 31, this.success);
        JsonElement jsonElement = this.result;
        int iHashCode = (iP + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        String str = this.error;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.requestId;
        boolean z = this.success;
        JsonElement jsonElement = this.result;
        String str3 = this.error;
        StringBuilder sbR = kgh.r("ToolResultMessage(type=", str, ", requestId=", str2, ", success=");
        sbR.append(z);
        sbR.append(", result=");
        sbR.append(jsonElement);
        sbR.append(", error=");
        return ij0.m(sbR, str3, ")");
    }

    public ToolResultMessage(String str, String str2, boolean z, JsonElement jsonElement, String str3) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.requestId = str2;
        this.success = z;
        this.result = jsonElement;
        this.error = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ToolResultMessage(java.lang.String r2, java.lang.String r3, boolean r4, kotlinx.serialization.json.JsonElement r5, java.lang.String r6, int r7, defpackage.mq5 r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = "tool_result"
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
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.ToolResultMessage.<init>(java.lang.String, java.lang.String, boolean, kotlinx.serialization.json.JsonElement, java.lang.String, int, mq5):void");
    }
}
