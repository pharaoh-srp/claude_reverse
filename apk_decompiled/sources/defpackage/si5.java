package defpackage;

import com.anthropic.claude.api.chat.ChatMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class si5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bj5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si5(List list, String str, bj5 bj5Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = list;
        this.G = str;
        this.H = bj5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new si5(this.F, this.G, this.H, tp4Var, 0);
            case 1:
                return new si5(this.F, this.G, this.H, tp4Var, 1);
            default:
                return new si5(this.F, this.G, this.H, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((si5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        bj5 bj5Var = this.H;
        String str = this.G;
        List list = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                List list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(yuj.j((ChatMessage) it.next(), str, bj5Var.a));
                }
                return arrayList;
            case 1:
                sf5.h0(obj);
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(yuj.j((ChatMessage) it2.next(), str, bj5Var.a));
                }
                return arrayList2;
            default:
                sf5.h0(obj);
                List list4 = list;
                ArrayList arrayList3 = new ArrayList(x44.y(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(yuj.j((ChatMessage) it3.next(), str, bj5Var.a));
                }
                return arrayList3;
        }
    }
}
