package com.anthropic.claude.api.chat.messages;

import defpackage.bhb;
import defpackage.dhb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b7\u0018\u0000 \u00102\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r\u0082\u0001\u0003\u0012\u0011\u0013¨\u0006\u0015"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/MessageFlag;", "", "<init>", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getRawValue", "rawValue", "Companion", "com/anthropic/claude/api/chat/messages/h", "com/anthropic/claude/api/chat/messages/g", "chb", "bhb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = dhb.class)
public abstract class MessageFlag {
    public static final int $stable = 0;
    public static final bhb Companion = new bhb();

    public /* synthetic */ MessageFlag(mq5 mq5Var) {
        this();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MessageFlag) {
            return x44.r(getRawValue(), ((MessageFlag) other).getRawValue());
        }
        return false;
    }

    public abstract String getRawValue();

    public int hashCode() {
        return getRawValue().hashCode();
    }

    public String toString() {
        return getRawValue();
    }

    private MessageFlag() {
    }
}
