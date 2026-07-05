package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.TaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kyk {
    public static iyk a;
    public static final xb b = new xb(3);

    public static final void a(ty5 ty5Var, String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        ty5Var.getClass();
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1396942146);
        int i2 = i | (e18Var.f(ty5Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            rwk.d(ty5Var, zy7Var, zy7Var2, d4c.k0(R.string.task_detail_delete_dialog_title, new Object[]{str}, e18Var), d4c.j0(R.string.task_detail_delete_dialog_confirm, e18Var), d4c.j0(R.string.task_detail_delete_dialog_subtitle, e18Var), 0, e18Var, i3 | (i4 & 112) | (i4 & 896), 64);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(ty5Var, str, zy7Var, zy7Var2, i, 2);
        }
    }

    public static long b(int i) {
        return Math.min(((1 << i) - 1) * 1000, 31000L);
    }

    public static boolean c(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean d(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean e(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean f(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static final int g(coc cocVar) {
        return (int) (cocVar.e == ukc.E ? cocVar.g() & 4294967295L : cocVar.g() >> 32);
    }

    public static final boolean h(hrd hrdVar) {
        hrdVar.getClass();
        return hrdVar.b() == null;
    }

    public static final Object i(zo1 zo1Var, ro6 ro6Var, g98 g98Var) {
        v84 v84VarC = zni.c();
        ap1 ap1Var = new ap1();
        ap1Var.a = v84VarC;
        zo1Var.c(ro6Var, ap1Var);
        return v84VarC.w(g98Var);
    }

    public static final Object j(zo1 zo1Var, zf zfVar, vp4 vp4Var) {
        v84 v84VarC = zni.c();
        ive iveVar = new ive(11, false);
        iveVar.F = v84VarC;
        zo1Var.getClass();
        if (zo1.f(new rqj(zo1Var, iveVar, zfVar.F), 30000L, new s2k(zo1Var, 13, iveVar), zo1Var.k(), zo1Var.e()) == null) {
            hp1 hp1VarN = zo1Var.n();
            zo1Var.z(25, 9, hp1VarN);
            kxj kxjVar = txj.F;
            iveVar.x(hp1VarN, szj.I);
        }
        return v84VarC.w(vp4Var);
    }

    public static final ty5 k(String str, e18 e18Var) {
        str.getClass();
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        TaskId taskIdM1128boximpl = TaskId.m1128boximpl(str);
        boolean zF = e18Var.f(str) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new jy5(str, m7fVar, 1);
            e18Var.k0(objN);
        }
        return (ty5) fd9.r0(jce.a.b(ty5.class), taskIdM1128boximpl, (bz7) objN, e18Var);
    }
}
