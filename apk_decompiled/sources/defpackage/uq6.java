package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class uq6 implements KSerializer {
    public static final uq6 a = new uq6();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        EnvironmentKind.Companion.getClass();
        KSerializer kSerializer = (KSerializer) EnvironmentKind.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (EnvironmentKind) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return EnvironmentKind.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentKind environmentKind = (EnvironmentKind) obj;
        encoder.getClass();
        environmentKind.getClass();
        b.serialize(encoder, environmentKind);
    }
}
