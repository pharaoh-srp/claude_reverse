package defpackage;

import com.anthropic.claude.api.tasks.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bfi implements KSerializer {
    public final String a;
    public final jnf b = j8.m("UnknownTaskSessionEvent", new SerialDescriptor[0], new r2i(6));

    public bfi(String str) {
        this.a = str;
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Object hreVar;
        decoder.getClass();
        try {
            if (decoder instanceof zg9) {
                Object objN = ((zg9) decoder).n();
                hreVar = objN instanceof JsonObject ? (JsonObject) objN : null;
                if (hreVar == null) {
                    hreVar = f.a;
                }
            } else {
                hreVar = (JsonObject) decoder.g(JsonObject.INSTANCE.serializer());
            }
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Object obj = f.a;
        if (hreVar instanceof hre) {
            hreVar = obj;
        }
        JsonObject jsonObject = (JsonObject) hreVar;
        String str = this.a;
        if (str == null) {
            str = "unknown";
        }
        return new cfi(str, jsonObject);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        ((cfi) obj).getClass();
        throw new IllegalStateException("Serialization is not supported");
    }
}
