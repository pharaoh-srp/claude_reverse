package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nn3 implements rn3 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn3) && Float.compare(0.1f, 0.1f) == 0 && Float.compare(0.9f, 0.9f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.9f) + (Float.hashCode(0.1f) * 31);
    }

    public final String toString() {
        return "Loop(from=0.1, to=0.9)";
    }
}
