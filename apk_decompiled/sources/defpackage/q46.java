package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q46 implements v46 {
    public final int a;

    public /* synthetic */ q46(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        sz6.p("px must be > 0.");
    }

    public final /* synthetic */ int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q46) {
            return this.a == ((q46) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return grc.u("Pixels(px=", this.a, ")");
    }
}
