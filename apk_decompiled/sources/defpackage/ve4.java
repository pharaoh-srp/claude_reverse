package defpackage;

import androidx.compose.ui.node.Owner;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve4 {
    public static final umg a = new umg(v00.R);
    public static final umg b = new umg(v00.S);
    public static final umg c = new umg(v00.U);
    public static final umg d = new umg(v00.T);
    public static final umg e = new umg(v00.W);
    public static final umg f = new umg(v00.V);
    public static final umg g = new umg(v00.c0);
    public static final umg h = new umg(v00.Y);
    public static final umg i = new umg(v00.Z);
    public static final umg j = new umg(v00.b0);
    public static final umg k = new umg(v00.a0);
    public static final umg l = new umg(v00.d0);
    public static final umg m = new umg(v00.e0);
    public static final umg n = new umg(v00.f0);
    public static final umg o = new umg(v00.h0);
    public static final xe4 p = new xe4(bx.Y);
    public static final umg q = new umg(re4.G);
    public static final umg r = new umg(v00.j0);
    public static final umg s = new umg(re4.H);
    public static final umg t = new umg(re4.I);
    public static final umg u = new umg(re4.J);
    public static final umg v = new umg(re4.K);
    public static final umg w = new umg(v00.g0);
    public static final xe4 x = new xe4(v00.i0);
    public static final umg y = new umg(v00.X);

    public static final void a(Owner owner, eli eliVar, pz7 pz7Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1925803616);
        int i3 = (e18Var.f(owner) ? 4 : 2) | i2 | (e18Var.f(eliVar) ? 32 : 16) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            hvd hvdVarA = a.a(owner.getAccessibilityManager());
            hvd hvdVarA2 = b.a(owner.getAutofill());
            hvd hvdVarA3 = d.a(owner.getAutofillManager());
            hvd hvdVarA4 = c.a(owner.getAutofillTree());
            hvd hvdVarA5 = e.a(owner.getClipboardManager());
            hvd hvdVarA6 = f.a(owner.getClipboard());
            hvd hvdVarA7 = h.a(owner.getDensity());
            hvd hvdVarA8 = i.a(owner.getFocusOwner());
            hvd hvdVarA9 = j.a(owner.getFontLoader());
            hvdVarA9.c = false;
            hvd hvdVarA10 = k.a(owner.getFontFamilyResolver());
            hvdVarA10.c = false;
            j8.d(new hvd[]{hvdVarA, hvdVarA2, hvdVarA3, hvdVarA4, hvdVarA5, hvdVarA6, hvdVarA7, hvdVarA8, hvdVarA9, hvdVarA10, l.a(owner.getHapticFeedBack()), m.a(owner.getInputModeManager()), n.a(owner.getLayoutDirection()), q.a(owner.getTextInputService()), r.a(owner.getSoftwareKeyboardController()), s.a(owner.getTextToolbar()), t.a(eliVar), u.a(owner.getViewConfiguration()), v.a(owner.getWindowInfo()), w.a(owner.getPointerIconService()), g.a(owner.getGraphicsContext()), wda.a.a(owner.getRetainedValuesStore()), o.a(owner.getLocaleList())}, pz7Var, e18Var, ((i3 >> 3) & 112) | 8);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new se4(owner, eliVar, pz7Var, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final umg c() {
        return h;
    }

    public static final umg d() {
        return n;
    }

    public static final umg e() {
        return t;
    }
}
