package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9a implements SerialDescriptor {
    public final SerialDescriptor a;

    public q9a(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer numR0 = isg.r0(10, str);
        if (numR0 != null) {
            return numR0.intValue();
        }
        sz6.p(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9a)) {
            return false;
        }
        q9a q9aVar = (q9a) obj;
        return x44.r(this.a, q9aVar.a) && x44.r(a(), q9aVar.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        if (i >= 0) {
            return lm6.E;
        }
        pmf.l(vb7.u("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        return vsg.m;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        if (i >= 0) {
            return this.a;
        }
        pmf.l(vb7.u("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        pmf.l(vb7.u("Illegal index ", i, ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
