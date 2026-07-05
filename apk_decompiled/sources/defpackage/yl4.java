package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class yl4 implements sac, b4f, qo6, crc, xp3, iqa, byb, iub, xcc, see {
    public static yl4 E;
    public static final /* synthetic */ yl4 F = new yl4();

    public yl4(int i) {
        switch (i) {
            case 13:
                iz8 iz8Var = nz8.F;
                vde vdeVar = vde.I;
                break;
            case 14:
                HashMap map = vf4.O1.v;
                break;
            default:
                if (Build.VERSION.SDK_INT >= 35) {
                }
                break;
        }
    }

    public static final egg m(egg eggVar, egg eggVar2) {
        nte nteVar = nte.i;
        return eggVar != null ? eggVar.d(eggVar2) : eggVar2;
    }

    @Override // defpackage.b4f
    public boolean a() {
        return true;
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        jf7 jf7Var;
        j5h j5hVar = (j5h) obj2;
        v6k v6kVar = (v6k) obj;
        ct9 ct9Var = new ct9(Long.MAX_VALUE, 0, false, null);
        jf7[] jf7VarArrJ = v6kVar.j();
        jf7 jf7Var2 = null;
        int i = 0;
        if (jf7VarArrJ != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= jf7VarArrJ.length) {
                    jf7Var = null;
                    break;
                }
                jf7Var = jf7VarArrJ[i2];
                if ("location_updates_with_callback".equals(jf7Var.E)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (jf7Var != null && jf7Var.l0() >= 1) {
                c5l c5lVar = (c5l) v6kVar.t();
                b8k b8kVarX0 = b8k.x0(new e4k(1, j5hVar));
                Parcel parcelH = c5lVar.H();
                zyj.b(parcelH, ct9Var);
                zyj.b(parcelH, b8kVarX0);
                c5lVar.L(parcelH, 90);
                return;
            }
        }
        jf7[] jf7VarArrJ2 = v6kVar.j();
        if (jf7VarArrJ2 != null) {
            while (true) {
                if (i >= jf7VarArrJ2.length) {
                    break;
                }
                jf7 jf7Var3 = jf7VarArrJ2[i];
                if ("get_last_location_with_request".equals(jf7Var3.E)) {
                    jf7Var2 = jf7Var3;
                    break;
                }
                i++;
            }
            if (jf7Var2 != null && jf7Var2.l0() >= 1) {
                c5l c5lVar2 = (c5l) v6kVar.t();
                e4k e4kVar = new e4k(1, j5hVar);
                Parcel parcelH2 = c5lVar2.H();
                zyj.b(parcelH2, ct9Var);
                parcelH2.writeStrongBinder(e4kVar);
                c5lVar2.L(parcelH2, 82);
                return;
            }
        }
        c5l c5lVar3 = (c5l) v6kVar.t();
        Parcel parcelJ = c5lVar3.J(c5lVar3.H(), 7);
        Location location = (Location) zyj.a(parcelJ, Location.CREATOR);
        parcelJ.recycle();
        j5hVar.b(location);
    }

    @Override // defpackage.b4f
    public int b(qb5 qb5Var, ro5 ro5Var, int i) {
        ro5Var.F = 4;
        return -4;
    }

    @Override // defpackage.xp3
    public c69 c() {
        c69 c69Var = c69.G;
        return d4c.O(System.currentTimeMillis());
    }

    @Override // defpackage.xcc
    public long d(xd7 xd7Var) {
        return -1L;
    }

    @Override // defpackage.byb
    public boolean e() {
        return false;
    }

    @Override // defpackage.qo6
    public Object f(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.b4f
    public void g() {
    }

    @Override // defpackage.b4f
    public int h(long j) {
        return 0;
    }

    @Override // defpackage.iqa
    public Object i(n2d n2dVar) {
        return n2dVar.m0;
    }

    @Override // defpackage.iub
    public boolean j() {
        return false;
    }

    @Override // defpackage.xcc
    public vef k() {
        return new z91(-9223372036854775807L);
    }

    @Override // defpackage.xcc
    public void l(long j) {
    }

    public void n(wc0 wc0Var, wc0 wc0Var2) {
        HashSet hashSet = new HashSet();
        Iterator it = wc0Var.iterator();
        while (it.hasNext()) {
            hashSet.add(((jc0) it.next()).e());
        }
        Iterator it2 = wc0Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((jc0) it2.next()).e());
        }
    }

    public j7g o(c61 c61Var, r9i r9iVar) {
        r9iVar.getClass();
        return p(c61Var, r9iVar, false, 0, true);
    }

    @Override // defpackage.sac
    public Object o0() {
        return new ArrayDeque();
    }

    public j7g p(c61 c61Var, r9i r9iVar, boolean z, int i, boolean z2) {
        r9i r9iVarB;
        q16 q16Var = (q16) c61Var.G;
        vai vaiVarQ = q(new wai(1, q16Var.P0()), c61Var, null, i);
        yr9 yr9VarB = vaiVarQ.b();
        yr9VarB.getClass();
        j7g j7gVarE = dwk.e(yr9VarB);
        if (ttj.j(j7gVarE)) {
            return j7gVarE;
        }
        vaiVarQ.a();
        n(j7gVarE.getAnnotations(), zc0.a(r9iVar));
        if (!ttj.j(j7gVarE)) {
            if (ttj.j(j7gVarE)) {
                r9iVarB = j7gVarE.K();
            } else {
                r9i r9iVarK = j7gVarE.K();
                cbf cbfVar = r9i.F;
                r9iVarK.getClass();
                if (r9iVar.isEmpty() && r9iVarK.isEmpty()) {
                    r9iVarB = r9iVar;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) cbfVar.F).values();
                    collectionValues.getClass();
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        yc0 yc0Var = (yc0) r9iVar.E.get(iIntValue);
                        yc0 yc0Var2 = (yc0) r9iVarK.E.get(iIntValue);
                        yc0 yc0VarA = yc0Var == null ? yc0Var2 != null ? yc0Var2.a(yc0Var) : null : yc0Var.a(yc0Var2);
                        if (yc0VarA != null) {
                            arrayList.add(yc0VarA);
                        }
                    }
                    r9iVarB = cbf.b(arrayList);
                }
            }
            j7gVarE = dwk.j(j7gVarE, null, r9iVarB, 1);
        }
        j7g j7gVarJ = fbi.j(j7gVarE, z);
        if (!z2) {
            return j7gVarJ;
        }
        j4 j4Var = q16Var.K;
        j4Var.getClass();
        return u00.S(j7gVarJ, yfd.d0(eab.b, r9iVar, j4Var, (List) c61Var.H, z));
    }

    public vai q(vai vaiVar, c61 c61Var, qai qaiVar, int i) {
        int iA;
        int iZ;
        q16 q16Var = (q16) c61Var.G;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + q16Var.getName());
        }
        if (vaiVar.c()) {
            qaiVar.getClass();
            return fbi.k(qaiVar);
        }
        yr9 yr9VarB = vaiVar.b();
        yr9VarB.getClass();
        u9i u9iVarO = yr9VarB.O();
        u9iVarO.getClass();
        xh3 xh3VarA = u9iVarO.a();
        vai vaiVar2 = xh3VarA instanceof qai ? (vai) ((Map) c61Var.I).get(xh3VarA) : null;
        if (vaiVar2 != null) {
            if (vaiVar2.c()) {
                qaiVar.getClass();
                return fbi.k(qaiVar);
            }
            fhi fhiVarK0 = vaiVar2.b().k0();
            int iA2 = vaiVar2.a();
            if (iA2 == 0 || (iA = vaiVar.a()) == 0) {
                throw null;
            }
            if (iA != iA2 && iA != 1 && iA2 == 1) {
                iA2 = iA;
            }
            if (qaiVar == null || (iZ = qaiVar.z()) == 0) {
                iZ = 1;
            }
            if (iZ != iA2 && iZ != 1 && iA2 == 1) {
                iA2 = 1;
            }
            n(yr9VarB.getAnnotations(), fhiVarK0.getAnnotations());
            j7g j7gVarJ = fbi.j(dwk.e(fhiVarK0), yr9VarB.b0());
            r9i r9iVarK = yr9VarB.K();
            if (!ttj.j(j7gVarJ)) {
                if (ttj.j(j7gVarJ)) {
                    r9iVarK = j7gVarJ.K();
                } else {
                    r9i r9iVarK2 = j7gVarJ.K();
                    r9iVarK.getClass();
                    cbf cbfVar = r9i.F;
                    r9iVarK2.getClass();
                    if (!r9iVarK.isEmpty() || !r9iVarK2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) cbfVar.F).values();
                        collectionValues.getClass();
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            yc0 yc0Var = (yc0) r9iVarK.E.get(iIntValue);
                            yc0 yc0Var2 = (yc0) r9iVarK2.E.get(iIntValue);
                            yc0 yc0VarA = yc0Var == null ? yc0Var2 != null ? yc0Var2.a(yc0Var) : null : yc0Var.a(yc0Var2);
                            if (yc0VarA != null) {
                                arrayList.add(yc0VarA);
                            }
                        }
                        r9iVarK = cbf.b(arrayList);
                    }
                }
                j7gVarJ = dwk.j(j7gVarJ, null, r9iVarK, 1);
            }
            return new wai(iA2, j7gVarJ);
        }
        j7g j7gVarE = dwk.e(vaiVar.b().k0());
        if (!ttj.j(j7gVarE) && fbi.c(j7gVarE, pgg.S, null)) {
            u9i u9iVarO2 = j7gVarE.O();
            xh3 xh3VarA2 = u9iVarO2.a();
            u9iVarO2.getParameters().size();
            j7gVarE.H().size();
            if (!(xh3VarA2 instanceof qai)) {
                int i2 = 0;
                if (!(xh3VarA2 instanceof q16)) {
                    j7g j7gVarR = r(j7gVarE, c61Var, i);
                    a.d(j7gVarR);
                    for (Object obj : j7gVarR.H()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            x44.n0();
                            throw null;
                        }
                        vai vaiVar3 = (vai) obj;
                        if (!vaiVar3.c()) {
                            yr9 yr9VarB2 = vaiVar3.b();
                            yr9VarB2.getClass();
                            if (!fbi.c(yr9VarB2, pgg.R, null)) {
                            }
                        }
                        i2 = i3;
                    }
                    return new wai(vaiVar.a(), j7gVarR);
                }
                q16 q16Var2 = (q16) xh3VarA2;
                if (c61Var.x(q16Var2)) {
                    String str = q16Var2.getName().E;
                    str.getClass();
                    return new wai(1, nu6.c(mu6.RECURSIVE_TYPE_ALIAS, str));
                }
                List listH = j7gVarE.H();
                ArrayList arrayList2 = new ArrayList(x44.y(listH, 10));
                for (Object obj2 : listH) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        x44.n0();
                        throw null;
                    }
                    arrayList2.add(q((vai) obj2, c61Var, (qai) u9iVarO2.getParameters().get(i2), i + 1));
                    i2 = i4;
                }
                List parameters = q16Var2.K.getParameters();
                ArrayList arrayList3 = new ArrayList(x44.y(parameters, 10));
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((qai) it2.next()).a());
                }
                return new wai(vaiVar.a(), u00.S(p(new c61(c61Var, q16Var2, arrayList2, sta.p0(w44.v1(arrayList3, arrayList2)), 26), j7gVarE.K(), j7gVarE.b0(), i + 1, false), r(j7gVarE, c61Var, i)));
            }
        }
        return vaiVar;
    }

    public j7g r(j7g j7gVar, c61 c61Var, int i) {
        u9i u9iVarO = j7gVar.O();
        List listH = j7gVar.H();
        ArrayList arrayList = new ArrayList(x44.y(listH, 10));
        int i2 = 0;
        for (Object obj : listH) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            vai vaiVar = (vai) obj;
            vai vaiVarQ = q(vaiVar, c61Var, (qai) u9iVarO.getParameters().get(i2), i + 1);
            if (!vaiVarQ.c()) {
                vaiVarQ = new wai(vaiVarQ.a(), fbi.i(vaiVarQ.b(), vaiVar.b().b0()));
            }
            arrayList.add(vaiVarQ);
            i2 = i3;
        }
        return dwk.j(j7gVar, arrayList, null, 2);
    }

    public yl4(hj6 hj6Var) {
    }

    public /* synthetic */ yl4(char c) {
    }
}
