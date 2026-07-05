package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aua {
    public final boolean a;

    public aua(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aua) && this.a == ((aua) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("MarkdownParseOptions(autolink=", ")", this.a);
    }
}
