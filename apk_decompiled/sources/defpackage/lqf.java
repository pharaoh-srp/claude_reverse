package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class lqf {
    public final String a;
    public final String b;

    public lqf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqf)) {
            return false;
        }
        lqf lqfVar = (lqf) obj;
        return SessionId.m1117equalsimpl0(this.a, lqfVar.a) && this.b.equals(lqfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (SessionId.m1118hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("NewestEvent(sessionId=", SessionId.m1119toStringimpl(this.a), ", eventId=", this.b, ")");
    }
}
