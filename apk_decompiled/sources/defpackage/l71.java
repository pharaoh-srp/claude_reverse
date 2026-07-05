package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l71 {
    public final int a;

    public /* synthetic */ l71(int i) {
        this.a = i;
    }

    public static final /* synthetic */ l71 a(int i) {
        return new l71(i);
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l71) {
            return this.a == ((l71) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("AutoClearFocusBehavior(value=", this.a, ')');
    }
}
