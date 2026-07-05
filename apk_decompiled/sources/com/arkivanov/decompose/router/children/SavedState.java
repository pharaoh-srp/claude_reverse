package com.arkivanov.decompose.router.children;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.gvj;
import defpackage.j5f;
import defpackage.jf3;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rnf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/arkivanov/decompose/router/children/SavedState;", "", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "navState", "", "Lcom/arkivanov/decompose/router/children/ChildrenNavigator$SavedChildState;", "childState", "<init>", "(Lcom/arkivanov/essenty/statekeeper/SerializableContainer;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/arkivanov/essenty/statekeeper/SerializableContainer;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/children/SavedState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "getNavState", "()Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "Ljava/util/List;", "getChildState", "()Ljava/util/List;", "Companion", "com/arkivanov/decompose/router/children/c", "j5f", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class SavedState {
    private final List<ChildrenNavigator$SavedChildState> childState;
    private final SerializableContainer navState;
    public static final j5f Companion = new j5f();
    private static final KSerializer[] $childSerializers = {null, new uo0(jf3.a, 0)};

    public /* synthetic */ SavedState(int i, SerializableContainer serializableContainer, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, c.a.getDescriptor());
            throw null;
        }
        this.navState = serializableContainer;
        this.childState = list;
    }

    public static final /* synthetic */ void write$Self$decompose_release(SavedState self, vd4 output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.r(serialDesc, 0, rnf.a, self.navState);
        output.r(serialDesc, 1, kSerializerArr[1], self.childState);
    }

    public final List<ChildrenNavigator$SavedChildState> getChildState() {
        return this.childState;
    }

    public final SerializableContainer getNavState() {
        return this.navState;
    }

    public SavedState(SerializableContainer serializableContainer, List<ChildrenNavigator$SavedChildState> list) {
        serializableContainer.getClass();
        list.getClass();
        this.navState = serializableContainer;
        this.childState = list;
    }
}
