package defpackage;

import java.util.HashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class yf8 extends u44 {
    public final no0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf8(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.b = new no0(descriptor, 1);
    }

    @Override // defpackage.x0
    public final Object a() {
        return new HashSet();
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet.size();
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.x0
    public final Object h(Object obj) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        return hashSet;
    }

    @Override // defpackage.s44
    public final void i(Object obj, int i, Object obj2) {
        HashSet hashSet = (HashSet) obj;
        hashSet.getClass();
        hashSet.add(obj2);
    }
}
