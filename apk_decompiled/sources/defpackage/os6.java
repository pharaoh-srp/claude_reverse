package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class os6 {
    public final String a;

    public os6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os6) && this.a.equals(((os6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ContainerView(id=", this.a, ")");
    }
}
