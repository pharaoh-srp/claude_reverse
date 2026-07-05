package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class az5 {
    public int a;

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a += i;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az5) && this.a == ((az5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
