package defpackage;

import com.anthropic.claude.chat.parse.sse.ServerSentEventError;

/* JADX INFO: loaded from: classes2.dex */
public final class ql2 extends qik {
    public final ServerSentEventError d;

    public ql2(ServerSentEventError serverSentEventError) {
        serverSentEventError.getClass();
        this.d = serverSentEventError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql2) && x44.r(this.d, ((ql2) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final ServerSentEventError p() {
        return this.d;
    }

    public final String toString() {
        return "ServerError(error=" + this.d + ")";
    }
}
