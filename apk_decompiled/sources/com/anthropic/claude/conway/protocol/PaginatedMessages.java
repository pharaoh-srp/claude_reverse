package com.anthropic.claude.conway.protocol;

import defpackage.blc;
import defpackage.fsh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.toc;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/PaginatedMessages;", "", "", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "messages", "", "hasMore", "", "oldestSeq", "<init>", "(Ljava/util/List;ZLjava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/Long;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/PaginatedMessages;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/Long;", "copy", "(Ljava/util/List;ZLjava/lang/Long;)Lcom/anthropic/claude/conway/protocol/PaginatedMessages;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Z", "getHasMore", "Ljava/lang/Long;", "getOldestSeq", "Companion", "soc", "toc", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PaginatedMessages {
    public static final int $stable = 8;
    private final boolean hasMore;
    private final List<RichMessage> messages;
    private final Long oldestSeq;
    public static final toc Companion = new toc();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new blc(2)), null, null};

    public /* synthetic */ PaginatedMessages(int i, List list, boolean z, Long l, vnf vnfVar) {
        this.messages = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.hasMore = false;
        } else {
            this.hasMore = z;
        }
        if ((i & 4) == 0) {
            this.oldestSeq = null;
        } else {
            this.oldestSeq = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(n0.c, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedMessages copy$default(PaginatedMessages paginatedMessages, List list, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paginatedMessages.messages;
        }
        if ((i & 2) != 0) {
            z = paginatedMessages.hasMore;
        }
        if ((i & 4) != 0) {
            l = paginatedMessages.oldestSeq;
        }
        return paginatedMessages.copy(list, z, l);
    }

    public static final /* synthetic */ void write$Self$conway(PaginatedMessages self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.messages, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.messages);
        }
        if (output.E(serialDesc) || self.hasMore) {
            output.p(serialDesc, 1, self.hasMore);
        }
        if (!output.E(serialDesc) && self.oldestSeq == null) {
            return;
        }
        output.B(serialDesc, 2, xka.a, self.oldestSeq);
    }

    public final List<RichMessage> component1() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getOldestSeq() {
        return this.oldestSeq;
    }

    public final PaginatedMessages copy(List<? extends RichMessage> messages, boolean hasMore, Long oldestSeq) {
        messages.getClass();
        return new PaginatedMessages(messages, hasMore, oldestSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedMessages)) {
            return false;
        }
        PaginatedMessages paginatedMessages = (PaginatedMessages) other;
        return x44.r(this.messages, paginatedMessages.messages) && this.hasMore == paginatedMessages.hasMore && x44.r(this.oldestSeq, paginatedMessages.oldestSeq);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<RichMessage> getMessages() {
        return this.messages;
    }

    public final Long getOldestSeq() {
        return this.oldestSeq;
    }

    public int hashCode() {
        int iP = fsh.p(this.messages.hashCode() * 31, 31, this.hasMore);
        Long l = this.oldestSeq;
        return iP + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "PaginatedMessages(messages=" + this.messages + ", hasMore=" + this.hasMore + ", oldestSeq=" + this.oldestSeq + ")";
    }

    public PaginatedMessages() {
        this((List) null, false, (Long) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaginatedMessages(List<? extends RichMessage> list, boolean z, Long l) {
        list.getClass();
        this.messages = list;
        this.hasMore = z;
        this.oldestSeq = l;
    }

    public /* synthetic */ PaginatedMessages(List list, boolean z, Long l, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : l);
    }
}
