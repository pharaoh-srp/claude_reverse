package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gjh {
    public final int a;

    public /* synthetic */ gjh(int i) {
        this.a = i;
    }

    public static final boolean a(int i) {
        return i == 1;
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gjh) {
            return this.a == ((gjh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.p("TextHighlightType(value=", this.a, ')');
    }
}
