package defpackage;

import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.datatypes.DataOrigin;
import android.os.ext.SdkExtensions;
import com.anthropic.claude.R;
import com.google.android.gms.internal.measurement.k0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class csk {
    public static final ta4 a = new ta4(1760276881, false, new vb4(12));

    static {
        new ta4(461360665, false, new vb4(13));
        new ta4(1837574169, false, new vb4(14));
    }

    public static final void a(boolean z, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1656118149);
        int i2 = 2;
        int i3 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            ud0 ud0Var = ud0.S;
            String strJ0 = d4c.j0(R.string.conway_system_developer_title, e18Var);
            String strJ02 = d4c.j0(R.string.conway_system_developer_desc, e18Var);
            ta4 ta4VarQ0 = fd9.q0(-1381590797, new nk4(i2, bz7Var, z), e18Var);
            fqb fqbVar = fqb.E;
            zsk.c(ud0Var, strJ0, strJ02, fqbVar, null, 200.0f, ta4VarQ0, e18Var, 1772544, 16);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(z, bz7Var, iqbVar2, i, 12);
        }
    }

    public static final qg8 b(qg8 qg8Var, float f) {
        jy1 jy1Var = qg8Var.c;
        if (jy1Var != null) {
            return qg8Var;
        }
        if (Float.isNaN(f)) {
            wo8 wo8Var = cg8.a;
            f = 20.0f;
        }
        long j = qg8Var.a;
        float fD = d54.d(j) * ((f / 72.0f) + 1.0f);
        return new qg8(d54.b(fD <= 1.0f ? fD : 1.0f, j), qg8Var.b, jy1Var);
    }

    public static final hs c(Set set, bz7 bz7Var, bz7 bz7Var2) {
        set.getClass();
        lqa lqaVar = new lqa();
        Set<vr> set2 = set;
        for (vr vrVar : set2) {
            Object objInvoke = bz7Var.invoke(tnk.k(vrVar));
            if (objInvoke != null) {
                lqaVar.put(vrVar, objInvoke);
            }
        }
        lqa lqaVarC = lqaVar.c();
        lqa lqaVar2 = new lqa();
        Iterator it = ((mqa) lqaVarC.entrySet()).iterator();
        while (((jqa) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((jqa) it).next();
            vr vrVar2 = (vr) entry.getKey();
            Object value = entry.getValue();
            if (es.b.containsKey(vrVar2) || es.e.containsKey(vrVar2)) {
                String strA = vrVar2.a();
                value.getClass();
                lqaVar2.put(strA, (Long) value);
            }
        }
        lqa lqaVarC2 = lqaVar2.c();
        lqa lqaVar3 = new lqa();
        Iterator it2 = ((mqa) lqaVarC.entrySet()).iterator();
        while (((jqa) it2).hasNext()) {
            Map.Entry entry2 = (Map.Entry) ((jqa) it2).next();
            vr vrVar3 = (vr) entry2.getKey();
            Object value2 = entry2.getValue();
            if (es.a.containsKey(vrVar3)) {
                String strA2 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA2, (Double) value2);
            } else if (es.c.containsKey(vrVar3)) {
                String strA3 = vrVar3.a();
                sn6 sn6Var = yn6.G;
                value2.getClass();
                lqaVar3.put(strA3, Double.valueOf(new yn6(bje.p(value2).getInCalories(), xn6.E).b()));
            } else if (es.f.containsKey(vrVar3)) {
                String strA4 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA4, Double.valueOf(bje.r(value2).getInGrams()));
            } else if (es.d.containsKey(vrVar3)) {
                String strA5 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA5, Double.valueOf(bje.q(value2).getInMeters()));
            } else if (es.g.containsKey(vrVar3)) {
                String strA6 = vrVar3.a();
                xua xuaVar = fva.G;
                value2.getClass();
                lqaVar3.put(strA6, Double.valueOf(xua.a(bje.r(value2).getInGrams()).a(eva.F)));
            } else if (es.i.containsKey(vrVar3)) {
                String strA7 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA7, Double.valueOf(bje.t(value2).getInMillimetersOfMercury()));
            } else if (es.h.containsKey(vrVar3)) {
                String strA8 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA8, Double.valueOf(bje.s(value2).getInWatts()));
            } else if (es.j.containsKey(vrVar3)) {
                if (SdkExtensions.getExtensionVersion(34) < 13) {
                    sz6.p("Failed requirement.");
                    return null;
                }
                String strA9 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA9, Double.valueOf(s8e.o(value2).getInCelsius()));
            } else if (es.k.containsKey(vrVar3)) {
                String strA10 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA10, Double.valueOf(bje.u(value2).getInMetersPerSecond()));
            } else if (es.l.containsKey(vrVar3)) {
                String strA11 = vrVar3.a();
                value2.getClass();
                lqaVar3.put(strA11, Double.valueOf(bje.v(value2).getInLiters()));
            }
        }
        lqa lqaVarC3 = lqaVar3.c();
        HashSet hashSet = new HashSet();
        Iterator it3 = set2.iterator();
        while (it3.hasNext()) {
            Iterable iterable = (Iterable) bz7Var2.invoke(tnk.k((vr) it3.next()));
            ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
            Iterator it4 = iterable.iterator();
            while (it4.hasNext()) {
                DataOrigin dataOriginO = bje.o(it4.next());
                dataOriginO.getClass();
                String packageName = dataOriginO.getPackageName();
                packageName.getClass();
                arrayList.add(new cg5(packageName));
            }
            b54.t0(hashSet, arrayList);
        }
        return new hs(lqaVarC2, lqaVarC3, hashSet);
    }

    public static final wc0 d(wc0 wc0Var, wc0 wc0Var2) {
        wc0Var.getClass();
        wc0Var2.getClass();
        return wc0Var.isEmpty() ? wc0Var2 : wc0Var2.isEmpty() ? wc0Var : new xc0(new wc0[]{wc0Var, wc0Var2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(defpackage.h08 r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r6 = r6 & 2
            if (r6 == 0) goto Le
            r1 = r2
        Le:
            r5.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r1 == 0) goto L30
            boolean r1 = r5 instanceof defpackage.dm4
            if (r1 == 0) goto L1f
            java.lang.String r1 = "<init>"
            goto L2d
        L1f:
            r1 = r5
            co5 r1 = (defpackage.co5) r1
            sxb r1 = r1.getName()
            java.lang.String r1 = r1.b()
            r1.getClass()
        L2d:
            r6.append(r1)
        L30:
            java.lang.String r1 = "("
            r6.append(r1)
            l6e r1 = r5.S()
            n08 r2 = defpackage.n08.F
            if (r1 == 0) goto L51
            mw9 r1 = (defpackage.mw9) r1
            yr9 r1 = r1.getType()
            r1.getClass()
            pai r3 = defpackage.pai.k
            java.lang.Object r1 = defpackage.oyk.f(r1, r3, r2)
            jl9 r1 = (defpackage.jl9) r1
            r6.append(r1)
        L51:
            java.util.List r1 = r5.I()
            java.util.Iterator r1 = r1.iterator()
        L59:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            eri r3 = (defpackage.eri) r3
            yr9 r3 = r3.getType()
            r3.getClass()
            pai r4 = defpackage.pai.k
            java.lang.Object r3 = defpackage.oyk.f(r3, r4, r2)
            jl9 r3 = (defpackage.jl9) r3
            r6.append(r3)
            goto L59
        L78:
            java.lang.String r1 = ")"
            r6.append(r1)
            if (r0 == 0) goto Lbe
            boolean r0 = r5 instanceof defpackage.dm4
            if (r0 == 0) goto L84
            goto La6
        L84:
            yr9 r0 = r5.getReturnType()
            r0.getClass()
            sxb r1 = defpackage.or9.e
            xw7 r1 = defpackage.okg.d
            boolean r0 = defpackage.or9.C(r0, r1)
            if (r0 == 0) goto Lac
            yr9 r0 = r5.getReturnType()
            r0.getClass()
            boolean r0 = defpackage.fbi.e(r0)
            if (r0 != 0) goto Lac
            boolean r0 = r5 instanceof defpackage.krd
            if (r0 != 0) goto Lac
        La6:
            java.lang.String r5 = "V"
            r6.append(r5)
            goto Lbe
        Lac:
            yr9 r5 = r5.getReturnType()
            r5.getClass()
            pai r0 = defpackage.pai.k
            java.lang.Object r5 = defpackage.oyk.f(r5, r0, r2)
            jl9 r5 = (defpackage.jl9) r5
            r6.append(r5)
        Lbe:
            java.lang.String r5 = r6.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csk.e(h08, int):java.lang.String");
    }

    public static final String f(c92 c92Var) {
        c92Var.getClass();
        if (!m06.o(c92Var)) {
            bo5 bo5VarH = c92Var.h();
            qqb qqbVar = bo5VarH instanceof qqb ? (qqb) bo5VarH : null;
            if (qqbVar != null && !qqbVar.getName().F) {
                c92 c92VarA = c92Var.a();
                c7g c7gVar = c92VarA instanceof c7g ? (c7g) c92VarA : null;
                if (c7gVar != null) {
                    return bsk.g(qqbVar, e(c7gVar, 3));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean g(h08 h08Var) {
        h08 h08VarA;
        h08Var.getClass();
        if (!x44.r(((co5) h08Var).getName().b(), "remove") || h08Var.I().size() != 1 || (o06.i(h08Var).h() instanceof vx9) || or9.y(h08Var)) {
            return false;
        }
        List listI = h08Var.a().I();
        listI.getClass();
        yr9 type = ((eri) w44.e1(listI)).getType();
        type.getClass();
        pai paiVar = pai.k;
        n08 n08Var = n08.F;
        jl9 jl9Var = (jl9) oyk.f(type, paiVar, n08Var);
        il9 il9Var = jl9Var instanceof il9 ? (il9) jl9Var : null;
        if ((il9Var != null ? il9Var.i : null) != nk9.INT || (h08VarA = zz1.a(h08Var)) == null) {
            return false;
        }
        List listI2 = h08VarA.a().I();
        listI2.getClass();
        yr9 type2 = ((eri) w44.e1(listI2)).getType();
        type2.getClass();
        jl9 jl9Var2 = (jl9) oyk.f(type2, paiVar, n08Var);
        bo5 bo5VarH = h08VarA.h();
        bo5VarH.getClass();
        xw7 xw7VarG = m06.g(bo5VarH);
        xw7VarG.getClass();
        return xw7VarG.equals(okg.J.i()) && (jl9Var2 instanceof hl9) && ((hl9) jl9Var2).i.equals("java/lang/Object");
    }

    public static final String h(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final jl9 i(yr9 yr9Var) {
        return (jl9) oyk.f(yr9Var, pai.k, n08.F);
    }

    public static final ks j(AggregateRecordsGroupedByPeriodResponse aggregateRecordsGroupedByPeriodResponse, Set set, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        AggregateRecordsGroupedByPeriodResponse aggregateRecordsGroupedByPeriodResponse2;
        bz7 pacVar;
        set.getClass();
        if (SdkExtensions.getExtensionVersion(34) >= 10) {
            aggregateRecordsGroupedByPeriodResponse2 = aggregateRecordsGroupedByPeriodResponse;
            pacVar = new pac(1, aggregateRecordsGroupedByPeriodResponse2, tqe.C(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0, 29);
        } else {
            aggregateRecordsGroupedByPeriodResponse2 = aggregateRecordsGroupedByPeriodResponse;
            pacVar = p9d.V;
        }
        AggregateRecordsGroupedByPeriodResponse aggregateRecordsGroupedByPeriodResponse3 = aggregateRecordsGroupedByPeriodResponse2;
        return new ks(c(set, new pac(1, aggregateRecordsGroupedByPeriodResponse3, tqe.C(), "get", "get(Landroid/health/connect/datatypes/AggregationType;)Ljava/lang/Object;", 0, 27), pacVar), localDateTime, localDateTime2, true);
    }

    public static lsj k(k0 k0Var) {
        if (k0Var == null) {
            return lsj.v;
        }
        int i = hnk.a[sq6.F(k0Var.q())];
        if (i == 1) {
            return k0Var.x() ? new qsj(k0Var.s()) : lsj.C;
        }
        if (i == 2) {
            return k0Var.w() ? new yqj(Double.valueOf(k0Var.p())) : new yqj(null);
        }
        if (i == 3) {
            return k0Var.v() ? new pqj(Boolean.valueOf(k0Var.u())) : new pqj(null);
        }
        if (i != 4) {
            if (i != 5) {
                sz6.j("Invalid entity: ".concat(String.valueOf(k0Var)));
                return null;
            }
            sz6.p("Unknown type found. Cannot convert entity");
            return null;
        }
        List listT = k0Var.t();
        ArrayList arrayList = new ArrayList();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(k((k0) it.next()));
        }
        return new tsj(k0Var.r(), arrayList);
    }

    public static lsj l(Object obj) {
        if (obj == null) {
            return lsj.w;
        }
        if (obj instanceof String) {
            return new qsj((String) obj);
        }
        if (obj instanceof Double) {
            return new yqj((Double) obj);
        }
        if (obj instanceof Long) {
            return new yqj(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new yqj(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new pqj((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                sz6.p("Invalid value type");
                return null;
            }
            jqj jqjVar = new jqj();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jqjVar.q(l(it.next()));
            }
            return jqjVar;
        }
        isj isjVar = new isj();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            lsj lsjVarL = l(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                isjVar.o((String) string, lsjVarL);
            }
        }
        return isjVar;
    }
}
