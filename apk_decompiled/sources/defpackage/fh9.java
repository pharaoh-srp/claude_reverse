package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class fh9 implements SerialDescriptor {
    public final u0h a;

    public fh9(zy7 zy7Var) {
        this.a = new u0h(zy7Var);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return b().d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return b().e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return b().f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        return b().g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        return b().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return b().h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return b().i(i);
    }
}
