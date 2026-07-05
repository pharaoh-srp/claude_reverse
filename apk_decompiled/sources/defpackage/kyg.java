package defpackage;

import com.anthropic.claude.sessions.types.SummaryStatusCategory;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class kyg implements KSerializer {
    public static final kyg a = new kyg();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        SummaryStatusCategory.Companion.getClass();
        KSerializer kSerializer = (KSerializer) SummaryStatusCategory.$cachedKeepSerializer$delegate.getValue();
        b = kSerializer;
        c = kSerializer.getDescriptor();
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        try {
            return (SummaryStatusCategory) b.deserialize(decoder);
        } catch (SerializationException unused) {
            return SummaryStatusCategory.UNKNOWN;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SummaryStatusCategory summaryStatusCategory = (SummaryStatusCategory) obj;
        encoder.getClass();
        summaryStatusCategory.getClass();
        b.serialize(encoder, summaryStatusCategory);
    }
}
