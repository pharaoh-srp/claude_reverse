package com.anthropic.claude.api.chat.messages;

import defpackage.an7;
import defpackage.bc9;
import defpackage.bn7;
import defpackage.dhb;
import defpackage.ef0;
import defpackage.gvj;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?Bo\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'Jz\u0010(\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010%R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010'¨\u0006@"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/FlagBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flag", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "helpline", "", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/FlagBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "component3", "()Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "component4", "()Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "component5", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/FlagBlock;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "getFlag", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "getHelpline", "Ljava/util/Set;", "getFlags", "Companion", "an7", "bn7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FlagBlock implements ContentBlock {
    public static final int $stable = 0;
    private final MessageFlag flag;
    private final Set<MessageFlag> flags;
    private final ApiHelpline helpline;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    public static final bn7 Companion = new bn7();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new jd7(4))};

    public /* synthetic */ FlagBlock(int i, Date date, Date date2, MessageFlag messageFlag, ApiHelpline apiHelpline, Set set, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, an7.a.getDescriptor());
            throw null;
        }
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
        this.flag = messageFlag;
        if ((i & 8) == 0) {
            this.helpline = null;
        } else {
            this.helpline = apiHelpline;
        }
        if ((i & 16) == 0) {
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
    public static /* synthetic */ FlagBlock copy$default(FlagBlock flagBlock, Date date, Date date2, MessageFlag messageFlag, ApiHelpline apiHelpline, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            date = flagBlock.start_timestamp;
        }
        if ((i & 2) != 0) {
            date2 = flagBlock.stop_timestamp;
        }
        if ((i & 4) != 0) {
            messageFlag = flagBlock.flag;
        }
        if ((i & 8) != 0) {
            apiHelpline = flagBlock.helpline;
        }
        if ((i & 16) != 0) {
            set = flagBlock.flags;
        }
        Set set2 = set;
        MessageFlag messageFlag2 = messageFlag;
        return flagBlock.copy(date, date2, messageFlag2, apiHelpline, set2);
    }

    public static final /* synthetic */ void write$Self$api(FlagBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        output.r(serialDesc, 2, dhb.a, self.flag);
        if (output.E(serialDesc) || self.helpline != null) {
            output.B(serialDesc, 3, ef0.a, self.helpline);
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
    public final MessageFlag getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ApiHelpline getHelpline() {
        return this.helpline;
    }

    public final Set<MessageFlag> component5() {
        return this.flags;
    }

    public final FlagBlock copy(Date start_timestamp, Date stop_timestamp, MessageFlag flag, ApiHelpline helpline, Set<? extends MessageFlag> flags) {
        flag.getClass();
        return new FlagBlock(start_timestamp, stop_timestamp, flag, helpline, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagBlock)) {
            return false;
        }
        FlagBlock flagBlock = (FlagBlock) other;
        return x44.r(this.start_timestamp, flagBlock.start_timestamp) && x44.r(this.stop_timestamp, flagBlock.stop_timestamp) && x44.r(this.flag, flagBlock.flag) && x44.r(this.helpline, flagBlock.helpline) && x44.r(this.flags, flagBlock.flags);
    }

    public final MessageFlag getFlag() {
        return this.flag;
    }

    @Override // com.anthropic.claude.api.chat.messages.ContentBlock
    public Set<MessageFlag> getFlags() {
        return this.flags;
    }

    public final ApiHelpline getHelpline() {
        return this.helpline;
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
        int iHashCode2 = (this.flag.hashCode() + ((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31)) * 31;
        ApiHelpline apiHelpline = this.helpline;
        int iHashCode3 = (iHashCode2 + (apiHelpline == null ? 0 : apiHelpline.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "FlagBlock(start_timestamp=" + this.start_timestamp + ", stop_timestamp=" + this.stop_timestamp + ", flag=" + this.flag + ", helpline=" + this.helpline + ", flags=" + this.flags + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlagBlock(Date date, Date date2, MessageFlag messageFlag, ApiHelpline apiHelpline, Set<? extends MessageFlag> set) {
        messageFlag.getClass();
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.flag = messageFlag;
        this.helpline = apiHelpline;
        this.flags = set;
    }

    public /* synthetic */ FlagBlock(Date date, Date date2, MessageFlag messageFlag, ApiHelpline apiHelpline, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, messageFlag, (i & 8) != 0 ? null : apiHelpline, (i & 16) != 0 ? null : set);
    }
}
