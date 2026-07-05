package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv7 implements sv7 {
    public final k84 a;

    public kv7(k84 k84Var) {
        k84Var.getClass();
        this.a = k84Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv7) && x44.r(this.a, ((kv7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Compacting(compactionState=" + this.a + ")";
    }
}
