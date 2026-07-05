package defpackage;

import com.anthropic.claude.sessions.types.BridgeSpawnMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class hx1 implements KSerializer {
    public static final hx1 a = new hx1();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        BridgeSpawnMode.Companion.getClass();
        KSerializer kSerializer = (KSerializer) BridgeSpawnMode.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (BridgeSpawnMode) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return BridgeSpawnMode.SingleSession;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BridgeSpawnMode bridgeSpawnMode = (BridgeSpawnMode) obj;
        encoder.getClass();
        bridgeSpawnMode.getClass();
        b.serialize(encoder, bridgeSpawnMode);
    }
}
