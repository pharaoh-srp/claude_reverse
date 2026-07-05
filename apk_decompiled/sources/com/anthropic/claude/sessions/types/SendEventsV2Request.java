package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rkf;
import defpackage.skf;
import defpackage.to3;
import defpackage.ucf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/SendEventsV2Request;", "", "", "session_id", "", "Lcom/anthropic/claude/sessions/types/ClientEventEnvelope;", "events", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SendEventsV2Request;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/sessions/types/SendEventsV2Request;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSession_id", "Ljava/util/List;", "getEvents", "Companion", "rkf", "skf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendEventsV2Request {
    private final List<ClientEventEnvelope> events;
    private final String session_id;
    public static final skf Companion = new skf();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ucf(11))};

    public /* synthetic */ SendEventsV2Request(int i, String str, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rkf.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        this.events = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(to3.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendEventsV2Request copy$default(SendEventsV2Request sendEventsV2Request, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendEventsV2Request.session_id;
        }
        if ((i & 2) != 0) {
            list = sendEventsV2Request.events;
        }
        return sendEventsV2Request.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$sessions(SendEventsV2Request self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.session_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.events);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    public final List<ClientEventEnvelope> component2() {
        return this.events;
    }

    public final SendEventsV2Request copy(String session_id, List<ClientEventEnvelope> events) {
        session_id.getClass();
        events.getClass();
        return new SendEventsV2Request(session_id, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEventsV2Request)) {
            return false;
        }
        SendEventsV2Request sendEventsV2Request = (SendEventsV2Request) other;
        return x44.r(this.session_id, sendEventsV2Request.session_id) && x44.r(this.events, sendEventsV2Request.events);
    }

    public final List<ClientEventEnvelope> getEvents() {
        return this.events;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return this.events.hashCode() + (this.session_id.hashCode() * 31);
    }

    public String toString() {
        return y6a.o("SendEventsV2Request(session_id=", this.session_id, ", events=", this.events, ")");
    }

    public SendEventsV2Request(String str, List<ClientEventEnvelope> list) {
        str.getClass();
        list.getClass();
        this.session_id = str;
        this.events = list;
    }
}
