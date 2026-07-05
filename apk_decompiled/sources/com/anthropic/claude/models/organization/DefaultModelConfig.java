package com.anthropic.claude.models.organization;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qs5;
import defpackage.rs5;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/models/organization/DefaultModelConfig;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/DefaultModelConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-a6HIKFk", "()Ljava/lang/String;", "component1", "copy-gqG_w4A", "(Ljava/lang/String;)Lcom/anthropic/claude/models/organization/DefaultModelConfig;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModel-a6HIKFk", "Companion", "qs5", "rs5", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DefaultModelConfig {
    public static final int $stable = 0;
    public static final rs5 Companion = new rs5();
    private final String model;

    private /* synthetic */ DefaultModelConfig(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.model = str;
        } else {
            gvj.f(i, 1, qs5.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: copy-gqG_w4A$default, reason: not valid java name */
    public static /* synthetic */ DefaultModelConfig m769copygqG_w4A$default(DefaultModelConfig defaultModelConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultModelConfig.model;
        }
        return defaultModelConfig.m771copygqG_w4A(str);
    }

    public static final /* synthetic */ void write$Self$models(DefaultModelConfig self, vd4 output, SerialDescriptor serialDesc) {
        vnb vnbVar = vnb.a;
        String str = self.model;
        output.B(serialDesc, 0, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1-a6HIKFk, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: copy-gqG_w4A, reason: not valid java name */
    public final DefaultModelConfig m771copygqG_w4A(String model) {
        return new DefaultModelConfig(model, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.anthropic.claude.models.organization.DefaultModelConfig
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.models.organization.DefaultModelConfig r4 = (com.anthropic.claude.models.organization.DefaultModelConfig) r4
            java.lang.String r3 = r3.model
            java.lang.String r4 = r4.model
            if (r3 != 0) goto L18
            if (r4 != 0) goto L16
            r3 = r0
            goto L1f
        L16:
            r3 = r2
            goto L1f
        L18:
            if (r4 != 0) goto L1b
            goto L16
        L1b:
            boolean r3 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r4)
        L1f:
            if (r3 != 0) goto L22
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.models.organization.DefaultModelConfig.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m772getModela6HIKFk() {
        return this.model;
    }

    public int hashCode() {
        String str = this.model;
        if (str == null) {
            return 0;
        }
        return ModelId.m1062hashCodeimpl(str);
    }

    public String toString() {
        String str = this.model;
        return ij0.j("DefaultModelConfig(model=", str == null ? "null" : ModelId.m1063toStringimpl(str), ")");
    }

    public /* synthetic */ DefaultModelConfig(String str, mq5 mq5Var) {
        this(str);
    }

    public /* synthetic */ DefaultModelConfig(int i, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, str, vnfVar);
    }

    private DefaultModelConfig(String str) {
        this.model = str;
    }
}
