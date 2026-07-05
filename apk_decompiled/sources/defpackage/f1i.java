package defpackage;

import com.anthropic.claude.api.chat.tool.ToolUseInput;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class f1i implements KSerializer {
    public static final f1i a = new f1i();
    public static final rfd b = j8.h("ToolUseInput", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        if (!(decoder instanceof zg9)) {
            sz6.j("Decoding only supported with JSON decoders");
            return null;
        }
        JsonElement jsonElementN = ((zg9) decoder).n();
        if (jsonElementN instanceof JsonNull) {
            return new ToolUseInput("");
        }
        if (jsonElementN instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementN;
            if (jsonPrimitive.isString()) {
                return new ToolUseInput(jsonPrimitive.getContent());
            }
        }
        return new ToolUseInput(jsonElementN.toString());
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolUseInput toolUseInput = (ToolUseInput) obj;
        encoder.getClass();
        toolUseInput.getClass();
        if (encoder instanceof gh9) {
            ((gh9) encoder).u(ch9.c(toolUseInput.getPartial_json()));
        } else {
            encoder.F(toolUseInput.getPartial_json());
        }
    }
}
