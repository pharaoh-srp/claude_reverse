package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.platform.plugins.SegmentSettings;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class pff extends w16 implements lvg {
    public h07 H;
    public List I = lm6.E;
    public final String J = "Segment.io";

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        el5 el5Var = gxVar.F;
        this.F = gxVar;
        lqh lqhVar = this.E;
        lqhVar.getClass();
        lqhVar.b = gxVar;
        eg4 eg4Var = gxVar.E;
        List listX = eg4Var.d;
        if (listX.isEmpty()) {
            s45 s45Var = new s45();
            s45Var.a = 3;
            uy7 uy7Var = new uy7();
            uy7Var.a = 10000L;
            listX = x44.X(s45Var, uy7Var);
        }
        this.I = listX;
        u16 u16Var = new u16();
        u16Var.F = new Settings((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 63, (mq5) null);
        u16Var.E = e();
        lqhVar.a(u16Var);
        this.H = new h07(gxVar, this.J, eg4Var.a, this.I, eg4Var.e);
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new rrb(gxVar, this, null, 6), 2);
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        String apiHost;
        h07 h07Var;
        settings.getClass();
        sq6.a(i);
        this.G = settings.hasIntegrationSettings(this);
        this.E.b(new v16(settings, i));
        if (settings.hasIntegrationSettings(this)) {
            bg9.d.getClass();
            KSerializer kSerializerSerializer = SegmentSettings.INSTANCE.serializer();
            JsonElement jsonElement = (JsonElement) settings.getIntegrations().get((Object) this.J);
            Object objA = null;
            if (jsonElement != null) {
                ih9 ih9Var = dj9.a;
                JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                if (jsonObject != null) {
                    objA = dj9.b.a(kSerializerSerializer, jsonObject);
                }
            }
            SegmentSettings segmentSettings = (SegmentSettings) objA;
            if (segmentSettings == null || (apiHost = segmentSettings.getApiHost()) == null || (h07Var = this.H) == null) {
                return;
            }
            h07Var.d = apiHost;
        }
    }

    public final void d(BaseEvent baseEvent) {
        h07 h07Var = this.H;
        if (h07Var != null) {
            h07Var.e.r(baseEvent);
        }
    }
}
