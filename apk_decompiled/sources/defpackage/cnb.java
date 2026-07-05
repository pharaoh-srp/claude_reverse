package defpackage;

import com.anthropic.claude.api.tasks.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cnb implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wlg F;

    public /* synthetic */ cnb(wlg wlgVar, int i) {
        this.E = i;
        this.F = wlgVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        wlg wlgVar = this.F;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) wlgVar.getValue()).floatValue());
            case 1:
                return Float.valueOf(((Number) wlgVar.getValue()).floatValue());
            case 2:
                return Float.valueOf(((Number) wlgVar.getValue()).floatValue());
            case 3:
                return new fcc(((fcc) wlgVar.getValue()).a);
            case 4:
                pb0 pb0Var = kif.a;
                return new fcc(((fcc) wlgVar.getValue()).a);
            case 5:
                return Float.valueOf(((Number) wlgVar.getValue()).floatValue());
            default:
                List list = (List) wlgVar.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    String strA = ((u7h) obj).a();
                    Object arrayList = linkedHashMap.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strA, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    arrayList2.add(new r7i(str, Integer.valueOf(list2.size()), f.b(((u7h) w44.L0(list2)).c)));
                }
                return w44.i1(arrayList2, nai.q(new x2h(3), new x2h(4), new x2h(5)));
        }
    }
}
