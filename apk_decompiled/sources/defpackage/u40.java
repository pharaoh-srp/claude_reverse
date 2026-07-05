package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class u40 {
    public static final xe4 a = new xe4(v00.M);
    public static final xe4 b = new xe4(v00.L);

    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.u9d r23, defpackage.zy7 r24, defpackage.v9d r25, defpackage.ta4 r26, defpackage.ld4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u40.a(u9d, zy7, v9d, ta4, ld4, int, int):void");
    }

    public static final void b(xo1 xo1Var, long j, v9d v9dVar, ta4 ta4Var, ld4 ld4Var, int i) {
        ta4 ta4Var2;
        v9d v9dVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(71005054);
        int i2 = (e18Var.e(j) ? 32 : 16) | i | 3456;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            v9d v9dVar3 = new v9d(false, 31);
            boolean zD = e18Var.d(1002) | ((i2 & 112) == 32) | e18Var.f(null);
            Object objN = e18Var.N();
            if (zD || objN == jd4.a) {
                objN = new cu(xo1Var, j);
                e18Var.k0(objN);
            }
            a((cu) objN, null, v9dVar3, ta4Var, e18Var, 3504, 0);
            ta4Var2 = ta4Var;
            v9dVar2 = v9dVar3;
        } else {
            ta4Var2 = ta4Var;
            e18Var.T();
            v9dVar2 = v9dVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m40(xo1Var, j, v9dVar2, ta4Var2, i);
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) ? false : true;
    }
}
