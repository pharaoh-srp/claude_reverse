package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jli implements s6f, plj, pek {
    public final /* synthetic */ int E;

    public /* synthetic */ jli(int i) {
        this.E = i;
    }

    @Override // defpackage.qlj
    public /* synthetic */ Object d() {
        return new zlj("IntegrityService");
    }

    @Override // defpackage.s6f
    public a7a h(int i, int i2, String str) {
        int iF;
        int i3 = i + 3;
        if (i3 >= str.length() || str.charAt(i + 1) != '/' || str.charAt(i + 2) != '/') {
            return null;
        }
        int i4 = -1;
        int i5 = -1;
        for (int i6 = i - 1; i6 >= i2; i6--) {
            char cCharAt = str.charAt(i6);
            if (auk.i(cCharAt)) {
                i4 = i6;
            } else if (!auk.j(cCharAt)) {
                if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                    break;
                }
            } else {
                i5 = i6;
            }
        }
        if (i4 > 0 && i4 - 1 == i5) {
            i4 = -1;
        }
        if (i4 == -1 || (iF = auk.f(i3, str)) == -1) {
            return null;
        }
        return new a7a(c7a.E, i4, iF + 1);
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                b4l.F.get();
                Boolean bool = (Boolean) d4l.f.a();
                bool.getClass();
                return bool;
            case 3:
                c3l.F.get();
                Boolean bool2 = (Boolean) e3l.a.a();
                bool2.getClass();
                return bool2;
            case 4:
                a2l.F.get();
                Boolean bool3 = (Boolean) c2l.b.a();
                bool3.getClass();
                return bool3;
            case 5:
                k1l.F.get();
                return (String) m1l.a0.a();
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.u.a();
                l.getClass();
                return l;
            case 7:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.m.a()).longValue());
            case 8:
                x3l.F.get();
                return Integer.valueOf((int) ((Long) z3l.d.a()).longValue());
            case 9:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.t.a()).longValue());
            case 10:
                k1l.F.get();
                return (String) m1l.j.a();
            case 11:
                u2l.F.get();
                Boolean bool4 = (Boolean) w2l.c.a();
                bool4.getClass();
                return bool4;
            case 12:
                i4l.F.get();
                Boolean bool5 = (Boolean) k4l.b.a();
                bool5.getClass();
                return bool5;
            default:
                y2l.F.get();
                Boolean bool6 = (Boolean) a3l.a.a();
                bool6.getClass();
                return bool6;
        }
    }
}
