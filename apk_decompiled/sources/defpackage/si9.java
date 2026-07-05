package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class si9 implements KSerializer {
    public final KSerializer a;

    public si9(KSerializer kSerializer) {
        kSerializer.getClass();
        this.a = kSerializer;
    }

    public JsonElement a(JsonElement jsonElement) {
        jsonElement.getClass();
        return jsonElement;
    }

    public JsonElement b(JsonElement jsonElement) {
        jsonElement.getClass();
        return jsonElement;
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9VarH = yb5.h(decoder);
        return zg9VarH.d().a(this.a, a(zg9VarH.n()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        gh9 gh9VarI = yb5.i(encoder);
        gh9VarI.u(b(v40.S(gh9VarI.d(), obj, this.a)));
    }
}
