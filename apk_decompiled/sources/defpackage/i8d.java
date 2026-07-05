package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i8d {
    public final int a;

    public /* synthetic */ i8d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i8d) {
            return this.a == ((i8d) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("PointerKeyboardModifiers(packedValue=", this.a, ')');
    }
}
