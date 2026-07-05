package com.anthropic.claude.api.chat.messages;

import defpackage.bc9;
import defpackage.dhb;
import defpackage.kdi;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oei;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B[\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rB?\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jd\u0010!\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001dR1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001dR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/UnknownContentBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/UnknownContentBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/UnknownContentBlock;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/util/Set;", "getFlags", "Companion", "nei", "oei", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UnknownContentBlock implements ContentBlock {
    public static final int $stable = 0;
    private final Set<MessageFlag> flags;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    public static final oei Companion = new oei();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new kdi(4))};

    public /* synthetic */ UnknownContentBlock(int i, Date date, Date date2, Set set, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.start_timestamp = null;
        } else {
            this.start_timestamp = date;
        }
        if ((i & 2) == 0) {
            this.stop_timestamp = null;
        } else {
            this.stop_timestamp = date2;
        }
        if ((i & 4) == 0) {
            this.flags = null;
        } else {
            this.flags = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(dhb.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnknownContentBlock copy$default(UnknownContentBlock unknownContentBlock, Date date, Date date2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            date = unknownContentBlock.start_timestamp;
        }
        if ((i & 2) != 0) {
            date2 = unknownContentBlock.stop_timestamp;
        }
        if ((i & 4) != 0) {
            set = unknownContentBlock.flags;
        }
        return unknownContentBlock.copy(date, date2, set);
    }

    public static final /* synthetic */ void write$Self$api(UnknownContentBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        if (!output.E(serialDesc) && self.getFlags() == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.getFlags());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStart_timestamp() {
        return this.start_timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getStop_timestamp() {
        return this.stop_timestamp;
    }

    public final Set<MessageFlag> component3() {
        return this.flags;
    }

    public final UnknownContentBlock copy(Date start_timestamp, Date stop_timestamp, Set<? extends MessageFlag> flags) {
        return new UnknownContentBlock(start_timestamp, stop_timestamp, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownContentBlock)) {
            return false;
        }
        UnknownContentBlock unknownContentBlock = (UnknownContentBlock) other;
        return x44.r(this.start_timestamp, unknownContentBlock.start_timestamp) && x44.r(this.stop_timestamp, unknownContentBlock.stop_timestamp) && x44.r(this.flags, unknownContentBlock.flags);
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

    public int hashCode() {
        Date date = this.start_timestamp;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.stop_timestamp;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "UnknownContentBlock(start_timestamp=" + this.start_timestamp + ", stop_timestamp=" + this.stop_timestamp + ", flags=" + this.flags + ")";
    }

    public UnknownContentBlock() {
        this((Date) null, (Date) null, (Set) null, 7, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnknownContentBlock(Date date, Date date2, Set<? extends MessageFlag> set) {
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.flags = set;
    }

    public /* synthetic */ UnknownContentBlock(Date date, Date date2, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, (i & 4) != 0 ? null : set);
    }
}
