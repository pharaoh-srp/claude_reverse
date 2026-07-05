package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ih1 {
    public final String a;

    public ih1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih1) && this.a.equals(((ih1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("BatchId(id=", this.a, ")");
    }
}
