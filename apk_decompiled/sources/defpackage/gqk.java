package defpackage;

import android.view.ActionMode;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gqk {
    public static final ta4 a = new ta4(-1688576862, false, new tb4(18));

    public static final void a(mnc mncVar, String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        String strN;
        mncVar.getClass();
        str.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(614115917);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mncVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(i3));
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(gb9.I(b.c(fqbVar, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zEquals = str.equals("reset");
            if (str.equals("pause")) {
                strN = vb7.n(e18Var, -1415367186, R.string.memory_pause_title, e18Var, false);
            } else if (str.equals("reset")) {
                strN = vb7.n(e18Var, -1415364658, R.string.memory_reset_title, e18Var, false);
            } else {
                e18Var.a0(-926565253);
                e18Var.p(false);
                strN = "";
            }
            dtj.a(strN, b.c(fqbVar, 1.0f), false, null, zEquals ? d12.a : e12.a, null, 0L, zy7Var, e18Var, ((i2 << 15) & 29360128) | 48, 108);
            dtj.a(d4c.j0(R.string.generic_button_cancel, e18Var), b.c(fqbVar, 1.0f), false, null, f12.a, null, 0L, zy7Var2, e18Var, ((i2 << 12) & 29360128) | 24624, 108);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(mncVar, str, zy7Var, zy7Var2, i, 9);
        }
    }

    public static h40 b() {
        if (h40.e) {
            return new h40();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r29.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Shader c(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqk.c(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.graphics.Shader");
    }

    public static String d(ContentBlock contentBlock) {
        return contentBlock instanceof TextBlock ? "text" : contentBlock instanceof ToolUseBlock ? "tool_use" : contentBlock instanceof ToolResultBlock ? "tool_result" : contentBlock instanceof ThinkingBlock ? "thinking" : contentBlock instanceof VoiceNoteBlock ? "voice_note" : contentBlock instanceof FlagBlock ? "flag" : "unknown";
    }

    public static cpe e(qh9 qh9Var) {
        String strM;
        try {
            bh9 bh9VarS = qh9Var.s("domain");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("type");
            int i = 0;
            if (bh9VarS3 != null && (strM = bh9VarS3.m()) != null) {
                int[] iArrH = sq6.H(14);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (gid.k(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new cpe(strM2, strM3, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Provider", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Provider", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Provider", e3);
            return null;
        }
    }

    public static void f() {
        boolean z = h40.e;
    }

    public static boolean g() {
        return h40.e;
    }

    public static ActionMode h(AndroidComposeView androidComposeView, gp7 gp7Var) {
        return androidComposeView.startActionMode(gp7Var, 1);
    }

    public static double i(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == -0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * ((double) (d > 0.0d ? 1 : -1));
    }

    public static Object j(lsj lsjVar) {
        if (lsj.w.equals(lsjVar)) {
            return null;
        }
        if (lsj.v.equals(lsjVar)) {
            return "";
        }
        if (lsjVar instanceof isj) {
            return k((isj) lsjVar);
        }
        if (!(lsjVar instanceof jqj)) {
            return !lsjVar.a().isNaN() ? lsjVar.a() : lsjVar.h();
        }
        ArrayList arrayList = new ArrayList();
        jqj jqjVar = (jqj) lsjVar;
        int i = 0;
        while (i < jqjVar.r()) {
            if (i >= jqjVar.r()) {
                pmf.h(grc.p(i, "Out of bounds index: "));
                return null;
            }
            int i2 = i + 1;
            Object objJ = j(jqjVar.p(i));
            if (objJ != null) {
                arrayList.add(objJ);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap k(isj isjVar) {
        HashMap map = new HashMap();
        isjVar.getClass();
        for (String str : new ArrayList(isjVar.E.keySet())) {
            Object objJ = j(isjVar.b(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static lxj l(String str) {
        lxj lxjVar;
        if (str == null || str.isEmpty()) {
            lxjVar = null;
        } else {
            lxjVar = (lxj) lxj.P0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (lxjVar != null) {
            return lxjVar;
        }
        sz6.p(ij0.i("Unsupported commandId ", str));
        return null;
    }

    public static void m(c61 c61Var) {
        int iQ = q(c61Var.N("runtime.counter").a().doubleValue() + 1.0d);
        if (iQ <= 1000000) {
            c61Var.S("runtime.counter", new yqj(Double.valueOf(iQ)));
        } else {
            sz6.j("Instructions allowed exceeded");
        }
    }

    public static void n(List list, int i, String str) {
        if (list.size() == i) {
            return;
        }
        poc.g(i, str, " operation requires ", list.size());
    }

    public static void o(lxj lxjVar, int i, List list) {
        n(list, i, lxjVar.name());
    }

    public static boolean p(lsj lsjVar, lsj lsjVar2) {
        if (!lsjVar.getClass().equals(lsjVar2.getClass())) {
            return false;
        }
        if ((lsjVar instanceof ltj) || (lsjVar instanceof csj)) {
            return true;
        }
        if (!(lsjVar instanceof yqj)) {
            return lsjVar instanceof qsj ? lsjVar.h().equals(lsjVar2.h()) : lsjVar instanceof pqj ? lsjVar.k().equals(lsjVar2.k()) : lsjVar == lsjVar2;
        }
        if (Double.isNaN(lsjVar.a().doubleValue()) || Double.isNaN(lsjVar2.a().doubleValue())) {
            return false;
        }
        return lsjVar.a().equals(lsjVar2.a());
    }

    public static int q(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * ((double) (d > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static void r(List list, int i, String str) {
        if (list.size() >= i) {
            return;
        }
        poc.g(i, str, " operation requires at least ", list.size());
    }

    public static void s(lxj lxjVar, int i, List list) {
        r(list, i, lxjVar.name());
    }

    public static boolean t(lsj lsjVar) {
        if (lsjVar == null) {
            return false;
        }
        Double dA = lsjVar.a();
        return !dA.isNaN() && dA.doubleValue() >= 0.0d && dA.equals(Double.valueOf(Math.floor(dA.doubleValue())));
    }

    public static void u(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        poc.g(i, str, " operation requires at most ", arrayList.size());
    }
}
