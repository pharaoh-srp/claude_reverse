package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eo implements so {
    public final kj a;

    public eo(kj kjVar) {
        kjVar.getClass();
        this.a = kjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo) && this.a == ((eo) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActivityStatus(status=" + this.a + ")";
    }
}
