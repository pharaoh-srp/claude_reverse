package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e5e implements dsi {
    public long E;
    public long F;
    public final Object G;
    public final Object H;

    public e5e(g5e g5eVar, long j) {
        this.H = g5eVar;
        this.G = new LinkedHashMap(0, 0.75f, true);
        this.E = j;
        if (j > 0) {
            return;
        }
        sz6.p("maxSize <= 0");
        throw null;
    }

    @Override // defpackage.dsi
    public boolean a() {
        return true;
    }

    public void b(Object obj, Object obj2, c5e c5eVar) {
        c5e c5eVar2 = (c5e) obj2;
        ((g11) ((g5e) this.H).b).r((mab) obj, c5eVar2.b(), c5eVar2.a(), c5eVar2.c());
    }

    public long c() {
        if (this.F == -1) {
            long jH = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.G).entrySet()) {
                jH += h(entry.getKey(), entry.getValue());
            }
            this.F = jH;
        }
        return this.F;
    }

    public long d(long j) {
        long j2 = this.F;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.E;
        long j5 = j3 / j4;
        return (((fhe) this.H) == fhe.E || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.dsi
    public long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((fsi) this.G).f(d(j), sb0Var, sb0Var2, g(j, sb0Var, sb0Var3, sb0Var2));
    }

    public sb0 g(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        long j2 = this.F;
        long j3 = j + j2;
        long j4 = this.E;
        return j3 > j4 ? ((fsi) this.G).f(j4 - j2, sb0Var, sb0Var3, sb0Var2) : sb0Var2;
    }

    public long h(Object obj, Object obj2) throws Exception {
        try {
            long jC = ((c5e) obj2).c();
            if (jC >= 0) {
                return jC;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + jC).toString());
        } catch (Exception e) {
            this.F = -1L;
            throw e;
        }
    }

    public void i(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.G;
        while (c() > j) {
            if (linkedHashMap.isEmpty()) {
                if (c() == 0) {
                    return;
                }
                sz6.j("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) w44.K0(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.F = c() - h(key, value);
                b(key, value, null);
            }
        }
    }

    public boolean j(long j, boolean z, boolean z2) {
        uuk uukVar = (uuk) this.G;
        yzk yzkVar = (yzk) this.H;
        yzkVar.K0();
        yzkVar.O0();
        umk umkVar = (umk) yzkVar.E;
        if (umkVar.e()) {
            kjk kjkVar = yzkVar.I0().U;
            umkVar.R.getClass();
            kjkVar.b(System.currentTimeMillis());
        }
        long j2 = j - this.E;
        if (!z && j2 < 1000) {
            yzkVar.b0().R.c("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.F;
            this.F = j;
        }
        yzkVar.b0().R.c("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        h1l.n1(yzkVar.M0().S0(!umkVar.K.a1()), bundle, true);
        if (!z2) {
            yzkVar.L0().p1("auto", "_e", bundle);
        }
        this.E = j;
        uukVar.a();
        uukVar.b(((Long) zvj.c0.a(null)).longValue());
        return true;
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return ((fsi) this.G).p(d(j), sb0Var, sb0Var2, g(j, sb0Var, sb0Var3, sb0Var2));
    }

    public e5e(yzk yzkVar) {
        this.H = yzkVar;
        umk umkVar = (umk) yzkVar.E;
        this.G = new uuk(this, umkVar, 1);
        umkVar.R.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.E = jElapsedRealtime;
        this.F = jElapsedRealtime;
    }

    public e5e(fsi fsiVar, fhe fheVar) {
        this.G = fsiVar;
        this.H = fheVar;
        this.E = ((long) (fsiVar.o() + fsiVar.k())) * 1000000;
        this.F = 0L;
    }
}
