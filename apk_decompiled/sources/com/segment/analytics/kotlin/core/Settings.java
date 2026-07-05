package com.segment.analytics.kotlin.core;

import defpackage.bg9;
import defpackage.dj9;
import defpackage.fof;
import defpackage.ih9;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pff;
import defpackage.pmf;
import defpackage.s06;
import defpackage.s47;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w16;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ6\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J(\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201HÇ\u0001¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u00109R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00106\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u00109R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00106\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u00109R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00106\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u00109R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00106\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u00109R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u00109¨\u0006F"}, d2 = {"Lcom/segment/analytics/kotlin/core/Settings;", "", "Lkotlinx/serialization/json/JsonObject;", "integrations", "plan", "edgeFunction", "middlewareSettings", "metrics", "consentSettings", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)V", "", "seen1", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "T", "", "name", "Ls06;", "strategy", "destinationSettings", "(Ljava/lang/String;Ls06;)Ljava/lang/Object;", "Lw16;", "plugin", "", "hasIntegrationSettings", "(Lw16;)Z", "key", "(Ljava/lang/String;)Z", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "component3", "component4", "component5", "component6", "copy", "(Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;)Lcom/segment/analytics/kotlin/core/Settings;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/Settings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "getIntegrations", "setIntegrations", "(Lkotlinx/serialization/json/JsonObject;)V", "getPlan", "setPlan", "getEdgeFunction", "setEdgeFunction", "getMiddlewareSettings", "setMiddlewareSettings", "getMetrics", "setMetrics", "getConsentSettings", "setConsentSettings", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private JsonObject consentSettings;
    private JsonObject edgeFunction;
    private JsonObject integrations;
    private JsonObject metrics;
    private JsonObject middlewareSettings;
    private JsonObject plan;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/Settings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/Settings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return Settings$$serializer.INSTANCE;
        }
    }

    @lz5
    public Settings(int i, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, vnf vnfVar) {
        this.integrations = (i & 1) == 0 ? s47.a : jsonObject;
        if ((i & 2) == 0) {
            this.plan = s47.a;
        } else {
            this.plan = jsonObject2;
        }
        if ((i & 4) == 0) {
            this.edgeFunction = s47.a;
        } else {
            this.edgeFunction = jsonObject3;
        }
        if ((i & 8) == 0) {
            this.middlewareSettings = s47.a;
        } else {
            this.middlewareSettings = jsonObject4;
        }
        if ((i & 16) == 0) {
            this.metrics = s47.a;
        } else {
            this.metrics = jsonObject5;
        }
        if ((i & 32) == 0) {
            this.consentSettings = s47.a;
        } else {
            this.consentSettings = jsonObject6;
        }
    }

    public static /* synthetic */ Settings copy$default(Settings settings, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = settings.integrations;
        }
        if ((i & 2) != 0) {
            jsonObject2 = settings.plan;
        }
        if ((i & 4) != 0) {
            jsonObject3 = settings.edgeFunction;
        }
        if ((i & 8) != 0) {
            jsonObject4 = settings.middlewareSettings;
        }
        if ((i & 16) != 0) {
            jsonObject5 = settings.metrics;
        }
        if ((i & 32) != 0) {
            jsonObject6 = settings.consentSettings;
        }
        JsonObject jsonObject7 = jsonObject5;
        JsonObject jsonObject8 = jsonObject6;
        return settings.copy(jsonObject, jsonObject2, jsonObject3, jsonObject4, jsonObject7, jsonObject8);
    }

    public static Object destinationSettings$default(Settings settings, String str, s06 s06Var, int i, Object obj) {
        if ((i & 2) != 0) {
            fof fofVar = bg9.d.b;
            pmf.n("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
            return null;
        }
        str.getClass();
        s06Var.getClass();
        JsonElement jsonElement = (JsonElement) settings.getIntegrations().get((Object) str);
        if (jsonElement != null) {
            ih9 ih9Var = dj9.a;
            JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            if (jsonObject != null) {
                return dj9.b.a(s06Var, jsonObject);
            }
        }
        return null;
    }

    public static final void write$Self(Settings self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        if (output.E(serialDesc) || !x44.r(self.integrations, s47.a)) {
            output.r(serialDesc, 0, uh9.a, self.integrations);
        }
        if (output.E(serialDesc) || !x44.r(self.plan, s47.a)) {
            output.r(serialDesc, 1, uh9.a, self.plan);
        }
        if (output.E(serialDesc) || !x44.r(self.edgeFunction, s47.a)) {
            output.r(serialDesc, 2, uh9.a, self.edgeFunction);
        }
        if (output.E(serialDesc) || !x44.r(self.middlewareSettings, s47.a)) {
            output.r(serialDesc, 3, uh9.a, self.middlewareSettings);
        }
        if (output.E(serialDesc) || !x44.r(self.metrics, s47.a)) {
            output.r(serialDesc, 4, uh9.a, self.metrics);
        }
        if (!output.E(serialDesc) && x44.r(self.consentSettings, s47.a)) {
            return;
        }
        output.r(serialDesc, 5, uh9.a, self.consentSettings);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getIntegrations() {
        return this.integrations;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonObject getEdgeFunction() {
        return this.edgeFunction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonObject getMiddlewareSettings() {
        return this.middlewareSettings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JsonObject getMetrics() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final JsonObject getConsentSettings() {
        return this.consentSettings;
    }

    public final Settings copy(JsonObject integrations, JsonObject plan, JsonObject edgeFunction, JsonObject middlewareSettings, JsonObject metrics, JsonObject consentSettings) {
        integrations.getClass();
        plan.getClass();
        edgeFunction.getClass();
        middlewareSettings.getClass();
        metrics.getClass();
        consentSettings.getClass();
        return new Settings(integrations, plan, edgeFunction, middlewareSettings, metrics, consentSettings);
    }

    public final <T> T destinationSettings(String name, s06 strategy) {
        name.getClass();
        strategy.getClass();
        JsonElement jsonElement = (JsonElement) getIntegrations().get((Object) name);
        if (jsonElement != null) {
            ih9 ih9Var = dj9.a;
            JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
            if (jsonObject != null) {
                return (T) dj9.b.a(strategy, jsonObject);
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings) other;
        return x44.r(this.integrations, settings.integrations) && x44.r(this.plan, settings.plan) && x44.r(this.edgeFunction, settings.edgeFunction) && x44.r(this.middlewareSettings, settings.middlewareSettings) && x44.r(this.metrics, settings.metrics) && x44.r(this.consentSettings, settings.consentSettings);
    }

    public final JsonObject getConsentSettings() {
        return this.consentSettings;
    }

    public final JsonObject getEdgeFunction() {
        return this.edgeFunction;
    }

    public final JsonObject getIntegrations() {
        return this.integrations;
    }

    public final JsonObject getMetrics() {
        return this.metrics;
    }

    public final JsonObject getMiddlewareSettings() {
        return this.middlewareSettings;
    }

    public final JsonObject getPlan() {
        return this.plan;
    }

    public final boolean hasIntegrationSettings(w16 plugin) {
        plugin.getClass();
        return hasIntegrationSettings(((pff) plugin).J);
    }

    public int hashCode() {
        return this.consentSettings.hashCode() + ((this.metrics.hashCode() + ((this.middlewareSettings.hashCode() + ((this.edgeFunction.hashCode() + ((this.plan.hashCode() + (this.integrations.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setConsentSettings(JsonObject jsonObject) {
        jsonObject.getClass();
        this.consentSettings = jsonObject;
    }

    public final void setEdgeFunction(JsonObject jsonObject) {
        jsonObject.getClass();
        this.edgeFunction = jsonObject;
    }

    public final void setIntegrations(JsonObject jsonObject) {
        jsonObject.getClass();
        this.integrations = jsonObject;
    }

    public final void setMetrics(JsonObject jsonObject) {
        jsonObject.getClass();
        this.metrics = jsonObject;
    }

    public final void setMiddlewareSettings(JsonObject jsonObject) {
        jsonObject.getClass();
        this.middlewareSettings = jsonObject;
    }

    public final void setPlan(JsonObject jsonObject) {
        jsonObject.getClass();
        this.plan = jsonObject;
    }

    public String toString() {
        return "Settings(integrations=" + this.integrations + ", plan=" + this.plan + ", edgeFunction=" + this.edgeFunction + ", middlewareSettings=" + this.middlewareSettings + ", metrics=" + this.metrics + ", consentSettings=" + this.consentSettings + ')';
    }

    public final boolean hasIntegrationSettings(String key) {
        key.getClass();
        return this.integrations.containsKey((Object) key);
    }

    public Settings(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? s47.a : jsonObject, (i & 2) != 0 ? s47.a : jsonObject2, (i & 4) != 0 ? s47.a : jsonObject3, (i & 8) != 0 ? s47.a : jsonObject4, (i & 16) != 0 ? s47.a : jsonObject5, (i & 32) != 0 ? s47.a : jsonObject6);
    }

    public Settings() {
        this((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 63, (mq5) null);
    }

    public Settings(JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, JsonObject jsonObject6) {
        jsonObject.getClass();
        jsonObject2.getClass();
        jsonObject3.getClass();
        jsonObject4.getClass();
        jsonObject5.getClass();
        jsonObject6.getClass();
        this.integrations = jsonObject;
        this.plan = jsonObject2;
        this.edgeFunction = jsonObject3;
        this.middlewareSettings = jsonObject4;
        this.metrics = jsonObject5;
        this.consentSettings = jsonObject6;
    }
}
