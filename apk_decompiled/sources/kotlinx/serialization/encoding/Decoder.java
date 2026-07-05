package kotlinx.serialization.encoding;

import defpackage.fof;
import defpackage.s06;
import defpackage.ud4;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public interface Decoder {
    byte A();

    short B();

    float C();

    double E();

    fof a();

    ud4 c(SerialDescriptor serialDescriptor);

    boolean f();

    default Object g(s06 s06Var) {
        s06Var.getClass();
        return s06Var.deserialize(this);
    }

    char h();

    int i(SerialDescriptor serialDescriptor);

    int p();

    String s();

    long t();

    boolean w();

    Decoder y(SerialDescriptor serialDescriptor);
}
