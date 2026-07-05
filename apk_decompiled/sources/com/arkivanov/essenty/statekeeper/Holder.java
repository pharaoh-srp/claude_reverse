package com.arkivanov.essenty.statekeeper;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.tn8;
import defpackage.vnf;
import defpackage.wn9;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0002:\u0002 !B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJG\u0010\u0015\u001a\u00020\u0012\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0019\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e\"\u0004\b\u001b\u0010\u0005¨\u0006\""}, d2 = {"Lcom/arkivanov/essenty/statekeeper/Holder;", "T", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/Object;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Object;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$state_keeper_release", "(Lcom/arkivanov/essenty/statekeeper/Holder;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "thisRef", "Lwn9;", "property", "getValue", "(Ljava/lang/Object;Lwn9;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lwn9;Ljava/lang/Object;)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Companion", "com/arkivanov/essenty/statekeeper/c", "tn8", "state-keeper_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class Holder<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final tn8 Companion = new tn8();
    private volatile T value;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.essenty.statekeeper.Holder", null, 1);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Holder(int i, Object obj, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.value = obj;
        } else {
            gvj.f(i, 1, $cachedDescriptor);
            throw null;
        }
    }

    public T getValue(Object thisRef, wn9 property) {
        property.getClass();
        return this.value;
    }

    public void setValue(Object thisRef, wn9 property, T value) {
        property.getClass();
        this.value = value;
    }

    public final T getValue() {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
    }

    public Holder(T t) {
        this.value = t;
    }
}
