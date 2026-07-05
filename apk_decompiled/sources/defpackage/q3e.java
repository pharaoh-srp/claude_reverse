package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q3e implements t3e {
    public final int a;

    public q3e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3e) && this.a == ((q3e) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("LoadedPartial(bytes=", this.a, ")");
    }
}
