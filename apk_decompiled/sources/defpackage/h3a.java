package defpackage;

import com.anthropic.claude.api.account.GrowthBookFeature;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class h3a implements KSerializer {
    public static final h3a a = new h3a();
    public static final f7a b;
    public static final SerialDescriptor c;

    static {
        f7a f7aVarU = d4c.u(srg.a, GrowthBookFeature.Companion.serializer());
        b = f7aVarU;
        c = f7aVarU.c;
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        if (zg9Var == null) {
            return (Map) b.deserialize(decoder);
        }
        JsonElement jsonElementN = zg9Var.n();
        JsonObject jsonObject = jsonElementN instanceof JsonObject ? (JsonObject) jsonElementN : null;
        if (jsonObject == null) {
            return nm6.E;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            try {
                linkedHashMap.put(key, zg9Var.d().a(GrowthBookFeature.Companion.serializer(), entry.getValue()));
            } catch (Exception e) {
                List list = xah.a;
                xah.f(e, ij0.i("Failed to parse GrowthBook feature: ", key), null, null, 28);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Map map = (Map) obj;
        encoder.getClass();
        map.getClass();
        b.serialize(encoder, map);
    }
}
