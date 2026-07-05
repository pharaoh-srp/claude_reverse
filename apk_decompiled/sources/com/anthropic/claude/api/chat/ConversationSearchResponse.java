package com.anthropic.claude.api.chat;

import defpackage.kw9;
import defpackage.l84;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rq4;
import defpackage.srg;
import defpackage.uo0;
import defpackage.uq4;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/ConversationSearchResponse;", "", "", "Lcom/anthropic/claude/api/chat/ConversationSearchHit;", "data", "", "next_page_token", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ConversationSearchResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ConversationSearchResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Ljava/lang/String;", "getNext_page_token", "Companion", "tq4", "uq4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConversationSearchResponse {
    public static final int $stable = 0;
    private final List<ConversationSearchHit> data;
    private final String next_page_token;
    public static final uq4 Companion = new uq4();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new l84(27)), null};

    public /* synthetic */ ConversationSearchResponse(int i, List list, String str, vnf vnfVar) {
        this.data = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.next_page_token = null;
        } else {
            this.next_page_token = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(rq4.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationSearchResponse copy$default(ConversationSearchResponse conversationSearchResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = conversationSearchResponse.data;
        }
        if ((i & 2) != 0) {
            str = conversationSearchResponse.next_page_token;
        }
        return conversationSearchResponse.copy(list, str);
    }

    public static final /* synthetic */ void write$Self$api(ConversationSearchResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.data, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        }
        if (!output.E(serialDesc) && self.next_page_token == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.next_page_token);
    }

    public final List<ConversationSearchHit> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_page_token() {
        return this.next_page_token;
    }

    public final ConversationSearchResponse copy(List<ConversationSearchHit> data, String next_page_token) {
        data.getClass();
        return new ConversationSearchResponse(data, next_page_token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationSearchResponse)) {
            return false;
        }
        ConversationSearchResponse conversationSearchResponse = (ConversationSearchResponse) other;
        return x44.r(this.data, conversationSearchResponse.data) && x44.r(this.next_page_token, conversationSearchResponse.next_page_token);
    }

    public final List<ConversationSearchHit> getData() {
        return this.data;
    }

    public final String getNext_page_token() {
        return this.next_page_token;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        String str = this.next_page_token;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ConversationSearchResponse(data=" + this.data + ", next_page_token=" + this.next_page_token + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchResponse() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ConversationSearchResponse(List<ConversationSearchHit> list, String str) {
        list.getClass();
        this.data = list;
        this.next_page_token = str;
    }

    public /* synthetic */ ConversationSearchResponse(List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : str);
    }
}
