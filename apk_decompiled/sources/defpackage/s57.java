package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s57 extends hjk {
    public final int c;

    public s57(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s57) {
            return this.c == ((s57) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return vb7.r(new StringBuilder("StepsGoal(steps="), this.c, ')');
    }
}
