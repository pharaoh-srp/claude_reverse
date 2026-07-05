package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ie7 {
    public final Object a;
    public final ta4 b;

    public ie7(sbg sbgVar, ta4 ta4Var) {
        this.a = sbgVar;
        this.b = ta4Var;
    }

    public final Object a() {
        return this.a;
    }

    public final rz7 b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ie7) {
            ie7 ie7Var = (ie7) obj;
            return x44.r(this.a, ie7Var.a) && this.b == ie7Var.b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
