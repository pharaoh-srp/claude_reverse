package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wd1 implements tg5 {
    public final boolean E;
    public final ArrayList F = new ArrayList(1);
    public int G;
    public ug5 H;

    public wd1(boolean z) {
        this.E = z;
    }

    public final void j(int i) {
        boolean z;
        ug5 ug5Var = this.H;
        String str = tpi.a;
        for (int i2 = 0; i2 < this.G; i2++) {
            yp5 yp5Var = (yp5) this.F.get(i2);
            boolean z2 = this.E;
            synchronized (yp5Var) {
                vde vdeVar = yp5.p;
                if (z2) {
                    int i3 = ug5Var.g;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    yp5Var.i += (long) i;
                }
            }
        }
    }

    public final void n() {
        boolean z;
        ug5 ug5Var = this.H;
        String str = tpi.a;
        for (int i = 0; i < this.G; i++) {
            yp5 yp5Var = (yp5) this.F.get(i);
            boolean z2 = this.E;
            synchronized (yp5Var) {
                try {
                    vde vdeVar = yp5.p;
                    if (z2) {
                        int i2 = ug5Var.g;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        fd9.M(yp5Var.g > 0);
                        yp5Var.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - yp5Var.h);
                        yp5Var.j += (long) i3;
                        long j = yp5Var.k;
                        long j2 = yp5Var.i;
                        yp5Var.k = j + j2;
                        if (i3 > 0) {
                            yp5Var.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (yp5Var.j >= 2000 || yp5Var.k >= 524288) {
                                yp5Var.l = (long) yp5Var.f.b();
                            }
                            yp5Var.b(yp5Var.i, i3, yp5Var.l);
                            yp5Var.h = jElapsedRealtime;
                            yp5Var.i = 0L;
                        }
                        yp5Var.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.H = null;
    }

    @Override // defpackage.tg5
    public final void o(yp5 yp5Var) {
        yp5Var.getClass();
        ArrayList arrayList = this.F;
        if (arrayList.contains(yp5Var)) {
            return;
        }
        arrayList.add(yp5Var);
        this.G++;
    }

    public final void q() {
        for (int i = 0; i < this.G; i++) {
            ((yp5) this.F.get(i)).getClass();
        }
    }

    public final void r(ug5 ug5Var) {
        boolean z;
        this.H = ug5Var;
        for (int i = 0; i < this.G; i++) {
            yp5 yp5Var = (yp5) this.F.get(i);
            boolean z2 = this.E;
            synchronized (yp5Var) {
                try {
                    vde vdeVar = yp5.p;
                    if (z2) {
                        int i2 = ug5Var.g;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (yp5Var.g == 0) {
                            yp5Var.d.getClass();
                            yp5Var.h = SystemClock.elapsedRealtime();
                        }
                        yp5Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
