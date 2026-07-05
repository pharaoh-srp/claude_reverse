package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wx2;
import defpackage.x44;
import defpackage.xq2;
import defpackage.xx2;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JD\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0014\u0010<\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010&¨\u0006@"}, d2 = {"com/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchSessionEnded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;", "entry_point", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;", "outcome", "", "total_time_ms", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;", "search_version", "", "search_version_str", "<init>", "(Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;JLcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;JLcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchSessionEnded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchSessionEnded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;", "component2", "()Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;", "component3", "()J", "component4", "()Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;", "component5", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;JLcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchSessionEnded;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchEntryPoint;", "getEntry_point", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchOutcome;", "getOutcome", "J", "getTotal_time_ms", "Lcom/anthropic/claude/analytics/events/ChatListEvents$ConversationSearchVersion;", "getSearch_version", "Ljava/lang/String;", "getSearch_version_str", "getEventName", "eventName", "Companion", "wx2", "xx2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatListEvents$ConversationSearchSessionEnded implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final xx2 Companion = new xx2();
    private final ChatListEvents$ConversationSearchEntryPoint entry_point;
    private final ChatListEvents$ConversationSearchOutcome outcome;
    private final ChatListEvents$ConversationSearchVersion search_version;
    private final String search_version_str;
    private final long total_time_ms;

    static {
        xq2 xq2Var = new xq2(18);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, xq2Var), yb5.w(w1aVar, new xq2(19)), null, yb5.w(w1aVar, new xq2(20)), null};
    }

    public /* synthetic */ ChatListEvents$ConversationSearchSessionEnded(int i, ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint, ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome, long j, ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion, String str, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, wx2.a.getDescriptor());
            throw null;
        }
        this.entry_point = chatListEvents$ConversationSearchEntryPoint;
        this.outcome = chatListEvents$ConversationSearchOutcome;
        this.total_time_ms = j;
        this.search_version = chatListEvents$ConversationSearchVersion;
        if ((i & 16) == 0) {
            this.search_version_str = null;
        } else {
            this.search_version_str = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatListEvents$ConversationSearchEntryPoint.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ChatListEvents$ConversationSearchOutcome.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ChatListEvents$ConversationSearchVersion.Companion.serializer();
    }

    public static /* synthetic */ ChatListEvents$ConversationSearchSessionEnded copy$default(ChatListEvents$ConversationSearchSessionEnded chatListEvents$ConversationSearchSessionEnded, ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint, ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome, long j, ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            chatListEvents$ConversationSearchEntryPoint = chatListEvents$ConversationSearchSessionEnded.entry_point;
        }
        if ((i & 2) != 0) {
            chatListEvents$ConversationSearchOutcome = chatListEvents$ConversationSearchSessionEnded.outcome;
        }
        if ((i & 4) != 0) {
            j = chatListEvents$ConversationSearchSessionEnded.total_time_ms;
        }
        if ((i & 8) != 0) {
            chatListEvents$ConversationSearchVersion = chatListEvents$ConversationSearchSessionEnded.search_version;
        }
        if ((i & 16) != 0) {
            str = chatListEvents$ConversationSearchSessionEnded.search_version_str;
        }
        long j2 = j;
        return chatListEvents$ConversationSearchSessionEnded.copy(chatListEvents$ConversationSearchEntryPoint, chatListEvents$ConversationSearchOutcome, j2, chatListEvents$ConversationSearchVersion, str);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatListEvents$ConversationSearchSessionEnded self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.entry_point);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.outcome);
        output.D(serialDesc, 2, self.total_time_ms);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.search_version);
        if (!output.E(serialDesc) && self.search_version_str == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.search_version_str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatListEvents$ConversationSearchEntryPoint getEntry_point() {
        return this.entry_point;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChatListEvents$ConversationSearchOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotal_time_ms() {
        return this.total_time_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatListEvents$ConversationSearchVersion getSearch_version() {
        return this.search_version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSearch_version_str() {
        return this.search_version_str;
    }

    public final ChatListEvents$ConversationSearchSessionEnded copy(ChatListEvents$ConversationSearchEntryPoint entry_point, ChatListEvents$ConversationSearchOutcome outcome, long total_time_ms, ChatListEvents$ConversationSearchVersion search_version, String search_version_str) {
        entry_point.getClass();
        outcome.getClass();
        search_version.getClass();
        return new ChatListEvents$ConversationSearchSessionEnded(entry_point, outcome, total_time_ms, search_version, search_version_str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatListEvents$ConversationSearchSessionEnded)) {
            return false;
        }
        ChatListEvents$ConversationSearchSessionEnded chatListEvents$ConversationSearchSessionEnded = (ChatListEvents$ConversationSearchSessionEnded) other;
        return this.entry_point == chatListEvents$ConversationSearchSessionEnded.entry_point && this.outcome == chatListEvents$ConversationSearchSessionEnded.outcome && this.total_time_ms == chatListEvents$ConversationSearchSessionEnded.total_time_ms && this.search_version == chatListEvents$ConversationSearchSessionEnded.search_version && x44.r(this.search_version_str, chatListEvents$ConversationSearchSessionEnded.search_version_str);
    }

    public final ChatListEvents$ConversationSearchEntryPoint getEntry_point() {
        return this.entry_point;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.conversation_search.session_ended";
    }

    public final ChatListEvents$ConversationSearchOutcome getOutcome() {
        return this.outcome;
    }

    public final ChatListEvents$ConversationSearchVersion getSearch_version() {
        return this.search_version;
    }

    public final String getSearch_version_str() {
        return this.search_version_str;
    }

    public final long getTotal_time_ms() {
        return this.total_time_ms;
    }

    public int hashCode() {
        int iHashCode = (this.search_version.hashCode() + vb7.e((this.outcome.hashCode() + (this.entry_point.hashCode() * 31)) * 31, 31, this.total_time_ms)) * 31;
        String str = this.search_version_str;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint = this.entry_point;
        ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome = this.outcome;
        long j = this.total_time_ms;
        ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion = this.search_version;
        String str = this.search_version_str;
        StringBuilder sb = new StringBuilder("ConversationSearchSessionEnded(entry_point=");
        sb.append(chatListEvents$ConversationSearchEntryPoint);
        sb.append(", outcome=");
        sb.append(chatListEvents$ConversationSearchOutcome);
        sb.append(", total_time_ms=");
        sb.append(j);
        sb.append(", search_version=");
        sb.append(chatListEvents$ConversationSearchVersion);
        return kgh.q(sb, ", search_version_str=", str, ")");
    }

    public ChatListEvents$ConversationSearchSessionEnded(ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint, ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome, long j, ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion, String str) {
        chatListEvents$ConversationSearchEntryPoint.getClass();
        chatListEvents$ConversationSearchOutcome.getClass();
        chatListEvents$ConversationSearchVersion.getClass();
        this.entry_point = chatListEvents$ConversationSearchEntryPoint;
        this.outcome = chatListEvents$ConversationSearchOutcome;
        this.total_time_ms = j;
        this.search_version = chatListEvents$ConversationSearchVersion;
        this.search_version_str = str;
    }

    public /* synthetic */ ChatListEvents$ConversationSearchSessionEnded(ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint, ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome, long j, ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion, String str, int i, mq5 mq5Var) {
        this(chatListEvents$ConversationSearchEntryPoint, chatListEvents$ConversationSearchOutcome, j, chatListEvents$ConversationSearchVersion, (i & 16) != 0 ? null : str);
    }
}
