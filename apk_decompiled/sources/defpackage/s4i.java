package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s4i implements t4i, pek, ri6 {
    public final /* synthetic */ int E;

    public /* synthetic */ s4i(int i) {
        this.E = i;
    }

    public static final w70 b(int i, String str) {
        WeakHashMap weakHashMap = gdj.x;
        return new w70(i, str);
    }

    public static final ari c(int i, String str) {
        WeakHashMap weakHashMap = gdj.x;
        return new ari(new o59(0, 0, 0, 0), str);
    }

    public static gdj d(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        View view = (View) e18Var.j(w00.f);
        gdj gdjVarE = e(view);
        boolean zH = e18Var.h(gdjVarE) | e18Var.h(view);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new e6f(gdjVarE, 16, view);
            e18Var.k0(objN);
        }
        fd9.d(gdjVarE, (bz7) objN, e18Var);
        return gdjVarE;
    }

    public static gdj e(View view) {
        gdj gdjVar;
        WeakHashMap weakHashMap = gdj.x;
        synchronized (weakHashMap) {
            try {
                Object gdjVar2 = weakHashMap.get(view);
                if (gdjVar2 == null) {
                    gdjVar2 = new gdj(view);
                    weakHashMap.put(view, gdjVar2);
                }
                gdjVar = (gdj) gdjVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gdjVar;
    }

    public static boolean f() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.ri6
    public qi6 a(Context context, String str, pi6 pi6Var) {
        int iB;
        qi6 qi6Var = new qi6();
        int iC = pi6Var.c(context, str);
        qi6Var.a = iC;
        int i = 1;
        int i2 = 0;
        if (iC != 0) {
            iB = pi6Var.b(context, str, false);
            qi6Var.b = iB;
        } else {
            iB = pi6Var.b(context, str, true);
            qi6Var.b = iB;
        }
        int i3 = qi6Var.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            qi6Var.c = i;
            return qi6Var;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        qi6Var.c = i;
        return qi6Var;
    }

    @Override // defpackage.t4i
    public wg8 get() {
        return wg8.F;
    }

    @Override // defpackage.pek
    public Object zza() {
        switch (this.E) {
            case 3:
                f4l.F.get();
                Boolean bool = (Boolean) h4l.a.a();
                bool.getClass();
                return bool;
            case 4:
                return Boolean.valueOf(f2l.b());
            case 5:
                i1l.F.get();
                Boolean bool2 = (Boolean) j1l.a.a();
                bool2.getClass();
                return bool2;
            case 6:
                k1l.F.get();
                Long l = (Long) m1l.b0.a();
                l.getClass();
                return l;
            case 7:
                k1l.F.get();
                Long l2 = (Long) m1l.M.a();
                l2.getClass();
                return l2;
            case 8:
                x3l.F.get();
                return (String) z3l.f.a();
            case 9:
                k1l.F.get();
                return Integer.valueOf((int) ((Long) m1l.d.a()).longValue());
            case 10:
                k1l.F.get();
                Long l3 = (Long) m1l.i.a();
                l3.getClass();
                return l3;
            case 11:
                return Boolean.valueOf(a4l.a());
            case 12:
                x1l.F.get();
                Boolean bool3 = (Boolean) z1l.d.a();
                bool3.getClass();
                return bool3;
            case 13:
                return Boolean.valueOf(x2l.a());
            default:
                b4l.F.get();
                Boolean bool4 = (Boolean) d4l.h.a();
                bool4.getClass();
                return bool4;
        }
    }
}
