package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class rfd implements SerialDescriptor {
    public final String a;
    public final kfd b;

    public rfd(String str, kfd kfdVar) {
        kfdVar.getClass();
        this.a = str;
        this.b = kfdVar;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(ij0.m(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfd)) {
            return false;
        }
        rfd rfdVar = (rfd) obj;
        return this.a.equals(rfdVar.a) && x44.r(this.b, rfdVar.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return vb7.s(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
