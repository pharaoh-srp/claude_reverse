package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rb7 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof rb7) {
            return this.a.equals(((rb7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
