package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e1e implements f1e {
    public final String a;

    public e1e(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1e) && x44.r(this.a, ((e1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Playing(videoId=", this.a, ")");
    }
}
