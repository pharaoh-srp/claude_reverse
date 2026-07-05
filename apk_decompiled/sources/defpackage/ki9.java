package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.mcpapps.transport.JsonRpcError;
import com.anthropic.claude.mcpapps.transport.JsonRpcInboundMessage;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ki9 implements KSerializer {
    public static final ki9 a = new ki9();
    public static final jnf b;

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (bsg.I0("JsonRpcInboundMessage")) {
            sz6.p("Blank serial names are prohibited");
        } else {
            oh3 oh3Var = new oh3("JsonRpcInboundMessage");
            b = new jnf("JsonRpcInboundMessage", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String content;
        String content2;
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        if (zg9Var == null) {
            throw new SerializationException("JsonRpcInboundMessage can only be deserialized from JSON");
        }
        JsonElement jsonElementN = zg9Var.n();
        if (!(jsonElementN instanceof JsonObject)) {
            sz6.p("Expected a JSON object");
            return null;
        }
        Map map = (Map) jsonElementN;
        boolean zContainsKey = map.containsKey(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
        boolean zContainsKey2 = map.containsKey("id");
        if (zContainsKey && zContainsKey2) {
            JsonObject jsonObject = (JsonObject) jsonElementN;
            Object obj = jsonObject.get((Object) "id");
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive == null) {
                throw new SerializationException("'id' must be a primitive");
            }
            Object obj2 = jsonObject.get((Object) VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
            JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
            if (jsonPrimitive2 == null || (content2 = jsonPrimitive2.getContent()) == null) {
                throw new SerializationException("'method' must be a string");
            }
            Object obj3 = jsonObject.get((Object) "params");
            return new ii9(content2, obj3 instanceof JsonObject ? (JsonObject) obj3 : null, jsonPrimitive);
        }
        if (zContainsKey) {
            JsonObject jsonObject2 = (JsonObject) jsonElementN;
            Object obj4 = jsonObject2.get((Object) VerifyMagicLinkRequest.Credentials.DISCRIMINATOR);
            JsonPrimitive jsonPrimitive3 = obj4 instanceof JsonPrimitive ? (JsonPrimitive) obj4 : null;
            if (jsonPrimitive3 == null || (content = jsonPrimitive3.getContent()) == null) {
                throw new SerializationException("'method' must be a string");
            }
            Object obj5 = jsonObject2.get((Object) "params");
            return new hi9(content, obj5 instanceof JsonObject ? (JsonObject) obj5 : null);
        }
        JsonObject jsonObject3 = (JsonObject) jsonElementN;
        Object obj6 = jsonObject3.get((Object) "id");
        JsonPrimitive jsonPrimitive4 = obj6 instanceof JsonPrimitive ? (JsonPrimitive) obj6 : null;
        if (jsonPrimitive4 == null) {
            throw new SerializationException("Response must have an 'id'");
        }
        Object obj7 = jsonObject3.get((Object) "result");
        JsonObject jsonObject4 = obj7 instanceof JsonObject ? (JsonObject) obj7 : null;
        JsonElement jsonElement = (JsonElement) jsonObject3.get((Object) "error");
        return new ji9(jsonPrimitive4, jsonObject4, jsonElement != null ? (JsonRpcError) zg9Var.d().a(JsonRpcError.Companion.serializer(), jsonElement) : null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((JsonRpcInboundMessage) obj).getClass();
        throw new SerializationException("JsonRpcInboundMessage is not intended for serialization");
    }
}
