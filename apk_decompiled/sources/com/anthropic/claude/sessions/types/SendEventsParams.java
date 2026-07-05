package com.anthropic.claude.sessions.types;

import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.okf;
import defpackage.onf;
import defpackage.srg;
import defpackage.ucf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/SendEventsParams;", "", "", "", "events", "checkpoint_id", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SendEventsParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SendEventsParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEvents", "Ljava/lang/String;", "getCheckpoint_id", "Companion", "nkf", "okf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendEventsParams {
    private final String checkpoint_id;
    private final List<String> events;
    public static final okf Companion = new okf();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ucf(9)), null};

    public /* synthetic */ SendEventsParams(int i, List list, String str, vnf vnfVar) {
        this.events = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.checkpoint_id = null;
        } else {
            this.checkpoint_id = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendEventsParams copy$default(SendEventsParams sendEventsParams, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sendEventsParams.events;
        }
        if ((i & 2) != 0) {
            str = sendEventsParams.checkpoint_id;
        }
        return sendEventsParams.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$sessions(SendEventsParams self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.events, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.events);
        }
        if (!output.E(serialDesc) && self.checkpoint_id == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.checkpoint_id);
    }

    public final List<String> component1() {
        return this.events;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckpoint_id() {
        return this.checkpoint_id;
    }

    public final SendEventsParams copy(List<String> events, String checkpoint_id) {
        events.getClass();
        return new SendEventsParams(events, checkpoint_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEventsParams)) {
            return false;
        }
        SendEventsParams sendEventsParams = (SendEventsParams) other;
        return x44.r(this.events, sendEventsParams.events) && x44.r(this.checkpoint_id, sendEventsParams.checkpoint_id);
    }

    public final String getCheckpoint_id() {
        return this.checkpoint_id;
    }

    public final List<String> getEvents() {
        return this.events;
    }

    public int hashCode() {
        int iHashCode = this.events.hashCode() * 31;
        String str = this.checkpoint_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SendEventsParams(events=" + this.events + ", checkpoint_id=" + this.checkpoint_id + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendEventsParams() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public SendEventsParams(List<String> list, String str) {
        list.getClass();
        this.events = list;
        this.checkpoint_id = str;
    }

    public /* synthetic */ SendEventsParams(List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : str);
    }
}
