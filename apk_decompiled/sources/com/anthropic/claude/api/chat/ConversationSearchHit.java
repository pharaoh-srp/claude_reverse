package com.anthropic.claude.api.chat;

import defpackage.cn2;
import defpackage.gid;
import defpackage.gvj;
import defpackage.iva;
import defpackage.kva;
import defpackage.kw9;
import defpackage.l84;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rq4;
import defpackage.sq4;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/chat/ConversationSearchHit;", "", "Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;", "conversation", "Lcom/anthropic/claude/api/chat/MatchedSnippet;", "matched_snippet", "", "Lcom/anthropic/claude/api/chat/MatchSpan;", "title_matches", "<init>", "(Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;Lcom/anthropic/claude/api/chat/MatchedSnippet;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;Lcom/anthropic/claude/api/chat/MatchedSnippet;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ConversationSearchHit;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;", "component2", "()Lcom/anthropic/claude/api/chat/MatchedSnippet;", "component3", "()Ljava/util/List;", "copy", "(Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;Lcom/anthropic/claude/api/chat/MatchedSnippet;Ljava/util/List;)Lcom/anthropic/claude/api/chat/ConversationSearchHit;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;", "getConversation", "Lcom/anthropic/claude/api/chat/MatchedSnippet;", "getMatched_snippet", "Ljava/util/List;", "getTitle_matches", "Companion", "rq4", "sq4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConversationSearchHit {
    public static final int $stable = 0;
    private final ChatConversationWithProjectReference conversation;
    private final MatchedSnippet matched_snippet;
    private final List<MatchSpan> title_matches;
    public static final sq4 Companion = new sq4();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new l84(26))};

    public /* synthetic */ ConversationSearchHit(int i, ChatConversationWithProjectReference chatConversationWithProjectReference, MatchedSnippet matchedSnippet, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, rq4.a.getDescriptor());
            throw null;
        }
        this.conversation = chatConversationWithProjectReference;
        if ((i & 2) == 0) {
            this.matched_snippet = null;
        } else {
            this.matched_snippet = matchedSnippet;
        }
        if ((i & 4) == 0) {
            this.title_matches = lm6.E;
        } else {
            this.title_matches = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(iva.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationSearchHit copy$default(ConversationSearchHit conversationSearchHit, ChatConversationWithProjectReference chatConversationWithProjectReference, MatchedSnippet matchedSnippet, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            chatConversationWithProjectReference = conversationSearchHit.conversation;
        }
        if ((i & 2) != 0) {
            matchedSnippet = conversationSearchHit.matched_snippet;
        }
        if ((i & 4) != 0) {
            list = conversationSearchHit.title_matches;
        }
        return conversationSearchHit.copy(chatConversationWithProjectReference, matchedSnippet, list);
    }

    public static final /* synthetic */ void write$Self$api(ConversationSearchHit self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, cn2.a, self.conversation);
        if (output.E(serialDesc) || self.matched_snippet != null) {
            output.B(serialDesc, 1, kva.a, self.matched_snippet);
        }
        if (!output.E(serialDesc) && x44.r(self.title_matches, lm6.E)) {
            return;
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.title_matches);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatConversationWithProjectReference getConversation() {
        return this.conversation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MatchedSnippet getMatched_snippet() {
        return this.matched_snippet;
    }

    public final List<MatchSpan> component3() {
        return this.title_matches;
    }

    public final ConversationSearchHit copy(ChatConversationWithProjectReference conversation, MatchedSnippet matched_snippet, List<MatchSpan> title_matches) {
        conversation.getClass();
        title_matches.getClass();
        return new ConversationSearchHit(conversation, matched_snippet, title_matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationSearchHit)) {
            return false;
        }
        ConversationSearchHit conversationSearchHit = (ConversationSearchHit) other;
        return x44.r(this.conversation, conversationSearchHit.conversation) && x44.r(this.matched_snippet, conversationSearchHit.matched_snippet) && x44.r(this.title_matches, conversationSearchHit.title_matches);
    }

    public final ChatConversationWithProjectReference getConversation() {
        return this.conversation;
    }

    public final MatchedSnippet getMatched_snippet() {
        return this.matched_snippet;
    }

    public final List<MatchSpan> getTitle_matches() {
        return this.title_matches;
    }

    public int hashCode() {
        int iHashCode = this.conversation.hashCode() * 31;
        MatchedSnippet matchedSnippet = this.matched_snippet;
        return this.title_matches.hashCode() + ((iHashCode + (matchedSnippet == null ? 0 : matchedSnippet.hashCode())) * 31);
    }

    public String toString() {
        ChatConversationWithProjectReference chatConversationWithProjectReference = this.conversation;
        MatchedSnippet matchedSnippet = this.matched_snippet;
        List<MatchSpan> list = this.title_matches;
        StringBuilder sb = new StringBuilder("ConversationSearchHit(conversation=");
        sb.append(chatConversationWithProjectReference);
        sb.append(", matched_snippet=");
        sb.append(matchedSnippet);
        sb.append(", title_matches=");
        return gid.q(sb, list, ")");
    }

    public ConversationSearchHit(ChatConversationWithProjectReference chatConversationWithProjectReference, MatchedSnippet matchedSnippet, List<MatchSpan> list) {
        chatConversationWithProjectReference.getClass();
        list.getClass();
        this.conversation = chatConversationWithProjectReference;
        this.matched_snippet = matchedSnippet;
        this.title_matches = list;
    }

    public /* synthetic */ ConversationSearchHit(ChatConversationWithProjectReference chatConversationWithProjectReference, MatchedSnippet matchedSnippet, List list, int i, mq5 mq5Var) {
        this(chatConversationWithProjectReference, (i & 2) != 0 ? null : matchedSnippet, (i & 4) != 0 ? lm6.E : list);
    }
}
