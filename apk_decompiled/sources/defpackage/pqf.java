package defpackage;

import com.anthropic.claude.sessions.types.SdkEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class pqf implements rqf {
    public final SdkEvent a;
    public final Throwable b;

    public pqf(SdkEvent sdkEvent, Throwable th) {
        this.a = sdkEvent;
        this.b = th;
    }

    public final Throwable a() {
        return this.b;
    }

    public final SdkEvent b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqf)) {
            return false;
        }
        pqf pqfVar = (pqf) obj;
        return x44.r(this.a, pqfVar.a) && x44.r(this.b, pqfVar.b);
    }

    public final int hashCode() {
        SdkEvent sdkEvent = this.a;
        int iHashCode = (sdkEvent == null ? 0 : sdkEvent.hashCode()) * 31;
        Throwable th = this.b;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Ws(event=" + this.a + ", closeCause=" + this.b + ")";
    }
}
