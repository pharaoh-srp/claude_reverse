package defpackage;

import com.anthropic.claude.sessions.types.SessionStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class cuf implements KSerializer {
    public static final cuf a = new cuf();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        SessionStatus.Companion.getClass();
        KSerializer kSerializer = (KSerializer) SessionStatus.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (SessionStatus) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return SessionStatus.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionStatus sessionStatus = (SessionStatus) obj;
        encoder.getClass();
        sessionStatus.getClass();
        b.serialize(encoder, sessionStatus);
    }
}
