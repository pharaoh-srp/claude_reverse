package com.arkivanov.decompose.router.children;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.gvj;
import defpackage.jf3;
import defpackage.kf3;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rnf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"com/arkivanov/decompose/router/children/ChildrenNavigator$SavedChildState", "", "", "key", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "savedState", "<init>", "(Ljava/lang/String;Lcom/arkivanov/essenty/statekeeper/SerializableContainer;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/arkivanov/essenty/statekeeper/SerializableContainer;Lvnf;)V", "Lcom/arkivanov/decompose/router/children/ChildrenNavigator$SavedChildState;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/children/ChildrenNavigator$SavedChildState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "copy", "(Ljava/lang/String;Lcom/arkivanov/essenty/statekeeper/SerializableContainer;)Lcom/arkivanov/decompose/router/children/ChildrenNavigator$SavedChildState;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lcom/arkivanov/essenty/statekeeper/SerializableContainer;", "getSavedState", "Companion", "jf3", "kf3", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
public final /* data */ class ChildrenNavigator$SavedChildState {
    public static final kf3 Companion = new kf3();
    private final String key;
    private final SerializableContainer savedState;

    public /* synthetic */ ChildrenNavigator$SavedChildState(int i, String str, SerializableContainer serializableContainer, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, jf3.a.getDescriptor());
            throw null;
        }
        this.key = str;
        this.savedState = serializableContainer;
    }

    public static /* synthetic */ ChildrenNavigator$SavedChildState copy$default(ChildrenNavigator$SavedChildState childrenNavigator$SavedChildState, String str, SerializableContainer serializableContainer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = childrenNavigator$SavedChildState.key;
        }
        if ((i & 2) != 0) {
            serializableContainer = childrenNavigator$SavedChildState.savedState;
        }
        return childrenNavigator$SavedChildState.copy(str, serializableContainer);
    }

    public static final /* synthetic */ void write$Self$decompose_release(ChildrenNavigator$SavedChildState self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.key);
        output.B(serialDesc, 1, rnf.a, self.savedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SerializableContainer getSavedState() {
        return this.savedState;
    }

    public final ChildrenNavigator$SavedChildState copy(String key, SerializableContainer savedState) {
        key.getClass();
        return new ChildrenNavigator$SavedChildState(key, savedState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildrenNavigator$SavedChildState)) {
            return false;
        }
        ChildrenNavigator$SavedChildState childrenNavigator$SavedChildState = (ChildrenNavigator$SavedChildState) other;
        return x44.r(this.key, childrenNavigator$SavedChildState.key) && x44.r(this.savedState, childrenNavigator$SavedChildState.savedState);
    }

    public final String getKey() {
        return this.key;
    }

    public final SerializableContainer getSavedState() {
        return this.savedState;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        SerializableContainer serializableContainer = this.savedState;
        return iHashCode + (serializableContainer == null ? 0 : serializableContainer.hashCode());
    }

    public String toString() {
        return "SavedChildState(key=" + this.key + ", savedState=" + this.savedState + ')';
    }

    public ChildrenNavigator$SavedChildState(String str, SerializableContainer serializableContainer) {
        str.getClass();
        this.key = str;
        this.savedState = serializableContainer;
    }
}
