package com.anthropic.claude.api.bootstrap;

import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ModelId;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ppb;
import defpackage.ulb;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/bootstrap/ModelSelectorStateBody;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "Lcom/anthropic/claude/api/model/ThinkingState;", "thinking", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/bootstrap/ModelSelectorStateBody;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-a6HIKFk", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/model/ThinkingState;", "copy-r6p41GU", "(Ljava/lang/String;Lcom/anthropic/claude/api/model/ThinkingState;)Lcom/anthropic/claude/api/bootstrap/ModelSelectorStateBody;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel-a6HIKFk", "Lcom/anthropic/claude/api/model/ThinkingState;", "getThinking", "Companion", "opb", "ppb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelSelectorStateBody {
    public static final int $stable = 0;
    private final String model;
    private final ThinkingState thinking;
    public static final ppb Companion = new ppb();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ulb(21))};

    private /* synthetic */ ModelSelectorStateBody(int i, String str, ThinkingState thinkingState, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
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

    /* JADX INFO: renamed from: copy-r6p41GU$default, reason: not valid java name */
    public static /* synthetic */ ModelSelectorStateBody m155copyr6p41GU$default(ModelSelectorStateBody modelSelectorStateBody, String str, ThinkingState thinkingState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelSelectorStateBody.model;
        }
        if ((i & 2) != 0) {
            thinkingState = modelSelectorStateBody.thinking;
        }
        return modelSelectorStateBody.m157copyr6p41GU(str, thinkingState);
    }

    public static final /* synthetic */ void write$Self$api(ModelSelectorStateBody self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.model != null) {
            vnb vnbVar = vnb.a;
            String str = self.model;
            output.B(serialDesc, 0, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.thinking == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.thinking);
    }

    /* JADX INFO: renamed from: component1-a6HIKFk, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ThinkingState getThinking() {
        return this.thinking;
    }

    /* JADX INFO: renamed from: copy-r6p41GU, reason: not valid java name */
    public final ModelSelectorStateBody m157copyr6p41GU(String model, ThinkingState thinking) {
        return new ModelSelectorStateBody(model, thinking, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.api.bootstrap.ModelSelectorStateBody
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.bootstrap.ModelSelectorStateBody r5 = (com.anthropic.claude.api.bootstrap.ModelSelectorStateBody) r5
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            com.anthropic.claude.api.model.ThinkingState r4 = r4.thinking
            com.anthropic.claude.api.model.ThinkingState r5 = r5.thinking
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.bootstrap.ModelSelectorStateBody.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m158getModela6HIKFk() {
        return this.model;
    }

    public final ThinkingState getThinking() {
        return this.thinking;
    }

    public int hashCode() {
        String str = this.model;
        int iM1062hashCodeimpl = (str == null ? 0 : ModelId.m1062hashCodeimpl(str)) * 31;
        ThinkingState thinkingState = this.thinking;
        return iM1062hashCodeimpl + (thinkingState != null ? thinkingState.hashCode() : 0);
    }

    public String toString() {
        String str = this.model;
        return "ModelSelectorStateBody(model=" + (str == null ? "null" : ModelId.m1063toStringimpl(str)) + ", thinking=" + this.thinking + ")";
    }

    public /* synthetic */ ModelSelectorStateBody(String str, ThinkingState thinkingState, mq5 mq5Var) {
        this(str, thinkingState);
    }

    public /* synthetic */ ModelSelectorStateBody(int i, String str, ThinkingState thinkingState, vnf vnfVar, mq5 mq5Var) {
        this(i, str, thinkingState, vnfVar);
    }

    private ModelSelectorStateBody(String str, ThinkingState thinkingState) {
        this.model = str;
        this.thinking = thinkingState;
    }

    public /* synthetic */ ModelSelectorStateBody(String str, ThinkingState thinkingState, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : thinkingState, null);
    }
}
