package com.arkivanov.decompose.router.children;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n5i;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/arkivanov/decompose/router/children/TransientSavedState;", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/Object;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/children/TransientSavedState;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "Companion", "com/arkivanov/decompose/router/children/d", "n5i", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
final class TransientSavedState {
    public static final n5i Companion = new n5i();
    private final Object value;

    public /* synthetic */ TransientSavedState(Object obj, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : obj);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$decompose_release(TransientSavedState self, vd4 output, SerialDescriptor serialDesc) {
    }

    public final Object getValue() {
        return this.value;
    }

    public /* synthetic */ TransientSavedState(int i, vnf vnfVar) {
        this.value = null;
    }

    public TransientSavedState(Object obj) {
        this.value = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransientSavedState() {
        mq5 mq5Var = null;
        this(mq5Var, 1, mq5Var);
    }
}
