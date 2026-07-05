package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kmh {
    public final jmh a;

    public kmh(jmh jmhVar) {
        this.a = jmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmh) && this.a == ((kmh) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Thinking(phase=" + this.a + ")";
    }
}
