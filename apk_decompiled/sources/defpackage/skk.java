package defpackage;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.anthropic.claude.R;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareChallengeError;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public abstract class skk {
    public static final ta4 a = new ta4(2021779314, false, new pb4(11));
    public static final ta4 b = new ta4(1824405936, false, new pb4(13));
    public static final ta4 c = new ta4(691954456, false, new rb4(4));
    public static final ta4 d = new ta4(-618808247, false, new rb4(5));
    public static final ta4 e = new ta4(817242064, false, new rb4(6));
    public static final ta4 f = new ta4(-1511899610, false, new rb4(7));
    public static final ta4 g = new ta4(1009090671, false, new rb4(8));
    public static final ta4 h = new ta4(-1111533656, false, new rb4(9));
    public static final ta4 i = new ta4(214142901, false, new rb4(10));
    public static final ta4 j = new ta4(-1358650621, false, new rb4(3));
    public static final ta4 k = new ta4(-1621030633, false, new pb4(12));

    public static final void a(String str, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1403066866);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var2.f(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(993631243, new ra7((eli) e18Var2.j(ve4.t), str, zy7Var), e18Var2), null, fd9.q0(453201737, new wh(25, zy7Var), e18Var2), tlk.c, fd9.q0(1790041126, new rq(str, 29), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, ((i3 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fv0(str, zy7Var, i2, 2);
        }
    }

    public static final ozf b(Throwable th) {
        th.getClass();
        ClaudeApiErrorException claudeApiErrorException = th instanceof ClaudeApiErrorException ? (ClaudeApiErrorException) th : null;
        if ((claudeApiErrorException != null ? claudeApiErrorException.E : null) instanceof ClaudeApiError$CloudflareChallengeError) {
            return ozf.F;
        }
        return null;
    }

    public static InvocationHandler c() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, j()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static da d(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("technology");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("carrier_name");
            return new da(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Cellular", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Cellular", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Cellular", e4);
            return null;
        }
    }

    public static mbh e(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("build");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("version");
            return new mbh(strM, strM2, bh9VarS3 != null ? bh9VarS3.m() : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Os", e4);
            return null;
        }
    }

    public static d8j f() {
        return u7j.a;
    }

    public static final Field g(wn9 wn9Var) {
        wn9Var.getClass();
        do9 do9VarC = vpi.c(wn9Var);
        if (do9VarC != null) {
            return (Field) do9VarC.N.getValue();
        }
        return null;
    }

    public static final Method h(jm9 jm9Var) {
        q92 q92VarQ;
        jm9Var.getClass();
        ol9 ol9VarA = vpi.a(jm9Var);
        Member memberB = (ol9VarA == null || (q92VarQ = ol9VarA.q()) == null) ? null : q92VarQ.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Type i(fo9 fo9Var) {
        ece eceVar = fo9Var.F;
        Type type = eceVar != null ? (Type) eceVar.a() : null;
        if (type != null) {
            return type;
        }
        Type type2 = eceVar != null ? (Type) eceVar.a() : null;
        return type2 != null ? type2 : ybi.e(fo9Var, false);
    }

    public static ClassLoader j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null).getClass().getClassLoader();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            xh6.h(e2);
            return null;
        }
    }

    public static void k(kta ktaVar, ed4 ed4Var, c18 c18Var) {
        ktaVar.getClass();
        e4c e4cVar = (e4c) ktaVar.findViewById(R.id.maps_compose_nodraw_container_view);
        if (e4cVar == null) {
            Context context = ktaVar.getContext();
            context.getClass();
            e4cVar = new e4c(context);
            e4cVar.setId(R.id.maps_compose_nodraw_container_view);
            ktaVar.addView(e4cVar);
        }
        e4cVar.addView(ed4Var);
        ed4Var.setParentCompositionContext(c18Var);
        e4cVar.removeView(ed4Var);
    }
}
