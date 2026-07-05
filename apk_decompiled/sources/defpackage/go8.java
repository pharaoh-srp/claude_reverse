package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class go8 extends xzg implements sz7 {
    public /* synthetic */ q0a E;
    public /* synthetic */ q0a F;
    public final /* synthetic */ List G;
    public final /* synthetic */ pe6 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go8(List list, pe6 pe6Var, tp4 tp4Var) {
        super(4, tp4Var);
        this.G = list;
        this.H = pe6Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        go8 go8Var = new go8(this.G, this.H, (tp4) obj4);
        go8Var.E = (q0a) obj2;
        go8Var.F = (q0a) obj3;
        iei ieiVar = iei.a;
        go8Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i;
        q0a q0aVar = this.E;
        q0a q0aVar2 = this.F;
        sf5.h0(obj);
        List list = this.G;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rf6) it.next()).a);
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            if (((pf6) it2.next()) == q0aVar.l) {
                break;
            }
            i3++;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (((pf6) it3.next()) == q0aVar2.l) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 >= 0 && i >= 0) {
            pe6 pe6Var = this.H;
            pe6Var.g.setValue(pe6Var.b().d(arrayList, i3, i));
        }
        return iei.a;
    }
}
