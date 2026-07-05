package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes3.dex */
public final class cn9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ dn9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn9(dn9 dn9Var, int i) {
        super(0);
        this.F = i;
        this.G = dn9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.zy7
    public final Object a() throws InvalidProtocolBufferException {
        ?? W;
        int i = this.F;
        List listAsList = null;
        dn9 dn9Var = this.G;
        switch (i) {
            case 0:
                ece eceVar = dn9Var.c;
                wn9 wn9Var = dn9.g[0];
                bce bceVar = (bce) eceVar.a();
                if (bceVar == null) {
                    return null;
                }
                z81 z81Var = bceVar.b;
                String[] strArr = (String[]) z81Var.f;
                String[] strArr2 = (String[]) z81Var.h;
                if (strArr == null || strArr2 == null) {
                    return null;
                }
                cpc cpcVarH = fl9.h(strArr, strArr2);
                return new r7i((kk9) cpcVarH.E, (ysd) cpcVarH.F, (jk9) z81Var.e);
            default:
                ece eceVar2 = dn9Var.c;
                wn9 wn9Var2 = dn9.g[0];
                bce bceVar2 = (bce) eceVar2.a();
                if (bceVar2 == null) {
                    return eab.b;
                }
                ece eceVar3 = dn9Var.a;
                wn9 wn9Var3 = gm9.b[0];
                Object objA = eceVar3.a();
                objA.getClass();
                w3c w3cVar = ((hze) objA).b;
                f16 f16Var = (f16) w3cVar.F;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w3cVar.H;
                Class cls = bceVar2.a;
                gh3 gh3VarA = yae.a(cls);
                Object obj = concurrentHashMap.get(gh3VarA);
                if (obj == null) {
                    ww7 ww7VarG = yae.a(cls).g();
                    ww7VarG.getClass();
                    z81 z81Var2 = bceVar2.b;
                    pr9 pr9Var = (pr9) z81Var2.d;
                    pr9 pr9Var2 = pr9.MULTIFILE_CLASS;
                    if (pr9Var == pr9Var2) {
                        String[] strArr3 = (String[]) z81Var2.f;
                        if (pr9Var != pr9Var2) {
                            strArr3 = null;
                        }
                        if (strArr3 != null) {
                            listAsList = Arrays.asList(strArr3);
                            listAsList.getClass();
                        }
                        if (listAsList == null) {
                            listAsList = lm6.E;
                        }
                        W = new ArrayList();
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            gh3 gh3VarJ = gh3.j(new ww7(zj9.d((String) it.next()).a.replace('/', '.')));
                            gmf gmfVar = (gmf) w3cVar.G;
                            f16Var.c().c.getClass();
                            bce bceVarY = mwa.y(gmfVar, gh3VarJ, jk9.g);
                            if (bceVarY != null) {
                                W.add(bceVarY);
                            }
                        }
                    } else {
                        W = x44.W(bceVar2);
                    }
                    pm6 pm6Var = new pm6(f16Var.c().b, ww7VarG);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) W).iterator();
                    while (it2.hasNext()) {
                        n16 n16VarA = f16Var.a(pm6Var, (bce) it2.next());
                        if (n16VarA != null) {
                            arrayList.add(n16VarA);
                        }
                    }
                    fab fabVarR = sf5.r("package " + ww7VarG + " (" + bceVar2 + ')', w44.p1(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(gh3VarA, fabVarR);
                    obj = objPutIfAbsent == null ? fabVarR : objPutIfAbsent;
                }
                obj.getClass();
                return (fab) obj;
        }
    }
}
