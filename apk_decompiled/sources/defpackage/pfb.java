package defpackage;

import com.anthropic.claude.sessions.types.SdkMessageContent;
import com.anthropic.claude.sessions.types.SdkTextMessageContent;
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
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public final class pfb implements KSerializer {
    public static final pfb a = new pfb();
    public static final to0 b = (to0) d4c.t(czh.c).c;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = (zg9) decoder;
        Object objN = zg9Var.n();
        if (objN instanceof JsonPrimitive) {
            return x44.W(new SdkTextMessageContent("text", ((JsonPrimitive) objN).getContent()));
        }
        if (!(objN instanceof JsonArray)) {
            throw new SerializationException("Unexpected content type: " + jce.a.b(objN.getClass()));
        }
        Iterable iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((SdkMessageContent) zg9Var.d().a(mbf.c, (JsonElement) it.next()));
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
        if (list.size() != 1 || !(list.get(0) instanceof SdkTextMessageContent)) {
            d4c.t(mbf.c).serialize(encoder, list);
            return;
        }
        Object obj2 = list.get(0);
        obj2.getClass();
        encoder.F(((SdkTextMessageContent) obj2).getText());
    }
}
