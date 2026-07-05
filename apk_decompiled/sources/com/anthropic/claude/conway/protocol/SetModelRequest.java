package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.swf;
import defpackage.twf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/conway/protocol/SetModelRequest;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/SetModelRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "copy-YWwWmQU", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/SetModelRequest;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel-i-4oh0I", "Companion", "swf", "twf", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SetModelRequest {
    public static final int $stable = 0;
    public static final twf Companion = new twf();
    private final String model;

    private /* synthetic */ SetModelRequest(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.model = str;
        } else {
            gvj.f(i, 1, swf.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: copy-YWwWmQU$default, reason: not valid java name */
    public static /* synthetic */ SetModelRequest m747copyYWwWmQU$default(SetModelRequest setModelRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setModelRequest.model;
        }
        return setModelRequest.m749copyYWwWmQU(str);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: copy-YWwWmQU, reason: not valid java name */
    public final SetModelRequest m749copyYWwWmQU(String model) {
        model.getClass();
        return new SetModelRequest(model, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetModelRequest) && ModelId.m1061equalsimpl0(this.model, ((SetModelRequest) other).model);
    }

    /* JADX INFO: renamed from: getModel-i-4oh0I, reason: not valid java name */
    public final String m750getModeli4oh0I() {
        return this.model;
    }

    public int hashCode() {
        return ModelId.m1062hashCodeimpl(this.model);
    }

    public String toString() {
        return ij0.j("SetModelRequest(model=", ModelId.m1063toStringimpl(this.model), ")");
    }

    public /* synthetic */ SetModelRequest(String str, mq5 mq5Var) {
        this(str);
    }

    public /* synthetic */ SetModelRequest(int i, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, str, vnfVar);
    }

    private SetModelRequest(String str) {
        str.getClass();
        this.model = str;
    }
}
