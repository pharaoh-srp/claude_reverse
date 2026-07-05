package com.arkivanov.decompose.router.pages;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.unf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001e*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0002\u001f B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0017\u001a\u00020\u0014\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/arkivanov/decompose/router/pages/SerializablePages;", "", "C", "", "items", "", "selectedIndex", "<init>", "(Ljava/util/List;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/pages/SerializablePages;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getSelectedIndex", "()I", "Companion", "com/arkivanov/decompose/router/pages/a", "unf", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class SerializablePages<C> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final unf Companion = new unf();
    private final List<C> items;
    private final int selectedIndex;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.pages.SerializablePages", null, 2);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("selectedIndex", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ SerializablePages(int i, List list, int i2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, $cachedDescriptor);
            throw null;
        }
        this.items = list;
        this.selectedIndex = i2;
    }

    public static final /* synthetic */ void write$Self$decompose_release(SerializablePages self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        output.r(serialDesc, 0, new uo0(typeSerial0, 0), self.items);
        output.l(1, self.selectedIndex, serialDesc);
    }

    public final List<C> getItems() {
        return this.items;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerializablePages(List<? extends C> list, int i) {
        list.getClass();
        this.items = list;
        this.selectedIndex = i;
    }
}
