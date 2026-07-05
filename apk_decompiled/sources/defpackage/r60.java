package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r60 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;

    public /* synthetic */ r60(Object obj, long j, int i) {
        this.E = i;
        this.G = obj;
        this.F = j;
    }

    @Override // defpackage.zy7
    public final Object a() {
        boolean z;
        switch (this.E) {
            case 0:
                return ((rzf) ((jy1) this.G)).c(this.F);
            default:
                zr8 zr8Var = (zr8) this.G;
                long j = this.F;
                synchronized (zr8Var) {
                    long j2 = zr8Var.Q;
                    long j3 = zr8Var.P;
                    if (j2 < j3) {
                        z = true;
                    } else {
                        zr8Var.P = j3 + 1;
                        z = false;
                    }
                }
                if (!z) {
                    try {
                        zr8Var.b0.j(1, 0, false);
                    } catch (IOException e) {
                        xr6 xr6Var = xr6.PROTOCOL_ERROR;
                        zr8Var.c(xr6Var, xr6Var, e);
                    }
                    break;
                } else {
                    xr6 xr6Var2 = xr6.PROTOCOL_ERROR;
                    zr8Var.c(xr6Var2, xr6Var2, null);
                    j = -1;
                }
                return Long.valueOf(j);
        }
    }
}
