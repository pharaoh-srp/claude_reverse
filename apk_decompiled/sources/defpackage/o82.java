package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseCalendarFilterChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o82 extends iwe {
    public final w72 b;
    public final dyh c;
    public final qi3 d;
    public final MobileAppUseEvents$MobileAppUsePermissionChangedSource e;
    public final lsc f;
    public final lsc g;
    public final lsc h;
    public final lsc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o82(w72 w72Var, dyh dyhVar, qi3 qi3Var, MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource, h86 h86Var) {
        super(h86Var);
        w72Var.getClass();
        dyhVar.getClass();
        qi3Var.getClass();
        mobileAppUseEvents$MobileAppUsePermissionChangedSource.getClass();
        this.b = w72Var;
        this.c = dyhVar;
        this.d = qi3Var;
        this.e = mobileAppUseEvents$MobileAppUsePermissionChangedSource;
        nm6 nm6Var = nm6.E;
        this.f = mpk.P(nm6Var);
        this.g = mpk.P(nm6Var);
        this.h = mpk.P(Boolean.FALSE);
        this.i = mpk.P(Boolean.TRUE);
    }

    public static final LinkedHashMap R(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List<k82> list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(x44.y(list, 10));
            for (k82 k82Var : list) {
                if (x44.r(k82Var.a, str)) {
                    boolean z = !k82Var.d;
                    String str2 = k82Var.a;
                    String str3 = k82Var.b;
                    String str4 = k82Var.c;
                    String str5 = k82Var.e;
                    boolean z2 = k82Var.f;
                    str2.getClass();
                    str3.getClass();
                    k82Var = new k82(str2, str3, z, z2, str4, str5);
                }
                arrayList.add(k82Var);
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }

    public final Map O() {
        return (Map) this.g.getValue();
    }

    public final Map P() {
        return (Map) this.f.getValue();
    }

    public final void Q(String str) throws JSONException {
        boolean z;
        str.getClass();
        this.f.setValue(R(str, P()));
        this.g.setValue(R(str, O()));
        List listP1 = w44.p1(w44.s1(dxf.p0(P().keySet(), O().keySet())));
        lqa lqaVar = new lqa();
        Iterator it = listP1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            List list = (List) P().get(str2);
            List list2 = lm6.E;
            if (list == null) {
                list = list2;
            }
            List list3 = (List) O().get(str2);
            if (list3 == null) {
                list3 = list2;
            }
            List list4 = list;
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                z = true;
            } else {
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (!((k82) it2.next()).d) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            List list5 = list3;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it3 = list5.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((k82) it3.next()).d) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z || !z) {
                List list6 = (List) P().get(str2);
                if (list6 == null) {
                    list6 = list2;
                }
                List list7 = (List) O().get(str2);
                if (list7 != null) {
                    list2 = list7;
                }
                ArrayList arrayListA1 = w44.a1(list6, list2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : arrayListA1) {
                    if (((k82) obj).d) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((k82) it4.next()).a);
                }
                Set setT1 = w44.t1(arrayList2);
                if (str2 == null) {
                    str2 = "";
                }
                lqaVar.put(str2, setT1);
            }
        }
        lqa lqaVarC = lqaVar.c();
        boolean zIsEmpty = lqaVarC.isEmpty();
        sfa sfaVar = sfa.DEBUG;
        dyh dyhVar = this.c;
        if (zIsEmpty) {
            SharedPreferences.Editor editorEdit = dyhVar.a.edit();
            editorEdit.remove("calendar_selections_by_account");
            editorEdit.apply();
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList3.add(obj2);
                }
                if (!arrayList3.isEmpty()) {
                    zfa.a.getClass();
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        ((n30) ((zfa) it5.next())).b(sfaVar, strE, "No customized accounts - cleared preferences");
                    }
                }
            }
        } else {
            dyhVar.getClass();
            SharedPreferences.Editor editorEdit2 = dyhVar.a.edit();
            if (lqaVarC.isEmpty()) {
                editorEdit2.remove("calendar_selections_by_account");
            } else {
                JSONObject jSONObject = new JSONObject();
                Iterator it6 = ((mqa) lqaVarC.entrySet()).iterator();
                while (((jqa) it6).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((jqa) it6).next();
                    jSONObject.put((String) entry.getKey(), new JSONArray((Collection) w44.p1((Set) entry.getValue())));
                }
                editorEdit2.putString("calendar_selections_by_account", jSONObject.toString());
            }
            editorEdit2.apply();
            Iterator it7 = ((nqa) lqaVarC.values()).iterator();
            int size = 0;
            while (it7.hasNext()) {
                size += ((Set) it7.next()).size();
            }
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList4.add(obj3);
                }
                if (!arrayList4.isEmpty()) {
                    zfa.a.getClass();
                    String strQ = vb7.q("Saved calendar selection: ", " calendars across ", size, lqaVarC.M, " customized accounts");
                    Iterator it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        ((n30) ((zfa) it8.next())).b(sfaVar, strE2, strQ);
                    }
                }
            }
        }
        int iB = ovj.b(O()) + ovj.b(P());
        Iterator it9 = P().values().iterator();
        int size2 = 0;
        while (it9.hasNext()) {
            size2 += ((List) it9.next()).size();
        }
        Iterator it10 = O().values().iterator();
        int size3 = 0;
        while (it10.hasNext()) {
            size3 += ((List) it10.next()).size();
        }
        int i = size2 + size3;
        this.d.e(new MobileAppUseEvents$MobileAppUseCalendarFilterChanged(iB, i, iB == i, this.e), MobileAppUseEvents$MobileAppUseCalendarFilterChanged.Companion.serializer());
    }
}
