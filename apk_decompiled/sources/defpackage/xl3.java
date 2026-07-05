package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xl3 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ x0a I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ nwb L;
    public final /* synthetic */ nwb M;
    public final /* synthetic */ nwb N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl3(boolean z, int i, int i2, x0a x0aVar, int i3, int i4, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z;
        this.G = i;
        this.H = i2;
        this.I = x0aVar;
        this.J = i3;
        this.K = i4;
        this.L = nwbVar;
        this.M = nwbVar2;
        this.N = nwbVar3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new xl3(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((xl3) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.L;
        x0a x0aVar = this.I;
        if (i == 0) {
            sf5.h0(obj);
            if (this.F) {
                if (this.G < 0 || this.H < 0) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.WARN, "ClaudeRespondingScrollAndSpacerEffect", "Assistant or footer index is negative, not scrolling");
                            }
                        }
                    }
                } else {
                    ((bz7) ((jm9) nwbVar.getValue())).invoke(new Integer((int) (x0aVar.h().g() & 4294967295L)));
                    int iIntValue = ((Number) this.M.getValue()).intValue();
                    int i2 = -this.J;
                    this.E = 1;
                    Object objF = x0aVar.f(iIntValue, i2, this);
                    m45 m45Var = m45.E;
                    if (objF == m45Var) {
                        return m45Var;
                    }
                }
            }
            return ieiVar;
        }
        if (i != 1) {
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        q0a q0aVarG = ykk.g(x0aVar, ((Number) this.N.getValue()).intValue());
        int i3 = q0aVarG != null ? q0aVarG.q : 0;
        p0a p0aVarH = x0aVar.h();
        int iG = ((((int) (4294967295L & p0aVarH.g())) - (-p0aVarH.l)) - p0aVarH.q) - (i3 + this.K);
        ((bz7) ((jm9) nwbVar.getValue())).invoke(new Integer(iG >= 0 ? iG : 0));
        return ieiVar;
    }
}
