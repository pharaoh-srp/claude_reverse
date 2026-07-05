package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uwb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ bz7 c;

    public /* synthetic */ uwb(Object obj, bz7 bz7Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = bz7Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                bm7 bm7Var = (bm7) this.b;
                b73 b73Var = (b73) this.c;
                synchronized (((efk) bm7Var.b)) {
                    bm7Var.d = sta.i0(b73Var, (Map) bm7Var.d);
                }
                return;
            default:
                y50 y50Var = (y50) this.b;
                bz7 bz7Var = this.c;
                synchronized (((efk) y50Var.b)) {
                    y50Var.d = dxf.n0((Set) y50Var.d, bz7Var);
                }
                return;
        }
    }
}
