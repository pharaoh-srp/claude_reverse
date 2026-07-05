package defpackage;

import com.anthropic.claude.sessions.types.WorkerStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ghj implements KSerializer {
    public static final ghj a = new ghj();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        WorkerStatus.Companion.getClass();
        KSerializer kSerializer = (KSerializer) WorkerStatus.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (WorkerStatus) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return WorkerStatus.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WorkerStatus workerStatus = (WorkerStatus) obj;
        encoder.getClass();
        workerStatus.getClass();
        b.serialize(encoder, workerStatus);
    }
}
