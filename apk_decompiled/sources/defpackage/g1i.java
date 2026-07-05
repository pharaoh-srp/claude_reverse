package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g1i {
    public final String a;
    public final Set b;

    public g1i(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1i)) {
            return false;
        }
        g1i g1iVar = (g1i) obj;
        return this.a.equals(g1iVar.a) && this.b.equals(g1iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolUseSummary(text=" + this.a + ", coveredToolUseIds=" + this.b + ")";
    }
}
