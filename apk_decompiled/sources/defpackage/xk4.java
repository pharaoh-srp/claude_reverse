package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class xk4 {
    public final File a;
    public final File b;

    public xk4(File file, File file2) {
        this.a = file;
        this.b = file2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk4)) {
            return false;
        }
        xk4 xk4Var = (xk4) obj;
        return this.a.equals(xk4Var.a) && x44.r(this.b, xk4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        File file = this.b;
        return iHashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Batch(file=" + this.a + ", metaFile=" + this.b + ")";
    }
}
