package defpackage;

import com.anthropic.claude.sessions.types.TextToolResult;
import com.anthropic.claude.sessions.types.ToolResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class ryh implements KSerializer {
    public static final ryh a = new ryh();
    public static final to0 b = (to0) d4c.t(czh.c).c;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = (zg9) decoder;
        JsonElement jsonElementN = zg9Var.n();
        if (jsonElementN instanceof JsonNull) {
            return lm6.E;
        }
        if (jsonElementN instanceof JsonPrimitive) {
            return x44.W(new TextToolResult((String) null, ((JsonPrimitive) jsonElementN).getContent(), 1, (mq5) (0 == true ? 1 : 0)));
        }
        if (!(jsonElementN instanceof JsonArray)) {
            throw new SerializationException("Unexpected content type: " + jce.a.b(jsonElementN.getClass()));
        }
        Iterable iterable = (Iterable) jsonElementN;
        ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((ToolResult) zg9Var.d().a(czh.c, (JsonElement) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        List list = (List) obj;
        encoder.getClass();
        list.getClass();
        if (list.size() != 1 || !(list.get(0) instanceof TextToolResult)) {
            d4c.t(czh.c).serialize(encoder, list);
            return;
        }
        Object obj2 = list.get(0);
        obj2.getClass();
        encoder.F(((TextToolResult) obj2).getText());
    }
}
