package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class cli implements wp3, b45, pek, jjk {
    public final /* synthetic */ int E;

    public /* synthetic */ cli(int i) {
        this.E = i;
    }

    @Override // defpackage.wp3
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.jjk
    public glk e(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.jjk
    public boolean w(Class cls) {
        return false;
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                k1l.F.get();
                Long l = (Long) m1l.a.a();
                l.getClass();
                return l;
            case 3:
                return Boolean.valueOf(i2l.a());
            case 4:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.T.a()).longValue());
            case 5:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.Q.a()).longValue());
            case 6:
                k1l.F.get();
                Long l2 = (Long) m1l.z.a();
                l2.getClass();
                return l2;
            case 7:
                t2l.F.get();
                Boolean bool = (Boolean) v2l.a.a();
                bool.getClass();
                return bool;
            case 8:
                x1l.F.get();
                Boolean bool2 = (Boolean) z1l.a.a();
                bool2.getClass();
                return bool2;
            case 9:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.n.a()).longValue());
            case 10:
                k1l.F.get();
                return (String) m1l.H.a();
            case 11:
                return Boolean.valueOf(w3l.a());
            case 12:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.P.a()).longValue());
            default:
                k3l.F.get();
                Boolean bool3 = (Boolean) v3l.a.a();
                bool3.getClass();
                return bool3;
        }
    }
}
