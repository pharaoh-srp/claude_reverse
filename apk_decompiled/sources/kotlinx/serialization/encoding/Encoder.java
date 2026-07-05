package kotlinx.serialization.encoding;

import defpackage.fof;
import defpackage.vd4;
import defpackage.znf;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public interface Encoder {
    void A(long j);

    void F(String str);

    fof a();

    vd4 c(SerialDescriptor serialDescriptor);

    void e();

    void f(double d);

    void g(short s);

    default void h(Object obj, znf znfVar) {
        znfVar.getClass();
        znfVar.serialize(this, obj);
    }

    void i(byte b);

    void j(boolean z);

    void m(float f);

    void o(char c);

    void t(SerialDescriptor serialDescriptor, int i);

    void w(int i);

    Encoder x(SerialDescriptor serialDescriptor);

    default vd4 y(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return c(serialDescriptor);
    }
}
