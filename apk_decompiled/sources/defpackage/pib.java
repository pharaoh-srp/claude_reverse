package defpackage;

import com.anthropic.claude.api.chat.messages.StreamEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class pib {
    public final StreamEvent a;

    public pib(StreamEvent streamEvent) {
        streamEvent.getClass();
        this.a = streamEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pib) && x44.r(this.a, ((pib) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.a + ")";
    }
}
