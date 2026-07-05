package com.anthropic.claude.chat.parse;

import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.api.chat.messages.ThinkingSummary;
import defpackage.bc9;
import defpackage.blc;
import defpackage.dhb;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.jtc;
import defpackage.jz0;
import defpackage.kgh;
import defpackage.ktc;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mmh;
import defpackage.mq5;
import defpackage.mtc;
import defpackage.ntc;
import defpackage.onf;
import defpackage.qf8;
import defpackage.um6;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vf8;
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
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002PQBy\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0019\u0010\u000f\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u001d\u0010\u0010\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017Be\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0016\u0010\u001eJ#\u0010\u001f\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÂ\u0003¢\u0006\u0004\b\u001f\u0010 J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u00100J'\u00101\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b4\u00105J\u008a\u0001\u00106\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001b\b\u0002\u0010\u000f\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u001f\b\u0002\u0010\u0010\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b8\u0010.J\u0010\u00109\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010,R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u00100R'\u0010\u000f\u001a\u00150\nj\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR.\u0010\u0010\u001a\u0019\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u00103R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u00105R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010M\u001a\u0004\b\u001b\u0010N¨\u0006R"}, d2 = {"com/anthropic/claude/chat/parse/ParsedContentBlock$Thinking", "Lmtc;", "Lvf8;", "Lqf8;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "id", "", "body", "Ljz0;", "markdownRoot", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lpl9;", "startTimestamp", "endTimestamp", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "latestSummary", "", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flags", "<init>", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljz0;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;Ljava/util/Set;)V", "", "seen0", "", "isComplete", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;Ljava/util/Set;ZLvnf;)V", "component4", "()Ljava/util/Date;", "Lcom/anthropic/claude/chat/parse/ParsedContentBlock$Thinking;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlock$Thinking;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "component2", "()Ljava/lang/String;", "component3", "()Ljz0;", "component5", "component6", "()Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "component7", "()Ljava/util/Set;", "copy", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;Ljava/lang/String;Ljz0;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;Ljava/util/Set;)Lcom/anthropic/claude/chat/parse/ParsedContentBlock$Thinking;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "getId", "Ljava/lang/String;", "getBody", "Ljz0;", "getMarkdownRoot", "getMarkdownRoot$annotations", "()V", "Ljava/util/Date;", "getEndTimestamp", "Lcom/anthropic/claude/api/chat/messages/ThinkingSummary;", "getLatestSummary", "Ljava/util/Set;", "getFlags", "Z", "()Z", "Companion", "jtc", "ktc", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ParsedContentBlock$Thinking implements mtc, vf8, qf8 {
    public static final int $stable = 0;
    private final String body;
    private final Date endTimestamp;
    private final Set<MessageFlag> flags;
    private final ParsedContentBlockId id;
    private final boolean isComplete;
    private final ThinkingSummary latestSummary;
    private final jz0 markdownRoot;
    private final Date startTimestamp;
    public static final ktc Companion = new ktc();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new blc(7)), null};

    public /* synthetic */ ParsedContentBlock$Thinking(int i, ParsedContentBlockId parsedContentBlockId, String str, Date date, Date date2, ThinkingSummary thinkingSummary, Set set, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, jtc.a.getDescriptor());
            throw null;
        }
        this.id = parsedContentBlockId;
        this.body = str;
        this.markdownRoot = null;
        this.startTimestamp = date;
        this.endTimestamp = date2;
        if ((i & 16) == 0) {
            this.latestSummary = null;
        } else {
            this.latestSummary = thinkingSummary;
        }
        if ((i & 32) == 0) {
            this.flags = um6.E;
        } else {
            this.flags = set;
        }
        if ((i & 64) == 0) {
            this.isComplete = date2 != null;
        } else {
            this.isComplete = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(dhb.a, 1);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedContentBlock$Thinking copy$default(ParsedContentBlock$Thinking parsedContentBlock$Thinking, ParsedContentBlockId parsedContentBlockId, String str, jz0 jz0Var, Date date, Date date2, ThinkingSummary thinkingSummary, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            parsedContentBlockId = parsedContentBlock$Thinking.id;
        }
        if ((i & 2) != 0) {
            str = parsedContentBlock$Thinking.body;
        }
        if ((i & 4) != 0) {
            jz0Var = parsedContentBlock$Thinking.markdownRoot;
        }
        if ((i & 8) != 0) {
            date = parsedContentBlock$Thinking.startTimestamp;
        }
        if ((i & 16) != 0) {
            date2 = parsedContentBlock$Thinking.endTimestamp;
        }
        if ((i & 32) != 0) {
            thinkingSummary = parsedContentBlock$Thinking.latestSummary;
        }
        if ((i & 64) != 0) {
            set = parsedContentBlock$Thinking.flags;
        }
        ThinkingSummary thinkingSummary2 = thinkingSummary;
        Set set2 = set;
        Date date3 = date2;
        jz0 jz0Var2 = jz0Var;
        return parsedContentBlock$Thinking.copy(parsedContentBlockId, str, jz0Var2, date, date3, thinkingSummary2, set2);
    }

    public static /* synthetic */ void getMarkdownRoot$annotations() {
    }

    public static final /* synthetic */ void write$Self$Claude_chat_parse(ParsedContentBlock$Thinking self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, ntc.a, self.getId());
        output.q(serialDesc, 1, self.getBody());
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 2, bc9Var, self.startTimestamp);
        output.B(serialDesc, 3, bc9Var, self.endTimestamp);
        if (output.E(serialDesc) || self.latestSummary != null) {
            output.B(serialDesc, 4, mmh.a, self.latestSummary);
        }
        if (output.E(serialDesc) || !x44.r(self.flags, um6.E)) {
            output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.flags);
        }
        if (!output.E(serialDesc)) {
            if (self.getIsComplete() == (self.endTimestamp != null)) {
                return;
            }
        }
        output.p(serialDesc, 6, self.getIsComplete());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ParsedContentBlockId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final jz0 getMarkdownRoot() {
        return this.markdownRoot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ThinkingSummary getLatestSummary() {
        return this.latestSummary;
    }

    public final Set<MessageFlag> component7() {
        return this.flags;
    }

    public final ParsedContentBlock$Thinking copy(ParsedContentBlockId id, String body, jz0 markdownRoot, Date startTimestamp, Date endTimestamp, ThinkingSummary latestSummary, Set<? extends MessageFlag> flags) {
        id.getClass();
        body.getClass();
        startTimestamp.getClass();
        flags.getClass();
        return new ParsedContentBlock$Thinking(id, body, markdownRoot, startTimestamp, endTimestamp, latestSummary, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedContentBlock$Thinking)) {
            return false;
        }
        ParsedContentBlock$Thinking parsedContentBlock$Thinking = (ParsedContentBlock$Thinking) other;
        return x44.r(this.id, parsedContentBlock$Thinking.id) && x44.r(this.body, parsedContentBlock$Thinking.body) && x44.r(this.markdownRoot, parsedContentBlock$Thinking.markdownRoot) && x44.r(this.startTimestamp, parsedContentBlock$Thinking.startTimestamp) && x44.r(this.endTimestamp, parsedContentBlock$Thinking.endTimestamp) && x44.r(this.latestSummary, parsedContentBlock$Thinking.latestSummary) && x44.r(this.flags, parsedContentBlock$Thinking.flags);
    }

    @Override // defpackage.mtc
    public String getBody() {
        return this.body;
    }

    public final Date getEndTimestamp() {
        return this.endTimestamp;
    }

    public final Set<MessageFlag> getFlags() {
        return this.flags;
    }

    @Override // defpackage.vf8
    public ParsedContentBlockId getId() {
        return this.id;
    }

    public final ThinkingSummary getLatestSummary() {
        return this.latestSummary;
    }

    public final jz0 getMarkdownRoot() {
        return this.markdownRoot;
    }

    @Override // defpackage.mtc
    public /* bridge */ boolean hasSources() {
        return super.hasSources();
    }

    public int hashCode() {
        int iL = kgh.l(this.id.hashCode() * 31, 31, this.body);
        jz0 jz0Var = this.markdownRoot;
        int iJ = ebh.j(this.startTimestamp, (iL + (jz0Var == null ? 0 : jz0Var.hashCode())) * 31, 31);
        Date date = this.endTimestamp;
        int iHashCode = (iJ + (date == null ? 0 : date.hashCode())) * 31;
        ThinkingSummary thinkingSummary = this.latestSummary;
        return this.flags.hashCode() + ((iHashCode + (thinkingSummary != null ? thinkingSummary.hashCode() : 0)) * 31);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete, reason: from getter */
    public boolean getIsComplete() {
        return this.isComplete;
    }

    public String toString() {
        return "Thinking(id=" + this.id + ", body=" + this.body + ", markdownRoot=" + this.markdownRoot + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", latestSummary=" + this.latestSummary + ", flags=" + this.flags + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParsedContentBlock$Thinking(ParsedContentBlockId parsedContentBlockId, String str, jz0 jz0Var, Date date, Date date2, ThinkingSummary thinkingSummary, Set<? extends MessageFlag> set) {
        parsedContentBlockId.getClass();
        str.getClass();
        date.getClass();
        set.getClass();
        this.id = parsedContentBlockId;
        this.body = str;
        this.markdownRoot = jz0Var;
        this.startTimestamp = date;
        this.endTimestamp = date2;
        this.latestSummary = thinkingSummary;
        this.flags = set;
        this.isComplete = date2 != null;
    }

    public /* synthetic */ ParsedContentBlock$Thinking(ParsedContentBlockId parsedContentBlockId, String str, jz0 jz0Var, Date date, Date date2, ThinkingSummary thinkingSummary, Set set, int i, mq5 mq5Var) {
        this(parsedContentBlockId, str, (i & 4) != 0 ? null : jz0Var, date, date2, (i & 32) != 0 ? null : thinkingSummary, (i & 64) != 0 ? um6.E : set);
    }
}
