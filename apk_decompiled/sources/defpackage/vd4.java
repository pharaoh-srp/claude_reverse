package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public interface vd4 {
    void B(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj);

    Encoder C(gfd gfdVar, int i);

    void D(SerialDescriptor serialDescriptor, int i, long j);

    default boolean E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return true;
    }

    void b(SerialDescriptor serialDescriptor);

    void k(SerialDescriptor serialDescriptor, int i, float f);

    void l(int i, int i2, SerialDescriptor serialDescriptor);

    void n(gfd gfdVar, int i, byte b);

    void p(SerialDescriptor serialDescriptor, int i, boolean z);

    void q(SerialDescriptor serialDescriptor, int i, String str);

    void r(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj);

    void s(gfd gfdVar, int i, short s);

    void v(gfd gfdVar, int i, char c);

    void z(SerialDescriptor serialDescriptor, int i, double d);
}
