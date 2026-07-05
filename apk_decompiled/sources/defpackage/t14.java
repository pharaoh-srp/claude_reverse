package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t14 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ i H;
    public final /* synthetic */ String I;
    public final /* synthetic */ lwc J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t14(i iVar, String str, lwc lwcVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = iVar;
        this.I = str;
        this.J = lwcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                t14 t14Var = new t14(this.H, this.I, this.J, tp4Var, 0);
                t14Var.G = obj;
                return t14Var;
            default:
                t14 t14Var2 = new t14(this.H, this.I, this.J, tp4Var, 1);
                t14Var2.G = obj;
                return t14Var2;
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
        return ((t14) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objY;
        Map map;
        Object objY2;
        Map map2;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.I;
        sfa sfaVar = sfa.ERROR;
        Map map3 = nm6.E;
        lwc lwcVar = this.J;
        m45 m45Var = m45.E;
        i iVar = this.H;
        switch (i) {
            case 0:
                Set set = iVar.y2;
                l45 l45Var = (l45) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    jrf jrfVar = iVar.d;
                    if (lwcVar != null && (map = lwcVar.g) != null) {
                        map3 = map;
                    }
                    this.G = l45Var;
                    this.F = 1;
                    objY = jrfVar.y(this.I, true, map3, true, this);
                    if (objY == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objY = obj;
                }
                ylf ylfVar = (ylf) objY;
                if (ylfVar instanceof wlf) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE = iuj.E(l45Var);
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            String strM = ebh.m(zfa.a, "Failed to always-allow tool call: ", str);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfaVar, strE, strM);
                            }
                        }
                    }
                    n2g n2gVar = iVar.g1;
                    String message = ((wlf) ylfVar).a.getMessage();
                    if (message == null) {
                        message = iVar.o.getString(R.string.ccr_error_failed_to_approve_tool_call);
                        message.getClass();
                    }
                    n2gVar.f(message);
                    return ieiVar;
                }
                if (!w44.G0(set, lwcVar != null ? lwcVar.c : null)) {
                    return ieiVar;
                }
                kdg kdgVar = iVar.S1;
                ArrayList arrayList2 = new ArrayList();
                ListIterator listIterator = kdgVar.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            iVar.W(((lwc) it2.next()).b);
                        }
                        return ieiVar;
                    }
                    Object next = c8aVar.next();
                    if (set.contains(((lwc) next).c)) {
                        arrayList2.add(next);
                    }
                }
                break;
            default:
                l45 l45Var2 = (l45) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    jrf jrfVar2 = iVar.d;
                    if (lwcVar != null && (map2 = lwcVar.g) != null) {
                        map3 = map2;
                    }
                    this.G = l45Var2;
                    this.F = 1;
                    Set set2 = jrf.B;
                    objY2 = jrfVar2.y(this.I, true, map3, false, this);
                    if (objY2 == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objY2 = obj;
                }
                ylf ylfVar2 = (ylf) objY2;
                if (!(ylfVar2 instanceof wlf)) {
                    return ieiVar;
                }
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(l45Var2);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList3.add(obj3);
                    }
                    if (!arrayList3.isEmpty()) {
                        String strM2 = ebh.m(zfa.a, "Failed to approve tool call: ", str);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            ((n30) ((zfa) it3.next())).b(sfaVar, strE2, strM2);
                        }
                    }
                }
                n2g n2gVar2 = iVar.g1;
                String message2 = ((wlf) ylfVar2).a.getMessage();
                if (message2 == null) {
                    message2 = iVar.o.getString(R.string.ccr_error_failed_to_approve_tool_call);
                    message2.getClass();
                }
                n2gVar2.f(message2);
                return ieiVar;
        }
    }
}
