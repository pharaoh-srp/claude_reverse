package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.citation.Citation;
import defpackage.bc9;
import defpackage.dhb;
import defpackage.eg3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odh;
import defpackage.onf;
import defpackage.pdh;
import defpackage.qy1;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?Bu\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012BY\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0080\u0001\u0010*\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001f\b\u0002\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R1\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R1\u0010\b\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010'R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010)¨\u0006@"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/TextBlock;", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "start_timestamp", "stop_timestamp", "", "text", "", "Lcom/anthropic/claude/api/chat/citation/Citation;", "citations", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/TextBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "()Ljava/util/Set;", "copy", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/messages/TextBlock;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getStart_timestamp", "getStop_timestamp", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getCitations", "Ljava/util/Set;", "getFlags", "Companion", "odh", "pdh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TextBlock implements ContentBlock {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final pdh Companion = new pdh();
    private final List<Citation> citations;
    private final Set<MessageFlag> flags;
    private final Date start_timestamp;
    private final Date stop_timestamp;
    private final String text;

    static {
        wof wofVar = new wof(20);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, wofVar), yb5.w(w1aVar, new wof(21))};
    }

    public /* synthetic */ TextBlock(int i, Date date, Date date2, String str, List list, Set set, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, odh.a.getDescriptor());
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
        this.text = str;
        if ((i & 8) == 0) {
            this.citations = null;
        } else {
            this.citations = list;
        }
        if ((i & 16) == 0) {
            this.flags = null;
        } else {
            this.flags = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(eg3.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(dhb.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextBlock copy$default(TextBlock textBlock, Date date, Date date2, String str, List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            date = textBlock.start_timestamp;
        }
        if ((i & 2) != 0) {
            date2 = textBlock.stop_timestamp;
        }
        if ((i & 4) != 0) {
            str = textBlock.text;
        }
        if ((i & 8) != 0) {
            list = textBlock.citations;
        }
        if ((i & 16) != 0) {
            set = textBlock.flags;
        }
        Set set2 = set;
        String str2 = str;
        return textBlock.copy(date, date2, str2, list, set2);
    }

    public static final /* synthetic */ void write$Self$api(TextBlock self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.getStart_timestamp() != null) {
            output.B(serialDesc, 0, bc9.a, self.getStart_timestamp());
        }
        if (output.E(serialDesc) || self.getStop_timestamp() != null) {
            output.B(serialDesc, 1, bc9.a, self.getStop_timestamp());
        }
        output.q(serialDesc, 2, self.text);
        if (output.E(serialDesc) || self.citations != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.citations);
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

    public final List<Citation> component4() {
        return this.citations;
    }

    public final Set<MessageFlag> component5() {
        return this.flags;
    }

    public final TextBlock copy(Date start_timestamp, Date stop_timestamp, String text, List<Citation> citations, Set<? extends MessageFlag> flags) {
        text.getClass();
        return new TextBlock(start_timestamp, stop_timestamp, text, citations, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlock)) {
            return false;
        }
        TextBlock textBlock = (TextBlock) other;
        return x44.r(this.start_timestamp, textBlock.start_timestamp) && x44.r(this.stop_timestamp, textBlock.stop_timestamp) && x44.r(this.text, textBlock.text) && x44.r(this.citations, textBlock.citations) && x44.r(this.flags, textBlock.flags);
    }

    public final List<Citation> getCitations() {
        return this.citations;
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

    public int hashCode() {
        Date date = this.start_timestamp;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.stop_timestamp;
        int iL = kgh.l((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.text);
        List<Citation> list = this.citations;
        int iHashCode2 = (iL + (list == null ? 0 : list.hashCode())) * 31;
        Set<MessageFlag> set = this.flags;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        Date date = this.start_timestamp;
        Date date2 = this.stop_timestamp;
        String str = this.text;
        List<Citation> list = this.citations;
        Set<MessageFlag> set = this.flags;
        StringBuilder sb = new StringBuilder("TextBlock(start_timestamp=");
        sb.append(date);
        sb.append(", stop_timestamp=");
        sb.append(date2);
        sb.append(", text=");
        qy1.p(str, ", citations=", ", flags=", sb, list);
        sb.append(set);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextBlock(Date date, Date date2, String str, List<Citation> list, Set<? extends MessageFlag> set) {
        str.getClass();
        this.start_timestamp = date;
        this.stop_timestamp = date2;
        this.text = str;
        this.citations = list;
        this.flags = set;
    }

    public /* synthetic */ TextBlock(Date date, Date date2, String str, List list, Set set, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : set);
    }
}
