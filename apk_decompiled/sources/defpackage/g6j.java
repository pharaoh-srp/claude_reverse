package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g6j implements wp3, kz6, pek {
    public final /* synthetic */ int E;

    public /* synthetic */ g6j(int i) {
        this.E = i;
    }

    @Override // defpackage.wp3
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.O.a()).longValue());
            case 3:
                l1l.F.get();
                Boolean bool = (Boolean) n1l.b.a();
                bool.getClass();
                return bool;
            case 4:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.R.a()).longValue());
            case 5:
                k1l.F.get();
                Long l = (Long) m1l.b.a();
                l.getClass();
                return l;
            case 6:
                k1l.F.get();
                Long l2 = (Long) m1l.Z.a();
                l2.getClass();
                return l2;
            case 7:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.r.a()).longValue());
            case 8:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.q.a()).longValue());
            case 9:
                k1l.F.get();
                return (String) m1l.g.a();
            case 10:
                k1l.F.get();
                Boolean bool2 = (Boolean) m1l.c.a();
                bool2.getClass();
                return bool2;
            case 11:
                return Integer.valueOf((int) w1l.a());
            case 12:
                k1l.F.get();
                return (String) m1l.C.a();
            default:
                b4l.F.get();
                Boolean bool3 = (Boolean) d4l.g.a();
                bool3.getClass();
                return bool3;
        }
    }
}
