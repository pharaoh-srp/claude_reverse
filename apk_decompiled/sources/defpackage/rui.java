package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class rui {
    public final qb5 a;
    public final lui b;
    public final rv1 c = new rv1(3);
    public final bi0 d = new bi0();
    public final bi0 e = new bi0();
    public final jw1 f;
    public final mui g;
    public long h;
    public long i;
    public long j;
    public yui k;
    public long l;

    public rui(qb5 qb5Var, lui luiVar, mui muiVar) {
        this.a = qb5Var;
        this.b = luiVar;
        this.g = muiVar;
        jw1 jw1Var = new jw1();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        jw1Var.E = 0;
        jw1Var.F = -1;
        jw1Var.G = 0;
        jw1Var.I = new long[iHighestOneBit];
        jw1Var.H = iHighestOneBit - 1;
        this.f = jw1Var;
        this.h = -9223372036854775807L;
        this.k = yui.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final qb5 qb5Var = this.a;
        wv5 wv5Var = (wv5) qb5Var.F;
        while (true) {
            jw1 jw1Var = this.f;
            int i = jw1Var.G;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                pmf.d();
                return;
            }
            long j3 = ((long[]) jw1Var.I)[jw1Var.E];
            Long l = (Long) this.e.K(j3);
            lui luiVar = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                luiVar.e(2);
            }
            long j4 = this.l;
            lui luiVar2 = this.b;
            rv1 rv1Var = this.c;
            int iA = luiVar2.a(j3, j, j2, j4, false, false, rv1Var);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, rv1Var.a);
            }
            final int i2 = 0;
            if (iA == 0 || iA == 1) {
                this.i = j3;
                boolean z = iA == 0;
                long jA = jw1Var.a();
                yui yuiVar = (yui) this.d.K(jA);
                if (yuiVar != null && !yuiVar.equals(yui.d) && !yuiVar.equals(this.k)) {
                    this.k = yuiVar;
                    iw7 iw7Var = new iw7();
                    iw7Var.u = yuiVar.a;
                    iw7Var.v = yuiVar.b;
                    iw7Var.n = gkb.k("video/raw");
                    qb5Var.E = new jw7(iw7Var);
                    wv5Var.i.execute(new fd(qb5Var, 29, yuiVar));
                }
                long jNanoTime = z ? System.nanoTime() : rv1Var.b;
                i = luiVar.e == 3 ? 0 : 1;
                luiVar.e = 3;
                luiVar.l.getClass();
                luiVar.g = tpi.C(SystemClock.elapsedRealtime());
                if (i != 0 && wv5Var.e != null) {
                    wv5Var.i.execute(new Runnable() { // from class: vv5
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            qb5 qb5Var2 = qb5Var;
                            switch (i3) {
                                case 0:
                                    ((wv5) qb5Var2.F).h.b();
                                    break;
                                default:
                                    ((wv5) qb5Var2.F).h.c();
                                    break;
                            }
                        }
                    });
                }
                jw7 jw7Var = (jw7) qb5Var.E;
                wv5Var.j.b(jA, jNanoTime, jw7Var == null ? new jw7(new iw7()) : jw7Var, null);
                u6b u6bVar = (u6b) wv5Var.d.remove();
                u6bVar.c.N0(u6bVar.a, u6bVar.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = j3;
                jw1Var.a();
                wv5Var.i.execute(new Runnable() { // from class: vv5
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        qb5 qb5Var2 = qb5Var;
                        switch (i3) {
                            case 0:
                                ((wv5) qb5Var2.F).h.b();
                                break;
                            default:
                                ((wv5) qb5Var2.F).h.c();
                                break;
                        }
                    }
                });
                u6b u6bVar2 = (u6b) wv5Var.d.remove();
                x6b x6bVar = u6bVar2.c;
                d6b d6bVar = u6bVar2.a;
                int i3 = u6bVar2.b;
                Trace.beginSection("dropVideoBuffer");
                d6bVar.e(i3);
                Trace.endSection();
                x6bVar.S0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    sz6.j(String.valueOf(iA));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
