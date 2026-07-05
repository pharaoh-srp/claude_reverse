package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class log implements Runnable {
    public final xhd E;
    public final hlg F;
    public final boolean G;
    public final int H;

    public log(xhd xhdVar, hlg hlgVar, boolean z, int i) {
        xhdVar.getClass();
        hlgVar.getClass();
        this.E = xhdVar;
        this.F = hlgVar;
        this.G = z;
        this.H = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qhj qhjVarB;
        boolean z = this.G;
        xhd xhdVar = this.E;
        hlg hlgVar = this.F;
        if (z) {
            int i = this.H;
            xhdVar.getClass();
            String str = hlgVar.a.a;
            synchronized (xhdVar.k) {
                qhjVarB = xhdVar.b(str);
            }
            xhd.d(qhjVarB, i);
        } else {
            int i2 = this.H;
            xhdVar.getClass();
            String str2 = hlgVar.a.a;
            synchronized (xhdVar.k) {
                try {
                    if (xhdVar.f.get(str2) != null) {
                        nga.c().getClass();
                    } else {
                        Set set = (Set) xhdVar.h.get(str2);
                        if (set != null && set.contains(hlgVar)) {
                            xhd.d(xhdVar.b(str2), i2);
                        }
                    }
                } finally {
                }
            }
        }
        nga ngaVarC = nga.c();
        nga.e("StopWorkRunnable");
        String str3 = this.F.a.a;
        ngaVarC.getClass();
    }
}
