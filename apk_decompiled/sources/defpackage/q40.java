package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q40 implements o5b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ q40(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        ArrayList arrayList;
        List list2;
        Object obj;
        List list3;
        cpc cpcVar;
        int i = this.a;
        nm6 nm6Var = nm6.E;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((r9d) obj2).setParentLayoutDirection((fu9) obj3);
                return q5bVar.U(0, 0, nm6Var, ex.L);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                List list4 = list;
                int size = list4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list.get(i2);
                    if (!(((h5b) obj4).z() instanceof lkh)) {
                        arrayList2.add(obj4);
                    }
                }
                List list5 = (List) ((zy7) obj3).a();
                if (list5 != null) {
                    ArrayList arrayList3 = new ArrayList(list5.size());
                    int size2 = list5.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        l9e l9eVar = (l9e) list5.get(i3);
                        if (l9eVar != null) {
                            float f = l9eVar.b;
                            float f2 = l9eVar.a;
                            h5b h5bVar = (h5b) arrayList2.get(i3);
                            obj = obj2;
                            int iFloor = (int) Math.floor(l9eVar.c - f2);
                            float f3 = l9eVar.d - f;
                            list3 = list4;
                            list2 = list5;
                            cpcVar = new cpc(h5bVar.u(sl4.b(0, iFloor, 0, (int) Math.floor(f3), 5)), new y69((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            list2 = list5;
                            obj = obj2;
                            list3 = list4;
                            cpcVar = null;
                        }
                        if (cpcVar != null) {
                            arrayList3.add(cpcVar);
                        }
                        i3++;
                        list4 = list3;
                        obj2 = obj;
                        list5 = list2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                Object obj5 = obj2;
                List list6 = list4;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list6.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj6 = list.get(i4);
                    if (((h5b) obj6).z() instanceof lkh) {
                        arrayList4.add(obj6);
                    }
                }
                return q5bVar.U(rl4.h(j), rl4.g(j), nm6Var, new nif(arrayList, 15, mpk.i(arrayList4, (zy7) obj5)));
        }
    }
}
