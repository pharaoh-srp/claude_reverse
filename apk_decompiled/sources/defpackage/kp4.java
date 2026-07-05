package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class kp4 implements n7d {
    public static final jp4 Companion = new jp4();
    public gx E;
    public JsonObject F;
    public final String G = vb7.i();

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        baseEvent.getClass();
        rh9 rh9Var = new rh9();
        dj9.a(rh9Var, baseEvent.getContext());
        JsonObject jsonObject = this.F;
        if (jsonObject == null) {
            x44.o0("library");
            throw null;
        }
        rh9Var.b("library", jsonObject);
        mpk.U(rh9Var, "instanceId", this.G);
        baseEvent.setContext(rh9Var.a());
        return baseEvent;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        this.E = gxVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonPrimitive jsonPrimitiveC = ch9.c("analytics-kotlin");
        jsonPrimitiveC.getClass();
        JsonPrimitive jsonPrimitiveC2 = ch9.c("1.19.2");
        jsonPrimitiveC2.getClass();
        this.F = new JsonObject(linkedHashMap);
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        mwa.X(settings, i);
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.E;
    }
}
