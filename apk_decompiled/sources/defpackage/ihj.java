package defpackage;

import com.anthropic.claude.sessions.types.WorkerStatusV2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ihj implements KSerializer {
    public static final ihj a = new ihj();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        WorkerStatusV2.Companion.getClass();
        KSerializer kSerializer = (KSerializer) WorkerStatusV2.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (WorkerStatusV2) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return WorkerStatusV2.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WorkerStatusV2 workerStatusV2 = (WorkerStatusV2) obj;
        encoder.getClass();
        workerStatusV2.getClass();
        b.serialize(encoder, workerStatusV2);
    }
}
