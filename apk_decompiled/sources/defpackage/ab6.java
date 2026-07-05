package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab6 {
    public final long a(cz5 cz5Var) {
        int i = d3i.b;
        return am4.y(cz5Var.M0(10.0f), cz5Var.M0(40.0f), cz5Var.M0(10.0f), cz5Var.M0(40.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab6) && va6.b(10.0f, 10.0f) && va6.b(40.0f, 40.0f) && va6.b(10.0f, 10.0f) && va6.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + vb7.b(40.0f, vb7.b(10.0f, vb7.b(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) va6.c(10.0f)) + ", top=" + ((Object) va6.c(40.0f)) + ", end=" + ((Object) va6.c(10.0f)) + ", bottom=" + ((Object) va6.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
