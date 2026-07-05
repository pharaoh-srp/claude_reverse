package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class eq6 extends PluginGeneratedSerialDescriptor {
    public final mnf m;
    public final u0h n;

    public eq6(String str, int i) {
        super(str, null, i);
        this.m = mnf.l;
        this.n = new u0h(new aa3(i, str, this, 1));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == mnf.l && this.a.equals(serialDescriptor.a()) && x44.r(yfd.q(this), yfd.q(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        return this.m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return ((SerialDescriptor[]) this.n.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        f2 f2Var = new f2(this);
        int iHashCode2 = 1;
        while (f2Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) f2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return w44.S0(new c19(1, this), ", ", this.a.concat("("), ")", null, 56);
    }
}
