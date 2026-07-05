package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class icd {
    public static final icd a = new icd();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icd) && va6.b(Float.NaN, Float.NaN) && Float.compare(Float.NaN, Float.NaN) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(Float.NaN) + (Float.hashCode(Float.NaN) * 31);
    }

    public final String toString() {
        return "PreferredSize(dp=" + ((Object) va6.c(Float.NaN)) + ", proportion=NaN)";
    }
}
