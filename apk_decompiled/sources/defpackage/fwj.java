package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fwj {
    public static final ta4 a = new ta4(-391260582, false, new xa4(23));
    public static final o54 b = o54.G;
    public static final aci c = aci.J;
    public static final o54 d = o54.H;
    public static final float e = 6.0f;
    public static final q0g f = q0g.G;
    public static final o54 g;
    public static final o54 h;
    public static final aci i;
    public static final float j;
    public static final float k;

    static {
        o54 o54Var = o54.F;
        g = o54Var;
        h = o54Var;
        i = aci.F;
        j = 48.0f;
        k = 68.0f;
    }

    public static final void a(ml3 ml3Var, final jwf jwfVar, final b bVar, final a aVar, zy7 zy7Var, zy7 zy7Var2, final boolean z, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var3;
        e18 e18Var;
        jwfVar.getClass();
        bVar.getClass();
        aVar.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(605432458);
        if ((i2 & 6) == 0) {
            i3 = (e18Var2.f(ml3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (e18Var2.h(jwfVar) ? 32 : 16) | (e18Var2.f(bVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(aVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if ((i2 & 24576) == 0) {
            zy7Var3 = zy7Var;
            i4 |= e18Var2.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var3 = zy7Var;
        }
        int i5 = i4 | (e18Var2.h(zy7Var2) ? 131072 : 65536);
        int i6 = 0;
        if (e18Var2.Q(i5 & 1, (4793491 & i5) != 4793490)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN);
            }
            final l45 l45Var = (l45) objN;
            final Context context = (Context) e18Var2.j(w00.b);
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(context.getString(R.string.ccr_environment_name_default));
                e18Var2.k0(objN2);
            }
            final nwb nwbVar = (nwb) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN3);
            }
            final nwb nwbVar2 = (nwb) objN3;
            Object objN4 = e18Var2.N();
            m0c m0cVar = m0c.E;
            if (objN4 == lz1Var) {
                objN4 = mpk.P(m0cVar);
                e18Var2.k0(objN4);
            }
            final nwb nwbVar3 = (nwb) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN5);
            }
            final nwb nwbVar4 = (nwb) objN5;
            Object objN6 = e18Var2.N();
            if (objN6 == lz1Var) {
                objN6 = mpk.P(null);
                e18Var2.k0(objN6);
            }
            final nwb nwbVar5 = (nwb) objN6;
            final List listX = x44.X(m0cVar, m0c.F, m0c.G);
            final String string = bsg.k1((String) nwbVar.getValue()).toString();
            final boolean z2 = string.length() > 0;
            final boolean z3 = ((Boolean) nwbVar2.getValue()).booleanValue() && !z2;
            final zy7 zy7Var4 = zy7Var3;
            e18Var = e18Var2;
            oq5.i(iqbVar, fd9.q0(921360710, new br6(zy7Var2, ml3Var, i6), e18Var2), null, null, null, 0, gm3.a(e18Var2).o, 0L, null, fd9.q0(53567003, new rz7() { // from class: cr6
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    iqb iqbVar2;
                    boolean z4;
                    nwb nwbVar6;
                    fqb fqbVar;
                    nwb nwbVar7;
                    e18 e18Var3;
                    boolean z5;
                    mnc mncVar = (mnc) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    mncVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(mncVar) ? 4 : 2;
                    }
                    e18 e18Var4 = (e18) ld4Var2;
                    if (e18Var4.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        iqb iqbVarK0 = mpk.k0(gb9.I(androidx.compose.foundation.layout.b.c, mncVar), mpk.n);
                        vo1 vo1Var = lja.S;
                        eo0 eo0Var = ko0.c;
                        q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var4, 0);
                        int iHashCode = Long.hashCode(e18Var4.T);
                        hyc hycVarL = e18Var4.l();
                        iqb iqbVarE = kxk.E(e18Var4, iqbVarK0);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var4.e0();
                        if (e18Var4.S) {
                            e18Var4.k(re4Var);
                        } else {
                            e18Var4.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var4, z80Var, q64VarA);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var4, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var4, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var4, bxVar);
                        z80 z80Var4 = cd4.d;
                        iqb iqbVarC = androidx.compose.foundation.layout.b.c(kgh.n(e18Var4, iqbVarE, z80Var4, 1.0f, true), 1.0f);
                        boolean z6 = z;
                        boolean zG = e18Var4.g(z6);
                        boolean z7 = z3;
                        boolean zG2 = zG | e18Var4.g(z7);
                        Object objN7 = e18Var4.N();
                        nwb nwbVar8 = nwbVar3;
                        lz1 lz1Var2 = jd4.a;
                        if (zG2 || objN7 == lz1Var2) {
                            iqbVar2 = iqbVarC;
                            rb2 rb2Var = new rb2(z6, z7, nwbVar, nwbVar2, listX, nwbVar8, 1);
                            z4 = z6;
                            nwbVar6 = nwbVar8;
                            e18Var4.k0(rb2Var);
                            objN7 = rb2Var;
                        } else {
                            iqbVar2 = iqbVarC;
                            nwbVar6 = nwbVar8;
                            z4 = z6;
                        }
                        boolean z8 = z4;
                        knk.h(iqbVar2, null, null, false, null, null, null, false, null, (bz7) objN7, e18Var4, 0, 510);
                        fqb fqbVar2 = fqb.E;
                        iqb iqbVarK = gb9.K(yfd.p(androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f), gm3.a(e18Var4).o, zni.b), 16.0f, 8.0f);
                        q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var4, 0);
                        int iHashCode2 = Long.hashCode(e18Var4.T);
                        hyc hycVarL2 = e18Var4.l();
                        iqb iqbVarE2 = kxk.E(e18Var4, iqbVarK);
                        e18Var4.e0();
                        if (e18Var4.S) {
                            e18Var4.k(re4Var);
                        } else {
                            e18Var4.n0();
                        }
                        d4c.i0(e18Var4, z80Var, q64VarA2);
                        d4c.i0(e18Var4, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var4, z80Var3, e18Var4, bxVar);
                        d4c.i0(e18Var4, z80Var4, iqbVarE2);
                        nwb nwbVar9 = nwbVar4;
                        boolean zBooleanValue = ((Boolean) nwbVar9.getValue()).booleanValue();
                        nwb nwbVar10 = nwbVar5;
                        if (zBooleanValue) {
                            e18Var4.a0(-1268355453);
                            xo1 xo1Var = lja.K;
                            iqb iqbVarC2 = androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f);
                            o5b o5bVarD = dw1.d(xo1Var, false);
                            int iHashCode3 = Long.hashCode(e18Var4.T);
                            hyc hycVarL3 = e18Var4.l();
                            iqb iqbVarE3 = kxk.E(e18Var4, iqbVarC2);
                            e18Var4.e0();
                            if (e18Var4.S) {
                                e18Var4.k(re4Var);
                            } else {
                                e18Var4.n0();
                            }
                            d4c.i0(e18Var4, z80Var, o5bVarD);
                            d4c.i0(e18Var4, z80Var2, hycVarL3);
                            ij0.t(iHashCode3, e18Var4, z80Var3, e18Var4, bxVar);
                            d4c.i0(e18Var4, z80Var4, iqbVarE3);
                            q64 q64VarA3 = p64.a(eo0Var, lja.T, e18Var4, 48);
                            int iHashCode4 = Long.hashCode(e18Var4.T);
                            hyc hycVarL4 = e18Var4.l();
                            iqb iqbVarE4 = kxk.E(e18Var4, fqbVar2);
                            e18Var4.e0();
                            if (e18Var4.S) {
                                e18Var4.k(re4Var);
                            } else {
                                e18Var4.n0();
                            }
                            d4c.i0(e18Var4, z80Var, q64VarA3);
                            d4c.i0(e18Var4, z80Var2, hycVarL4);
                            ij0.t(iHashCode4, e18Var4, z80Var3, e18Var4, bxVar);
                            d4c.i0(e18Var4, z80Var4, iqbVarE4);
                            ez1.a(null, vf2.J, 0L, e18Var4, 48, 5);
                            fqbVar = fqbVar2;
                            tjh.b(gid.p(8.0f, R.string.ccr_onboarding_creating_environment, e18Var4, e18Var4, fqbVar2), null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 131066);
                            e18Var3 = e18Var4;
                            z5 = false;
                            ij0.w(e18Var3, true, true, false);
                            nwbVar7 = nwbVar10;
                        } else {
                            fqbVar = fqbVar2;
                            e18Var4.a0(-1267436179);
                            String strJ0 = d4c.j0(R.string.ccr_onboarding_environment_create_button, e18Var4);
                            iqb iqbVarC3 = androidx.compose.foundation.layout.b.c(fqbVar, 1.0f);
                            l45 l45Var2 = l45Var;
                            boolean zH = e18Var4.h(l45Var2);
                            jwf jwfVar2 = jwfVar;
                            boolean zH2 = zH | e18Var4.h(jwfVar2);
                            String str = string;
                            boolean zF = zH2 | e18Var4.f(str) | e18Var4.g(z8);
                            Context context2 = context;
                            boolean zH3 = zF | e18Var4.h(context2);
                            b bVar2 = bVar;
                            boolean zF2 = zH3 | e18Var4.f(bVar2);
                            a aVar2 = aVar;
                            boolean zH4 = zF2 | e18Var4.h(aVar2);
                            zy7 zy7Var5 = zy7Var4;
                            boolean zF3 = zH4 | e18Var4.f(zy7Var5);
                            Object objN8 = e18Var4.N();
                            if (zF3 || objN8 == lz1Var2) {
                                nwbVar7 = nwbVar10;
                                un1 un1Var = new un1(l45Var2, jwfVar2, str, z8, context2, bVar2, aVar2, zy7Var5, nwbVar9, nwbVar7, nwbVar6);
                                e18Var4.k0(un1Var);
                                objN8 = un1Var;
                            } else {
                                nwbVar7 = nwbVar10;
                            }
                            dtj.a(strJ0, iqbVarC3, z2, null, e12.a, null, 0L, (zy7) objN8, e18Var4, 24624, 104);
                            e18Var3 = e18Var4;
                            z5 = false;
                            e18Var3.p(false);
                        }
                        String str2 = (String) nwbVar7.getValue();
                        if (str2 == null) {
                            e18Var3.a0(-1263892291);
                            e18Var3.p(z5);
                        } else {
                            sq6.A(8.0f, -1263892290, e18Var3, e18Var3, fqbVar);
                            e18 e18Var5 = e18Var3;
                            tjh.b(str2, androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), gm3.a(e18Var3).y, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var5, 48, 0, 130040);
                            e18Var3 = e18Var5;
                            e18Var3.p(false);
                        }
                        e18Var3.p(true);
                        e18Var3.p(true);
                    } else {
                        e18Var4.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, 805306422, 444);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(ml3Var, jwfVar, bVar, aVar, zy7Var, zy7Var2, z, iqbVar, i2);
        }
    }

    public static final void b(MessageBlobFile messageBlobFile, ej7 ej7Var, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        messageBlobFile.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(297432359);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(messageBlobFile) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(ej7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            boolean zH = (((i4 ^ 6) > 4 && e18Var.f(messageBlobFile)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && e18Var.f(ej7Var)) || (i3 & 48) == 32) | e18Var.h(m7fVar);
            Object objN = e18Var.N();
            int i5 = 3;
            if (zH || objN == jd4.a) {
                objN = new f2d(messageBlobFile, ej7Var, m7fVar, i5);
                e18Var.k0(objN);
            }
            kce kceVar = jce.a;
            int i6 = i3 << 3;
            lwj.i(messageBlobFile, messageBlobFile.getFile_name(), ej7Var, zy7Var, fd9.q0(-1198367537, new nw7((ydd) fd9.r0(kceVar.b(ydd.class), oq5.B(kceVar.b(ydd.class)), (bz7) objN, e18Var), 21, messageBlobFile), e18Var), e18Var, i4 | 24576 | (i6 & 896) | (i6 & 7168));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(messageBlobFile, i2, ej7Var, zy7Var, 22);
        }
    }

    public static tvi c(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("technology");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("carrier_name");
            return new tvi(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
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

    public static final boolean d(toh tohVar) {
        tohVar.getClass();
        return tohVar.a == lja.a0;
    }

    public static final boolean e(toh tohVar) {
        tohVar.getClass();
        return tohVar.b == lja.a0;
    }

    public static boolean f(Canvas canvas, float f2, float f3, float f4, float f5) {
        return canvas.quickReject(f2, f3, f4, f5);
    }

    public static boolean g(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean h(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
