package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g5e {
    public final long a;
    public final Object b;
    public final Object c;

    public g5e(long j, g11 g11Var) {
        this.a = j;
        this.b = g11Var;
        this.c = new e5e(this, j);
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static g5e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new g5e(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new g5e(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void c(mab mabVar, wv8 wv8Var, Map map, long j) {
        e5e e5eVar = (e5e) this.c;
        long j2 = e5eVar.E;
        LinkedHashMap linkedHashMap = (LinkedHashMap) e5eVar.G;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(mabVar);
            if (objRemove != null) {
                e5eVar.F = e5eVar.c() - e5eVar.h(mabVar, objRemove);
                e5eVar.b(mabVar, objRemove, null);
            }
            ((g11) this.b).r(mabVar, wv8Var, map, j);
            return;
        }
        c5e c5eVar = new c5e(wv8Var, map, j);
        Object objPut = linkedHashMap.put(mabVar, c5eVar);
        e5eVar.F = e5eVar.h(mabVar, c5eVar) + e5eVar.c();
        if (objPut != null) {
            e5eVar.F = e5eVar.c() - e5eVar.h(mabVar, objPut);
            e5eVar.b(mabVar, objPut, c5eVar);
        }
        e5eVar.i(e5eVar.E);
    }

    public g5e(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
