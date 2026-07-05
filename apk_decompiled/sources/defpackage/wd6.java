package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.Layout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class wd6 implements Encoder, vd4 {
    public static final mrg a = new mrg("conway-okhttp");
    public static final xbd b = new xbd("growthbook_forced_features");
    public static final gbg c = new gbg();
    public static final hbg d = new hbg();

    public static z69 A0(b79 b79Var, int i) {
        b79Var.getClass();
        X(i > 0, Integer.valueOf(i));
        int i2 = b79Var.E;
        int i3 = b79Var.F;
        if (b79Var.G <= 0) {
            i = -i;
        }
        return new z69(i2, i3, i);
    }

    public static final zo6 B0(a6i a6iVar, bz7 bz7Var, Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.X(-422486745, a6iVar);
        boolean zG = a6iVar.g();
        rok rokVar = a6iVar.a;
        zo6 zo6Var = zo6.E;
        zo6 zo6Var2 = zo6.G;
        zo6 zo6Var3 = zo6.F;
        if (zG) {
            e18Var.a0(-212166497);
            e18Var.p(false);
            if (((Boolean) bz7Var.invoke(obj)).booleanValue()) {
                zo6Var = zo6Var3;
            } else if (((Boolean) bz7Var.invoke(rokVar.q0())).booleanValue()) {
                zo6Var = zo6Var2;
            }
        } else {
            e18Var.a0(-211892364);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) bz7Var.invoke(rokVar.q0())).booleanValue()) {
                nwbVar.setValue(Boolean.TRUE);
            }
            if (((Boolean) bz7Var.invoke(obj)).booleanValue()) {
                zo6Var = zo6Var3;
            } else if (((Boolean) nwbVar.getValue()).booleanValue()) {
                zo6Var = zo6Var2;
            }
            e18Var.p(false);
        }
        e18Var.p(false);
        return zo6Var;
    }

    public static final BlendMode C0(int i) {
        return i == 0 ? BlendMode.CLEAR : i == 1 ? BlendMode.SRC : i == 2 ? BlendMode.DST : i == 3 ? BlendMode.SRC_OVER : i == 4 ? BlendMode.DST_OVER : i == 5 ? BlendMode.SRC_IN : i == 6 ? BlendMode.DST_IN : i == 7 ? BlendMode.SRC_OUT : i == 8 ? BlendMode.DST_OUT : i == 9 ? BlendMode.SRC_ATOP : i == 10 ? BlendMode.DST_ATOP : i == 11 ? BlendMode.XOR : i == 12 ? BlendMode.PLUS : i == 13 ? BlendMode.MODULATE : i == 14 ? BlendMode.SCREEN : i == 15 ? BlendMode.OVERLAY : i == 16 ? BlendMode.DARKEN : i == 17 ? BlendMode.LIGHTEN : i == 18 ? BlendMode.COLOR_DODGE : i == 19 ? BlendMode.COLOR_BURN : i == 20 ? BlendMode.HARD_LIGHT : i == 21 ? BlendMode.SOFT_LIGHT : i == 22 ? BlendMode.DIFFERENCE : i == 23 ? BlendMode.EXCLUSION : i == 24 ? BlendMode.MULTIPLY : i == 25 ? BlendMode.HUE : i == 26 ? BlendMode.SATURATION : i == 27 ? BlendMode.COLOR : i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode D0(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final int E0(String str) {
        lci lciVarF0 = F0(16, str);
        if (lciVarF0 != null) {
            return lciVarF0.E;
        }
        isg.k0(str);
        throw null;
    }

    public static final lci F0(int i, String str) {
        int i2;
        gb9.q(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, i);
                if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i4 = i3 * i;
            int i5 = iDigit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i2++;
            i3 = i5;
        }
        return new lci(i3);
    }

    public static final void G(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, pz7 pz7Var, rz7 rz7Var, ld4 ld4Var, int i) {
        int i2;
        rz7 rz7Var2;
        e18 e18Var;
        d9i d9iVar;
        b6i b6iVar;
        boolean z;
        zy7 zy7Var;
        d77 d77Var2;
        a6i a6iVar2;
        q5i q5iVar;
        q5i q5iVar2;
        boolean z2;
        q5i q5iVar3;
        d9i d9iVar2;
        boolean z3;
        boolean z4;
        q5i q5iVarU;
        q5i q5iVar4;
        boolean z5;
        q5i q5iVar5;
        int i3;
        q5i q5iVar6;
        q5i q5iVarU2;
        d77 d77Var3;
        wp6 wp6Var2;
        boolean z6;
        rz7 rz7Var3;
        rz7 rz7Var4 = rz7Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1912839215);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(a6iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(wp6Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(d77Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(pz7Var) ? 131072 : 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= e18Var2.h(rz7Var4) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (e18Var2.Q(i5 & 1, (4793491 & i5) != 4793490)) {
            lsc lscVar = a6iVar.d;
            rok rokVar = a6iVar.a;
            if (((Boolean) bz7Var.invoke(lscVar.getValue())).booleanValue() || ((Boolean) bz7Var.invoke(rokVar.q0())).booleanValue() || a6iVar.g() || a6iVar.d()) {
                e18Var2.a0(-232386135);
                int i6 = i5 & 14;
                int i7 = i6 | 48;
                int i8 = i7 & 14;
                boolean z7 = ((i8 ^ 6) > 4 && e18Var2.f(a6iVar)) || (i7 & 6) == 4;
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (z7 || objN == lz1Var) {
                    objN = rokVar.q0();
                    e18Var2.k0(objN);
                }
                if (a6iVar.g()) {
                    objN = rokVar.q0();
                }
                e18Var2.a0(1844425648);
                zo6 zo6VarB0 = B0(a6iVar, bz7Var, objN, e18Var2);
                e18Var2.p(false);
                Object value = a6iVar.d.getValue();
                e18Var2.a0(1844425648);
                zo6 zo6VarB02 = B0(a6iVar, bz7Var, value, e18Var2);
                e18Var2.p(false);
                a6i a6iVarT = nai.t(a6iVar, zo6VarB0, zo6VarB02, "EnterExitTransition", e18Var2, i8 | 3072);
                e18 e18Var3 = e18Var2;
                d9i d9iVar3 = gp6.a;
                boolean zF = e18Var3.f(a6iVarT);
                Object objN2 = e18Var3.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = mpk.P(wp6Var);
                    e18Var3.k0(objN2);
                }
                nwb nwbVar = (nwb) objN2;
                rok rokVar2 = a6iVarT.a;
                rok rokVar3 = a6iVarT.a;
                lsc lscVar2 = a6iVarT.d;
                Object objQ0 = rokVar2.q0();
                Object value2 = lscVar2.getValue();
                zo6 zo6Var = zo6.F;
                if (objQ0 == value2 && rokVar3.q0() == zo6Var) {
                    if (a6iVarT.g()) {
                        nwbVar.setValue(wp6Var);
                    } else {
                        nwbVar.setValue(wp6.b);
                    }
                } else if (lscVar2.getValue() == zo6Var) {
                    nwbVar.setValue(((wp6) nwbVar.getValue()).a(wp6Var));
                }
                wp6 wp6Var3 = (wp6) nwbVar.getValue();
                boolean zF2 = e18Var3.f(a6iVarT);
                Object objN3 = e18Var3.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = mpk.P(d77Var);
                    e18Var3.k0(objN3);
                }
                nwb nwbVar2 = (nwb) objN3;
                if (rokVar3.q0() == lscVar2.getValue() && rokVar3.q0() == zo6Var) {
                    if (a6iVarT.g()) {
                        nwbVar2.setValue(d77Var);
                    } else {
                        nwbVar2.setValue(d77.b);
                    }
                } else if (lscVar2.getValue() != zo6Var) {
                    nwbVar2.setValue(((d77) nwbVar2.getValue()).a(d77Var));
                }
                d77 d77Var4 = (d77) nwbVar2.getValue();
                nwb nwbVarZ = mpk.Z(pz7Var, e18Var3);
                Object objInvoke = pz7Var.invoke(rokVar3.q0(), lscVar2.getValue());
                boolean zF3 = e18Var3.f(a6iVarT) | e18Var3.f(nwbVarZ);
                Object objN4 = e18Var3.N();
                tp4 tp4Var = null;
                if (zF3 || objN4 == lz1Var) {
                    objN4 = new cx(a6iVarT, nwbVarZ, tp4Var, 1);
                    e18Var3.k0(objN4);
                }
                nwb nwbVarR = mpk.R(e18Var3, (pz7) objN4, objInvoke);
                Object objQ02 = rokVar3.q0();
                zo6 zo6Var2 = zo6.G;
                if (objQ02 == zo6Var2 && lscVar2.getValue() == zo6Var2 && ((Boolean) nwbVarR.getValue()).booleanValue()) {
                    e18Var3.a0(-229368781);
                    z6 = false;
                    e18Var3.p(false);
                    rz7Var3 = rz7Var4;
                } else {
                    e18Var3.a0(-230699766);
                    boolean z8 = i6 == 4;
                    Object objN5 = e18Var3.N();
                    if (z8 || objN5 == lz1Var) {
                        objN5 = new ja0(a6iVarT);
                        e18Var3.k0(objN5);
                    }
                    ja0 ja0Var = (ja0) objN5;
                    d9i d9iVar4 = dgj.l;
                    Object objN6 = e18Var3.N();
                    if (objN6 == lz1Var) {
                        objN6 = re4.R;
                        e18Var3.k0(objN6);
                    }
                    zy7 zy7Var2 = (zy7) objN6;
                    e18Var3.a0(-167964673);
                    e18Var3.p(false);
                    e18Var3.a0(-167961890);
                    e18Var3.p(false);
                    b6i b6iVar2 = wp6Var3.a;
                    b6i b6iVar3 = d77Var4.a;
                    b6i b6iVar4 = wp6Var3.a;
                    s9g s9gVar = b6iVar4.b;
                    dh2 dh2Var = b6iVar4.c;
                    boolean z9 = (s9gVar == null && b6iVar3.b == null) ? false : true;
                    boolean z10 = (dh2Var == null && b6iVar3.c == null) ? false : true;
                    if (z9) {
                        e18Var3.a0(-911488127);
                        Object objN7 = e18Var3.N();
                        if (objN7 == lz1Var) {
                            objN7 = "Built-in slide";
                            e18Var3.k0("Built-in slide");
                        }
                        z = z10;
                        b6iVar = b6iVar4;
                        zy7Var = zy7Var2;
                        d77Var2 = d77Var4;
                        a6iVar2 = a6iVarT;
                        q5i q5iVarU3 = nai.u(a6iVar2, d9iVar4, (String) objN7, e18Var3, 384, 0);
                        d9iVar = d9iVar4;
                        e18Var3.p(false);
                        q5iVar = q5iVarU3;
                    } else {
                        d9iVar = d9iVar4;
                        b6iVar = b6iVar4;
                        z = z10;
                        zy7Var = zy7Var2;
                        d77Var2 = d77Var4;
                        a6iVar2 = a6iVarT;
                        e18Var3.a0(-911382324);
                        e18Var3.p(false);
                        q5iVar = null;
                    }
                    if (z) {
                        e18Var3.a0(-911290533);
                        d9i d9iVar5 = dgj.m;
                        Object objN8 = e18Var3.N();
                        if (objN8 == lz1Var) {
                            objN8 = "Built-in shrink/expand";
                            e18Var3.k0("Built-in shrink/expand");
                        }
                        q5i q5iVarU4 = nai.u(a6iVar2, d9iVar5, (String) objN8, e18Var3, 384, 0);
                        e18Var3.p(false);
                        q5iVar2 = q5iVarU4;
                    } else {
                        e18Var3.a0(-911179709);
                        e18Var3.p(false);
                        q5iVar2 = null;
                    }
                    if (z) {
                        e18Var3.a0(-911106083);
                        Object objN9 = e18Var3.N();
                        if (objN9 == lz1Var) {
                            objN9 = "Built-in InterruptionHandlingOffset";
                            e18Var3.k0("Built-in InterruptionHandlingOffset");
                        }
                        q5i q5iVarU5 = nai.u(a6iVar2, d9iVar, (String) objN9, e18Var3, 384, 0);
                        z2 = false;
                        e18Var3.p(false);
                        q5iVar3 = q5iVarU5;
                    } else {
                        z2 = false;
                        e18Var3.a0(-910935677);
                        e18Var3.p(false);
                        q5iVar3 = null;
                    }
                    boolean z11 = !z;
                    float[] fArr = t54.a;
                    e18Var3.a0(-910130296);
                    e18Var3.p(z2);
                    b6i b6iVar5 = d77Var2.a;
                    d9i d9iVar6 = dgj.f;
                    boolean z12 = (b6iVar.a == null && b6iVar5.a == null) ? false : true;
                    boolean z13 = (b6iVar.d == null && b6iVar5.d == null) ? false : true;
                    if (z12) {
                        e18Var3.a0(-703879421);
                        Object objN10 = e18Var3.N();
                        if (objN10 == lz1Var) {
                            objN10 = "Built-in alpha";
                            e18Var3.k0("Built-in alpha");
                        }
                        String str = (String) objN10;
                        d9iVar2 = d9iVar6;
                        z3 = z13;
                        z4 = z11;
                        q5iVarU = nai.u(a6iVar2, d9iVar2, str, e18Var3, 384, 0);
                        e18Var3.p(false);
                    } else {
                        d9iVar2 = d9iVar6;
                        z3 = z13;
                        z4 = z11;
                        e18Var3.a0(-703709976);
                        e18Var3.p(false);
                        q5iVarU = null;
                    }
                    if (z3) {
                        e18Var3.a0(-703642333);
                        Object objN11 = e18Var3.N();
                        if (objN11 == lz1Var) {
                            objN11 = "Built-in scale";
                            e18Var3.k0("Built-in scale");
                        }
                        q5iVar4 = q5iVarU;
                        q5i q5iVarU6 = nai.u(a6iVar2, d9iVar2, (String) objN11, e18Var3, 384, 0);
                        z5 = false;
                        e18Var3.p(false);
                        q5iVar5 = q5iVarU6;
                    } else {
                        q5iVar4 = q5iVarU;
                        z5 = false;
                        e18Var3.a0(-703472888);
                        e18Var3.p(false);
                        q5iVar5 = null;
                    }
                    if (z3) {
                        e18Var3.a0(-703395232);
                        i3 = i5;
                        q5iVar6 = q5iVar5;
                        q5iVarU2 = nai.u(a6iVar2, gp6.a, "TransformOriginInterruptionHandling", e18Var3, 384, 0);
                        e18Var3.p(z5);
                    } else {
                        i3 = i5;
                        q5iVar6 = q5iVar5;
                        e18Var3.a0(-703222904);
                        e18Var3.p(z5);
                        q5iVarU2 = null;
                    }
                    boolean zH = e18Var3.h(q5iVar4) | e18Var3.f(wp6Var3) | e18Var3.f(d77Var2) | e18Var3.h(q5iVar6) | e18Var3.f(a6iVar2) | e18Var3.h(q5iVarU2);
                    Object objN12 = e18Var3.N();
                    if (zH || objN12 == lz1Var) {
                        d77Var3 = d77Var2;
                        wp6Var2 = wp6Var3;
                        objN12 = new bp6(q5iVar4, q5iVar6, a6iVar2, wp6Var2, d77Var3, q5iVarU2);
                        e18Var3.k0(objN12);
                    } else {
                        d77Var3 = d77Var2;
                        wp6Var2 = wp6Var3;
                    }
                    bp6 bp6Var = (bp6) objN12;
                    boolean zG = e18Var3.g(z4) | e18Var3.f(zy7Var);
                    Object objN13 = e18Var3.N();
                    if (zG || objN13 == lz1Var) {
                        objN13 = new ep6(zy7Var, z4);
                        e18Var3.k0(objN13);
                    }
                    fqb fqbVar = fqb.E;
                    iqb iqbVarB = xn5.i0(fqbVar, (bz7) objN13).B(new ap6(a6iVar2, q5iVar2, q5iVar3, q5iVar, wp6Var2, d77Var3, zy7Var, bp6Var)).B(fqbVar);
                    e18Var3.a0(-7404393);
                    e18Var3.p(false);
                    iqb iqbVarB2 = iqbVar.B(iqbVarB.B(fqbVar));
                    Object objN14 = e18Var3.N();
                    if (objN14 == lz1Var) {
                        objN14 = new l90(ja0Var);
                        e18Var3.k0(objN14);
                    }
                    l90 l90Var = (l90) objN14;
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarB2);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, l90Var);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.V(e18Var3, Integer.valueOf(iHashCode), cd4.g);
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    rz7 rz7Var5 = rz7Var;
                    rz7Var5.invoke(ja0Var, e18Var3, Integer.valueOf((i3 >> 18) & 112));
                    e18Var3.p(true);
                    z6 = false;
                    e18Var3.p(false);
                    rz7Var3 = rz7Var5;
                }
                e18Var3.p(z6);
                e18Var = e18Var3;
                rz7Var2 = rz7Var3;
            } else {
                e18Var2.a0(-229362829);
                e18Var2.p(false);
                e18Var = e18Var2;
                rz7Var2 = rz7Var4;
            }
        } else {
            e18Var2.T();
            e18Var = e18Var2;
            rz7Var2 = rz7Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new aa0(a6iVar, bz7Var, iqbVar, wp6Var, d77Var, pz7Var, rz7Var2, i);
        }
    }

    public static final qci G0(int i, String str) {
        str.getClass();
        gb9.q(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = i;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i2++;
            j2 = j4;
        }
        return new qci(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(defpackage.s64 r13, boolean r14, defpackage.iqb r15, defpackage.wp6 r16, defpackage.d77 r17, java.lang.String r18, defpackage.ta4 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd6.H(s64, boolean, iqb, wp6, d77, java.lang.String, ta4, ld4, int, int):void");
    }

    public static b79 H0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new b79(i, i2 - 1, 1);
        }
        b79 b79Var = b79.H;
        return b79.H;
    }

    public static final void I(swb swbVar, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, ta4 ta4Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(657024243);
        int i2 = i | (e18Var.f(swbVar) ? 4 : 2) | 24624;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            a6i a6iVarA0 = nai.a0(swbVar, "AnimatedVisibility", e18Var, (i2 & 14) | 48, 0);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = ex.U;
                e18Var.k0(objN);
            }
            fqb fqbVar = fqb.E;
            O(a6iVarA0, (bz7) objN, fqbVar, wp6Var, d77Var, ta4Var, e18Var, 224688);
            iqbVar2 = fqbVar;
            str2 = "AnimatedVisibility";
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            str2 = str;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new da0(swbVar, iqbVar2, wp6Var, d77Var, str2, ta4Var, i, 1);
        }
    }

    public static final void J(swb swbVar, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        String str2;
        iqb iqbVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1763490971);
        int i4 = (e18Var.f(swbVar) ? 32 : 16) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 384;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i4 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.f(wp6Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.f(d77Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i6 = i3 | 196608;
        if (e18Var.Q(i6 & 1, (599185 & i6) != 599184)) {
            iqb iqbVar4 = i5 != 0 ? fqb.E : iqbVar2;
            a6i a6iVarA0 = nai.a0(swbVar, "AnimatedVisibility", e18Var, ((i6 >> 3) & 14) | 48, 0);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = ex.V;
                e18Var.k0(objN);
            }
            O(a6iVarA0, (bz7) objN, iqbVar4, wp6Var, d77Var, ta4Var, e18Var, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | 196608);
            str2 = "AnimatedVisibility";
            iqbVar3 = iqbVar4;
        } else {
            e18Var.T();
            str2 = str;
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ca0(swbVar, iqbVar3, wp6Var, d77Var, str2, ta4Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(defpackage.dxe r13, boolean r14, defpackage.iqb r15, defpackage.wp6 r16, defpackage.d77 r17, java.lang.String r18, defpackage.ta4 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd6.K(dxe, boolean, iqb, wp6, d77, java.lang.String, ta4, ld4, int, int):void");
    }

    public static final void L(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        iqb iqbVar2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1699747442);
        int i4 = i | (e18Var.f(a6iVar) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 384;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i3 = i4 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i6 = i3 | (e18Var.f(wp6Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(d77Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i6 & 1, (74899 & i6) != 74898)) {
            if (i5 != 0) {
                iqbVar2 = fqb.E;
            }
            O(a6iVar, bz7Var, iqbVar2, wp6Var, d77Var, ta4Var, e18Var, i6 & 524286);
        } else {
            e18Var.T();
        }
        iqb iqbVar3 = iqbVar2;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ea0(a6iVar, bz7Var, iqbVar3, wp6Var, d77Var, ta4Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(boolean r16, defpackage.iqb r17, defpackage.wp6 r18, defpackage.d77 r19, java.lang.String r20, defpackage.rz7 r21, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd6.M(boolean, iqb, wp6, d77, java.lang.String, rz7, ld4, int, int):void");
    }

    public static final void N(swb swbVar, iqb iqbVar, wp6 wp6Var, d77 d77Var, String str, ta4 ta4Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1238803325);
        int i2 = i | (e18Var.f(swbVar) ? 32 : 16) | 196992;
        if (e18Var.Q(i2 & 1, (599185 & i2) != 599184)) {
            a6i a6iVarA0 = nai.a0(swbVar, "AnimatedVisibility", e18Var, ((i2 >> 3) & 14) | 48, 0);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = ex.T;
                e18Var.k0(objN);
            }
            fqb fqbVar = fqb.E;
            O(a6iVarA0, (bz7) objN, fqbVar, wp6Var, d77Var, ta4Var, e18Var, 224688);
            iqbVar2 = fqbVar;
            str2 = "AnimatedVisibility";
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            str2 = str;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new da0(swbVar, iqbVar2, wp6Var, d77Var, str2, ta4Var, i, 0);
        }
    }

    public static final void O(a6i a6iVar, bz7 bz7Var, iqb iqbVar, wp6 wp6Var, d77 d77Var, rz7 rz7Var, ld4 ld4Var, int i) {
        int i2;
        wp6 wp6Var2;
        d77 d77Var2;
        rz7 rz7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1706321816);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(a6iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            wp6Var2 = wp6Var;
            i2 |= e18Var.f(wp6Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            wp6Var2 = wp6Var;
        }
        if ((i & 24576) == 0) {
            d77Var2 = d77Var;
            i2 |= e18Var.f(d77Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            d77Var2 = d77Var;
        }
        if ((i & 196608) == 0) {
            rz7Var2 = rz7Var;
            i2 |= e18Var.h(rz7Var2) ? 131072 : 65536;
        } else {
            rz7Var2 = rz7Var;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new ha0(bz7Var, a6iVar);
                e18Var.k0(objN);
            }
            iqb iqbVarH0 = fd9.h0(iqbVar, (rz7) objN);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = z80.H;
                e18Var.k0(objN2);
            }
            G(a6iVar, bz7Var, iqbVarH0, wp6Var2, d77Var2, (pz7) objN2, rz7Var2, e18Var, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ea0(a6iVar, bz7Var, iqbVar, wp6Var, d77Var, rz7Var, i);
        }
    }

    public static zy1 P(int i, int i2, py1 py1Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        py1 py1Var2 = py1.E;
        if (i3 != 0) {
            py1Var = py1Var2;
        }
        if (i == -2) {
            if (py1Var != py1Var2) {
                return new hg4(1, py1Var);
            }
            gh2.c.getClass();
            return new zy1(fh2.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? py1Var == py1Var2 ? new zy1(i) : new hg4(i, py1Var) : new zy1(Integer.MAX_VALUE) : py1Var == py1Var2 ? new zy1(0) : new hg4(1, py1Var);
        }
        if (py1Var == py1Var2) {
            return new hg4(1, py1.F);
        }
        sz6.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void Q(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(441837433);
        int i2 = 0;
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            Object objN = e18Var.N();
            Object obj = jd4.a;
            Object obj2 = objN;
            if (objN == obj) {
                nma nmaVar = new nma();
                nmaVar.E = null;
                e18Var.k0(nmaVar);
                obj2 = nmaVar;
            }
            Object obj3 = (nma) obj2;
            Object objN2 = e18Var.N();
            if (objN2 == obj) {
                objN2 = re4.V;
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            if (e18Var.S) {
                e18Var.b(new lwf(27), iei.a);
            }
            d4c.i0(e18Var, z80.O, obj3);
            ta4Var.invoke(obj3, e18Var, 48);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oma(ta4Var, i, i2);
        }
    }

    public static final void R(x0a x0aVar, zy7 zy7Var, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        x0a x0aVar2;
        zy7 zy7Var2;
        bz7 bz7Var2;
        x0aVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2085273384);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(x0aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                zy7Var2 = zy7Var;
                cx cxVar = new cx(zy7Var2, bz7Var, x0aVar, (tp4) null, 22);
                bz7Var2 = bz7Var;
                x0aVar2 = x0aVar;
                e18Var.k0(cxVar);
                objN = cxVar;
            } else {
                x0aVar2 = x0aVar;
                zy7Var2 = zy7Var;
                bz7Var2 = bz7Var;
            }
            fd9.i(e18Var, (pz7) objN, x0aVar2);
        } else {
            x0aVar2 = x0aVar;
            zy7Var2 = zy7Var;
            bz7Var2 = bz7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(x0aVar2, i, zy7Var2, bz7Var2, 6);
        }
    }

    public static final float S(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final Double T(double d2) {
        return new Double(d2);
    }

    public static final Integer U(int i) {
        return new Integer(i);
    }

    public static final long V(i5i i5iVar, sih sihVar, akh akhVar, long j) {
        long j2;
        long jS = sihVar.s();
        if ((9223372034707292159L & jS) != 9205357640488583168L && i5iVar.d().G.length() != 0) {
            long j3 = i5iVar.d().H;
            te8 te8VarQ = sihVar.q();
            int i = te8VarQ == null ? -1 : ehh.a[te8VarQ.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = kkh.c;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        mr9.b();
                        return 0L;
                    }
                    int i3 = kkh.c;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                yjh yjhVarC = akhVar.c();
                if (yjhVarC != null) {
                    qtb qtbVar = yjhVarC.b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32));
                    int iD = qtbVar.d(i4);
                    float f = yjhVarC.f(iD);
                    float fG = yjhVarC.g(iD);
                    float fD0 = d0(fIntBitsToFloat, Math.min(f, fG), Math.max(f, fG));
                    if (g79.b(j, 0L) || Math.abs(fIntBitsToFloat - fD0) <= ((int) (j >> 32)) / 2) {
                        float f2 = qtbVar.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((qtbVar.b(iD) - f2) / 2.0f) + f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fD0)) << 32);
                        cu9 cu9VarE = akhVar.e();
                        if (cu9VarE != null) {
                            if (!cu9VarE.n()) {
                                cu9VarE = null;
                            }
                            if (cu9VarE != null) {
                                jFloatToRawIntBits = aqk.b(jFloatToRawIntBits, u00.R(cu9VarE));
                            }
                        }
                        return aqk.i(akhVar, jFloatToRawIntBits);
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static final float W(zn5 zn5Var, float f, float f2) {
        return ((ob0) new h61(zn5Var.a).a(new ob0(f), new ob0(f2))).a;
    }

    public static final void X(boolean z, Number number) {
        if (z) {
            return;
        }
        mr9.c(46, number, "Step must be positive, was: ");
    }

    public static ewe Y(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float fCos = 1.0f / ((float) Math.cos(bqi.b / f));
        r35 r35Var = new r35(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long jO = yfd.O(bqi.c(fCos, (bqi.b / f) * 2.0f * i4), so7.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier));
            int i5 = i3 + 1;
            fArr[i3] = yfd.E(jO);
            i3 += 2;
            fArr[i5] = yfd.F(jO);
        }
        return x44.i(fArr, r35Var, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public static final void Z(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                mwa.p(th, th2);
            }
        }
    }

    public static float a0(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int b0(int i) {
        if (i > 5000) {
            return 5000;
        }
        return i;
    }

    public static double c0(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float d0(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int e0(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long f0(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        sz6.p(ebh.p(grc.w(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long g0(long j, vka vkaVar) {
        if (vkaVar instanceof gq3) {
            return ((Number) i0(Long.valueOf(j), (gq3) vkaVar)).longValue();
        }
        if (!vkaVar.isEmpty()) {
            return j < ((Number) vkaVar.e()).longValue() ? ((Number) vkaVar.e()).longValue() : j > ((Number) vkaVar.g()).longValue() ? ((Number) vkaVar.g()).longValue() : j;
        }
        mr9.c(46, vkaVar, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static Comparable h0(va6 va6Var, va6 va6Var2, va6 va6Var3) {
        if (va6Var2.compareTo(va6Var3) <= 0) {
            return va6Var.compareTo(va6Var2) < 0 ? va6Var2 : va6Var.compareTo(va6Var3) > 0 ? va6Var3 : va6Var;
        }
        mr9.m("Cannot coerce value to an empty range: maximum ", va6Var3, " is less than minimum ", va6Var2, 46);
        return null;
    }

    public static Comparable i0(Comparable comparable, gq3 gq3Var) {
        gq3Var.getClass();
        if (!gq3Var.isEmpty()) {
            return (!gq3Var.a(comparable, gq3Var.e()) || gq3Var.a(gq3Var.e(), comparable)) ? (!gq3Var.a(gq3Var.g(), comparable) || gq3Var.a(comparable, gq3Var.g())) ? comparable : gq3Var.g() : gq3Var.e();
        }
        mr9.c(46, gq3Var, "Cannot coerce value to an empty range: ");
        return null;
    }

    public static final zt7 j0(Context context) {
        return new zt7(new m20(context, 0), new n20(Build.VERSION.SDK_INT >= 31 ? ev7.a.a(context) : 0));
    }

    public static final fo9 k0(cm9 cm9Var, List list, boolean z, List list2) {
        xh3 descriptor;
        r9i r9iVar;
        Object skgVar;
        cm9Var.getClass();
        list.getClass();
        list2.getClass();
        dm9 dm9Var = cm9Var instanceof dm9 ? (dm9) cm9Var : null;
        if (dm9Var == null || (descriptor = dm9Var.getDescriptor()) == null) {
            StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
            sb.append(cm9Var);
            Class<?> cls = cm9Var.getClass();
            sb.append(" (");
            sb.append(cls);
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        u9i u9iVarP = descriptor.p();
        u9iVarP.getClass();
        List parameters = u9iVarP.getParameters();
        parameters.getClass();
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            r9i.F.getClass();
            r9iVar = r9i.G;
        } else {
            r9i.F.getClass();
            r9iVar = r9i.G;
        }
        List parameters2 = u9iVarP.getParameters();
        parameters2.getClass();
        List list3 = list;
        ArrayList arrayList = new ArrayList(x44.y(list3, 10));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            jo9 jo9Var = (jo9) obj;
            fo9 fo9Var = (fo9) jo9Var.a();
            yr9 yr9Var = fo9Var != null ? fo9Var.E : null;
            lo9 lo9VarB = jo9Var.b();
            int i3 = lo9VarB == null ? -1 : em9.a[lo9VarB.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters2.get(i);
                obj2.getClass();
                skgVar = new skg((qai) obj2);
            } else if (i3 == 1) {
                yr9Var.getClass();
                skgVar = new wai(1, yr9Var);
            } else if (i3 == 2) {
                yr9Var.getClass();
                skgVar = new wai(2, yr9Var);
            } else {
                if (i3 != 3) {
                    mr9.b();
                    return null;
                }
                yr9Var.getClass();
                skgVar = new wai(3, yr9Var);
            }
            arrayList.add(skgVar);
            i = i2;
        }
        return new fo9(yfd.c0(r9iVar, u9iVarP, arrayList, z), null);
    }

    public static final gq6 n0(Enum[] enumArr) {
        enumArr.getClass();
        return new gq6(enumArr);
    }

    public static zn5 o0() {
        return new zn5(new go7());
    }

    public static fk0 p0(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("app_prefs", 0);
        sharedPreferences.getClass();
        return new fk0(sharedPreferences);
    }

    public static final float q0(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = bkh.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : t09.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float r0(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = bkh.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? t09.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Object s0(u6c u6cVar, wn9 wn9Var) {
        u6cVar.getClass();
        wn9Var.getClass();
        return u6cVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t0(vd6 vd6Var) {
        if (((hqb) vd6Var).E.R) {
            yfd.U(vd6Var, 1).o1();
        }
    }

    public static final boolean u0(Context context) {
        NetworkCapabilities networkCapabilities;
        context.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    public static final iqb v0(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new kec(bz7Var));
    }

    public static final wxc w0(String str, bz7 bz7Var, ld4 ld4Var, int i, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(923020361);
        if ((i2 & 2) != 0) {
            e18Var.a0(1537041123);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new xg5(22);
                e18Var.k0(objN);
            }
            bz7Var = (bz7) objN;
            e18Var.p(false);
        }
        wxc wxcVarX0 = x0(str, bz7Var, yxc.a, e18Var, 390 | (i & 112), 0);
        e18Var.p(false);
        return wxcVarX0;
    }

    public static final wxc x0(String str, bz7 bz7Var, zxc zxcVar, ld4 ld4Var, int i, int i2) {
        wxc wedVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1732095526);
        int i3 = i2 & 2;
        lz1 lz1Var = jd4.a;
        if (i3 != 0) {
            e18Var.a0(1537068707);
            Object objN = e18Var.N();
            Object obj = objN;
            if (objN == lz1Var) {
                xg5 xg5Var = new xg5(22);
                e18Var.k0(xg5Var);
                obj = xg5Var;
            }
            bz7Var = (bz7) obj;
            e18Var.p(false);
        }
        if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
            wedVar = new wed(str, zxcVar);
        } else {
            e18Var.a0(1424240517);
            Context context = (Context) e18Var.j(w00.b);
            e18Var.a0(1134374053);
            Object objN2 = e18Var.N();
            Object obj2 = objN2;
            if (objN2 == lz1Var) {
                wvb wvbVar = new wvb(str, context, oq5.x(context));
                e18Var.k0(wvbVar);
                obj2 = wvbVar;
            }
            wvb wvbVar2 = (wvb) obj2;
            e18Var.p(false);
            oq5.g(wvbVar2, null, e18Var, 0);
            int i4 = 1;
            vc vcVar = new vc(i4);
            e18Var.a0(1134386901);
            boolean zF = e18Var.f(wvbVar2);
            if ((((i & 112) ^ 48) <= 32 || !e18Var.f(bz7Var)) && (i & 48) != 32) {
                i4 = 0;
            }
            int i5 = (zF ? 1 : 0) | i4;
            Object objN3 = e18Var.N();
            Object obj3 = objN3;
            if (i5 != 0 || objN3 == lz1Var) {
                vk3 vk3Var = new vk3(wvbVar2, bz7Var, 17);
                e18Var.k0(vk3Var);
                obj3 = vk3Var;
            }
            e18Var.p(false);
            xpa xpaVarD0 = sf5.d0(vcVar, (bz7) obj3, e18Var, 0);
            e18Var.a0(1134391322);
            boolean zF2 = e18Var.f(wvbVar2) | e18Var.h(xpaVarD0);
            Object objN4 = e18Var.N();
            Object obj4 = objN4;
            if (zF2 || objN4 == lz1Var) {
                vk3 vk3Var2 = new vk3(wvbVar2, 18, xpaVarD0);
                e18Var.k0(vk3Var2);
                obj4 = vk3Var2;
            }
            e18Var.p(false);
            fd9.e(wvbVar2, xpaVarD0, (bz7) obj4, e18Var);
            e18Var.p(false);
            wedVar = wvbVar2;
        }
        e18Var.p(false);
        return wedVar;
    }

    public static final a5f y0(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1967007413);
        Object[] objArr = new Object[0];
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new zcd(23);
            e18Var.k0(objN);
        }
        a5f a5fVar = (a5f) iuj.K(objArr, a5f.I, (zy7) objN, e18Var, 384);
        a5fVar.G = (c5f) e18Var.j(e5f.a);
        e18Var.p(false);
        return a5fVar;
    }

    public static ewe z0(int i, r35 r35Var) {
        r35Var.getClass();
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = bqi.b / i;
            long jC = bqi.c(1.0f, 2.0f * f * i3);
            fArr[i2] = yfd.E(jC) + MTTypesetterKt.kLineSkipLimitMultiplier;
            fArr[i2 + 1] = yfd.F(jC) + MTTypesetterKt.kLineSkipLimitMultiplier;
            long jC2 = bqi.c(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = yfd.E(jC2) + MTTypesetterKt.kLineSkipLimitMultiplier;
            i2 += 4;
            fArr[i4] = yfd.F(jC2) + MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        return x44.i(fArr, r35Var, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void A(long j) {
        m0(Long.valueOf(j));
    }

    public void B(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        serialDescriptor.getClass();
        znfVar.getClass();
        l0(serialDescriptor, i);
        if (znfVar.getDescriptor().c()) {
            h(obj, znfVar);
        } else if (obj == null) {
            e();
        } else {
            h(obj, znfVar);
        }
    }

    @Override // defpackage.vd4
    public Encoder C(gfd gfdVar, int i) {
        gfdVar.getClass();
        l0(gfdVar, i);
        return x(gfdVar.h(i));
    }

    @Override // defpackage.vd4
    public void D(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        l0(serialDescriptor, i);
        A(j);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void F(String str) {
        str.getClass();
        m0(str);
    }

    public void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public vd4 c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void f(double d2) {
        m0(Double.valueOf(d2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(short s) {
        m0(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void i(byte b2) {
        m0(Byte.valueOf(b2));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void j(boolean z) {
        m0(Boolean.valueOf(z));
    }

    @Override // defpackage.vd4
    public void k(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        l0(serialDescriptor, i);
        m(f);
    }

    @Override // defpackage.vd4
    public void l(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        l0(serialDescriptor, i);
        w(i2);
    }

    public void l0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(float f) {
        m0(Float.valueOf(f));
    }

    public void m0(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = obj.getClass();
        kce kceVar = jce.a;
        sb.append(kceVar.b(cls));
        sb.append(" is not supported by ");
        sb.append(kceVar.b(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    @Override // defpackage.vd4
    public void n(gfd gfdVar, int i, byte b2) {
        gfdVar.getClass();
        l0(gfdVar, i);
        i(b2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(char c2) {
        m0(Character.valueOf(c2));
    }

    @Override // defpackage.vd4
    public void p(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        l0(serialDescriptor, i);
        j(z);
    }

    @Override // defpackage.vd4
    public void q(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        l0(serialDescriptor, i);
        F(str);
    }

    @Override // defpackage.vd4
    public void r(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        serialDescriptor.getClass();
        znfVar.getClass();
        l0(serialDescriptor, i);
        h(obj, znfVar);
    }

    @Override // defpackage.vd4
    public void s(gfd gfdVar, int i, short s) {
        gfdVar.getClass();
        l0(gfdVar, i);
        g(s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void t(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        m0(Integer.valueOf(i));
    }

    @Override // defpackage.vd4
    public void v(gfd gfdVar, int i, char c2) {
        gfdVar.getClass();
        l0(gfdVar, i);
        o(c2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(int i) {
        m0(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this;
    }

    @Override // defpackage.vd4
    public void z(SerialDescriptor serialDescriptor, int i, double d2) {
        serialDescriptor.getClass();
        l0(serialDescriptor, i);
        f(d2);
    }
}
