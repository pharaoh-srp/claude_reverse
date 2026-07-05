package com.arkivanov.decompose.router.items;

import defpackage.f7a;
import defpackage.lm6;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nc9;
import defpackage.nm6;
import defpackage.oc9;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0006./B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJG\u0010\u0019\u001a\u00020\u0016\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/arkivanov/decompose/router/items/Items;", "", "C", "", "items", "", "Lnc9;", "activeItems", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/items/Items;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/arkivanov/decompose/router/items/Items;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/util/Map;", "getActiveItems", "Companion", "mc9", "oc9", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
public final /* data */ class Items<C> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final oc9 Companion = new oc9();
    private final Map<C, nc9> activeItems;
    private final List<C> items;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.items.Items", null, 2);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("activeItems", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ Items(int i, List list, Map map, vnf vnfVar) {
        this.items = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.activeItems = nm6.E;
        } else {
            this.activeItems = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Items copy$default(Items items, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = items.items;
        }
        if ((i & 2) != 0) {
            map = items.activeItems;
        }
        return items.copy(list, map);
    }

    public static final void write$Self$decompose_release(Items self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        if (output.E(serialDesc) || !x44.r(self.items, lm6.E)) {
            output.r(serialDesc, 0, new uo0(typeSerial0, 0), self.items);
        }
        if (!output.E(serialDesc) && x44.r(self.activeItems, nm6.E)) {
            return;
        }
        nc9[] nc9VarArrValues = nc9.values();
        nc9VarArrValues.getClass();
        output.r(serialDesc, 1, new f7a(typeSerial0, new lq6("com.arkivanov.decompose.router.items.Items.ActiveLifecycleState", (Enum[]) nc9VarArrValues)), self.activeItems);
    }

    public final List<C> component1() {
        return this.items;
    }

    public final Map<C, nc9> component2() {
        return this.activeItems;
    }

    public final Items<C> copy(List<? extends C> items, Map<C, ? extends nc9> activeItems) {
        items.getClass();
        activeItems.getClass();
        return new Items<>(items, activeItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Items)) {
            return false;
        }
        Items items = (Items) other;
        return x44.r(this.items, items.items) && x44.r(this.activeItems, items.activeItems);
    }

    public final Map<C, nc9> getActiveItems() {
        return this.activeItems;
    }

    public final List<C> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.activeItems.hashCode() + (this.items.hashCode() * 31);
    }

    public String toString() {
        return "Items(items=" + this.items + ", activeItems=" + this.activeItems + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Items() {
        this((List) null, (Map) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Items(List<? extends C> list, Map<C, ? extends nc9> map) {
        list.getClass();
        map.getClass();
        this.items = list;
        this.activeItems = map;
    }

    public /* synthetic */ Items(List list, Map map, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? nm6.E : map);
    }
}
