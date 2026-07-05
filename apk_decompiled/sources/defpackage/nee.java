package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nee implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ y5f F;
    public final /* synthetic */ y5f G;

    public /* synthetic */ nee(y5f y5fVar, y5f y5fVar2, int i) {
        this.E = i;
        this.F = y5fVar;
        this.G = y5fVar2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        y5f y5fVar = this.G;
        y5f y5fVar2 = this.F;
        y4f y4fVar = (y4f) obj;
        switch (i) {
            case 0:
                int i2 = 1;
                y5f y5fVarK = dgj.K(new oee(y5fVar2, y5fVar, i2), new nee(y5fVar2, y5fVar, i2));
                d8a d8aVarE = x44.E();
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (it.hasNext()) {
                    Object objInvoke = y5fVarK.a.invoke(y4fVar, (Map.Entry) it.next());
                    objInvoke.getClass();
                    d8aVarE.add(objInvoke);
                }
                return x44.v(d8aVarE);
            default:
                Map.Entry entry = (Map.Entry) obj2;
                return x44.X(y5fVar2.a.invoke(y4fVar, entry.getKey()), y5fVar.a.invoke(y4fVar, entry.getValue()));
        }
    }
}
