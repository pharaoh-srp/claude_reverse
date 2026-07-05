package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class va6 implements Comparable {
    public final float E;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.E, ((va6) obj).E);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof va6) {
            return Float.compare(this.E, ((va6) obj).E) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.E);
    }

    public final String toString() {
        return c(this.E);
    }
}
