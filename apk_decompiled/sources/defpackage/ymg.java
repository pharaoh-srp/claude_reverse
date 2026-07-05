package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ymg implements tg5 {
    public final tg5 E;
    public long F;
    public Uri G;
    public Map H;

    public ymg(tg5 tg5Var) {
        tg5Var.getClass();
        this.E = tg5Var;
        this.G = Uri.EMPTY;
        this.H = Collections.EMPTY_MAP;
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) {
        tg5 tg5Var = this.E;
        this.G = ug5Var.a;
        this.H = Collections.EMPTY_MAP;
        try {
            return tg5Var.b(ug5Var);
        } finally {
            Uri uriM = tg5Var.m();
            if (uriM != null) {
                this.G = uriM;
            }
            this.H = tg5Var.i();
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        this.E.close();
    }

    @Override // defpackage.tg5
    public final Map i() {
        return this.E.i();
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.E.m();
    }

    @Override // defpackage.tg5
    public final void o(yp5 yp5Var) {
        yp5Var.getClass();
        this.E.o(yp5Var);
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.E.read(bArr, i, i2);
        if (i3 != -1) {
            this.F += (long) i3;
        }
        return i3;
    }
}
