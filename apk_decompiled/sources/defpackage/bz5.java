package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bz5 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz5) && this.a == ((bz5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
