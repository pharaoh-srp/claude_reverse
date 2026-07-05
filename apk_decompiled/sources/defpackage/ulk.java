package defpackage;

import android.webkit.WebResourceResponse;
import androidx.compose.foundation.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ulk {
    public static final ta4 a = new ta4(779414923, false, new pb4(28));
    public static final ta4 b = new ta4(-805601030, false, new pb4(29));
    public static final ta4 c = new ta4(385927896, false, new rb4(16));

    public static final void a(String str, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1609424874);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var = e18Var2;
            trk.b(zy7Var2, fd9.q0(-1961234669, new sxa(zy7Var, 19, b2), e18Var2), null, fd9.q0(-1452455855, new sxa(zy7Var2, 20, b2), e18Var2), ssk.b, fd9.q0(-689287634, new yi7(str, 26), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, ((i2 >> 6) & 14) | 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t2b(str, zy7Var, zy7Var2, i, 1);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, e0g e0gVar, ld4 ld4Var, int i, int i2) {
        int i3;
        e0g e0gVar2;
        e18 e18Var;
        int i4;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1667928142);
        if ((i & 6) == 0) {
            i3 = (e18Var2.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                e0gVar2 = e0gVar;
                if (e18Var2.f(e0gVar2)) {
                    i4 = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                }
                i3 |= i4;
            } else {
                e0gVar2 = e0gVar;
            }
            i4 = FreeTypeConstants.FT_LOAD_PEDANTIC;
            i3 |= i4;
        } else {
            e0gVar2 = e0gVar;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            } else if ((i2 & 4) != 0) {
                e0gVar2 = gm3.b(e18Var2).f;
            }
            e18Var2.q();
            xo1 xo1Var = lja.K;
            iqb iqbVarC = b.c(yfd.p(xn5.V(iqbVar, e0gVar2), gm3.a(e18Var2).r, zni.b), false, null, null, null, zy7Var, 15);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
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
            tjh.b(d4c.j0(R.string.remote_image_load_image, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(zy7Var, iqbVar, e0gVar2, i, i2, 9);
        }
    }

    public static final void c(String str, String str2, iqb iqbVar, e0g e0gVar, xee xeeVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e0g e0gVar2;
        xee xeeVar2;
        e0g e0gVar3;
        int i2;
        iqb iqbVar3;
        xee xeeVar3;
        iqb iqbVar4;
        e0g e0gVar4;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-36957664);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | 76800;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                e0gVar3 = gm3.b(e18Var).f;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(xee.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-516097);
                iqbVar3 = fqb.E;
                xeeVar3 = (xee) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-516097);
                iqbVar3 = iqbVar;
                e0gVar3 = e0gVar;
                xeeVar3 = xeeVar;
            }
            int i6 = i2;
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.w(new aac(xeeVar3, 20, str));
                e18Var.k0(objN2);
            }
            if (((Boolean) ((wlg) objN2).getValue()).booleanValue()) {
                e18Var.a0(-1493722163);
                e0g e0gVar5 = e0gVar3;
                tlk.c(str, str2, iqbVar3, e0gVar5, null, e18Var, i6 & 65534);
                iqbVar4 = iqbVar3;
                e0gVar4 = e0gVar5;
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                iqbVar4 = iqbVar3;
                e0gVar4 = e0gVar3;
                e18Var.a0(-1493493414);
                Object[] objArr = new Object[0];
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new afe(i4);
                    e18Var.k0(objN3);
                }
                nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN3, e18Var, 48);
                iqb iqbVarO = androidx.compose.foundation.layout.b.o(iqbVar4, 120.0f);
                boolean zF2 = e18Var.f(nwbVar);
                Object objN4 = e18Var.N();
                if (zF2 || objN4 == lz1Var) {
                    objN4 = new k3c(24, nwbVar);
                    e18Var.k0(objN4);
                }
                b((zy7) objN4, iqbVarO, e0gVar4, e18Var, 0, 0);
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    e18Var.a0(-1493212027);
                    int i7 = i6 & 14;
                    boolean zH = e18Var.h(xeeVar3) | (i7 == 4) | e18Var.f(nwbVar);
                    Object objN5 = e18Var.N();
                    if (zH || objN5 == lz1Var) {
                        objN5 = new hya(xeeVar3, str, nwbVar, 19);
                        e18Var.k0(objN5);
                    }
                    zy7 zy7Var = (zy7) objN5;
                    boolean zF3 = e18Var.f(nwbVar);
                    Object objN6 = e18Var.N();
                    if (zF3 || objN6 == lz1Var) {
                        objN6 = new k3c(25, nwbVar);
                        e18Var.k0(objN6);
                    }
                    a(str, zy7Var, (zy7) objN6, e18Var, i7);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1492938142);
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
            xeeVar2 = xeeVar3;
            iqbVar2 = iqbVar4;
            e0gVar2 = e0gVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            e0gVar2 = e0gVar;
            xeeVar2 = xeeVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(str, str2, iqbVar2, e0gVar2, xeeVar2, i, 3);
        }
    }

    public static xa d(qh9 qh9Var) {
        try {
            return new xa(qh9Var.s("x").k(), qh9Var.s("y").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Position", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Position", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Position", e3);
            return null;
        }
    }

    public static wbh e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new wbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Session", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Session", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Session", e3);
            return null;
        }
    }

    public static sxb f() {
        return yp3.e;
    }

    public static ax5 g(ova ovaVar) {
        return new ax5(19, ovaVar);
    }

    public static boolean h(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final WebResourceResponse i(hdc hdcVar, String str, String str2, Long l) {
        nm6 nm6Var = nm6.E;
        hdcVar.getClass();
        str.getClass();
        try {
            jie jieVar = new jie();
            jieVar.g(str);
            pqe pqeVarF = new f4e(hdcVar, new kie(jieVar), false).f();
            rqe rqeVar = pqeVarF.K;
            int i = pqeVarF.H;
            boolean z = pqeVarF.U;
            sfa sfaVar = sfa.WARN;
            if (!z) {
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
                        String str3 = "Proxy fetch: HTTP " + i + " for " + str;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "FileProxy", str3);
                        }
                    }
                }
                pqeVarF.close();
                return new WebResourceResponse("text/plain", "UTF-8", i, "upstream error", nm6Var, null);
            }
            if (l != null) {
                long jD = rqeVar.d();
                if (jD > l.longValue()) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList2) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList2.add(obj2);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            String str4 = "Proxy fetch: Content-Length " + jD + " > cap " + l + " for " + str;
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((n30) ((zfa) it2.next())).b(sfaVar, "FileProxy", str4);
                            }
                        }
                    }
                    pqeVarF.close();
                    return new WebResourceResponse("text/plain", "UTF-8", 413, "content too large", nm6Var, null);
                }
            }
            Map mapSingletonMap = Collections.singletonMap("Access-Control-Allow-Origin", "*");
            mapSingletonMap.getClass();
            return new WebResourceResponse(str2, null, 200, "OK", mapSingletonMap, rqeVar.G0().M0());
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (!arrayList3.isEmpty()) {
                    zfa.a.getClass();
                    String strK = ij0.k("Proxy fetch threw for ", str, ": ", gsk.c(e));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfa.ERROR, "FileProxy", strK);
                    }
                }
            }
            return new WebResourceResponse("text/plain", "UTF-8", 500, "fetch failed", nm6Var, null);
        }
    }
}
