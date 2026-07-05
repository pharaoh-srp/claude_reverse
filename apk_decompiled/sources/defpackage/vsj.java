package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vsj {
    public static final qb a = new qb("com.anthropic.claude.intent.extra.START_CHAT_MODE");
    public static final o54 b;
    public static final float c;
    public static final o54 d;
    public static final float e;
    public static final o54 f;
    public static final float g;
    public static final o54 h;
    public static final o54 i;
    public static final float j;
    public static final o54 k;
    public static final float l;

    static {
        o54 o54Var = o54.L;
        b = o54Var;
        c = 0.38f;
        d = o54Var;
        e = 0.38f;
        f = o54Var;
        g = 0.38f;
        h = o54Var;
        o54 o54Var2 = o54.M;
        i = o54Var2;
        j = 24.0f;
        k = o54Var2;
        l = 24.0f;
    }

    public static final void a(Object obj, boolean z, boolean z2, zy7 zy7Var, ld4 ld4Var, int i2) {
        boolean z3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(661695629);
        int i3 = (e18Var.h(obj) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= e18Var.g(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.g(z2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | (e18Var.h(zy7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            Boolean boolValueOf = Boolean.valueOf(z3);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zH = ((i4 & 112) == 32) | e18Var.h(obj) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                w66 w66Var = new w66(obj, z3, z2, zy7Var, null);
                e18Var.k0(w66Var);
                objN = w66Var;
            }
            fd9.k(obj, boolValueOf, boolValueOf2, (pz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cy3(obj, z, z2, zy7Var, i2, 2);
        }
    }

    public static final void b(int i2, int i3, vvc vvcVar, bz7 bz7Var, bz7 bz7Var2, iqb iqbVar, ld4 ld4Var, int i4) {
        e18 e18Var;
        vvcVar.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(993445134);
        int i5 = i4 | (e18Var2.d(i2) ? 4 : 2) | (e18Var2.d(i3) ? 32 : 16) | (e18Var2.h(vvcVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i5 & 1, (74899 & i5) != 74898)) {
            boolean z = (i5 & 14) == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            wlg wlgVarB = n80.b(((Boolean) nwbVar.getValue()).booleanValue() ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "PDF Loading Fade", e18Var2, 3072, 22);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, o5bVarD);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            e18Var2.X(-1141913740, Integer.valueOf(i2));
            nw1 nw1Var = nw1.a;
            iqb iqbVarB = nw1Var.b();
            boolean zF = e18Var2.f(wlgVarB);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new ek1(wlgVarB, 3);
                e18Var2.k0(objN2);
            }
            iqb iqbVarH = xkk.h(e18Var2, xn5.i0(iqbVarB, (bz7) objN2));
            boolean zF2 = e18Var2.f(nwbVar) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | e18Var2.h(vvcVar);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                wvc wvcVar = new wvc(vvcVar, bz7Var, bz7Var2, nwbVar, 0);
                e18Var2.k0(wvcVar);
                objN3 = wvcVar;
            }
            bz7 bz7Var3 = (bz7) objN3;
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = new kac(25);
                e18Var2.k0(objN4);
            }
            bz7 bz7Var4 = (bz7) objN4;
            boolean z2 = (i5 & 112) == 32;
            Object objN5 = e18Var2.N();
            if (z2 || objN5 == lz1Var) {
                objN5 = new sm5(i3, 3);
                e18Var2.k0(objN5);
            }
            uj5.b(bz7Var3, iqbVarH, null, bz7Var4, (bz7) objN5, e18Var2, 3072, 4);
            e18Var = e18Var2;
            e18Var.p(false);
            wd6.M(!((Boolean) nwbVar.getValue()).booleanValue(), nw1Var.a(fqb.E, lja.K), null, gp6.f(null, 3), null, grk.a, e18Var, 199680, 20);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et(i2, i3, vvcVar, bz7Var, bz7Var2, iqbVar, i4);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        zy7 zy7Var2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(798932296);
        int i3 = i2 | 48;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarJ = gb9.J(b.c, 16.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            zy7Var2 = zy7Var;
            uik.d(d4c.j0(R.string.pdf_preview_load_error, e18Var), null, null, d4c.j0(R.string.generic_reload, e18Var), zy7Var2, e18Var, 24576, 6);
            e18Var.p(true);
            iqbVar = fqb.E;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var2, iqbVar, i2, 11);
        }
    }

    public static final ukg d(alg algVar) {
        return new ukg(amk.e((rb[]) Arrays.copyOf(new rb[]{new rb(algVar.name())}, 1)));
    }

    public static o54 e() {
        return b;
    }

    public static float f() {
        return c;
    }

    public static o54 g() {
        return d;
    }

    public static float h() {
        return e;
    }

    public static o54 i() {
        return f;
    }

    public static float j() {
        return g;
    }

    public static o54 k() {
        return h;
    }

    public static o54 l() {
        return i;
    }

    public static o54 m() {
        return k;
    }

    public static final int n(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final SerializableContainer o(Bundle bundle) throws IOException {
        KSerializer kSerializerSerializer = SerializableContainer.Companion.serializer();
        kSerializerSerializer.getClass();
        ClassLoader classLoader = bundle.getClassLoader();
        try {
            bundle.setClassLoader(yqi.class.getClassLoader());
            yqi yqiVar = (yqi) bundle.getParcelable("STATE_KEEPER_STATE");
            bundle.setClassLoader(classLoader);
            Object objF = null;
            if (yqiVar != null) {
                Object obj = yqiVar.E;
                if (obj == null) {
                    byte[] bArr = (byte[]) yqiVar.F.getValue();
                    if (bArr != null) {
                        objF = dvj.f(bArr, kSerializerSerializer);
                    }
                } else {
                    objF = obj;
                }
            }
            return (SerializableContainer) objF;
        } catch (Throwable th) {
            bundle.setClassLoader(classLoader);
            throw th;
        }
    }

    public static boolean p(byte b2) {
        return b2 > -65;
    }

    public static final uzf q(uzf uzfVar, uzf uzfVar2, float f2) {
        return new uzf(d4c.W(uzfVar.c, uzfVar2.c, f2), d4c.Y(f2, uzfVar.a, uzfVar2.a), hvk.g(f2, uzfVar.b, uzfVar2.b));
    }

    public static final void r(Bundle bundle, SerializableContainer serializableContainer) {
        KSerializer kSerializerSerializer = SerializableContainer.Companion.serializer();
        kSerializerSerializer.getClass();
        bundle.putParcelable("STATE_KEEPER_STATE", new yqi(serializableContainer, new u0h(new ik1(serializableContainer, 5, kSerializerSerializer))));
    }
}
