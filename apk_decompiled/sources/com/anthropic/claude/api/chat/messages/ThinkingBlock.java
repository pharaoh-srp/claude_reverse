package com.anthropic.claude.api.chat.messages;

import defpackage.bc9;
import defpackage.dhb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mmh;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.qy1;
import defpackage.tlh;
import defpackage.ulh;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?Bm\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012BY\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)Jz\u0010*\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R-\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010'R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010)¨\u0006@"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ThinkingBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "thinking", "", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "summaries", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ThinkingBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/ThinkingBlock;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/lang/String;", "getThinking", "Ljava/util/List;", "getSummaries", "Ljava/util/Set;", "getFlags", "Companion", "tlh", "ulh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThinkingBlock implements ContentBlock {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ulh Companion = new ulh();
    private final Set<MessageFlag> flags;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    private final List<ThinkingSummary> summaries;
    private final String thinking;

    static {
        nlh nlhVar = new nlh(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, nlhVar), yb5.w(w1aVar, new nlh(2))};
    }

    public /* synthetic */ ThinkingBlock(int i, Date date, Date date2, String str, List list, Set set, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, tlh.a.getDescriptor());
            throw null;
        }
        this.start_timestamp = date;
        if ((i & 2) == 0) {
            this.stop_timestamp = null;
        } else {
            this.stop_timestamp = date2;
        }
        this.thinking = str;
        if ((i & 8) == 0) {
            this.summaries = lm6.E;
        } else {
            this.summaries = list;
        }
        if ((i & 16) == 0) {
            this.flags = null;
        } else {
            this.flags = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(mmh.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(dhb.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThinkingBlock copy$default(ThinkingBlock thinkingBlock, Date date, Date date2, String str, List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            date = thinkingBlock.start_timestamp;
        }
        if ((i & 2) != 0) {
            date2 = thinkingBlock.stop_timestamp;
        }
        if ((i & 4) != 0) {
            str = thinkingBlock.thinking;
        }
        if ((i & 8) != 0) {
            list = thinkingBlock.summaries;
        }
        if ((i & 16) != 0) {
            set = thinkingBlock.flags;
        }
        Set set2 = set;
        String str2 = str;
        return thinkingBlock.copy(date, date2, str2, list, set2);
    }

    public static final /* synthetic */ void write$Self$api(ThinkingBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 0, bc9Var, self.getStart_timestamp());
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9Var, self.getStop_timestamp());
        }
        output.q(serialDesc, 2, self.thinking);
        if (output.E(serialDesc) || !x44.r(self.summaries, lm6.E)) {
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.summaries);
        }
        if (!output.E(serialDesc) && self.getFlags() == null) {
            return;
        }
        output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.getFlags());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStart_timestamp() {
        return this.start_timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThinking() {
        return this.thinking;
    }

    public final List<ThinkingSummary> component4() {
        return this.summaries;
    }

    public final Set<MessageFlag> component5() {
        return this.flags;
    }

    public final ThinkingBlock copy(Date start_timestamp, Date stop_timestamp, String thinking, List<ThinkingSummary> summaries, Set<? extends MessageFlag> flags) {
        start_timestamp.getClass();
        thinking.getClass();
        summaries.getClass();
        return new ThinkingBlock(start_timestamp, stop_timestamp, thinking, summaries, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThinkingBlock)) {
            return false;
        }
        ThinkingBlock thinkingBlock = (ThinkingBlock) other;
        return x44.r(this.start_timestamp, thinkingBlock.start_timestamp) && x44.r(this.stop_timestamp, thinkingBlock.stop_timestamp) && x44.r(this.thinking, thinkingBlock.thinking) && x44.r(this.summaries, thinkingBlock.summaries) && x44.r(this.flags, thinkingBlock.flags);
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Set<MessageFlag> getFlags() {
        return this.flags;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStart_timestamp() {
        return this.start_timestamp;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public final List<ThinkingSummary> getSummaries() {
        return this.summaries;
    }

    public final String getThinking() {
        return this.thinking;
    }

    public int hashCode() {
        int iHashCode = this.start_timestamp.hashCode() * 31;
        Date date = this.stop_timestamp;
        int iM = kgh.m(kgh.l((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.thinking), 31, this.summaries);
        Set<MessageFlag> set = this.flags;
        return iM + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        Date date = this.start_timestamp;
        Date date2 = this.stop_timestamp;
        String str = this.thinking;
        List<ThinkingSummary> list = this.summaries;
        Set<MessageFlag> set = this.flags;
        StringBuilder sb = new StringBuilder("ThinkingBlock(start_timestamp=");
        sb.append(date);
        sb.append(", stop_timestamp=");
        sb.append(date2);
        sb.append(", thinking=");
        qy1.p(str, ", summaries=", ", flags=", sb, list);
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThinkingBlock(Date date, Date date2, String str, List<ThinkingSummary> list, Set<? extends MessageFlag> set) {
        date.getClass();
        str.getClass();
        list.getClass();
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.thinking = str;
        this.summaries = list;
        this.flags = set;
    }

    public /* synthetic */ ThinkingBlock(Date date, Date date2, String str, List list, Set set, int i, mq5 mq5Var) {
        this(date, (i & 2) != 0 ? null : date2, str, (i & 8) != 0 ? lm6.E : list, (i & 16) != 0 ? null : set);
    }
}
