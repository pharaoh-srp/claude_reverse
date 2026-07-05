package defpackage;

import android.util.Base64;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xnk {
    public static final ta4 a = new ta4(3546525, false, new rb4(26));
    public static final ta4 b = new ta4(-2052035804, false, new sb4(14));
    public static final ta4 c = new ta4(378714661, false, new sb4(15));

    public static final void a(ggc ggcVar, iqb iqbVar, mn5 mn5Var, ld4 ld4Var, int i) {
        int i2;
        mn5 mn5Var2;
        int i3;
        mn5 mn5Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-462221320);
        int i4 = 2;
        int i5 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ggcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i6 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            int i7 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i7 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i3 = i2 & (-897);
                mn5Var3 = (mn5) objN;
            } else {
                e18Var.T();
                i3 = i2 & (-897);
                mn5Var3 = mn5Var;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(new fi(mn5Var3, (LocalDate) ggcVar.a.t.getValue(), i5));
                e18Var.k0(objN2);
            }
            nwb nwbVar = (nwb) objN2;
            String strJ0 = d4c.j0(R.string.onboarding_v2_age_title, e18Var);
            String strJ02 = d4c.j0(R.string.onboarding_v2_age_subtitle, e18Var);
            String strJ03 = d4c.j0(R.string.onboarding_v2_continue, e18Var);
            boolean zB = ((hi) nwbVar.getValue()).b();
            iqb iqbVarB = iqbVar.B(b.c);
            boolean z = (i3 & 14) == 4;
            Object objN3 = e18Var.N();
            if (z || objN3 == lz1Var) {
                objN3 = new k6(ggcVar, i4, nwbVar);
                e18Var.k0(objN3);
            }
            nvk.d(strJ0, strJ02, strJ03, (zy7) objN3, iqbVarB, zB, false, false, null, null, fd9.q0(640141356, new ii(ggcVar, i6, nwbVar), e18Var), e18Var, 0, 960);
            mn5Var2 = mn5Var3;
        } else {
            e18Var.T();
            mn5Var2 = mn5Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(ggcVar, i, iqbVar, mn5Var2, 0);
        }
    }

    public static final void b(boolean z, jme jmeVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String str;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(368923237);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(jmeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String str2 = null;
            if (jmeVar != null && (str = jmeVar.g) != null && str.length() > 0) {
                str2 = str;
            }
            pvj.g((jmeVar == null && z) ? false : true, yfd.p(fqb.E, gm3.a(e18Var).p, xve.b(4.0f)), 0L, fd9.q0(-1829548271, new tfe(jmeVar, str2, iqbVar, 3), e18Var), e18Var, 3072);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(z, jmeVar, iqbVar, i, 10);
        }
    }

    public static String c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final View d(hqb hqbVar) {
        nxi nxiVar = yfd.W(hqbVar.E).T;
        View interopView = nxiVar != null ? nxiVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        sz6.j("Could not fetch interop view");
        return null;
    }

    public static final aeh e(nw5 nw5Var) {
        leh lehVar;
        ydh ydhVar = new ydh();
        j8.m0(nw5Var, ceh.a, new d6d(new d6d(25, ydhVar), new b2g(1, ydhVar, ydh.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 9)));
        qvb qvbVar = new qvb();
        qvb qvbVar2 = ydhVar.a;
        Object[] objArr = qvbVar2.a;
        int i = qvbVar2.b;
        int i2 = 0;
        boolean z = true;
        zdh zdhVar = null;
        while (true) {
            lehVar = leh.b;
            if (i2 >= i) {
                break;
            }
            zdh zdhVar2 = (zdh) objArr[i2];
            if (!z || zdhVar2 != lehVar) {
                if (zdhVar2 == lehVar && zdhVar == lehVar) {
                    z = false;
                    break;
                    break;
                }
                if (zdhVar2 != lehVar) {
                    qvb qvbVar3 = ydhVar.b;
                    Object[] objArr2 = qvbVar3.a;
                    int i3 = qvbVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (!((Boolean) ((bz7) objArr2[i4]).invoke(zdhVar2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                qvbVar.a(zdhVar2);
                z = false;
                zdhVar = zdhVar2;
            }
            i2++;
        }
        if (((zdh) (qvbVar.h() ? null : qvbVar.a[qvbVar.b - 1])) == lehVar) {
            qvbVar.k(qvbVar.b - 1);
        }
        ovb ovbVar = qvbVar.c;
        if (ovbVar == null) {
            ovbVar = new ovb(qvbVar);
            qvbVar.c = ovbVar;
        }
        return new aeh(ovbVar);
    }

    public static int f(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long g(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static boolean h(String str) {
        str.getClass();
        return str.equals("WebViewError") || str.equals("WebViewHttpError");
    }
}
