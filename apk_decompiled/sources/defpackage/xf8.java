package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class xf8 extends usa {
    public final wf8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf8(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        kSerializer.getClass();
        kSerializer2.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new wf8("kotlin.collections.HashMap", descriptor, descriptor2);
    }

    @Override // defpackage.x0
    public final Object a() {
        return new HashMap();
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map.size() * 2;
    }

    @Override // defpackage.x0
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // defpackage.x0
    public final int d(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // defpackage.x0
    public final Object g(Object obj) {
        throw null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // defpackage.x0
    public final Object h(Object obj) {
        HashMap map = (HashMap) obj;
        map.getClass();
        return map;
    }
}
