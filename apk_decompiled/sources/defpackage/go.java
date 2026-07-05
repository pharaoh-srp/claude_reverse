package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class go implements so {
    public final String a;

    public go(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go) && this.a.equals(((go) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Cursor(eventId=", this.a, ")");
    }
}
