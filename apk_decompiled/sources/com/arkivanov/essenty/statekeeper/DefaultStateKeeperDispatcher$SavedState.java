package com.arkivanov.essenty.statekeeper;

import defpackage.f7a;
import defpackage.gvj;
import defpackage.iu5;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rnf;
import defpackage.srg;
import defpackage.vnf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"com/arkivanov/essenty/statekeeper/DefaultStateKeeperDispatcher$SavedState", "", "", "", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "map", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "Lcom/arkivanov/essenty/statekeeper/DefaultStateKeeperDispatcher$SavedState;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$state_keeper_release", "(Lcom/arkivanov/essenty/statekeeper/DefaultStateKeeperDispatcher$SavedState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "Companion", "com/arkivanov/essenty/statekeeper/a", "iu5", "state-keeper_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class DefaultStateKeeperDispatcher$SavedState {
    private final Map<String, SerializableContainer> map;
    public static final iu5 Companion = new iu5();
    private static final KSerializer[] $childSerializers = {new f7a(srg.a, rnf.a)};

    public /* synthetic */ DefaultStateKeeperDispatcher$SavedState(int i, Map map, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.map = map;
        } else {
            gvj.f(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final Map<String, SerializableContainer> getMap() {
        return this.map;
    }

    public DefaultStateKeeperDispatcher$SavedState(Map<String, SerializableContainer> map) {
        map.getClass();
        this.map = map;
    }
}
