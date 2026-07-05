package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.HTTPException;
import com.segment.analytics.kotlin.core.ScreenEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class h07 {
    public static final f07 Companion = new f07();
    public static final ScreenEvent i;
    public final gx a;
    public final String b;
    public final List c;
    public String d;
    public zy1 e;
    public zy1 f;
    public final q28 g;
    public boolean h;

    static {
        ScreenEvent screenEvent = new ScreenEvent("#!flush", "#!flush", s47.a);
        screenEvent.setMessageId("#!flush");
        i = screenEvent;
    }

    public h07(gx gxVar, String str, String str2, List list, String str3) {
        str.getClass();
        list.getClass();
        this.a = gxVar;
        this.b = str;
        this.c = list;
        this.d = str3;
        this.g = new q28(str2, gxVar.E.g);
        this.h = false;
        this.e = wd6.P(Integer.MAX_VALUE, 6, null);
        this.f = wd6.P(Integer.MAX_VALUE, 6, null);
        Runtime.getRuntime().addShutdownHook(new n35(1, this));
    }

    public static final boolean a(h07 h07Var, Exception exc, String str) {
        if (!(exc instanceof HTTPException)) {
            yw ywVar = gx.Companion;
            StringBuilder sbX = sq6.x("\n                    | Error uploading events from batch file\n                    | fileUrl=\"", str, "\"\n                    | msg=");
            sbX.append(exc.getMessage());
            sbX.append("\n                ");
            dch.P(ywVar, csg.W(sbX.toString()), 1);
            return false;
        }
        yb5.z(h07Var.a, h07Var.b + " exception while uploading, " + exc.getMessage());
        int i2 = ((HTTPException) exc).E;
        if (400 > i2 || i2 >= 500 || i2 == 429) {
            dch.P(gx.Companion, "Error while uploading payloads", 1);
            return false;
        }
        dch.P(gx.Companion, "Payloads were rejected by server. Marked for removal.", 1);
        return true;
    }

    public static String c(BaseEvent baseEvent) {
        ih9 ih9Var = dj9.a;
        ih9Var.getClass();
        JsonObject jsonObjectI = ch9.i(ih9Var.c(baseEvent, BaseEvent.INSTANCE.serializer()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObjectI.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!x44.r(key, "userId") || !bsg.I0(ch9.j(value).getContent())) {
                if (!x44.r(key, "traits") || !x44.r(value, s47.a)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        ag9 ag9Var = bg9.d;
        ag9Var.getClass();
        return ag9Var.d(linkedHashMap, new f7a(srg.a, eh9.a));
    }

    public final void b() {
        if (this.h) {
            this.h = false;
            this.f.d(null);
            this.e.d(null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((sr7) it.next()).d();
            }
        }
    }
}
