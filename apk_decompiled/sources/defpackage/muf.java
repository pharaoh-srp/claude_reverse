package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class muf implements fvf {
    public final dk6 a;

    public muf(dk6 dk6Var) {
        this.a = dk6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof muf) && this.a == ((muf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ElevatedAuthRequired(resource=" + this.a + ")";
    }
}
