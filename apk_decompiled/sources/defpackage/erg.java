package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class erg implements vb0 {
    public final String a;

    public /* synthetic */ erg(String str) {
        this.a = str;
    }

    public static final /* synthetic */ erg a(String str) {
        return new erg(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof erg) {
            return x44.r(this.a, ((erg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return grc.n(')', "StringAnnotation(value=", this.a);
    }
}
