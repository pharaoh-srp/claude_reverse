package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j42 implements o0j {
    public static final File c = new File("/proc/self/stat");
    public final File a;
    public final h99 b;

    public j42(h99 h99Var) {
        File file = c;
        file.getClass();
        h99Var.getClass();
        this.a = file;
        this.b = h99Var;
    }

    @Override // defpackage.o0j
    public final Double a() {
        String strP0;
        File file = this.a;
        h99 h99Var = this.b;
        if (!fd9.T(file, h99Var) || !fd9.x(file, h99Var) || (strP0 = fd9.p0(file, dj2.a, h99Var)) == null) {
            return null;
        }
        List listX0 = bsg.X0(strP0, new char[]{' '}, 6);
        if (listX0.size() > 13) {
            return hsg.a0((String) listX0.get(13));
        }
        return null;
    }
}
