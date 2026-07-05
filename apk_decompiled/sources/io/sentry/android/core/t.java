package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.y4;

/* JADX INFO: loaded from: classes.dex */
public final class t implements io.sentry.o1, y0, io.sentry.a1, io.sentry.logger.b, io.sentry.metrics.b {
    public static final t F = new t(0);
    public static final t G = new t(1);
    public final /* synthetic */ int E;

    public /* synthetic */ t(int i) {
        this.E = i;
    }

    @Override // io.sentry.o1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.a1
    public void b(t5 t5Var, Throwable th, String str, Object... objArr) {
        switch (this.E) {
            case 2:
                if (objArr.length != 0) {
                    d(t5Var, String.format(str, objArr), th);
                } else {
                    d(t5Var, str, th);
                }
                break;
            default:
                if (objArr.length != 0) {
                    d(t5Var, String.format(str, objArr), th);
                } else {
                    d(t5Var, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public io.sentry.metrics.a mo1181c(w6 w6Var, y4 y4Var) {
        o oVar = new o(w6Var, y4Var);
        f0.I.c(oVar);
        return oVar;
    }

    @Override // io.sentry.a1
    public void d(t5 t5Var, String str, Throwable th) {
        switch (this.E) {
            case 2:
                Log.wtf("Sentry", str, th);
                break;
            default:
                int i = k.a[t5Var.ordinal()];
                if (i == 1) {
                    Log.i("Sentry", str, th);
                    break;
                } else if (i == 2) {
                    Log.w("Sentry", str, th);
                    break;
                } else if (i == 3) {
                    Log.e("Sentry", str, th);
                    break;
                } else if (i == 4) {
                    Log.wtf("Sentry", str, th);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.o1
    public void e() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.a1
    public void h(t5 t5Var, String str, Object... objArr) {
        int i = 7;
        switch (this.E) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                if (objArr.length != 0) {
                    int i2 = k.a[t5Var.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 == 2) {
                        i = 5;
                    } else if (i2 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = k.a[t5Var.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 == 2) {
                        i = 5;
                    } else if (i3 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.a1
    public boolean l(t5 t5Var) {
        switch (this.E) {
        }
        return true;
    }

    @Override // io.sentry.logger.b
    public io.sentry.logger.a c(w6 w6Var, y4 y4Var) {
        return new m(w6Var, y4Var);
    }
}
