package defpackage;

import com.anthropic.claude.models.organization.configtypes.RegionSupport;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ajk {
    public static final ta4 a = new ta4(478354177, false, new jb4(8));
    public static final ta4 b = new ta4(1044519082, false, new jb4(9));
    public static final ta4 c = new ta4(-908167699, false, new jb4(10));

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(boolean z, boolean z2, boolean z3, boolean z4, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6, zy7 zy7Var7, oy2 oy2Var, ld4 ld4Var, int i, int i2) {
        int i3;
        int i4;
        oy2 oy2Var2;
        int i5;
        boolean z5;
        hj6 hj6Var = hj6.H;
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        zy7Var7.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1035165303);
        if ((i & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.g(z3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= e18Var.h(zy7Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= e18Var.h(zy7Var4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= e18Var.h(zy7Var5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= e18Var.h(zy7Var6) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.h(zy7Var7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(oy2.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                oy2Var2 = (oy2) objN;
                i5 = i4 & (-113);
            } else {
                e18Var.T();
                i5 = i4 & (-113);
                oy2Var2 = oy2Var;
            }
            e18Var.q();
            if (z) {
                z5 = false;
                e18Var.a0(745284907);
                e18Var.p(false);
            } else {
                e18Var.a0(744821705);
                if (zy7Var == null) {
                    e18Var.a0(744831407);
                } else {
                    e18Var.a0(744831408);
                    hj6Var.l(zy7Var, e18Var, 48);
                }
                e18Var.p(false);
                int i6 = i3 >> 15;
                hj6Var.k(zy7Var2, e18Var, (i6 & 14) | 48);
                hj6Var.p(((i3 >> 3) & 14) | 384 | (i6 & 112), e18Var, zy7Var3, z2);
                if (((Boolean) oy2Var2.c.getValue()).booleanValue()) {
                    e18Var.a0(745052159);
                    hj6Var.d(((i3 >> 9) & 14) | 384 | ((i3 >> 24) & 112), e18Var, zy7Var6, z4);
                    if (z4) {
                        e18Var.a0(745173896);
                        hj6Var.j(zy7Var7, e18Var, (i5 & 14) | 48);
                        z5 = false;
                        e18Var.p(false);
                    } else {
                        z5 = false;
                        e18Var.a0(745269035);
                        e18Var.p(false);
                    }
                    e18Var.p(z5);
                } else {
                    z5 = false;
                    e18Var.a0(745278955);
                    e18Var.p(false);
                }
                e18Var.p(z5);
            }
            if (z || !z3) {
                e18Var.a0(745384107);
                e18Var.p(z5);
            } else {
                e18Var.a0(745333174);
                hj6Var.c(zy7Var5, e18Var, ((i3 >> 24) & 14) | 48);
                e18Var.p(z5);
            }
            hj6Var.f(zy7Var4, e18Var, ((i3 >> 21) & 14) | 48);
        } else {
            e18Var.T();
            oy2Var2 = oy2Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ry2(z, z2, z3, z4, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, zy7Var7, oy2Var2, i, i2);
        }
    }

    public static final ntd b(ntd ntdVar, cbi cbiVar) {
        ntdVar.getClass();
        int i = ntdVar.G;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 1024) {
            return ntdVar.S;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 2048) {
            return cbiVar.b(ntdVar.T);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List c(esd esdVar, cbi cbiVar) {
        esdVar.getClass();
        List list = esdVar.Q;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = esdVar.R;
            list2.getClass();
            List<Integer> list3 = list2;
            arrayList = new ArrayList(x44.y(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(cbiVar.b(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List d(usd usdVar, cbi cbiVar) {
        usdVar.getClass();
        List list = usdVar.P;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = usdVar.Q;
            list2.getClass();
            List<Integer> list3 = list2;
            arrayList = new ArrayList(x44.y(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(cbiVar.b(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List e(ctd ctdVar, cbi cbiVar) {
        ctdVar.getClass();
        List list = ctdVar.P;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = ctdVar.Q;
            list2.getClass();
            List<Integer> list3 = list2;
            arrayList = new ArrayList(x44.y(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(cbiVar.b(num.intValue()));
            }
        }
        return arrayList;
    }

    public static ou6 f(String str) {
        return new ou6(str);
    }

    public static final ntd g(ptd ptdVar, cbi cbiVar) {
        int i = ptdVar.G;
        if ((i & 16) == 16) {
            ntd ntdVar = ptdVar.M;
            ntdVar.getClass();
            return ntdVar;
        }
        if ((i & 32) == 32) {
            return cbiVar.b(ptdVar.N);
        }
        sz6.j("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final ntd h(ntd ntdVar, cbi cbiVar) {
        ntdVar.getClass();
        int i = ntdVar.G;
        if ((i & 4) == 4) {
            return ntdVar.K;
        }
        if ((i & 8) == 8) {
            return cbiVar.b(ntdVar.L);
        }
        return null;
    }

    public static ila i(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new ila(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ContainerView", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ContainerView", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ContainerView", e3);
            return null;
        }
    }

    public static final boolean j(usd usdVar) {
        usdVar.getClass();
        int i = usdVar.G;
        return (i & 32) == 32 || (i & 64) == 64;
    }

    public static final boolean k(ctd ctdVar) {
        ctdVar.getClass();
        int i = ctdVar.G;
        return (i & 32) == 32 || (i & 64) == 64;
    }

    public static final ntd l(ntd ntdVar, cbi cbiVar) {
        ntdVar.getClass();
        int i = ntdVar.G;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 256) {
            return ntdVar.Q;
        }
        if ((i & 512) == 512) {
            return cbiVar.b(ntdVar.R);
        }
        return null;
    }

    public static Set m(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            RegionSupport regionSupport = (RegionSupport) entry.getValue();
            if (regionSupport.getClaudeai_supported() && regionSupport.getPhone_verification_supported()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(x44.y(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList.add(upperCase);
        }
        Set setT1 = w44.t1(arrayList);
        return setT1.isEmpty() ? null : setT1;
    }

    public static final ntd n(usd usdVar, cbi cbiVar) {
        usdVar.getClass();
        cbiVar.getClass();
        int i = usdVar.G;
        if ((i & 32) == 32) {
            return usdVar.N;
        }
        if ((i & 64) == 64) {
            return cbiVar.b(usdVar.O);
        }
        return null;
    }

    public static final ntd o(ctd ctdVar, cbi cbiVar) {
        ctdVar.getClass();
        int i = ctdVar.G;
        if ((i & 32) == 32) {
            return ctdVar.N;
        }
        if ((i & 64) == 64) {
            return cbiVar.b(ctdVar.O);
        }
        return null;
    }

    public static final ntd p(usd usdVar, cbi cbiVar) {
        usdVar.getClass();
        cbiVar.getClass();
        int i = usdVar.G;
        if ((i & 8) == 8) {
            ntd ntdVar = usdVar.K;
            ntdVar.getClass();
            return ntdVar;
        }
        if ((i & 16) == 16) {
            return cbiVar.b(usdVar.L);
        }
        sz6.j("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final ntd q(ctd ctdVar, cbi cbiVar) {
        ctdVar.getClass();
        cbiVar.getClass();
        int i = ctdVar.G;
        if ((i & 8) == 8) {
            ntd ntdVar = ctdVar.K;
            ntdVar.getClass();
            return ntdVar;
        }
        if ((i & 16) == 16) {
            return cbiVar.b(ctdVar.L);
        }
        sz6.j("No returnType in ProtoBuf.Property");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final List r(esd esdVar, cbi cbiVar) {
        esdVar.getClass();
        List list = esdVar.L;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = esdVar.M;
            list2.getClass();
            List<Integer> list3 = list2;
            arrayList = new ArrayList(x44.y(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(cbiVar.b(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List s(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(w44.L0(arrayList)) : lm6.E;
    }

    public static final Map t(Map map) {
        int size = map.size();
        if (size == 0) {
            return nm6.E;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) w44.K0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final ntd v(ltd ltdVar, cbi cbiVar) {
        int i = ltdVar.F;
        if ((i & 2) == 2) {
            return ltdVar.H;
        }
        if ((i & 4) == 4) {
            return cbiVar.b(ltdVar.I);
        }
        return null;
    }

    public static final ntd w(vtd vtdVar, cbi cbiVar) {
        cbiVar.getClass();
        int i = vtdVar.G;
        if ((i & 4) == 4) {
            ntd ntdVar = vtdVar.J;
            ntdVar.getClass();
            return ntdVar;
        }
        if ((i & 8) == 8) {
            return cbiVar.b(vtdVar.K);
        }
        sz6.j("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final ntd x(ptd ptdVar, cbi cbiVar) {
        int i = ptdVar.G;
        if ((i & 4) == 4) {
            ntd ntdVar = ptdVar.K;
            ntdVar.getClass();
            return ntdVar;
        }
        if ((i & 8) == 8) {
            return cbiVar.b(ptdVar.L);
        }
        sz6.j("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final ntd y(vtd vtdVar, cbi cbiVar) {
        int i = vtdVar.G;
        if ((i & 16) == 16) {
            return vtdVar.L;
        }
        if ((i & 32) == 32) {
            return cbiVar.b(vtdVar.M);
        }
        return null;
    }

    public abstract qh9 u();
}
