package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oee implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ y5f F;
    public final /* synthetic */ y5f G;

    public /* synthetic */ oee(y5f y5fVar, y5f y5fVar2, int i) {
        this.E = i;
        this.F = y5fVar;
        this.G = y5fVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        y5f y5fVar = this.G;
        y5f y5fVar2 = this.F;
        int i2 = 1;
        List list = (List) obj;
        switch (i) {
            case 0:
                y5f y5fVarK = dgj.K(new oee(y5fVar2, y5fVar, i2), new nee(y5fVar2, y5fVar, i2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Map.Entry entry = (Map.Entry) y5fVarK.b.invoke(list.get(i3));
                    entry.getClass();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                return linkedHashMap;
            default:
                Object obj2 = list.get(0);
                obj2.getClass();
                Object objInvoke = y5fVar2.b.invoke(obj2);
                Object obj3 = list.get(1);
                obj3.getClass();
                return new xra(objInvoke, y5fVar.b.invoke(obj3));
        }
    }
}
