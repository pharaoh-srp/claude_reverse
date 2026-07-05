package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lg6 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ lg6(Object obj, int i, int i2, int i3) {
        this.E = i3;
        this.H = obj;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = this.G;
        int i3 = this.F;
        Object obj = this.H;
        switch (i) {
            case 0:
                ((pz7) obj).invoke(Integer.valueOf(i3), Integer.valueOf(i2 - 1));
                return Boolean.TRUE;
            default:
                zr8 zr8Var = (zr8) obj;
                try {
                    zr8Var.b0.j(i3, i2, true);
                    break;
                } catch (IOException e) {
                    xr6 xr6Var = xr6.PROTOCOL_ERROR;
                    zr8Var.c(xr6Var, xr6Var, e);
                }
                return iei.a;
        }
    }
}
