package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ki7 implements fv6 {
    public final wi7 a;
    public final g4d b;
    public final xi7 c;
    public final yk4 d;
    public final h99 e;
    public final u0h f;

    public ki7(wi7 wi7Var, g4d g4dVar, g4d g4dVar2, xi7 xi7Var, yk4 yk4Var, h99 h99Var) {
        g4dVar.getClass();
        g4dVar2.getClass();
        xi7Var.getClass();
        h99Var.getClass();
        this.a = wi7Var;
        this.b = g4dVar;
        this.c = xi7Var;
        this.d = yk4Var;
        this.e = h99Var;
        this.f = new u0h(new l4(14, this));
    }

    @Override // defpackage.fv6
    public final boolean a(x1e x1eVar, int i) {
        byte[] bArr = x1eVar.a;
        sq6.a(i);
        u0h u0hVar = this.f;
        File file = (File) u0hVar.getValue();
        File file2 = (File) u0hVar.getValue();
        if (file2 != null) {
            this.a.l(file2);
        }
        g99 g99Var = g99.E;
        if (file == null) {
            dch.I(this.e, 5, x44.X(g99Var, g99.G), yf5.j0, null, 56);
            return false;
        }
        if (bArr.length == 0) {
            return true;
        }
        int length = bArr.length;
        if (length > this.c.c) {
            dch.H(this.e, 5, g99Var, new zf5(length, this, 1), null, false, 56);
            return false;
        }
        if (!this.b.h(file, x1eVar, true)) {
            return false;
        }
        yk4 yk4Var = this.d;
        efk efkVar = yk4Var.O;
        String str = yk4Var.N;
        efkVar.getClass();
        str.getClass();
        efkVar.w(str, "android.benchmark.bytes_written");
        return true;
    }
}
