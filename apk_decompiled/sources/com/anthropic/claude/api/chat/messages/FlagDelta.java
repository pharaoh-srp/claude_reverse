package com.anthropic.claude.api.chat.messages;

import defpackage.cn7;
import defpackage.dhb;
import defpackage.dn7;
import defpackage.ef0;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/FlagDelta;", "Lcom/anthropic/claude/api/chat/messages/ContentBlockDelta;", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "flag", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "helpline", "<init>", "(Lcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/FlagDelta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "component2", "()Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "copy", "(Lcom/anthropic/claude/api/chat/messages/MessageFlag;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;)Lcom/anthropic/claude/api/chat/messages/FlagDelta;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "getFlag", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "getHelpline", "Companion", "cn7", "dn7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FlagDelta implements ContentBlockDelta {
    public static final int $stable = 0;
    public static final dn7 Companion = new dn7();
    private final MessageFlag flag;
    private final ApiHelpline helpline;

    public /* synthetic */ FlagDelta(int i, MessageFlag messageFlag, ApiHelpline apiHelpline, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, cn7.a.getDescriptor());
            throw null;
        }
        this.flag = messageFlag;
        if ((i & 2) == 0) {
            this.helpline = null;
        } else {
            this.helpline = apiHelpline;
        }
    }

    public static /* synthetic */ FlagDelta copy$default(FlagDelta flagDelta, MessageFlag messageFlag, ApiHelpline apiHelpline, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFlag = flagDelta.flag;
        }
        if ((i & 2) != 0) {
            apiHelpline = flagDelta.helpline;
        }
        return flagDelta.copy(messageFlag, apiHelpline);
    }

    public static final /* synthetic */ void write$Self$api(FlagDelta self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, dhb.a, self.flag);
        if (!output.E(serialDesc) && self.helpline == null) {
            return;
        }
        output.B(serialDesc, 1, ef0.a, self.helpline);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageFlag getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ApiHelpline getHelpline() {
        return this.helpline;
    }

    public final FlagDelta copy(MessageFlag flag, ApiHelpline helpline) {
        flag.getClass();
        return new FlagDelta(flag, helpline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagDelta)) {
            return false;
        }
        FlagDelta flagDelta = (FlagDelta) other;
        return x44.r(this.flag, flagDelta.flag) && x44.r(this.helpline, flagDelta.helpline);
    }

    public final MessageFlag getFlag() {
        return this.flag;
    }

    public final ApiHelpline getHelpline() {
        return this.helpline;
    }

    public int hashCode() {
        int iHashCode = this.flag.hashCode() * 31;
        ApiHelpline apiHelpline = this.helpline;
        return iHashCode + (apiHelpline == null ? 0 : apiHelpline.hashCode());
    }

    public String toString() {
        return "FlagDelta(flag=" + this.flag + ", helpline=" + this.helpline + ")";
    }

    public FlagDelta(MessageFlag messageFlag, ApiHelpline apiHelpline) {
        messageFlag.getClass();
        this.flag = messageFlag;
        this.helpline = apiHelpline;
    }

    public /* synthetic */ FlagDelta(MessageFlag messageFlag, ApiHelpline apiHelpline, int i, mq5 mq5Var) {
        this(messageFlag, (i & 2) != 0 ? null : apiHelpline);
    }
}
