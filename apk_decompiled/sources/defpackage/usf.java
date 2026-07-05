package defpackage;

import com.anthropic.claude.sessions.types.SessionLifecycleStatusV2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class usf implements KSerializer {
    public static final usf a = new usf();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        SessionLifecycleStatusV2.Companion.getClass();
        KSerializer kSerializer = (KSerializer) SessionLifecycleStatusV2.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (SessionLifecycleStatusV2) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return SessionLifecycleStatusV2.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionLifecycleStatusV2 sessionLifecycleStatusV2 = (SessionLifecycleStatusV2) obj;
        encoder.getClass();
        sessionLifecycleStatusV2.getClass();
        b.serialize(encoder, sessionLifecycleStatusV2);
    }
}
