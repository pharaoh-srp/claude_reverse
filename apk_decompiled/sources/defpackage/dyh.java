package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dyh {
    public final SharedPreferences a;
    public final mdg b = new mdg();

    public dyh(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final Map a() {
        String string = this.a.getString("calendar_selections_by_account", null);
        nm6 nm6Var = nm6.E;
        if (string != null && string.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                lqa lqaVar = new lqa();
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    b79 b79VarH0 = wd6.H0(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(x44.y(b79VarH0, 10));
                    Iterator it = b79VarH0.iterator();
                    while (((a79) it).G) {
                        arrayList.add(jSONArray.getString(((a79) it).nextInt()));
                    }
                    Set setT1 = w44.t1(arrayList);
                    next.getClass();
                    lqaVar.put(next, setT1);
                }
                return lqaVar.c();
            } catch (Exception e) {
                List list = xah.a;
                Map mapSingletonMap = Collections.singletonMap("json_parse_failed_content", string);
                mapSingletonMap.getClass();
                xah.f(e, "Failed to parse calendar selections from preferences", null, mapSingletonMap, 20);
            }
        }
        return nm6Var;
    }

    public final eyh b(rok rokVar) {
        Object next;
        String str = (String) rokVar.E;
        mdg mdgVar = this.b;
        Object objR0 = mdgVar.get(str);
        if (objR0 == null) {
            String string = this.a.getString(str, rokVar.r0().name());
            Iterator<E> it = eyh.I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x44.r(((eyh) next).name(), string)) {
                    break;
                }
            }
            eyh eyhVar = (eyh) next;
            objR0 = eyhVar == null ? rokVar.r0() : eyhVar;
            mdgVar.put(str, objR0);
        }
        return (eyh) objR0;
    }

    public final void c(rok rokVar, eyh eyhVar) {
        eyhVar.getClass();
        String str = (String) rokVar.E;
        this.b.put(str, eyhVar);
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(str, eyhVar.name());
        editorEdit.apply();
    }
}
