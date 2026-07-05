package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wf5 extends xzg implements pz7 {
    public List E;
    public Iterator F;
    public Object G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ List K;
    public final /* synthetic */ ArrayList L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf5(List list, ArrayList arrayList, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = list;
        this.L = arrayList;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        wf5 wf5Var = new wf5(this.K, this.L, tp4Var);
        wf5Var.J = obj;
        return wf5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((wf5) create(obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int i;
        List list;
        int i2;
        Object obj2 = this.J;
        int i3 = this.I;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = this.H;
                Object obj3 = this.G;
                Iterator it2 = this.F;
                List list2 = this.E;
                sf5.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    list2.add(new vf5());
                    this.J = null;
                    this.E = list2;
                    this.F = it2;
                    this.G = null;
                    this.H = i4;
                    this.I = 2;
                    throw null;
                }
                i2 = i4;
                obj = obj3;
                it = it2;
                list = list2;
            } else {
                if (i3 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.H;
                it = this.F;
                list = this.E;
                sf5.h0(obj);
            }
            int i5 = i2;
            obj2 = obj;
            i = i5;
        } else {
            sf5.h0(obj);
            it = this.K.iterator();
            i = 0;
            list = this.L;
        }
        if (!it.hasNext()) {
            return obj2;
        }
        if (it.next() != null) {
            mr9.o();
            return null;
        }
        this.J = null;
        this.E = list;
        this.F = it;
        this.G = obj2;
        this.H = i;
        this.I = 1;
        throw null;
    }
}
