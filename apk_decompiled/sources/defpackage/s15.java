package defpackage;

import com.anthropic.claude.conway.protocol.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s15 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ b0 G;
    public final /* synthetic */ dae H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s15(b0 b0Var, dae daeVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = b0Var;
        this.H = daeVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new s15(this.G, this.H, tp4Var, 0);
            default:
                return new s15(this.G, this.H, tp4Var, 1);
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
        return ((s15) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        dae daeVar = this.H;
        b0 b0Var = this.G;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String str = (String) daeVar.E;
                    this.F = 1;
                    return b0Var.o(str, this) == m45Var ? m45Var : ieiVar;
                }
                if (i2 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    s15 s15Var = new s15(b0Var, daeVar, tp4Var, 0);
                    this.F = 1;
                    obj = iuj.Q(5000L, s15Var, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                if (((iei) obj) != null) {
                    return ieiVar;
                }
                zfa.a.getClass();
                if (!yfa.b()) {
                    return ieiVar;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (arrayList.isEmpty()) {
                    return ieiVar;
                }
                zfa.a.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "Conway", "wake: sendBackgroundHint timed out");
                }
                return ieiVar;
        }
    }
}
