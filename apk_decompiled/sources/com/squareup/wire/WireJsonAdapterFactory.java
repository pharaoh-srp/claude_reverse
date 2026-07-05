package com.squareup.wire;

import com.squareup.wire.internal.EnumJsonFormatter;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import defpackage.fg9;
import defpackage.gg9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.prb;
import defpackage.spi;
import defpackage.sta;
import defpackage.sz6;
import defpackage.wwk;
import defpackage.x44;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\u000fJ3\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/WireJsonAdapterFactory;", "Lfg9;", "", "", "Lcom/squareup/wire/ProtoAdapter;", "typeUrlToAdapter", "", "writeIdentityValues", "<init>", "(Ljava/util/Map;Z)V", "", "adapters", "plus", "(Ljava/util/List;)Lcom/squareup/wire/WireJsonAdapterFactory;", "adapter", "(Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/WireJsonAdapterFactory;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lprb;", "moshi", "Lgg9;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lprb;)Lgg9;", "Ljava/util/Map;", "Z", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class WireJsonAdapterFactory implements fg9 {
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;
    private final boolean writeIdentityValues;

    public /* synthetic */ WireJsonAdapterFactory(Map map, boolean z, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? nm6.E : map, (i & 2) != 0 ? false : z);
    }

    @Override // defpackage.fg9
    public gg9 create(Type type, Set<? extends Annotation> annotations, prb moshi) {
        type.getClass();
        annotations.getClass();
        moshi.getClass();
        Class clsM = wwk.m(type);
        if (annotations.isEmpty()) {
            if (x44.r(clsM, AnyMessage.class)) {
                return new AnyMessageJsonAdapter(moshi, this.typeUrlToAdapter);
            }
            if (Message.class.isAssignableFrom(clsM)) {
                RuntimeMessageAdapter runtimeMessageAdapterCreateRuntimeMessageAdapter = ReflectionKt.createRuntimeMessageAdapter((Class) type, this.writeIdentityValues, clsM.getClassLoader());
                return new MessageJsonAdapter(runtimeMessageAdapterCreateRuntimeMessageAdapter, MoshiJsonIntegration.INSTANCE.jsonAdapters(runtimeMessageAdapterCreateRuntimeMessageAdapter, moshi), moshi.b(wwk.o(List.class, String.class), spi.a, null)).nullSafe();
            }
            if (WireEnum.class.isAssignableFrom(clsM)) {
                return new EnumJsonAdapter(new EnumJsonFormatter(RuntimeEnumAdapter.INSTANCE.create((Class) type))).nullSafe();
            }
        }
        return null;
    }

    public final WireJsonAdapterFactory plus(List<? extends ProtoAdapter<?>> adapters) {
        adapters.getClass();
        LinkedHashMap linkedHashMapT0 = sta.t0(this.typeUrlToAdapter);
        for (ProtoAdapter<?> protoAdapter : adapters) {
            String typeUrl = protoAdapter.getTypeUrl();
            if (typeUrl == null) {
                sz6.i(protoAdapter.getType(), " to use it with WireJsonAdapterFactory", "recompile ");
                return null;
            }
            linkedHashMapT0.put(typeUrl, protoAdapter);
        }
        return new WireJsonAdapterFactory(linkedHashMapT0, this.writeIdentityValues);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> map) {
        this(map, false, 2, null);
        map.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> map, boolean z) {
        map.getClass();
        this.typeUrlToAdapter = map;
        this.writeIdentityValues = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final WireJsonAdapterFactory plus(ProtoAdapter<?> adapter) {
        adapter.getClass();
        return plus(x44.W(adapter));
    }
}
