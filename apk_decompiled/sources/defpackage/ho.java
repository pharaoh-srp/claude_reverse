package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ho implements so {
    public final dk6 a;

    public ho(dk6 dk6Var) {
        this.a = dk6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho) && this.a == ((ho) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ElevatedAuthRequired(resource=" + this.a + ")";
    }
}
