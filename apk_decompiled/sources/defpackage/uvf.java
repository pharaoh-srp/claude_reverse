package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class uvf implements wvf {
    public final String a;

    public uvf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvf) && SessionId.m1117equalsimpl0(this.a, ((uvf) obj).a);
    }

    public final int hashCode() {
        return SessionId.m1118hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Deleted(id=", SessionId.m1119toStringimpl(this.a), ")");
    }
}
