package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class vd5 implements n7d {
    public static final Set H = sf5.f0("email");
    public final String E;
    public final String F;
    public gx G;

    public vd5(String str, String str2) {
        this.E = str;
        this.F = str2;
    }

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        baseEvent.getClass();
        rh9 rh9Var = new rh9();
        dj9.a(rh9Var, baseEvent.getContext());
        mpk.U(rh9Var, "ant_device_id", this.E);
        mpk.U(rh9Var, "primary_language", this.F);
        JsonObject jsonObject = e().I.c;
        if (jsonObject != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!H.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            rh9Var.b("traits", new JsonObject(linkedHashMap));
        }
        baseEvent.setContext(rh9Var.a());
        return baseEvent;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        this.G = gxVar;
    }

    @Override // defpackage.n7d
    public final /* bridge */ void c(Settings settings, int i) {
        mwa.X(settings, i);
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.G;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.F;
    }
}
