package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g63 implements j63 {
    public final boolean a;

    public g63(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g63) && this.a == ((g63) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qy1.g("SendMessageSucceeded(isRetry=", ")", this.a);
    }
}
