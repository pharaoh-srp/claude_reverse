package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wpd {
    public final Boolean a;
    public final boolean b;

    public wpd(boolean z, Boolean bool) {
        this.a = bool;
        this.b = z;
    }

    public static wpd a(wpd wpdVar, boolean z) {
        Boolean bool = wpdVar.a;
        wpdVar.getClass();
        return new wpd(z, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpd)) {
            return false;
        }
        wpd wpdVar = (wpd) obj;
        return x44.r(this.a, wpdVar.a) && this.b == wpdVar.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return Boolean.hashCode(this.b) + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final String toString() {
        return "ProjectsPaginationState(hasMore=" + this.a + ", isLoadingMore=" + this.b + ")";
    }

    public /* synthetic */ wpd() {
        this(false, null);
    }
}
