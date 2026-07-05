package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uwh implements vwh {
    public final boolean a;

    public uwh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwh) && this.a == ((uwh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("VisibleInChat(collapsible=", ")", this.a);
    }
}
