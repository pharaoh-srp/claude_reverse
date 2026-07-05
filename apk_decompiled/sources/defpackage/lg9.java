package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
public final class lg9 implements KSerializer {
    public static final lg9 a = new lg9();
    public static final kg9 b = kg9.b;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        yb5.h(decoder);
        return new JsonArray((List) new uo0(eh9.a, 0).e(decoder));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        JsonArray jsonArray = (JsonArray) obj;
        encoder.getClass();
        jsonArray.getClass();
        yb5.i(encoder);
        eh9 eh9Var = eh9.a;
        SerialDescriptor descriptor = eh9Var.getDescriptor();
        descriptor.getClass();
        to0 to0Var = new to0(descriptor, 0);
        int size = jsonArray.size();
        vd4 vd4VarY = encoder.y(to0Var);
        Iterator<JsonElement> it = jsonArray.iterator();
        for (int i = 0; i < size; i++) {
            vd4VarY.r(to0Var, i, eh9Var, it.next());
        }
        vd4VarY.b(to0Var);
    }
}
