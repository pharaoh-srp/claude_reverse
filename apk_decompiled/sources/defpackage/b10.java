package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b10 {
    public final int a;

    public /* synthetic */ b10(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b10) {
            return this.a == ((b10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("AndroidContentDataType(androidAutofillType=", this.a, ')');
    }
}
