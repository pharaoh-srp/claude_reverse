package defpackage;

import com.anthropic.claude.sessions.types.SdkEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class tj implements uj {
    public final SdkEvent a;
    public final Throwable b;

    public tj(SdkEvent sdkEvent, Throwable th) {
        this.a = sdkEvent;
        this.b = th;
    }

    public final SdkEvent a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return x44.r(this.a, tjVar.a) && x44.r(this.b, tjVar.b);
    }

    public final int hashCode() {
        SdkEvent sdkEvent = this.a;
        int iHashCode = (sdkEvent == null ? 0 : sdkEvent.hashCode()) * 31;
        Throwable th = this.b;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "WsEvent(event=" + this.a + ", closeCause=" + this.b + ")";
    }
}
