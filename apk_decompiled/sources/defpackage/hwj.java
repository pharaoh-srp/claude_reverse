package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hwj {
    public final pwj a;
    public boolean b;
    public long c;
    public long d;

    public hwj(pwj pwjVar) {
        if (pwjVar != null) {
            this.a = pwjVar;
        } else {
            mr9.h("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            sz6.j("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.b();
        }
    }

    public final String toString() {
        String str;
        long jB = this.b ? (this.a.b() - this.d) + this.c : this.c;
        TimeUnit timeUnit = jB / 86400000000000L > 0 ? TimeUnit.DAYS : jB / 3600000000000L > 0 ? TimeUnit.HOURS : jB / 60000000000L > 0 ? TimeUnit.MINUTES : jB / MathMethodsKt.NANOS_PER_SECOND > 0 ? TimeUnit.SECONDS : jB / 1000000 > 0 ? TimeUnit.MILLISECONDS : jB / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jB / r2.convert(1L, timeUnit)));
        switch (cwj.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                mr9.u();
                return null;
        }
        return ij0.C(str2, " ", str);
    }
}
