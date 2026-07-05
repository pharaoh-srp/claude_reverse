package com.arkivanov.decompose.router.items;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.e79;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pc9;
import defpackage.rnf;
import defpackage.vd4;
import defpackage.vnf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"com/arkivanov/decompose/router/items/ItemsController$SavedState", "", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "navState", "", "", "childState", "<init>", "(Lcom/arkivanov/essenty/statekeeper/SerializableContainer;Ljava/util/Map;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/arkivanov/essenty/statekeeper/SerializableContainer;Ljava/util/Map;Lvnf;)V", "Lcom/arkivanov/decompose/router/items/ItemsController$SavedState;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/items/ItemsController$SavedState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "getNavState", "()Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "Ljava/util/Map;", "getChildState", "()Ljava/util/Map;", "Companion", "com/arkivanov/decompose/router/items/a", "pc9", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class ItemsController$SavedState {
    private final Map<Integer, SerializableContainer> childState;
    private final SerializableContainer navState;
    public static final pc9 Companion = new pc9();
    private static final KSerializer[] $childSerializers = {null, new f7a(e79.a, rnf.a)};

    public /* synthetic */ ItemsController$SavedState(int i, SerializableContainer serializableContainer, Map map, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.navState = serializableContainer;
        this.childState = map;
    }

    public static final /* synthetic */ void write$Self$decompose_release(ItemsController$SavedState self, vd4 output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.r(serialDesc, 0, rnf.a, self.navState);
        output.r(serialDesc, 1, kSerializerArr[1], self.childState);
    }

    public final Map<Integer, SerializableContainer> getChildState() {
        return this.childState;
    }

    public final SerializableContainer getNavState() {
        return this.navState;
    }

    public ItemsController$SavedState(SerializableContainer serializableContainer, Map<Integer, SerializableContainer> map) {
        serializableContainer.getClass();
        map.getClass();
        this.navState = serializableContainer;
        this.childState = map;
    }
}
