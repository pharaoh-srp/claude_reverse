package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l19 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof l19) {
            return this.a == ((l19) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.a, ')');
    }
}
