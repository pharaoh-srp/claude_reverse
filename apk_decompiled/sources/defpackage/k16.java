package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k16 {
    public static final /* synthetic */ wn9[] j;
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final afa d;
    public final afa e;
    public final efa f;
    public final dfa g;
    public final dfa h;
    public final /* synthetic */ m16 i;

    static {
        kce kceVar = jce.a;
        j = new wn9[]{kceVar.g(new mrd(kceVar.b(k16.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kceVar.g(new mrd(kceVar.b(k16.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public k16(m16 m16Var, List list, List list2, List list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.i = m16Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            sxb sxbVarW = iv1.w((txb) m16Var.b.e, ((usd) ((b3) obj)).J);
            Object arrayList = linkedHashMap.get(sxbVarW);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(sxbVarW, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        m16 m16Var2 = this.i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            sxb sxbVarW2 = iv1.w((txb) m16Var2.b.e, ((ctd) ((b3) obj2)).J);
            Object arrayList2 = linkedHashMap2.get(sxbVarW2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(sxbVarW2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.b = a(linkedHashMap2);
        ((r06) this.i.b.d).c.getClass();
        m16 m16Var3 = this.i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            sxb sxbVarW3 = iv1.w((txb) m16Var3.b.e, ((ptd) ((b3) obj3)).I);
            Object arrayList3 = linkedHashMap3.get(sxbVarW3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(sxbVarW3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.c = a(linkedHashMap3);
        int i = 0;
        this.d = ((r06) this.i.b.d).a.b(new j16(this, i));
        int i2 = 1;
        this.e = ((r06) this.i.b.d).a.b(new j16(this, i2));
        this.f = ((r06) this.i.b.d).a.c(new j16(this, 2));
        m16 m16Var4 = this.i;
        gfa gfaVar = ((r06) m16Var4.b.d).a;
        i16 i16Var = new i16(this, m16Var4, i);
        gfaVar.getClass();
        this.g = new dfa(gfaVar, i16Var);
        m16 m16Var5 = this.i;
        gfa gfaVar2 = ((r06) m16Var5.b.d).a;
        i16 i16Var2 = new i16(this, m16Var5, i2);
        gfaVar2.getClass();
        this.h = new dfa(gfaVar2, i16Var2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tta.d0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<b3> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
            for (b3 b3Var : iterable) {
                int iC = b3Var.c();
                int iF = v34.f(iC) + iC;
                if (iF > 4096) {
                    iF = 4096;
                }
                v34 v34VarJ = v34.j(byteArrayOutputStream, iF);
                v34VarJ.v(iC);
                b3Var.f(v34VarJ);
                v34VarJ.k();
                arrayList.add(iei.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
