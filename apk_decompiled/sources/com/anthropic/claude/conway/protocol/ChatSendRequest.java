package com.anthropic.claude.conway.protocol;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qa3;
import defpackage.ra3;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001e¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ChatSendRequest;", "", "", "Lcom/anthropic/claude/conway/protocol/ChatPart;", "parts", "", "interrupt", "", "agentId", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ChatSendRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ZLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/ChatSendRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getParts", "Z", "getInterrupt", "Ljava/lang/String;", "getAgentId", "Companion", "qa3", "ra3", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSendRequest {
    public static final int $stable = 8;
    private final String agentId;
    private final boolean interrupt;
    private final List<ChatPart> parts;
    public static final ra3 Companion = new ra3();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new wy2(11)), null, null};

    public /* synthetic */ ChatSendRequest(int i, List list, boolean z, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, qa3.a.getDescriptor());
            throw null;
        }
        this.parts = list;
        if ((i & 2) == 0) {
            this.interrupt = true;
        } else {
            this.interrupt = z;
        }
        if ((i & 4) == 0) {
            this.agentId = null;
        } else {
            this.agentId = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ChatPart.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatSendRequest copy$default(ChatSendRequest chatSendRequest, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatSendRequest.parts;
        }
        if ((i & 2) != 0) {
            z = chatSendRequest.interrupt;
        }
        if ((i & 4) != 0) {
            str = chatSendRequest.agentId;
        }
        return chatSendRequest.copy(list, z, str);
    }

    public static final /* synthetic */ void write$Self$conway(ChatSendRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.parts);
        if (output.E(serialDesc) || !self.interrupt) {
            output.p(serialDesc, 1, self.interrupt);
        }
        if (!output.E(serialDesc) && self.agentId == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.agentId);
    }

    public final List<ChatPart> component1() {
        return this.parts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInterrupt() {
        return this.interrupt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    public final ChatSendRequest copy(List<? extends ChatPart> parts, boolean interrupt, String agentId) {
        parts.getClass();
        return new ChatSendRequest(parts, interrupt, agentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSendRequest)) {
            return false;
        }
        ChatSendRequest chatSendRequest = (ChatSendRequest) other;
        return x44.r(this.parts, chatSendRequest.parts) && this.interrupt == chatSendRequest.interrupt && x44.r(this.agentId, chatSendRequest.agentId);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final boolean getInterrupt() {
        return this.interrupt;
    }

    public final List<ChatPart> getParts() {
        return this.parts;
    }

    public int hashCode() {
        int iP = fsh.p(this.parts.hashCode() * 31, 31, this.interrupt);
        String str = this.agentId;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<ChatPart> list = this.parts;
        boolean z = this.interrupt;
        String str = this.agentId;
        StringBuilder sb = new StringBuilder("ChatSendRequest(parts=");
        sb.append(list);
        sb.append(", interrupt=");
        sb.append(z);
        sb.append(", agentId=");
        return ij0.m(sb, str, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatSendRequest(List<? extends ChatPart> list, boolean z, String str) {
        list.getClass();
        this.parts = list;
        this.interrupt = z;
        this.agentId = str;
    }

    public /* synthetic */ ChatSendRequest(List list, boolean z, String str, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str);
    }
}
