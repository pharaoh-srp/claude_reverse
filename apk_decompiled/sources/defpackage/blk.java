package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class blk {
    public static final ta4 a = new ta4(-174272049, false, new pb4(15));

    public static final void a(ukg ukgVar, q68 q68Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1589731815);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(ukgVar) : e18Var.h(ukgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(q68Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            kud.a(q68Var.d(new bc1(new j50(R.drawable.claude_widget_button_background), new e54(new irh(((ni6) e18Var.j(te4.e)).k)))).d(new pb(ukgVar, R.drawable.claude_widget_button_ripple)), st.d, fd9.q0(-395867397, new rx0(ta4Var, 8), e18Var), e18Var, 384);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(ukgVar, i, q68Var, ta4Var, 11);
        }
    }

    public static final void b(Uri uri, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        uri.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1087519010);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (e18Var.h(uri) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, ((i4 << 6) & 7168) | 6, 6);
            iqbVar2 = fqb.E;
            auj.b(r4gVarS, d4c.j0(R.string.feedback_view_photo, e18Var), iqbVar2, null, false, null, a5g.F, null, null, fd9.q0(1099760179, new u22(r4gVarS, i3), e18Var), null, null, fd9.q0(1471153764, new nn(22, uri), e18Var), e18Var, 819462152 | (i4 & 896), 384, 3384);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(uri, i, zy7Var, iqbVar2, 2);
        }
    }

    public static final void c(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        e18 e18Var;
        String strK0;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-803042963);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            if (x44.r(str2, "cyber")) {
                e18Var2.a0(1369831478);
                strK0 = d4c.k0(R.string.ccr_refusal_paused_body_cyber, new Object[]{str}, e18Var2);
                e18Var2.p(false);
            } else if (x44.r(str2, "bio")) {
                e18Var2.a0(1369834612);
                strK0 = d4c.k0(R.string.ccr_refusal_paused_body_bio, new Object[]{str}, e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(1369839992);
                strK0 = d4c.k0(R.string.ccr_refusal_paused_body_generic, new Object[]{str}, e18Var2);
                e18Var2.p(false);
            }
            e18Var2.a0(1369843577);
            xb0 xb0Var = new xb0();
            e18Var2.a0(1369844602);
            int iM = xb0Var.m(new egg(0L, 0L, dv7.M, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                xb0Var.h(d4c.j0(R.string.ccr_refusal_paused_prefix, e18Var2));
                xb0Var.j(iM);
                e18Var2.p(false);
                xb0Var.h(": ");
                xb0Var.h(strK0);
                zb0 zb0VarN = xb0Var.n();
                e18Var2.p(false);
                e18Var = e18Var2;
                tjh.c(zb0VarN, b.c(iqbVar, 1.0f), gm3.a(e18Var2).N, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 0, 0, 262136);
            } catch (Throwable th) {
                xb0Var.j(iM);
                throw th;
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl3(str, str2, iqbVar, i, 2);
        }
    }

    public static void d() {
        try {
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
            WebStorage.getInstance().deleteAllData();
        } catch (RuntimeException e) {
            SilentException.a(new SilentException("WebViewStateCleaner: failed to clear WebView state", e), ozf.F, false, 2);
        }
    }

    public static final tkg e(qqb qqbVar, qqb qqbVar2) {
        qqbVar.getClass();
        qqbVar2.getClass();
        qqbVar.i0().size();
        qqbVar2.i0().size();
        List listI0 = qqbVar.i0();
        listI0.getClass();
        List list = listI0;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qai) it.next()).p());
        }
        List listI02 = qqbVar2.i0();
        listI02.getClass();
        List list2 = listI02;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        Iterator it2 = list2.iterator();
        while (true) {
            int i = 1;
            if (!it2.hasNext()) {
                return new tkg(i, sta.p0(w44.v1(arrayList, arrayList2)));
            }
            j7g j7gVarW = ((qai) it2.next()).W();
            j7gVarW.getClass();
            arrayList2.add(new wai(1, j7gVarW));
        }
    }

    public static ia f(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new ia(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ContainerView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ContainerView", e3);
            return null;
        }
    }

    public static pbh g(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new pbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type View", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type View", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type View", e3);
            return null;
        }
    }
}
