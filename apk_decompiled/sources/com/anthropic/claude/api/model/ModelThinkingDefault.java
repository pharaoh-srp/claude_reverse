package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vpb;
import defpackage.w1a;
import defpackage.wpb;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/model/ModelThinkingDefault;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "id", "Lcom/anthropic/claude/api/model/ThinkingState;", "thinking", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelThinkingDefault;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/model/ThinkingState;", "copy-xe3n0YA", "(Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;)Lcom/anthropic/claude/api/model/ModelThinkingDefault;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId-i-4oh0I", "Lcom/anthropic/claude/api/model/ThinkingState;", "getThinking", "Companion", "vpb", "wpb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelThinkingDefault {
    public static final int $stable = 0;
    private final String id;
    private final ThinkingState thinking;
    public static final wpb Companion = new wpb();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new oob(9))};

    private /* synthetic */ ModelThinkingDefault(int i, String str, ThinkingState thinkingState, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, vpb.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.thinking = null;
        } else {
            this.thinking = thinkingState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ThinkingState.Companion.serializer();
    }

    /* JADX INFO: renamed from: copy-xe3n0YA$default, reason: not valid java name */
    public static /* synthetic */ ModelThinkingDefault m379copyxe3n0YA$default(ModelThinkingDefault modelThinkingDefault, String str, ThinkingState thinkingState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelThinkingDefault.id;
        }
        if ((i & 2) != 0) {
            thinkingState = modelThinkingDefault.thinking;
        }
        return modelThinkingDefault.m381copyxe3n0YA(str, thinkingState);
    }

    public static final /* synthetic */ void write$Self$api(ModelThinkingDefault self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.id));
        if (!output.E(serialDesc) && self.thinking == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.thinking);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ThinkingState getThinking() {
        return this.thinking;
    }

    /* JADX INFO: renamed from: copy-xe3n0YA, reason: not valid java name */
    public final ModelThinkingDefault m381copyxe3n0YA(String id, ThinkingState thinking) {
        id.getClass();
        return new ModelThinkingDefault(id, thinking, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelThinkingDefault)) {
            return false;
        }
        ModelThinkingDefault modelThinkingDefault = (ModelThinkingDefault) other;
        return ModelId.m1061equalsimpl0(this.id, modelThinkingDefault.id) && x44.r(this.thinking, modelThinkingDefault.thinking);
    }

    /* JADX INFO: renamed from: getId-i-4oh0I, reason: not valid java name */
    public final String m382getIdi4oh0I() {
        return this.id;
    }

    public final ThinkingState getThinking() {
        return this.thinking;
    }

    public int hashCode() {
        int iM1062hashCodeimpl = ModelId.m1062hashCodeimpl(this.id) * 31;
        ThinkingState thinkingState = this.thinking;
        return iM1062hashCodeimpl + (thinkingState == null ? 0 : thinkingState.hashCode());
    }

    public String toString() {
        return "ModelThinkingDefault(id=" + ModelId.m1063toStringimpl(this.id) + ", thinking=" + this.thinking + ")";
    }

    public /* synthetic */ ModelThinkingDefault(String str, ThinkingState thinkingState, mq5 mq5Var) {
        this(str, thinkingState);
    }

    public /* synthetic */ ModelThinkingDefault(int i, String str, ThinkingState thinkingState, vnf vnfVar, mq5 mq5Var) {
        this(i, str, thinkingState, vnfVar);
    }

    private ModelThinkingDefault(String str, ThinkingState thinkingState) {
        str.getClass();
        this.id = str;
        this.thinking = thinkingState;
    }

    public /* synthetic */ ModelThinkingDefault(String str, ThinkingState thinkingState, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : thinkingState, null);
    }
}
