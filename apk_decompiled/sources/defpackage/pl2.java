package defpackage;

import com.anthropic.claude.chat.parse.sse.ServerSentEventException;

/* JADX INFO: loaded from: classes2.dex */
public final class pl2 extends qik {
    public final ServerSentEventException d;

    public pl2(ServerSentEventException serverSentEventException) {
        serverSentEventException.getClass();
        this.d = serverSentEventException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl2) && x44.r(this.d, ((pl2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final ServerSentEventException p() {
        return this.d;
    }

    public final String toString() {
        return "ConnectionError(exception=" + this.d + ")";
    }
}
