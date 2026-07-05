package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io1 implements ko1 {
    public final int a;

    public io1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io1) && this.a == ((io1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("Track(firstChatMessageIndex=", this.a, ")");
    }
}
