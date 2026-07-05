package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ChatId;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.psb;
import defpackage.ulb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J4\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/chat/MoveChatsResponse;", "", "", "Lcom/anthropic/claude/types/strings/ChatId;", "moved", "failed", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Set;Ljava/util/Set;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MoveChatsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Set;", "component2", "copy", "(Ljava/util/Set;Ljava/util/Set;)Lcom/anthropic/claude/api/chat/MoveChatsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getMoved", "getFailed", "Companion", "osb", "psb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MoveChatsResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final psb Companion = new psb();
    private final Set<ChatId> failed;
    private final Set<ChatId> moved;

    static {
        ulb ulbVar = new ulb(26);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ulbVar), yb5.w(w1aVar, new ulb(27))};
    }

    public /* synthetic */ MoveChatsResponse(int i, Set set, Set set2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.moved = null;
        } else {
            this.moved = set;
        }
        if ((i & 2) == 0) {
            this.failed = null;
        } else {
            this.failed = set2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(vs2.a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(vs2.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MoveChatsResponse copy$default(MoveChatsResponse moveChatsResponse, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = moveChatsResponse.moved;
        }
        if ((i & 2) != 0) {
            set2 = moveChatsResponse.failed;
        }
        return moveChatsResponse.copy(set, set2);
    }

    public static final /* synthetic */ void write$Self$api(MoveChatsResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.moved != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.moved);
        }
        if (!output.E(serialDesc) && self.failed == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.failed);
    }

    public final Set<ChatId> component1() {
        return this.moved;
    }

    public final Set<ChatId> component2() {
        return this.failed;
    }

    public final MoveChatsResponse copy(Set<ChatId> moved, Set<ChatId> failed) {
        return new MoveChatsResponse(moved, failed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoveChatsResponse)) {
            return false;
        }
        MoveChatsResponse moveChatsResponse = (MoveChatsResponse) other;
        return x44.r(this.moved, moveChatsResponse.moved) && x44.r(this.failed, moveChatsResponse.failed);
    }

    public final Set<ChatId> getFailed() {
        return this.failed;
    }

    public final Set<ChatId> getMoved() {
        return this.moved;
    }

    public int hashCode() {
        Set<ChatId> set = this.moved;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<ChatId> set2 = this.failed;
        return iHashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        return "MoveChatsResponse(moved=" + this.moved + ", failed=" + this.failed + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoveChatsResponse() {
        this((Set) null, (Set) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public MoveChatsResponse(Set<ChatId> set, Set<ChatId> set2) {
        this.moved = set;
        this.failed = set2;
    }

    public /* synthetic */ MoveChatsResponse(Set set, Set set2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : set2);
    }
}
