package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w2h {
    public static final List a;
    public static final Set b;

    static {
        List listX = x44.X(new cpc("℃", "celsius"), new cpc("°C", "celsius"), new cpc("℉", "fahrenheit"), new cpc("°F", "fahrenheit"), new cpc("÷", "divide"), new cpc("×", "times"));
        a = listX;
        List list = listX;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((cpc) it.next()).E);
        }
        b = w44.t1(arrayList);
    }

    public static ArrayList a(Context context, String str) {
        context.getClass();
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        List<cpc> list = a;
        ArrayList arrayList = new ArrayList();
        for (cpc cpcVar : list) {
            String str2 = (String) cpcVar.E;
            int identifier = resources.getIdentifier(ij0.k("tts_symbol_", (String) cpcVar.F, "_", str), "string", packageName);
            cpc cpcVar2 = null;
            if (identifier != 0) {
                String string = resources.getString(identifier);
                string.getClass();
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    cpcVar2 = new cpc(str2, ij0.j(" ", string, " "));
                }
            }
            if (cpcVar2 != null) {
                arrayList.add(cpcVar2);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        str.getClass();
        Set set = b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (bsg.u0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
