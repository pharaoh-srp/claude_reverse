package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.aob;
import defpackage.bob;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ulb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ModelInfo;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "current", "", "available", "<init>", "(Ljava/lang/String;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ModelInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-a6HIKFk", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "copy-r6p41GU", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/conway/protocol/ModelInfo;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrent-a6HIKFk", "getCurrent-a6HIKFk$annotations", "()V", "Ljava/util/List;", "getAvailable", "Companion", "aob", "bob", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelInfo {
    public static final int $stable = 8;
    private final List<ModelId> available;
    private final String current;
    public static final bob Companion = new bob();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ulb(19))};

    private /* synthetic */ ModelInfo(int i, String str, List list, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, aob.a.getDescriptor());
            throw null;
        }
        this.current = str;
        this.available = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(vnb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-r6p41GU$default, reason: not valid java name */
    public static /* synthetic */ ModelInfo m742copyr6p41GU$default(ModelInfo modelInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelInfo.current;
        }
        if ((i & 2) != 0) {
            list = modelInfo.available;
        }
        return modelInfo.m745copyr6p41GU(str, list);
    }

    /* JADX INFO: renamed from: getCurrent-a6HIKFk$annotations, reason: not valid java name */
    public static /* synthetic */ void m743getCurrenta6HIKFk$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ModelInfo self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        vnb vnbVar = vnb.a;
        String str = self.current;
        output.B(serialDesc, 0, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.available);
    }

    /* JADX INFO: renamed from: component1-a6HIKFk, reason: not valid java name and from getter */
    public final String getCurrent() {
        return this.current;
    }

    public final List<ModelId> component2() {
        return this.available;
    }

    /* JADX INFO: renamed from: copy-r6p41GU, reason: not valid java name */
    public final ModelInfo m745copyr6p41GU(String current, List<ModelId> available) {
        available.getClass();
        return new ModelInfo(current, available, null);
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
            boolean r1 = r5 instanceof com.anthropic.claude.conway.protocol.ModelInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.conway.protocol.ModelInfo r5 = (com.anthropic.claude.conway.protocol.ModelInfo) r5
            java.lang.String r1 = r4.current
            java.lang.String r3 = r5.current
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
            java.util.List<com.anthropic.claude.types.strings.ModelId> r4 = r4.available
            java.util.List<com.anthropic.claude.types.strings.ModelId> r5 = r5.available
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.conway.protocol.ModelInfo.equals(java.lang.Object):boolean");
    }

    public final List<ModelId> getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: getCurrent-a6HIKFk, reason: not valid java name */
    public final String m746getCurrenta6HIKFk() {
        return this.current;
    }

    public int hashCode() {
        String str = this.current;
        return this.available.hashCode() + ((str == null ? 0 : ModelId.m1062hashCodeimpl(str)) * 31);
    }

    public String toString() {
        String str = this.current;
        return y6a.o("ModelInfo(current=", str == null ? "null" : ModelId.m1063toStringimpl(str), ", available=", this.available, ")");
    }

    public /* synthetic */ ModelInfo(String str, List list, mq5 mq5Var) {
        this(str, list);
    }

    public /* synthetic */ ModelInfo(int i, String str, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, list, vnfVar);
    }

    private ModelInfo(String str, List<ModelId> list) {
        list.getClass();
        this.current = str;
        this.available = list;
    }
}
