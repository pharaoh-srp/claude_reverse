package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class no0 extends q9a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            default:
                return "kotlin.collections.HashSet";
        }
    }
}
