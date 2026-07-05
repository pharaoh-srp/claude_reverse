package defpackage;

import com.anthropic.claude.code.ui.DiffLineComment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x48 {
    public final v48 a;
    public final LinkedHashMap b;
    public final ArrayList c;
    public final qo8 d;

    public x48(v48 v48Var, List list, xm8 xm8Var, om8 om8Var, l45 l45Var, pz7 pz7Var) {
        v48Var.getClass();
        list.getClass();
        xm8Var.getClass();
        om8Var.getClass();
        l45Var.getClass();
        pz7Var.getClass();
        this.a = v48Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String filePath = ((DiffLineComment) obj).getFilePath();
            Object arrayList = linkedHashMap.get(filePath);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(filePath, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
        List<fi7> list2 = this.a.a;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        for (fi7 fi7Var : list2) {
            String str = fi7Var.b;
            if (str == null && (str = fi7Var.a) == null) {
                str = "";
            }
            List list3 = (List) this.b.get(str);
            if (list3 == null) {
                list3 = lm6.E;
            }
            arrayList2.add(new ii7(fi7Var, list3, xm8Var, om8Var, l45Var, pz7Var));
        }
        this.c = arrayList2;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ii7) it.next()).getClass();
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((ii7) it2.next()).getClass();
        }
        this.d = new qo8();
    }
}
