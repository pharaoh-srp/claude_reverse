package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class hqf {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;

    public hqf(String str, boolean z, boolean z2, Boolean bool) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqf)) {
            return false;
        }
        hqf hqfVar = (hqf) obj;
        return SessionId.m1117equalsimpl0(this.a, hqfVar.a) && this.b == hqfVar.b && this.c == hqfVar.c && x44.r(this.d, hqfVar.d);
    }

    public final int hashCode() {
        int iP = fsh.p(fsh.p(SessionId.m1118hashCodeimpl(this.a) * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        return iP + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "ConnectArgs(sessionId=" + SessionId.m1119toStringimpl(this.a) + ", useLatestFirstPagination=" + this.b + ", promptSuggestionsEnabled=" + this.c + ", overrideV2Stream=" + this.d + ")";
    }
}
