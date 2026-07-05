package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qwk {
    public static final o54 a = o54.P;
    public static final aci b = aci.J;
    public static final o54 c = o54.W;
    public static final q0g d = q0g.E;
    public static final o54 e = o54.L;
    public static final aci f = aci.I;
    public static final o54 g = o54.M;
    public static final aci h = aci.F;
    public static final o54 i = o54.S;

    public qwk() {
        new ConcurrentHashMap();
    }

    public static final void a(zy7 zy7Var, qi3 qi3Var, jx5 jx5Var, ld4 ld4Var, int i2) {
        e18 e18Var;
        qi3 qi3Var2;
        jx5 jx5Var2;
        int i3;
        qi3 qi3Var3;
        final jx5 jx5Var3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1226638530);
        int i4 = i2 | (e18Var2.h(zy7Var) ? 4 : 2) | 144;
        final int i5 = 0;
        final int i6 = 1;
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var2.V();
            int i7 = i2 & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i7 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3 qi3Var4 = (qi3) objN;
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN2 = e18Var2.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new di(m7fVar, 13);
                    e18Var2.k0(objN2);
                }
                kce kceVar = jce.a;
                jx5 jx5Var4 = (jx5) fd9.r0(kceVar.b(jx5.class), oq5.B(kceVar.b(jx5.class)), (bz7) objN2, e18Var2);
                i3 = i4 & (-1009);
                qi3Var3 = qi3Var4;
                jx5Var3 = jx5Var4;
            } else {
                e18Var2.T();
                jx5Var3 = jx5Var;
                i3 = i4 & (-1009);
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 12);
                e18Var2.k0(objN3);
            }
            opk.a(e18Var2, (bz7) objN3);
            boolean zF2 = ((i3 & 14) == 4) | e18Var2.f(jx5Var3);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new kx5(jx5Var3, zy7Var, i5);
                e18Var2.k0(objN4);
            }
            e18Var = e18Var2;
            trk.b((zy7) objN4, fd9.q0(884451621, new pz7() { // from class: lx5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i5;
                    iei ieiVar = iei.a;
                    lz1 lz1Var2 = jd4.a;
                    switch (i8) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (e18Var3.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                                jx5 jx5Var5 = jx5Var3;
                                sx5 sx5Var = (sx5) jx5Var5.d.getValue();
                                if (sx5Var instanceof rx5) {
                                    e18Var3.a0(-925988679);
                                    String strJ0 = d4c.j0(R.string.delete_account_dialog_understand_button, e18Var3);
                                    boolean zF3 = e18Var3.f(jx5Var5);
                                    Object objN5 = e18Var3.N();
                                    if (zF3 || objN5 == lz1Var2) {
                                        y14 y14Var = new y14(0, jx5Var5, jx5.class, "confirmDelete", "confirmDelete()V", 0, 29);
                                        e18Var3.k0(y14Var);
                                        objN5 = y14Var;
                                    }
                                    oe5.a(0, 4, e18Var3, (zy7) ((jm9) objN5), strJ0, false);
                                    e18Var3.p(false);
                                } else if (sx5Var instanceof nx5) {
                                    e18Var3.a0(-925715321);
                                    String strJ02 = d4c.j0(R.string.delete_account_dialog_confirm_button, e18Var3);
                                    boolean zBooleanValue = ((Boolean) jx5Var5.e.getValue()).booleanValue();
                                    boolean zF4 = e18Var3.f(jx5Var5);
                                    Object objN6 = e18Var3.N();
                                    if (zF4 || objN6 == lz1Var2) {
                                        mx5 mx5Var = new mx5(0, jx5Var5, jx5.class, "deleteAccount", "deleteAccount()V", 0, 0);
                                        e18Var3.k0(mx5Var);
                                        objN6 = mx5Var;
                                    }
                                    oe5.a(0, 0, e18Var3, (zy7) ((jm9) objN6), strJ02, zBooleanValue);
                                    e18Var3.p(false);
                                } else {
                                    e18Var3.a0(-445495319);
                                    e18Var3.p(false);
                                }
                            } else {
                                e18Var3.T();
                            }
                            return ieiVar;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                jx5 jx5Var6 = jx5Var3;
                                sx5 sx5Var2 = (sx5) jx5Var6.d.getValue();
                                if (sx5Var2 instanceof ox5) {
                                    e18Var4.a0(291697868);
                                    xo1 xo1Var = lja.K;
                                    iqb iqbVarC = b.c(fqb.E, 1.0f);
                                    o5b o5bVarD = dw1.d(xo1Var, false);
                                    int iHashCode = Long.hashCode(e18Var4.T);
                                    hyc hycVarL = e18Var4.l();
                                    iqb iqbVarE = kxk.E(e18Var4, iqbVarC);
                                    dd4.e.getClass();
                                    re4 re4Var = cd4.b;
                                    e18Var4.e0();
                                    if (e18Var4.S) {
                                        e18Var4.k(re4Var);
                                    } else {
                                        e18Var4.n0();
                                    }
                                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                                    d4c.i0(e18Var4, cd4.e, hycVarL);
                                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                    d4c.h0(e18Var4, cd4.h);
                                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                                    Boolean bool = Boolean.TRUE;
                                    boolean zF5 = e18Var4.f(jx5Var6);
                                    Object objN7 = e18Var4.N();
                                    if (zF5 || objN7 == lz1Var2) {
                                        objN7 = new kk0(jx5Var6, null, 23);
                                        e18Var4.k0(objN7);
                                    }
                                    fd9.i(e18Var4, (pz7) objN7, bool);
                                    ez1.a(null, vf2.J, 0L, e18Var4, 48, 5);
                                    e18Var4.p(true);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof qx5) {
                                    e18Var4.a0(1533444055);
                                    tjh.b(d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof px5) {
                                    e18Var4.a0(1533448940);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_cannot_delete, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof rx5) {
                                    e18Var4.a0(1533453646);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_understand_text, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else {
                                    if (!(sx5Var2 instanceof nx5)) {
                                        throw ebh.u(e18Var4, 1533427484, false);
                                    }
                                    e18Var4.a0(1533458315);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_confirm_text, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                }
                            } else {
                                e18Var4.T();
                            }
                            return ieiVar;
                    }
                }
            }, e18Var2), null, fd9.q0(1007733287, new um5(jx5Var3, 8, zy7Var), e18Var2), mkk.a, fd9.q0(-954827862, new pz7() { // from class: lx5
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i6;
                    iei ieiVar = iei.a;
                    lz1 lz1Var2 = jd4.a;
                    switch (i8) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (e18Var3.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                                jx5 jx5Var5 = jx5Var3;
                                sx5 sx5Var = (sx5) jx5Var5.d.getValue();
                                if (sx5Var instanceof rx5) {
                                    e18Var3.a0(-925988679);
                                    String strJ0 = d4c.j0(R.string.delete_account_dialog_understand_button, e18Var3);
                                    boolean zF3 = e18Var3.f(jx5Var5);
                                    Object objN5 = e18Var3.N();
                                    if (zF3 || objN5 == lz1Var2) {
                                        y14 y14Var = new y14(0, jx5Var5, jx5.class, "confirmDelete", "confirmDelete()V", 0, 29);
                                        e18Var3.k0(y14Var);
                                        objN5 = y14Var;
                                    }
                                    oe5.a(0, 4, e18Var3, (zy7) ((jm9) objN5), strJ0, false);
                                    e18Var3.p(false);
                                } else if (sx5Var instanceof nx5) {
                                    e18Var3.a0(-925715321);
                                    String strJ02 = d4c.j0(R.string.delete_account_dialog_confirm_button, e18Var3);
                                    boolean zBooleanValue = ((Boolean) jx5Var5.e.getValue()).booleanValue();
                                    boolean zF4 = e18Var3.f(jx5Var5);
                                    Object objN6 = e18Var3.N();
                                    if (zF4 || objN6 == lz1Var2) {
                                        mx5 mx5Var = new mx5(0, jx5Var5, jx5.class, "deleteAccount", "deleteAccount()V", 0, 0);
                                        e18Var3.k0(mx5Var);
                                        objN6 = mx5Var;
                                    }
                                    oe5.a(0, 0, e18Var3, (zy7) ((jm9) objN6), strJ02, zBooleanValue);
                                    e18Var3.p(false);
                                } else {
                                    e18Var3.a0(-445495319);
                                    e18Var3.p(false);
                                }
                            } else {
                                e18Var3.T();
                            }
                            return ieiVar;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                jx5 jx5Var6 = jx5Var3;
                                sx5 sx5Var2 = (sx5) jx5Var6.d.getValue();
                                if (sx5Var2 instanceof ox5) {
                                    e18Var4.a0(291697868);
                                    xo1 xo1Var = lja.K;
                                    iqb iqbVarC = b.c(fqb.E, 1.0f);
                                    o5b o5bVarD = dw1.d(xo1Var, false);
                                    int iHashCode = Long.hashCode(e18Var4.T);
                                    hyc hycVarL = e18Var4.l();
                                    iqb iqbVarE = kxk.E(e18Var4, iqbVarC);
                                    dd4.e.getClass();
                                    re4 re4Var = cd4.b;
                                    e18Var4.e0();
                                    if (e18Var4.S) {
                                        e18Var4.k(re4Var);
                                    } else {
                                        e18Var4.n0();
                                    }
                                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                                    d4c.i0(e18Var4, cd4.e, hycVarL);
                                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                    d4c.h0(e18Var4, cd4.h);
                                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                                    Boolean bool = Boolean.TRUE;
                                    boolean zF5 = e18Var4.f(jx5Var6);
                                    Object objN7 = e18Var4.N();
                                    if (zF5 || objN7 == lz1Var2) {
                                        objN7 = new kk0(jx5Var6, null, 23);
                                        e18Var4.k0(objN7);
                                    }
                                    fd9.i(e18Var4, (pz7) objN7, bool);
                                    ez1.a(null, vf2.J, 0L, e18Var4, 48, 5);
                                    e18Var4.p(true);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof qx5) {
                                    e18Var4.a0(1533444055);
                                    tjh.b(d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof px5) {
                                    e18Var4.a0(1533448940);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_cannot_delete, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else if (sx5Var2 instanceof rx5) {
                                    e18Var4.a0(1533453646);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_understand_text, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                } else {
                                    if (!(sx5Var2 instanceof nx5)) {
                                        throw ebh.u(e18Var4, 1533427484, false);
                                    }
                                    e18Var4.a0(1533458315);
                                    tjh.b(d4c.j0(R.string.delete_account_dialog_confirm_text, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 262142);
                                    e18Var4.p(false);
                                }
                            } else {
                                e18Var4.T();
                            }
                            return ieiVar;
                    }
                }
            }, e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
            jx5Var2 = jx5Var3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
            jx5Var2 = jx5Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(zy7Var, i2, qi3Var2, jx5Var2, 25);
        }
    }

    public static final void b(boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, i4g i4gVar, ld4 ld4Var, int i2) {
        int i3;
        zy7Var.getClass();
        zy7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(86843239);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i4 = i3;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqb.E, 1.0f), i4gVar.b()), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            int i5 = i4 << 3;
            d(d4c.j0(R.string.ccr_autofix_toggle_label, e18Var), d4c.j0(R.string.ccr_autofix_toggle_description, e18Var), z, zy7Var, e18Var, ((i4 << 6) & 896) | (i5 & 7168));
            d(d4c.j0(R.string.ccr_automerge_toggle_label, e18Var), d4c.j0(R.string.ccr_automerge_toggle_description, e18Var), z2, zy7Var2, e18Var, (i5 & 896) | (i4 & 7168));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey3(z, z2, zy7Var, zy7Var2, i4gVar, i2);
        }
    }

    public static final SerializableContainer c(Object obj, znf znfVar) {
        znfVar.getClass();
        SerializableContainer serializableContainer = new SerializableContainer();
        serializableContainer.set(obj, znfVar);
        return serializableContainer;
    }

    public static final void d(String str, String str2, boolean z, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1880430258);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            jl3 jl3VarA = gm3.a(e18Var);
            jm3 jm3Var = (jm3) gm3.c(e18Var).e.E;
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(i4));
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            vue vueVar = new vue(2);
            boolean z3 = (i3 & 7168) == 2048;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new kw0(13, zy7Var);
                e18Var.k0(objN);
            }
            iqb iqbVarL = gb9.L(kzj.h(iqbVarC, z2, false, vueVar, (bz7) objN, 10), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            int i5 = i3;
            hw9 hw9VarN = kgh.n(e18Var, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9VarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(str, null, jl3VarA.M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.g, e18Var, i5 & 14, 0, 131066);
            tjh.b(str2, null, jl3VarA.O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.i, e18Var, (i5 >> 3) & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            zsk.d(z, null, false, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var, ((i5 >> 6) & 14) | 1572864, 62);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(str, str2, z, zy7Var, i2, 8);
        }
    }

    public static final Object e(SerializableContainer serializableContainer, uo0 uo0Var) {
        serializableContainer.getClass();
        Object objConsume = serializableContainer.consume(uo0Var);
        if (objConsume != null) {
            return objConsume;
        }
        sz6.j("Required value was null.");
        return null;
    }

    public static boolean j(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = j(file2) && z;
        }
        return z;
    }

    public static void k(Context context, efe efeVar) {
        if (j(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            efeVar.n(14, null);
        } else {
            efeVar.n(15, null);
        }
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        pmf.d();
        return null;
    }

    public static void m(List list, hbd hbdVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (hbdVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    public abstract Typeface f(Context context, qu7 qu7Var, Resources resources, int i2);

    public abstract Typeface g(Context context, jv7[] jv7VarArr, int i2);

    public Typeface h(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface i(Context context, Resources resources, int i2, String str);
}
