package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class x29 extends PluginGeneratedSerialDescriptor {
    public final boolean m;

    public x29(String str, w28 w28Var) {
        super(str, w28Var, 1);
        this.m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x29) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a())) {
                x29 x29Var = (x29) obj;
                if (x29Var.m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) x29Var.k.getValue())) {
                    int iE = serialDescriptor.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (x44.r(h(i2).a(), serialDescriptor.h(i2).a()) && x44.r(h(i2).getKind(), serialDescriptor.h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.m;
    }
}
