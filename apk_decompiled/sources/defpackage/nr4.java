package defpackage;

import com.anthropic.claude.conway.protocol.ConwayAppScreenSpec;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class nr4 implements KSerializer {
    public static final nr4 a = new nr4();
    public static final uo0 b;
    public static final SerialDescriptor c;

    static {
        uo0 uo0VarT = d4c.t(ConwayAppScreenSpec.Companion.serializer());
        b = uo0VarT;
        c = (to0) uo0VarT.c;
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zg9 zg9Var = decoder instanceof zg9 ? (zg9) decoder : null;
        uo0 uo0Var = b;
        if (zg9Var == null) {
            return (List) uo0Var.deserialize(decoder);
        }
        try {
            return (List) zg9Var.d().a(uo0Var, zg9Var.n());
        } catch (SerializationException | IllegalArgumentException unused) {
            return lm6.E;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        List list = (List) obj;
        encoder.getClass();
        list.getClass();
        b.serialize(encoder, list);
    }
}
