package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b1j implements c1j {
    public final htc a;

    public b1j(htc htcVar) {
        this.a = htcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1j) && this.a.equals(((b1j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchToolUse(block=" + this.a + ")";
    }
}
