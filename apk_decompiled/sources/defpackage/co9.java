package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public final class co9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ do9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co9(do9 do9Var, int i) {
        super(0);
        this.F = i;
        this.G = do9Var;
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        Class<?> enclosingClass;
        int i = this.F;
        do9 do9Var = this.G;
        switch (i) {
            case 0:
                im9 im9Var = do9Var.J;
                String str = do9Var.K;
                String str2 = do9Var.L;
                im9Var.getClass();
                str.getClass();
                str2.getClass();
                ova ovaVarE = im9.E.e(str2);
                if (ovaVarE != null) {
                    String str3 = (String) ((mva) ulk.g(ovaVarE).v().a()).get(1);
                    hrd hrdVarO = im9Var.o(Integer.parseInt(str3));
                    if (hrdVarO != null) {
                        return hrdVarO;
                    }
                    StringBuilder sbX = sq6.x("Local property #", str3, " not found in ");
                    sbX.append(im9Var.a());
                    throw new KotlinReflectionInternalError(sbX.toString());
                }
                Collection collectionR = im9Var.r(sxb.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionR) {
                    if (x44.r(jze.b((hrd) obj).e(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbR = kgh.r("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbR.append(im9Var);
                    throw new KotlinReflectionInternalError(sbR.toString());
                }
                if (arrayList.size() == 1) {
                    return (hrd) w44.e1(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    ow5 visibility = ((hrd) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new g67(12));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = (List) w44.T0(collectionValues);
                if (list.size() == 1) {
                    return (hrd) w44.L0(list);
                }
                String strS0 = w44.S0(im9Var.r(sxb.e(str)), "\n", null, null, f06.W, 30);
                StringBuilder sbR2 = kgh.r("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbR2.append(im9Var);
                sbR2.append(':');
                sbR2.append(strS0.length() == 0 ? " no members found" : "\n".concat(strS0));
                throw new KotlinReflectionInternalError(sbR2.toString());
            default:
                gh3 gh3Var = jze.a;
                hrd hrdVarT = do9Var.t();
                im9 im9Var2 = do9Var.J;
                ne5 ne5VarB = jze.b(hrdVarT);
                if (!(ne5VarB instanceof qk9)) {
                    if (ne5VarB instanceof ok9) {
                        return ((ok9) ne5VarB).l();
                    }
                    if ((ne5VarB instanceof pk9) || (ne5VarB instanceof rk9)) {
                        return null;
                    }
                    mr9.b();
                    return null;
                }
                qk9 qk9Var = (qk9) ne5VarB;
                hrd hrdVarL = qk9Var.l();
                oc7 oc7Var = fl9.a;
                hk9 hk9VarB = fl9.b(qk9Var.n(), qk9Var.m(), qk9Var.p(), true);
                if (hk9VarB == null) {
                    return null;
                }
                if (fe5.h(hrdVarL) || fl9.d(qk9Var.n())) {
                    enclosingClass = im9Var2.a().getEnclosingClass();
                } else {
                    bo5 bo5VarH = hrdVarL.h();
                    enclosingClass = bo5VarH instanceof qqb ? vpi.j((qqb) bo5VarH) : im9Var2.a();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(hk9VarB.j());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
        }
    }
}
