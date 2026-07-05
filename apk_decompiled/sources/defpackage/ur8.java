package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ur8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zr8 F;
    public final /* synthetic */ int G;

    public /* synthetic */ ur8(zr8 zr8Var, int i, List list, boolean z) {
        this.E = 2;
        this.F = zr8Var;
        this.G = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                zr8 zr8Var = this.F;
                int i = this.G;
                zr8Var.O.getClass();
                try {
                    zr8Var.b0.n(i, xr6.CANCEL);
                    synchronized (zr8Var) {
                        zr8Var.d0.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return iei.a;
            case 1:
                zr8 zr8Var2 = this.F;
                int i2 = this.G;
                zr8Var2.O.getClass();
                synchronized (zr8Var2) {
                    zr8Var2.d0.remove(Integer.valueOf(i2));
                }
                return iei.a;
            default:
                zr8 zr8Var3 = this.F;
                int i3 = this.G;
                zr8Var3.O.getClass();
                try {
                    zr8Var3.b0.n(i3, xr6.CANCEL);
                    synchronized (zr8Var3) {
                        zr8Var3.d0.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return iei.a;
        }
    }

    public /* synthetic */ ur8(zr8 zr8Var, int i, Object obj, int i2) {
        this.E = i2;
        this.F = zr8Var;
        this.G = i;
    }
}
