package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sai implements pek, dzk {
    public final /* synthetic */ int E;

    public /* synthetic */ sai(int i) {
        this.E = i;
    }

    @Override // defpackage.dzk
    public boolean e(Class cls) {
        return false;
    }

    @Override // defpackage.dzk
    public zzk f(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public String toString() {
        switch (this.E) {
            case 1:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                b4l.F.get();
                Boolean bool = (Boolean) d4l.c.a();
                bool.getClass();
                return bool;
            case 3:
                e2l.F.get();
                Boolean bool2 = (Boolean) g2l.a.a();
                bool2.getClass();
                return bool2;
            case 4:
                b2l.F.get();
                Boolean bool3 = (Boolean) d2l.b.a();
                bool3.getClass();
                return bool3;
            case 5:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.W.a()).longValue());
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.h.a();
                l.getClass();
                return l;
            case 7:
                k1l.F.get();
                Long l2 = (Long) m1l.V.a();
                l2.getClass();
                return l2;
            case 8:
                x3l.F.get();
                Long l3 = (Long) z3l.e.a();
                l3.getClass();
                return l3;
            case 9:
                k1l.F.get();
                Long l4 = (Long) m1l.J.a();
                l4.getClass();
                return l4;
            case 10:
                k1l.F.get();
                return (String) m1l.y.a();
            case 11:
                u2l.F.get();
                Boolean bool4 = (Boolean) w2l.b.a();
                bool4.getClass();
                return bool4;
            case 12:
                return Boolean.valueOf(e4l.b());
            default:
                f3l.F.get();
                Boolean bool5 = (Boolean) h3l.a.a();
                bool5.getClass();
                return bool5;
        }
    }
}
