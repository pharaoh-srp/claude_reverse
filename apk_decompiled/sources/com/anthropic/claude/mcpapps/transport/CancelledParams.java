package com.anthropic.claude.mcpapps.transport;

import defpackage.db2;
import defpackage.eb2;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yh9;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0017\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/CancelledParams;", "", "Lkotlinx/serialization/json/JsonPrimitive;", "Lcom/anthropic/claude/mcpapps/transport/RequestId;", "requestId", "", "reason", "<init>", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/CancelledParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonPrimitive;", "component2", "()Ljava/lang/String;", "copy", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;)Lcom/anthropic/claude/mcpapps/transport/CancelledParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonPrimitive;", "getRequestId", "Ljava/lang/String;", "getReason", "Companion", "db2", "eb2", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CancelledParams {
    public static final int $stable = 8;
    public static final eb2 Companion = new eb2();
    private final String reason;
    private final JsonPrimitive requestId;

    public /* synthetic */ CancelledParams(int i, JsonPrimitive jsonPrimitive, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, db2.a.getDescriptor());
            throw null;
        }
        this.requestId = jsonPrimitive;
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str;
        }
    }

    public static /* synthetic */ CancelledParams copy$default(CancelledParams cancelledParams, JsonPrimitive jsonPrimitive, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonPrimitive = cancelledParams.requestId;
        }
        if ((i & 2) != 0) {
            str = cancelledParams.reason;
        }
        return cancelledParams.copy(jsonPrimitive, str);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(CancelledParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, yh9.a, self.requestId);
        if (!output.E(serialDesc) && self.reason == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonPrimitive getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final CancelledParams copy(JsonPrimitive requestId, String reason) {
        requestId.getClass();
        return new CancelledParams(requestId, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelledParams)) {
            return false;
        }
        CancelledParams cancelledParams = (CancelledParams) other;
        return x44.r(this.requestId, cancelledParams.requestId) && x44.r(this.reason, cancelledParams.reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public final JsonPrimitive getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int iHashCode = this.requestId.hashCode() * 31;
        String str = this.reason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CancelledParams(requestId=" + this.requestId + ", reason=" + this.reason + ")";
    }

    public CancelledParams(JsonPrimitive jsonPrimitive, String str) {
        jsonPrimitive.getClass();
        this.requestId = jsonPrimitive;
        this.reason = str;
    }

    public /* synthetic */ CancelledParams(JsonPrimitive jsonPrimitive, String str, int i, mq5 mq5Var) {
        this(jsonPrimitive, (i & 2) != 0 ? null : str);
    }
}
