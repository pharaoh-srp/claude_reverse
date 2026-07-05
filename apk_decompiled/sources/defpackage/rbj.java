package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbj {
    public static final rbj b = new rbj(0);
    public static final rbj c = new rbj(1);
    public static final rbj d = new rbj(2);
    public final int a;

    public rbj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rbj.class == obj.getClass() && this.a == ((rbj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "WindowHeightSizeClass: ".concat(equals(b) ? "COMPACT" : equals(c) ? "MEDIUM" : equals(d) ? "EXPANDED" : "UNKNOWN");
    }
}
