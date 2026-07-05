package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class f7a extends usa {
    public final e7a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7a(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        kSerializer.getClass();
        kSerializer2.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.c = new e7a("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // defpackage.x0
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
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
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
