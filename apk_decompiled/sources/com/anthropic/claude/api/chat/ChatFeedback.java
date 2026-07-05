package com.anthropic.claude.api.chat;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ps2;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wr2;
import defpackage.x44;
import defpackage.xr2;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatFeedback;", "", "Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "type", "", "reason", "<init>", "(Lcom/anthropic/claude/api/chat/ChatFeedbackType;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/ChatFeedbackType;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatFeedback;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/api/chat/ChatFeedbackType;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ChatFeedback;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/ChatFeedbackType;", "getType", "Ljava/lang/String;", "getReason", "Companion", "wr2", "xr2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatFeedback {
    public static final int $stable = 0;
    public static final xr2 Companion = new xr2();
    private final String reason;
    private final ChatFeedbackType type;

    public /* synthetic */ ChatFeedback(int i, ChatFeedbackType chatFeedbackType, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wr2.a.getDescriptor());
            throw null;
        }
        this.type = chatFeedbackType;
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str;
        }
    }

    public static /* synthetic */ ChatFeedback copy$default(ChatFeedback chatFeedback, ChatFeedbackType chatFeedbackType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            chatFeedbackType = chatFeedback.type;
        }
        if ((i & 2) != 0) {
            str = chatFeedback.reason;
        }
        return chatFeedback.copy(chatFeedbackType, str);
    }

    public static final /* synthetic */ void write$Self$api(ChatFeedback self, vd4 output, SerialDescriptor serialDesc) {
        output.B(serialDesc, 0, ps2.d, self.type);
        if (!output.E(serialDesc) && self.reason == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatFeedbackType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final ChatFeedback copy(ChatFeedbackType type, String reason) {
        return new ChatFeedback(type, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatFeedback)) {
            return false;
        }
        ChatFeedback chatFeedback = (ChatFeedback) other;
        return this.type == chatFeedback.type && x44.r(this.reason, chatFeedback.reason);
    }

    public final String getReason() {
        return this.reason;
    }

    public final ChatFeedbackType getType() {
        return this.type;
    }

    public int hashCode() {
        ChatFeedbackType chatFeedbackType = this.type;
        int iHashCode = (chatFeedbackType == null ? 0 : chatFeedbackType.hashCode()) * 31;
        String str = this.reason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ChatFeedback(type=" + this.type + ", reason=" + this.reason + ")";
    }

    public ChatFeedback(ChatFeedbackType chatFeedbackType, String str) {
        this.type = chatFeedbackType;
        this.reason = str;
    }

    public /* synthetic */ ChatFeedback(ChatFeedbackType chatFeedbackType, String str, int i, mq5 mq5Var) {
        this(chatFeedbackType, (i & 2) != 0 ? null : str);
    }
}
