package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class gfd extends q9a {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfd(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.b = serialDescriptor.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.b;
    }
}
