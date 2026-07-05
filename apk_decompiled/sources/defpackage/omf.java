package defpackage;

import com.anthropic.claude.api.account.GrowthBookFeature;
import io.sentry.t4;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class omf implements k4i {
    @Override // defpackage.k4i
    public final void c(String str, GrowthBookFeature growthBookFeature, JsonObject jsonObject) {
        Boolean boolE;
        str.getClass();
        JsonElement defaultValue = growthBookFeature.getDefaultValue();
        JsonPrimitive jsonPrimitive = defaultValue instanceof JsonPrimitive ? (JsonPrimitive) defaultValue : null;
        if (jsonPrimitive == null || (boolE = ch9.e(jsonPrimitive)) == null) {
            return;
        }
        t4.a(str, boolE);
    }
}
