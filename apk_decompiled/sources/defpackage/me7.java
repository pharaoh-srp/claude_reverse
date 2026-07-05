package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.window.core.WindowStrictModeException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class me7 {
    public static final q0g A;
    public static final float B;
    public static final o54 C;
    public static final o54 D;
    public static final float E;
    public static final o54 F;
    public static final o54 G;
    public static final ta4 e = new ta4(1972650777, false, new xa4(27));
    public static final o54 f = o54.U;
    public static final float g = 1.0f;
    public static final o54 h;
    public static final float i;
    public static final o54 j;
    public static final float k;
    public static final o54 l;
    public static final float m;
    public static final o54 n;
    public static final float o;
    public static final o54 p;
    public static final o54 q;
    public static final q0g r;
    public static final float s;
    public static final o54 t;
    public static final float u;
    public static final o54 v;
    public static final o54 w;
    public static final float x;
    public static final float y;
    public static final float z;
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final ati c;
    public final Object d;

    static {
        o54 o54Var = o54.L;
        h = o54Var;
        i = 0.38f;
        j = o54Var;
        k = 0.12f;
        l = o54Var;
        m = 0.38f;
        o54 o54Var2 = o54.X;
        n = o54Var2;
        o = 0.38f;
        p = o54Var2;
        q = o54Var;
        q0g q0gVar = q0g.I;
        r = q0gVar;
        s = 28.0f;
        t = o54.I;
        u = 24.0f;
        v = o54.J;
        w = o54.P;
        x = 40.0f;
        y = 32.0f;
        z = 2.0f;
        A = q0gVar;
        B = 52.0f;
        o54 o54Var3 = o54.N;
        C = o54Var3;
        D = o54Var3;
        E = 16.0f;
        F = o54Var2;
        G = o54Var2;
    }

    public me7(Object obj, String str, lyk lykVar, ati atiVar) {
        Collection collectionAsList;
        obj.getClass();
        atiVar.getClass();
        this.b = obj;
        this.c = atiVar;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str + " value: " + obj);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length < 0) {
            mr9.q(grc.u("Requested element count ", length, " is less than zero."));
            throw null;
        }
        if (length == 0) {
            collectionAsList = lm6.E;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionAsList = mp0.Y0(stackTrace);
            } else if (length == 1) {
                collectionAsList = x44.W(stackTrace[length2 - 1]);
            } else {
                collectionAsList = Arrays.asList(mp0.y0(stackTrace, length2 - length, length2));
                collectionAsList.getClass();
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) collectionAsList.toArray(new StackTraceElement[0]));
        this.d = windowStrictModeException;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r26, defpackage.iqb r27, long r28, long r30, defpackage.mnc r32, defpackage.qu1 r33, defpackage.e0g r34, defpackage.tkh r35, defpackage.ld4 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me7.a(java.lang.String, iqb, long, long, mnc, qu1, e0g, tkh, ld4, int, int):void");
    }

    public static final void b(float f2, final int i2, long j2, ld4 ld4Var, final iqb iqbVar) {
        int i3;
        final long j3;
        long j4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-331778895);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 3248;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                f2 = 8.0f;
                j4 = gm3.a(e18Var).u;
            } else {
                e18Var.T();
                j4 = j2;
            }
            e18Var.q();
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, f2));
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, j4, e18Var, 48, 1);
            grc.z(fqbVar, f2, e18Var, true);
            j3 = j4;
        } else {
            e18Var.T();
            j3 = j2;
        }
        final float f3 = f2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: faa
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    me7.b(f3, iP0, j3, (ld4) obj, iqbVar);
                    return iei.a;
                }
            };
        }
    }

    public static final void c(KnowledgeSource knowledgeSource, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i2) {
        e18 e18Var;
        knowledgeSource.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-137744452);
        int i3 = i2 | (e18Var2.f(knowledgeSource) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var = e18Var2;
            vkc.a(gb9.S(null, null, null, zy7Var3, e18Var2, i3 & 7168, 7), d4c.e0(R.plurals.knowledge_sources, 1, e18Var2), null, null, false, false, null, null, null, null, null, null, fd9.q0(-1629169097, new wd(knowledgeSource, zy7Var, zy7Var2, 9), e18Var2), e18Var, 8, 3072, 8188);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(knowledgeSource, zy7Var, zy7Var2, zy7Var3, i2, 26);
        }
    }

    public static final void d(iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1869150294);
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            String strN = vb7.n(e18Var, -957097807, R.string.caps_badge_pro, e18Var, false);
            long jB = d54.b(0.1f, gm3.a(e18Var).k);
            long j2 = gm3.a(e18Var).j;
            fqb fqbVar = fqb.E;
            a(strN, fqbVar, jB, j2, null, null, null, null, e18Var, 48, 240);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i2, 4, iqbVar);
        }
    }

    public static hs6 e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("message").m();
            bh9 bh9VarS = qh9Var.s("type");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("stack");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            String strM4 = qh9Var.s("source").m();
            strM4.getClass();
            for (int i2 : sq6.H(8)) {
                if (ms6.p(i2).equals(strM4)) {
                    strM.getClass();
                    return new hs6(strM, strM2, strM3, i2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Cause", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Cause", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Cause", e4);
            return null;
        }
    }

    public static gwi f(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("viewport");
            lxi lxiVarE = bh9VarS != null ? jik.e(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("scroll");
            return new gwi(lxiVarE, bh9VarS2 != null ? fik.l(bh9VarS2.g()) : null);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Display", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Display", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Display", e4);
            return null;
        }
    }

    public final me7 g(String str, bz7 bz7Var) {
        switch (this.a) {
            case 0:
                return this;
            default:
                Object obj = this.b;
                return ((Boolean) bz7Var.invoke(obj)).booleanValue() ? this : new me7(obj, str, (lyk) this.d, this.c);
        }
    }

    public me7(Object obj, ati atiVar, lyk lykVar) {
        obj.getClass();
        atiVar.getClass();
        this.b = obj;
        this.c = atiVar;
        this.d = lykVar;
    }
}
