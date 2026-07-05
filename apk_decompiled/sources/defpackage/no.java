package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class no implements so {
    public final String a;

    public no(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof no) && this.a.equals(((no) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("SeenChanged(messageId=", this.a, ")");
    }
}
