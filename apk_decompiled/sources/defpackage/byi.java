package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class byi implements pek, j5i, pi6, ri6 {
    public final /* synthetic */ int E;

    public /* synthetic */ byi(int i) {
        this.E = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ri6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qi6 a(android.content.Context r2, java.lang.String r3, defpackage.pi6 r4) {
        /*
            r1 = this;
            qi6 r1 = new qi6
            r1.<init>()
            int r0 = r4.c(r2, r3)
            r1.a = r0
            r0 = 1
            int r2 = r4.b(r2, r3, r0)
            r1.b = r2
            int r3 = r1.a
            if (r3 != 0) goto L1b
            r3 = 0
            if (r2 != 0) goto L1b
            r0 = r3
            goto L1e
        L1b:
            if (r3 < r2) goto L1e
            r0 = -1
        L1e:
            r1.c = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.a(android.content.Context, java.lang.String, pi6):qi6");
    }

    @Override // defpackage.j5i
    public Object apply(Object obj) {
        return ((ivk) obj).b();
    }

    @Override // defpackage.pi6
    public int b(Context context, String str, boolean z) {
        return si6.d(context, str, z);
    }

    @Override // defpackage.pi6
    public int c(Context context, String str) {
        return si6.a(context, str);
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 2:
                b4l.F.get();
                Boolean bool = (Boolean) d4l.a.a();
                bool.getClass();
                return bool;
            case 3:
                c3l.F.get();
                Boolean bool2 = (Boolean) e3l.b.a();
                bool2.getClass();
                return bool2;
            case 4:
                a2l.F.get();
                Boolean bool3 = (Boolean) c2l.a.a();
                bool3.getClass();
                return bool3;
            case 5:
                k1l.F.get();
                return (String) m1l.l.a();
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.D.a();
                l.getClass();
                return l;
            case 7:
            default:
                b4l.F.get();
                Boolean bool4 = (Boolean) d4l.d.a();
                bool4.getClass();
                return bool4;
            case 8:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.s.a()).longValue());
            case 9:
                k1l.F.get();
                return (String) m1l.E.a();
            case 10:
                k1l.F.get();
                Boolean bool5 = (Boolean) m1l.x.a();
                bool5.getClass();
                return bool5;
        }
    }
}
