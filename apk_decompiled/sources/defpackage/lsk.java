package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lsk {
    public static final ta4 a = new ta4(716264340, false, new vb4(22));

    public static final void a(vxc vxcVar, gh2 gh2Var, zy7 zy7Var, ld4 ld4Var, int i) {
        vxcVar.getClass();
        gh2Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(501619551);
        int i2 = i | (e18Var.f(vxcVar) ? 4 : 2) | (e18Var.f(gh2Var) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            kl8 kl8VarG = msk.g(gh2Var, e18Var, (i2 >> 3) & 14);
            int i3 = i2 & 14;
            boolean zH = e18Var.h(kl8VarG) | (i3 == 4);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ny4(vxcVar, kl8VarG, nwbVar, 10);
                e18Var.k0(objN2);
            }
            yjk.g(vxcVar, (bz7) objN2, null, zy7Var, null, null, e18Var, i3 | ((i2 << 3) & 7168), 52);
            eyh eyhVar = (eyh) nwbVar.getValue();
            if (eyhVar == null) {
                e18Var.a0(1557543172);
                e18Var.p(false);
            } else {
                e18Var.a0(1557543173);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new sy4(29, nwbVar);
                    e18Var.k0(objN3);
                }
                esk.a(kl8VarG, (zy7) objN3, eyhVar, e18Var, 56);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(vxcVar, gh2Var, zy7Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r22, int r23, defpackage.ld4 r24, defpackage.zy7 r25, defpackage.iqb r26) {
        /*
            r4 = r25
            r4.getClass()
            r0 = r24
            e18 r0 = (defpackage.e18) r0
            r1 = 1428909406(0x552b6d5e, float:1.1780389E13)
            r0.c0(r1)
            r1 = r22 & 6
            if (r1 != 0) goto L1f
            boolean r1 = r0.h(r4)
            if (r1 == 0) goto L1b
            r1 = 4
            goto L1c
        L1b:
            r1 = 2
        L1c:
            r1 = r22 | r1
            goto L21
        L1f:
            r1 = r22
        L21:
            r2 = r23 & 2
            if (r2 == 0) goto L2a
            r1 = r1 | 48
        L27:
            r3 = r26
            goto L3c
        L2a:
            r3 = r22 & 48
            if (r3 != 0) goto L27
            r3 = r26
            boolean r5 = r0.f(r3)
            if (r5 == 0) goto L39
            r5 = 32
            goto L3b
        L39:
            r5 = 16
        L3b:
            r1 = r1 | r5
        L3c:
            r5 = r1 & 19
            r6 = 18
            if (r5 == r6) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            r7 = r1 & 1
            boolean r5 = r0.Q(r7, r5)
            if (r5 == 0) goto L7f
            if (r2 == 0) goto L53
            fqb r2 = defpackage.fqb.E
            r5 = r2
            goto L54
        L53:
            r5 = r3
        L54:
            tu r2 = new tu
            r2.<init>(r6, r4)
            r3 = -937669100(0xffffffffc81c4e14, float:-160056.31)
            ta4 r18 = defpackage.fd9.q0(r3, r2, r0)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r21 = 2042(0x7fa, float:2.861E-42)
            r6 = 0
            ta4 r7 = defpackage.ppk.a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = r0
            r20 = r1
            defpackage.v40.b(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21)
            goto L85
        L7f:
            r19 = r0
            r19.T()
            r5 = r3
        L85:
            r7e r6 = r19.s()
            if (r6 == 0) goto L97
            vp r0 = new vp
            r3 = 3
            r1 = r22
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsk.b(int, int, ld4, zy7, iqb):void");
    }

    public static final String c(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        str.getClass();
        return str;
    }

    public static void d(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final ote e(tkh tkhVar, va6 va6Var, ld4 ld4Var, int i, int i2) {
        dv7 dv7Var = ((tkh) ((wk) gm3.c(ld4Var).e.F).g).a.c;
        tkh tkhVar2 = (tkh) ((wk) gm3.c(ld4Var).e.F).c;
        long jB = eve.B(8);
        ah8 ah8Var = new ah8((tkh) ((wk) gm3.c(ld4Var).e.F).d, (tkh) ((wk) gm3.c(ld4Var).e.F).e, (tkh) ((wk) gm3.c(ld4Var).e.F).a);
        oaa oaaVar = new oaa(new clh(eve.B(8)), new clh(eve.B(4)), new clh(eve.B(4)), null, null);
        long j = gm3.a(ld4Var).a;
        long j2 = gm3.a(ld4Var).u;
        va6 va6Var2 = (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : va6Var;
        boolean z = ((((i & 14) ^ 6) > 4 && ((e18) ld4Var).f(tkhVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((e18) ld4Var).f(dv7Var)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && ((e18) ld4Var).f(tkhVar2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && ((e18) ld4Var).e(jB)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && ((e18) ld4Var).f(ah8Var)) || (i & 24576) == 16384) | ((((458752 & i) ^ 196608) > 131072 && ((e18) ld4Var).f(oaaVar)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) > 1048576 && ((e18) ld4Var).e(j)) || (i & 1572864) == 1048576) | ((((29360128 & i) ^ 12582912) > 8388608 && ((e18) ld4Var).e(j2)) || (i & 12582912) == 8388608) | ((((234881024 & i) ^ 100663296) > 67108864 && ((e18) ld4Var).f(va6Var2)) || (i & 100663296) == 67108864);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (z || objN == jd4.a) {
            clh clhVar = new clh(jB);
            mk4 mk4Var = new mk4(24, ah8Var);
            rr1 rr1Var = new rr1();
            zq3 zq3Var = new zq3(tkhVar2, fqb.E, new clh(eve.B(16)), Boolean.FALSE);
            w3h w3hVar = new w3h(va6Var2, new d54(j2), 19);
            if (dv7Var == null) {
                dv7Var = dv7.M;
            }
            dv7 dv7Var2 = dv7Var;
            egg eggVar = tkhVar2.a;
            egg eggVar2 = new egg(0L, 0L, dv7Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
            egg eggVar3 = new egg(0L, 0L, null, new wu7(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
            qeh qehVar = qeh.c;
            ote oteVar = new ote(clhVar, mk4Var, oaaVar, rr1Var, zq3Var, w3hVar, new nte(eggVar2, eggVar3, new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qehVar, null, 61439), new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.d, null, 61439), eggVar, new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qehVar, null, 61438), 48), 64);
            e18Var.k0(oteVar);
            objN = oteVar;
        }
        return (ote) objN;
    }

    public static String f(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        mr9.y();
        return null;
    }
}
