package defpackage;

import com.anthropic.claude.types.strings.ForkId;

/* JADX INFO: loaded from: classes2.dex */
public final class i5f {
    public final String a;

    public i5f(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5f) && ForkId.m1024equalsimpl0(this.a, ((i5f) obj).a);
    }

    public final int hashCode() {
        return ForkId.m1025hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("Restore(id=", ForkId.m1027toStringimpl(this.a), ")");
    }
}
