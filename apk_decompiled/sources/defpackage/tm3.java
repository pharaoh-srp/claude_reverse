package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.media3.common.PlaybackException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tm3 {
    public static final long a;
    public static final long b;

    static {
        int i = d54.i;
        a = d54.b;
        b = d54.d;
    }

    public static final void a(final String str, final hdc hdcVar, final iqb iqbVar, ld4 ld4Var, final int i) {
        r7e r7eVarS;
        pz7 pz7Var;
        str.getClass();
        hdcVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(433296179);
        int i2 = (i & 6) == 0 ? (e18Var.f(str) ? 4 : 2) | i : i;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(hdcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else {
            if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
                e18Var.a0(1949893376);
                b(iqbVar, e18Var, (i2 >> 6) & 14);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i4 = 0;
                    pz7Var = new pz7() { // from class: om3
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            iei ieiVar = iei.a;
                            int i6 = i;
                            iqb iqbVar2 = iqbVar;
                            hdc hdcVar2 = hdcVar;
                            String str2 = str;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    tm3.a(str2, hdcVar2, iqbVar2, ld4Var2, x44.p0(i6 | 1));
                                    break;
                                default:
                                    tm3.a(str2, hdcVar2, iqbVar2, ld4Var2, x44.p0(i6 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var.a0(1949969295);
            e18Var.p(false);
            Context applicationContext = ((Context) e18Var.j(w00.b)).getApplicationContext();
            m4a m4aVar = (m4a) e18Var.j(tda.a);
            boolean zF = e18Var.f(hdcVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                h77 h77Var = new h77(applicationContext);
                epk epkVar = new epk();
                epkVar.F = hdcVar;
                epkVar.E = new epk(20);
                os5 os5Var = new os5(epkVar, new gr5());
                fd9.M(!h77Var.x);
                h77Var.d = new ms5(1, os5Var);
                p31 p31Var = p31.b;
                fd9.M(!h77Var.x);
                h77Var.i = p31Var;
                h77Var.j = true;
                fd9.M(!h77Var.x);
                h77Var.k = true;
                fd9.M(!h77Var.x);
                h77Var.x = true;
                v77 v77Var = new v77(h77Var);
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str2 = "created ExoPlayer " + v77Var;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.DEBUG, "ClaudeVideoPlayer", str2);
                        }
                    }
                }
                objN = new j77(v77Var);
                e18Var.k0(objN);
            }
            v77 v77Var2 = ((j77) objN).E;
            boolean zH = e18Var.h(v77Var2) | ((i2 & 14) == 4);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new u73(v77Var2, str, null, 3);
                e18Var.k0(objN2);
            }
            fd9.j(v77Var2, str, (pz7) objN2, e18Var);
            boolean zF2 = e18Var.f(v77Var2);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = mpk.P(null);
                e18Var.k0(objN3);
            }
            nwb nwbVar = (nwb) objN3;
            boolean zF3 = e18Var.f(nwbVar) | e18Var.h(v77Var2) | e18Var.h(m4aVar);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new l6(m4aVar, nwbVar, v77Var2, i3);
                e18Var.k0(objN4);
            }
            fd9.e(v77Var2, m4aVar, (bz7) objN4, e18Var);
            View view = (View) e18Var.j(w00.f);
            boolean zH2 = e18Var.h(v77Var2) | e18Var.h(view);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new lj2(view, 5, v77Var2);
                e18Var.k0(objN5);
            }
            fd9.e(v77Var2, view, (bz7) objN5, e18Var);
            c(v77Var2, iqbVar, e18Var, (i2 >> 3) & 112);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i5 = 1;
            pz7Var = new pz7() { // from class: om3
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = i5;
                    iei ieiVar = iei.a;
                    int i6 = i;
                    iqb iqbVar2 = iqbVar;
                    hdc hdcVar2 = hdcVar;
                    String str22 = str;
                    ld4 ld4Var2 = (ld4) obj2;
                    ((Integer) obj22).getClass();
                    switch (i52) {
                        case 0:
                            tm3.a(str22, hdcVar2, iqbVar2, ld4Var2, x44.p0(i6 | 1));
                            break;
                        default:
                            tm3.a(str22, hdcVar2, iqbVar2, ld4Var2, x44.p0(i6 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void b(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2048206444);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarP = yfd.p(iqbVar, a, zni.b);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            cv8.b(a.a(ud0.Z0, e18Var), null, b.o(nw1.a.a(fqb.E, lja.K), 64.0f), b, e18Var, 3128, 0);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, 4, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void c(v77 v77Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        nm3 nm3Var;
        ?? r2;
        e18 e18Var2;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(1266481069);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = i | (e18Var3.h(v77Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(iqbVar) ? 32 : 16;
        }
        if (e18Var3.Q(i2 & 1, (i2 & 19) != 18)) {
            int i4 = i2 & 14;
            e18Var3.a0(-1006141136);
            e18Var3.a0(2097651363);
            Object objN = e18Var3.N();
            Object obj = jd4.a;
            if (objN == obj) {
                objN = new edd();
                e18Var3.k0(objN);
            }
            edd eddVar = (edd) objN;
            e18Var3.p(false);
            e18Var3.a0(2097653782);
            boolean zH = e18Var3.h(eddVar) | e18Var3.h(v77Var);
            Object objN2 = e18Var3.N();
            tp4 tp4Var = null;
            if (zH || objN2 == obj) {
                objN2 = new kza(eddVar, v77Var, tp4Var, 17);
                e18Var3.k0(objN2);
            }
            e18Var3.p(false);
            fd9.i(e18Var3, (pz7) objN2, v77Var);
            Boolean bool = Boolean.FALSE;
            e18Var3.a0(2097656206);
            boolean zH2 = e18Var3.h(eddVar) | e18Var3.g(false);
            Object objN3 = e18Var3.N();
            if (zH2 || objN3 == obj) {
                objN3 = new l6b(eddVar, tp4Var, i3);
                e18Var3.k0(objN3);
            }
            e18Var3.p(false);
            fd9.i(e18Var3, (pz7) objN3, bool);
            e18Var3.p(false);
            e18Var3.a0(1585922024);
            e18Var3.a0(-1936579788);
            boolean zF = e18Var3.f(v77Var);
            Object objN4 = e18Var3.N();
            if (zF || objN4 == obj) {
                objN4 = new f6d(v77Var);
                e18Var3.k0(objN4);
            }
            f6d f6dVar = (f6d) objN4;
            e18Var3.p(false);
            e18Var3.a0(-1936577403);
            boolean zH3 = e18Var3.h(f6dVar);
            Object objN5 = e18Var3.N();
            if (zH3 || objN5 == obj) {
                objN5 = new al8(f6dVar, (tp4) null, 21);
                e18Var3.k0(objN5);
            }
            e18Var3.p(false);
            fd9.i(e18Var3, (pz7) objN5, v77Var);
            e18Var3.p(false);
            boolean zF2 = e18Var3.f(v77Var);
            Object objN6 = e18Var3.N();
            if (zF2 || objN6 == obj) {
                objN6 = new nm3(v77Var);
                e18Var3.k0(objN6);
            }
            nm3 nm3Var2 = (nm3) objN6;
            boolean zH4 = e18Var3.h(nm3Var2);
            Object objN7 = e18Var3.N();
            if (zH4 || objN7 == obj) {
                objN7 = new cj(nm3Var2, tp4Var, 13);
                e18Var3.k0(objN7);
            }
            fd9.i(e18Var3, (pz7) objN7, v77Var);
            wo8 wo8Var = zni.b;
            long j = a;
            iqb iqbVarP = yfd.p(iqbVar, j, wo8Var);
            Object objN8 = e18Var3.N();
            if (objN8 == obj) {
                objN8 = vb7.f(e18Var3);
            }
            zub zubVar = (zub) objN8;
            boolean z = ((PlaybackException) nm3Var2.c.getValue()) == null && ((Boolean) f6dVar.b.getValue()).booleanValue();
            String strJ0 = d4c.j0(((Boolean) f6dVar.c.getValue()).booleanValue() ? R.string.media_player_play : R.string.media_player_pause, e18Var3);
            boolean zH5 = e18Var3.h(f6dVar);
            Object objN9 = e18Var3.N();
            if (zH5 || objN9 == obj) {
                objN9 = new r73(0, f6dVar, f6d.class, "onClick", "onClick()V", 0, 22);
                e18Var3.k0(objN9);
            }
            iqb iqbVarB = androidx.compose.foundation.b.b(iqbVarP, zubVar, null, z, strJ0, null, (zy7) ((jm9) objN9), 16);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var3.e0();
            if (e18Var3.S) {
                e18Var3.k(re4Var);
            } else {
                e18Var3.n0();
            }
            d4c.i0(e18Var3, cd4.f, o5bVarD);
            d4c.i0(e18Var3, cd4.e, hycVarL);
            d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var3, cd4.h);
            d4c.i0(e18Var3, cd4.d, iqbVarE);
            xo1 xo1Var = lja.K;
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarA = nw1Var.a(fqbVar, xo1Var);
            k8g k8gVar = (k8g) eddVar.a.getValue();
            iqbVarA.getClass();
            e18Var3.a0(-363477779);
            final cz5 cz5Var = (cz5) e18Var3.j(ve4.h);
            iqb iqbVarH0 = null;
            iqb iqbVarY = b.y(b.c, null, 3);
            if (k8gVar == null) {
                nm3Var = nm3Var2;
                r2 = 0;
            } else {
                final long j2 = k8gVar.a;
                e18Var3.a0(-1859173400);
                boolean zF3 = e18Var3.f(cz5Var) | e18Var3.e(j2);
                nm3Var = nm3Var2;
                Object objN10 = e18Var3.N();
                if (zF3 || objN10 == obj) {
                    objN10 = new rz7() { // from class: gd7
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            q5b q5bVar = (q5b) obj2;
                            h5b h5bVar = (h5b) obj3;
                            q5bVar.getClass();
                            h5bVar.getClass();
                            long j3 = j2;
                            float fE = k8g.e(j3);
                            cz5 cz5Var2 = cz5Var;
                            long jI = eve.i(cz5Var2.q0(fE), cz5Var2.q0(k8g.c(j3)));
                            float fS = wd6.S(jI, eve.i(rl4.h(r3.a), rl4.g(r3.a)));
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fS)) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
                            int i5 = m6f.a;
                            long j4 = ((rl4) obj4).a;
                            float fE2 = k8g.e(jI);
                            int i6 = m6f.a;
                            c3d c3dVarU = h5bVar.u(rl4.a(0, mwa.L(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * fE2), 0, mwa.L(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * k8g.c(jI)), 5, j4));
                            return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 11));
                        }
                    };
                    e18Var3.k0(objN10);
                }
                r2 = 0;
                e18Var3.p(false);
                iqbVarH0 = fd9.h0(fqbVar, (rz7) objN10);
            }
            if (iqbVarH0 == null) {
                iqbVarH0 = fqbVar;
            }
            iqb iqbVarB2 = iqbVarA.B(iqbVarY.B(iqbVarH0));
            e18Var3.p(r2);
            dvj.b(v77Var, iqbVarB2, r2, e18Var3, i4);
            if (((Boolean) eddVar.b.getValue()).booleanValue()) {
                e18Var3.a0(-67117543);
                dw1.a(yfd.p(nw1Var.b(), j, wo8Var), e18Var3, r2);
                e18Var3.p(r2);
            } else {
                e18Var3.a0(-66973393);
                e18Var3.p(r2);
            }
            nm3 nm3Var3 = nm3Var;
            if (((PlaybackException) nm3Var3.c.getValue()) != null) {
                e18Var3.a0(-971989786);
                boolean zH6 = e18Var3.h(nm3Var3) | e18Var3.h(v77Var);
                Object objN11 = e18Var3.N();
                if (zH6 || objN11 == obj) {
                    objN11 = new ik1(v77Var, 19, nm3Var3);
                    e18Var3.k0(objN11);
                }
                d((zy7) objN11, nw1Var.a(fqbVar, xo1Var), e18Var3, 0);
                e18Var3.p(false);
                e18Var2 = e18Var3;
            } else if (nm3Var3.b.h() == 2) {
                e18Var3.a0(-66637818);
                tjd.a(nw1Var.a(fqbVar, xo1Var), b, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var3, 48, 60);
                e18 e18Var4 = e18Var3;
                e18Var4.p(false);
                e18Var2 = e18Var4;
            } else if (((Boolean) f6dVar.c.getValue()).booleanValue()) {
                e18Var3.a0(-66460591);
                cv8.b(a.a(ud0.Z0, e18Var3), null, b.o(nw1Var.a(fqbVar, xo1Var), 64.0f), b, e18Var3, 3128, 0);
                e18Var3.p(false);
                e18Var2 = e18Var3;
            } else {
                e18Var3.a0(-66114321);
                e18Var3.p(false);
                e18Var2 = e18Var3;
            }
            e18Var2.p(true);
            e18Var = e18Var2;
        } else {
            e18Var3.T();
            e18Var = e18Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(v77Var, iqbVar, i, 8);
        }
    }

    public static final void d(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(591600071);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            q64 q64VarA = p64.a(new ho0(8.0f, true, new sz6(1)), lja.T, e18Var, 54);
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
            bpc bpcVarA = a.a(ud0.K1, e18Var);
            iqb iqbVarO = b.o(fqb.E, 40.0f);
            long j = b;
            cv8.b(bpcVarA, null, iqbVarO, j, e18Var, 3512, 0);
            tjh.b(d4c.j0(R.string.media_player_error, e18Var), null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 384, 0, 262138);
            csg.j(zy7Var, null, false, null, null, null, null, fhk.a, e18Var, (i3 & 14) | 805306368, 510);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var, iqbVar, i, 5);
        }
    }
}
