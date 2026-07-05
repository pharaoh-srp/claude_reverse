package com.anthropic.claude.api.chat.messages;

import defpackage.bc9;
import defpackage.dhb;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pm1;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;Bs\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J|\u0010'\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b6\u0010#R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010&¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/BellNoteBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "text", "title", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/BellNoteBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/BellNoteBlock;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/lang/String;", "getText", "getTitle", "Ljava/util/Set;", "getFlags", "Companion", "om1", "pm1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BellNoteBlock implements ContentBlock {
    public static final int $stable = 0;
    private final Set<MessageFlag> flags;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    private final String text;
    private final String title;
    public static final pm1 Companion = new pm1();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new ll1(5))};

    public /* synthetic */ BellNoteBlock(int i, Date date, Date date2, String str, String str2, Set set, vnf vnfVar) {
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
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str2;
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
    public static /* synthetic */ BellNoteBlock copy$default(BellNoteBlock bellNoteBlock, Date date, Date date2, String str, String str2, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            date = bellNoteBlock.start_timestamp;
        }
        if ((i & 2) != 0) {
            date2 = bellNoteBlock.stop_timestamp;
        }
        if ((i & 4) != 0) {
            str = bellNoteBlock.text;
        }
        if ((i & 8) != 0) {
            str2 = bellNoteBlock.title;
        }
        if ((i & 16) != 0) {
            set = bellNoteBlock.flags;
        }
        Set set2 = set;
        String str3 = str;
        return bellNoteBlock.copy(date, date2, str3, str2, set2);
    }

    public static final /* synthetic */ void write$Self$api(BellNoteBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        if (output.E(serialDesc) || self.text != null) {
            output.B(serialDesc, 2, srg.a, self.text);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 3, srg.a, self.title);
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
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Set<MessageFlag> component5() {
        return this.flags;
    }

    public final BellNoteBlock copy(Date start_timestamp, Date stop_timestamp, String text, String title, Set<? extends MessageFlag> flags) {
        return new BellNoteBlock(start_timestamp, stop_timestamp, text, title, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BellNoteBlock)) {
            return false;
        }
        BellNoteBlock bellNoteBlock = (BellNoteBlock) other;
        return x44.r(this.start_timestamp, bellNoteBlock.start_timestamp) && x44.r(this.stop_timestamp, bellNoteBlock.stop_timestamp) && x44.r(this.text, bellNoteBlock.text) && x44.r(this.title, bellNoteBlock.title) && x44.r(this.flags, bellNoteBlock.flags);
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

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Date date = this.start_timestamp;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.stop_timestamp;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode4 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        Date date = this.start_timestamp;
        Date date2 = this.stop_timestamp;
        String str = this.text;
        String str2 = this.title;
        Set<MessageFlag> set = this.flags;
        StringBuilder sb = new StringBuilder("BellNoteBlock(start_timestamp=");
        sb.append(date);
        sb.append(", stop_timestamp=");
        sb.append(date2);
        sb.append(", text=");
        kgh.u(sb, str, ", title=", str2, ", flags=");
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    public BellNoteBlock() {
        this((Date) null, (Date) null, (String) null, (String) null, (Set) null, 31, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BellNoteBlock(Date date, Date date2, String str, String str2, Set<? extends MessageFlag> set) {
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.text = str;
        this.title = str2;
        this.flags = set;
    }

    public /* synthetic */ BellNoteBlock(Date date, Date date2, String str, String str2, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : set);
    }
}
