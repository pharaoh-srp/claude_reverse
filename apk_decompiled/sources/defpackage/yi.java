package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yi {
    public final int a;
    public final jj b;

    public yi(int i, jj jjVar) {
        jjVar.getClass();
        this.a = i;
        this.b = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        return this.a == yiVar.a && this.b == yiVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Stamped(gen=" + this.a + ", result=" + this.b + ")";
    }
}
