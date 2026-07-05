package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public interface znf {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj);
}
