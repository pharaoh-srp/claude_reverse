package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o57 extends hjk {
    public final f3a c;

    public o57(f3a f3aVar) {
        this.c = f3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o57)) {
            return false;
        }
        return this.c.equals(((o57) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "DistanceGoal(distance=" + this.c + ')';
    }
}
