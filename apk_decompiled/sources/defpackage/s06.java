package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public interface s06 {
    Object deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
