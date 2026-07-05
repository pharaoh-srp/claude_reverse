package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.z;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tjb {
    public long a;
    public Object b;
    public Object c;
    public final Object d;

    public tjb(rl rlVar, String str, String str2, iuj iujVar) {
        this.b = rlVar;
        this.c = str;
        this.d = str2;
        this.a = System.nanoTime();
    }

    public void a(boolean z) {
        long jNanoTime = System.nanoTime() - this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("execution_time", Long.valueOf(jNanoTime));
        linkedHashMap.put("operation_name", (String) this.c);
        linkedHashMap.put("caller_class", (String) this.d);
        linkedHashMap.put("is_successful", Boolean.valueOf(z));
        linkedHashMap.put("metric_type", "method called");
        ((rl) this.b).N(qs7.Y, linkedHashMap, 100.0f, Float.valueOf(0.001f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x b(x xVar, String str) {
        x xVar2;
        Pair pair;
        Object obj;
        String strD = xVar.D();
        List listE = xVar.E();
        l5l l5lVar = (l5l) this.d;
        l5lVar.L0();
        Long l = (Long) dik.v1(xVar, "_eid");
        boolean z = l != null;
        if (z && strD.equals("_ep")) {
            dgj.v(l);
            l5lVar.L0();
            String str2 = (String) dik.v1(xVar, "_en");
            Cursor cursorRawQuery = null;
            if (TextUtils.isEmpty(str2)) {
                l5lVar.b0().K.c("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (((x) this.b) == null || ((Long) this.c) == null || l.longValue() != ((Long) this.c).longValue()) {
                wrj wrjVarM0 = l5lVar.M0();
                wrjVarM0.K0();
                wrjVarM0.O0();
                try {
                    try {
                        xVar2 = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        cursorRawQuery = wrjVarM0.R0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                        try {
                        } catch (SQLiteException e) {
                            e = e;
                            wrjVarM0.b0().J.c("Error selecting main event", e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorRawQuery = null;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    xVar2 = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (cursorRawQuery.moveToFirst()) {
                    try {
                        Pair pairCreate = Pair.create((x) ((mhk) dik.e1(x.C(), cursorRawQuery.getBlob(0))).b(), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        pair = pairCreate;
                    } catch (IOException e4) {
                        wrjVarM0.b0().J.d("Failed to merge main event. appId, eventId", qgk.Q0(str), l, e4);
                        cursorRawQuery.close();
                        pair = xVar2;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        l5lVar.b0().K.a(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return xVar2;
                    }
                    this.b = (x) obj;
                    this.a = ((Long) pair.second).longValue();
                    l5lVar.L0();
                    this.c = (Long) dik.v1((x) this.b, "_eid");
                } else {
                    wrjVarM0.b0().R.b("Main event not found");
                    cursorRawQuery.close();
                }
                pair = xVar2;
                if (pair != 0) {
                }
                l5lVar.b0().K.a(str2, l, "Extra parameter without existing main event. eventName, eventId");
                return xVar2;
            }
            long j = this.a - 1;
            this.a = j;
            if (j <= 0) {
                wrj wrjVarM02 = l5lVar.M0();
                wrjVarM02.K0();
                wrjVarM02.b0().R.c("Clearing complex main event info. appId", str);
                try {
                    wrjVarM02.R0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e5) {
                    wrjVarM02.b0().J.c("Error clearing complex main event", e5);
                }
            } else {
                l5lVar.M0().j1(str, l, this.a, (x) this.b);
            }
            ArrayList arrayList = new ArrayList();
            for (z zVar : ((x) this.b).E()) {
                l5lVar.L0();
                if (dik.X0(xVar, zVar.E()) == null) {
                    arrayList.add(zVar);
                }
            }
            if (arrayList.isEmpty()) {
                l5lVar.b0().K.c("No unique parameters in main event. eventName", str2);
            } else {
                arrayList.addAll(listE);
                listE = arrayList;
            }
            strD = str2;
        } else if (z) {
            this.c = l;
            this.b = xVar;
            l5lVar.L0();
            Serializable serializableV1 = dik.v1(xVar, "_epc");
            long jLongValue = ((Long) (serializableV1 != null ? serializableV1 : 0L)).longValue();
            this.a = jLongValue;
            if (jLongValue <= 0) {
                l5lVar.b0().K.c("Complex event with zero extra param count. eventName", strD);
            } else {
                wrj wrjVarM03 = l5lVar.M0();
                dgj.v(l);
                wrjVarM03.j1(str, l, this.a, xVar);
            }
        }
        mhk mhkVar = (mhk) xVar.l();
        mhkVar.c();
        x.x((x) mhkVar.F, strD);
        mhkVar.c();
        x.t((x) mhkVar.F);
        mhkVar.c();
        x.w((x) mhkVar.F, listE);
        return (x) mhkVar.b();
    }

    public tjb(l5l l5lVar) {
        this.d = l5lVar;
    }
}
