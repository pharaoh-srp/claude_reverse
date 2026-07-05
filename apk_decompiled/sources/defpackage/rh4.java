package defpackage;

import com.anthropic.claude.sessions.types.ConnectionStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class rh4 implements KSerializer {
    public static final rh4 a = new rh4();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        ConnectionStatus.Companion.getClass();
        KSerializer kSerializer = (KSerializer) ConnectionStatus.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (ConnectionStatus) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return ConnectionStatus.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConnectionStatus connectionStatus = (ConnectionStatus) obj;
        encoder.getClass();
        connectionStatus.getClass();
        b.serialize(encoder, connectionStatus);
    }
}
