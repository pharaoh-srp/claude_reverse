package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class jre implements Serializable {
    public final Object E;

    public /* synthetic */ jre(Object obj) {
        this.E = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof hre) {
            return ((hre) obj).E;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return !(serializable instanceof hre);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jre) {
            return x44.r(this.E, ((jre) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.E;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.E;
        if (obj instanceof hre) {
            return ((hre) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
