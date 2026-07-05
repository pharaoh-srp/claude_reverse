package com.anthropic.claude.api.chat.messages;

import defpackage.e79;
import defpackage.gn4;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ContentBlockRetractEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "", "from_index", "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ContentBlockRetractEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/anthropic/claude/api/chat/messages/ContentBlockRetractEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getFrom_index", "Companion", "fn4", "gn4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContentBlockRetractEvent implements StreamEvent {
    public static final int $stable = 0;
    public static final gn4 Companion = new gn4();
    private final Integer from_index;

    public /* synthetic */ ContentBlockRetractEvent(int i, Integer num, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.from_index = null;
        } else {
            this.from_index = num;
        }
    }

    public static /* synthetic */ ContentBlockRetractEvent copy$default(ContentBlockRetractEvent contentBlockRetractEvent, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = contentBlockRetractEvent.from_index;
        }
        return contentBlockRetractEvent.copy(num);
    }

    public static final /* synthetic */ void write$Self$api(ContentBlockRetractEvent self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.from_index == null) {
            return;
        }
        output.B(serialDesc, 0, e79.a, self.from_index);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFrom_index() {
        return this.from_index;
    }

    public final ContentBlockRetractEvent copy(Integer from_index) {
        return new ContentBlockRetractEvent(from_index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentBlockRetractEvent) && x44.r(this.from_index, ((ContentBlockRetractEvent) other).from_index);
    }

    public final Integer getFrom_index() {
        return this.from_index;
    }

    public int hashCode() {
        Integer num = this.from_index;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "ContentBlockRetractEvent(from_index=" + this.from_index + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentBlockRetractEvent() {
        this((Integer) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ContentBlockRetractEvent(Integer num) {
        this.from_index = num;
    }

    public /* synthetic */ ContentBlockRetractEvent(Integer num, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num);
    }
}
