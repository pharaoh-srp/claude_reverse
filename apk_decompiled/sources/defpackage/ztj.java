package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ztj {
    public static final ta4 a = new ta4(-553024520, false, new p6(17));

    public static final void a(List list, List list2, String str, bz7 bz7Var, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        bz7 bz7Var2;
        e18 e18Var;
        iqb iqbVar2;
        list.getClass();
        list2.getClass();
        bz7Var.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2088265125);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(list2) : e18Var2.h(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(str != null ? ModelId.m1058boximpl(str) : null) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var2.h(bz7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        boolean z = false;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            qnc qncVarB = i4gVar.b();
            fqb fqbVar = fqb.E;
            iqb iqbVarF = tvk.f(b.c(fqbVar, 1.0f));
            boolean z2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var2.h(list))) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && e18Var2.h(list2))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objN = e18Var2.N();
            if (z3 || objN == jd4.a) {
                fe feVar = new fe(list, list2, str, bz7Var2, 4);
                e18Var2.k0(feVar);
                objN = feVar;
            }
            e18Var = e18Var2;
            knk.h(iqbVarF, null, qncVarB, false, null, null, null, false, null, (bz7) objN, e18Var, 0, 506);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(list, list2, str, bz7Var, i4gVar, iqbVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r33, int r34, defpackage.ld4 r35, defpackage.zy7 r36, defpackage.iqb r37, java.lang.String r38) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztj.b(int, int, ld4, zy7, iqb, java.lang.String):void");
    }

    public static final void c(ModelSelectorEntry modelSelectorEntry, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j;
        ta4 ta4Var;
        _ServerLocalizedString description;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-255343178);
        int i2 = i | (e18Var.f(modelSelectorEntry) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            long j2 = gm3.a(e18Var).k;
            if (z) {
                e18Var.a0(-571650596);
                e18Var.p(false);
                j = j2;
            } else if (modelSelectorEntry.isSelectable()) {
                e18Var.a0(-571648803);
                j = gm3.a(e18Var).M;
                e18Var.p(false);
            } else {
                e18Var.a0(-571647427);
                j = gm3.a(e18Var).O;
                e18Var.p(false);
            }
            String unavailableMessage = modelSelectorEntry.getUnavailableMessage();
            ta4 ta4VarQ0 = null;
            if (unavailableMessage == null) {
                e18Var.a0(-571643691);
                unavailableMessage = d4c.j0(R.string.ccr_model_unavailable, e18Var);
                if (!modelSelectorEntry.isKillSwitched()) {
                    unavailableMessage = null;
                }
            } else {
                e18Var.a0(-571646264);
            }
            e18Var.p(false);
            if (unavailableMessage == null) {
                Notice notice = modelSelectorEntry.getNotice();
                unavailableMessage = notice != null ? notice.getText() : null;
                if (unavailableMessage == null && ((description = modelSelectorEntry.getDescription()) == null || (unavailableMessage = description.getLocalizedText()) == null || bsg.I0(unavailableMessage))) {
                    unavailableMessage = null;
                }
            }
            if (unavailableMessage == null) {
                e18Var.a0(-539246099);
                e18Var.p(false);
                ta4Var = null;
            } else {
                e18Var.a0(-539246098);
                ta4 ta4VarQ02 = fd9.q0(31526895, new d32(unavailableMessage, z, j2), e18Var);
                e18Var.p(false);
                ta4Var = ta4VarQ02;
            }
            if (z) {
                e18Var.a0(-538869510);
                ta4VarQ0 = fd9.q0(-1180674079, new e32(j2, b, b), e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(-538660880);
                e18Var.p(false);
            }
            ta4 ta4Var2 = ta4VarQ0;
            boolean zIsSelectable = modelSelectorEntry.isSelectable();
            vue vueVar = new vue(3);
            fqb fqbVar = fqb.E;
            iqb iqbVarE0 = j8.e0(fqbVar, z, zIsSelectable, vueVar, zy7Var, 8);
            long j3 = j;
            ybi.b(null, fd9.q0(-1358849346, new d32(modelSelectorEntry, z, j3, 1), e18Var), iqbVarE0, ta4Var, ta4Var2, j3, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, 54, 0, 16320);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 2, modelSelectorEntry, zy7Var, iqbVar2, z);
        }
    }

    public static final void d(iqb iqbVar, long j, String str, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str2;
        String strJ0;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(195676413);
        int i2 = i | 6 | (e18Var.e(j) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                k4g k4gVar = k4g.a;
                strJ0 = d4c.j0(R.string.sheet_grabber_description, e18Var);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                strJ0 = str;
            }
            e18Var.q();
            iqb iqbVarP = yfd.p(xn5.V(b.p(k4g.g, gb9.I(iqbVar3, k4g.f)), xve.a), j, zni.b);
            boolean zF = e18Var.f(strJ0);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new cm5(strJ0, 24);
                e18Var.k0(objN);
            }
            dw1.a(tjf.b(iqbVarP, false, (bz7) objN), e18Var, 0);
            iqb iqbVar4 = iqbVar3;
            str2 = strJ0;
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            str2 = str;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fj2(iqbVar2, j, str2, i, 3);
        }
    }

    public static final int e(String str, int i, String str2) {
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        if (i >= str.length()) {
            return str2.length();
        }
        String strSubstring = str.substring(0, i);
        int i3 = 0;
        for (int i4 = 0; i4 < strSubstring.length(); i4++) {
            if (Character.isDigit(strSubstring.charAt(i4))) {
                i3++;
            }
        }
        int i5 = 0;
        while (i2 < i3 && i5 < str2.length()) {
            if (Character.isDigit(str2.charAt(i5))) {
                i2++;
            }
            i5++;
        }
        return i5;
    }

    public static final jc0 f(el5 el5Var, ace aceVar) {
        aceVar.getClass();
        Object obj = null;
        if (aceVar.c() == null) {
            sz6.p("Nullability annotations on unbounded wildcards aren't supported");
            return null;
        }
        Iterator it = new sx9(el5Var, aceVar, false).iterator();
        loop0: while (true) {
            al7 al7Var = (al7) it;
            if (!al7Var.hasNext()) {
                break;
            }
            Object next = al7Var.next();
            jc0 jc0Var = (jc0) next;
            for (ww7 ww7Var : he9.b) {
                if (x44.r(jc0Var.e(), ww7Var)) {
                    obj = next;
                    break loop0;
                }
            }
        }
        return (jc0) obj;
    }

    public static final boolean g(ud9 ud9Var) {
        return (ud9Var instanceof h08) && x44.r(ud9Var.n(ge9.k0), Boolean.TRUE);
    }

    public static final boolean h(bf9 bf9Var) {
        bf9Var.getClass();
        return af9.E.invoke(he9.a) == iie.STRICT;
    }

    public static final iqb i(iqb iqbVar, yzb yzbVar, b0c b0cVar) {
        return iqbVar.B(new c0c(yzbVar, b0cVar));
    }

    public static final ow5 j(kzi kziVar) {
        kziVar.getClass();
        ow5 ow5Var = (ow5) ce9.d.get(kziVar);
        return ow5Var == null ? q06.f(kziVar) : ow5Var;
    }
}
