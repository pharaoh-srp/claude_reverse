package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fog implements kog {
    public final String a;

    public fog(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fog) && this.a.equals(((fog) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("StopSequence(sequence=", this.a, ")");
    }
}
