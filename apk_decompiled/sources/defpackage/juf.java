package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class juf implements fvf {
    public final lqa a;

    public juf(lqa lqaVar) {
        this.a = lqaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juf) && this.a.equals(((juf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CommandDescriptionsAvailable(descriptions=" + this.a + ")";
    }
}
