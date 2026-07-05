package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ai2 {
    public static final zh2 b = new zh2();
    public final Object a;

    public /* synthetic */ ai2(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        yh2 yh2Var = obj instanceof yh2 ? (yh2) obj : null;
        if (yh2Var != null) {
            return yh2Var.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof zh2) {
            return null;
        }
        return obj;
    }

    public static final void c(Object obj) throws Throwable {
        if (obj instanceof zh2) {
            if (!(obj instanceof yh2)) {
                sz6.j("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((yh2) obj).a;
            if (th != null) {
                throw th;
            }
            sz6.j("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof zh2);
    }

    public final /* synthetic */ Object e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ai2) {
            return x44.r(this.a, ((ai2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof yh2) {
            return ((yh2) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
