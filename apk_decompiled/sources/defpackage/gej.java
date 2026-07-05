package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gej {
    public static final gej b = new gej(0);
    public static final gej c = new gej(1);
    public static final gej d = new gej(2);
    public final int a;

    public gej(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gej.class == obj.getClass() && this.a == ((gej) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "WindowWidthSizeClass: ".concat(equals(b) ? "COMPACT" : equals(c) ? "MEDIUM" : equals(d) ? "EXPANDED" : "UNKNOWN");
    }
}
