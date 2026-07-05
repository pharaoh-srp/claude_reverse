package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class uqg {
    public static final Set a = mp0.Z0(new SerialDescriptor[]{pci.b, uci.b, jci.b, zci.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
