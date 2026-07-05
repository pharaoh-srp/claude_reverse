package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class fo1 extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ List F;
    public final /* synthetic */ z9e G;
    public final /* synthetic */ z9e H;
    public final /* synthetic */ go1 I;
    public final /* synthetic */ z9e J;
    public final /* synthetic */ String K;
    public final /* synthetic */ List L;
    public final /* synthetic */ List M;
    public final /* synthetic */ im2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo1(List list, z9e z9eVar, z9e z9eVar2, go1 go1Var, z9e z9eVar3, String str, List list2, List list3, im2 im2Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = list;
        this.G = z9eVar;
        this.H = z9eVar2;
        this.I = go1Var;
        this.J = z9eVar3;
        this.K = str;
        this.L = list2;
        this.M = list3;
        this.N = im2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        fo1 fo1Var = new fo1(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, tp4Var);
        fo1Var.E = obj;
        return fo1Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        fo1 fo1Var = (fo1) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        fo1Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.E;
        sf5.h0(obj);
        List list = this.F;
        go1 go1Var = this.I;
        LinkedHashMap linkedHashMap = go1Var.q;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            mtc mtcVar = (mtc) obj2;
            if (mtcVar instanceof ParsedContentBlock$Thinking) {
                this.G.E = !((ParsedContentBlock$Thinking) mtcVar).getIsComplete();
            } else if (mtcVar instanceof htc) {
                htc htcVar = (htc) mtcVar;
                this.H.E = !htcVar.e;
                go1.a(go1Var, go1Var.o, htcVar.a, new b1j(htcVar));
            } else {
                boolean z = mtcVar instanceof qxh;
                String str = this.K;
                if (z) {
                    this.J.E = !((qf8) mtcVar).getIsComplete();
                    go1.a(go1Var, go1Var.p, ((vf8) mtcVar).getId(), new a1j((qxh) mtcVar, str));
                } else {
                    boolean z2 = mtcVar instanceof btc;
                    List list2 = this.L;
                    List list3 = this.M;
                    if (z2) {
                        btc btcVar = (btc) mtcVar;
                        list2.addAll(btcVar.a);
                        list3.addAll(btcVar.b);
                    } else if (mtcVar instanceof itc) {
                        kdg kdgVar = go1Var.g;
                        Integer num = (Integer) linkedHashMap.get(new Integer(i));
                        List listP1 = lm6.E;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            String str2 = ((itc) mtcVar).a;
                            im2 im2Var = this.N;
                            boolean z3 = im2Var.e;
                            List listP12 = z3 ? w44.p1(list2) : listP1;
                            if (im2Var.e) {
                                listP1 = w44.p1(list3);
                            }
                            kdgVar.set(iIntValue, new y0j(str2, str, z3, listP12, listP1));
                        } else {
                            itc itcVar = (itc) mtcVar;
                            if (!bsg.I0(itcVar.a)) {
                                go1Var.i.setValue(null);
                                kdgVar.add(new y0j(itcVar.a, str, false, listP1, listP1));
                                int size = kdgVar.size() - 1;
                                linkedHashMap.put(new Integer(i), new Integer(size));
                                go1Var.h.put(new Integer(size), new Integer(0));
                                if (!go1Var.r) {
                                    go1Var.r = true;
                                    go1Var.f.A.d.r(new io1(size));
                                }
                            }
                        }
                    } else {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            String strE = iuj.E(l45Var);
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj3)).getClass();
                                arrayList.add(obj3);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String simpleName = mtcVar.getClass().getSimpleName();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, simpleName);
                                }
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        return iei.a;
    }
}
