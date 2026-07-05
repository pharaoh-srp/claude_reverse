package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pnb;
import defpackage.qnb;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ModelFallback;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "fallbackModelName", "", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ModelFallback;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "copy-xe3n0YA", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/ModelFallback;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFallbackModelName-i-4oh0I", "getDisplayName", "Companion", "pnb", "qnb", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelFallback {
    public static final int $stable = 0;
    public static final qnb Companion = new qnb();
    private final String displayName;
    private final String fallbackModelName;

    private /* synthetic */ ModelFallback(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, pnb.a.getDescriptor());
            throw null;
        }
        this.fallbackModelName = str;
        this.displayName = str2;
    }

    /* JADX INFO: renamed from: copy-xe3n0YA$default, reason: not valid java name */
    public static /* synthetic */ ModelFallback m777copyxe3n0YA$default(ModelFallback modelFallback, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelFallback.fallbackModelName;
        }
        if ((i & 2) != 0) {
            str2 = modelFallback.displayName;
        }
        return modelFallback.m779copyxe3n0YA(str, str2);
    }

    public static final /* synthetic */ void write$Self$models(ModelFallback self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.fallbackModelName));
        output.q(serialDesc, 1, self.displayName);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getFallbackModelName() {
        return this.fallbackModelName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: copy-xe3n0YA, reason: not valid java name */
    public final ModelFallback m779copyxe3n0YA(String fallbackModelName, String displayName) {
        fallbackModelName.getClass();
        displayName.getClass();
        return new ModelFallback(fallbackModelName, displayName, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelFallback)) {
            return false;
        }
        ModelFallback modelFallback = (ModelFallback) other;
        return ModelId.m1061equalsimpl0(this.fallbackModelName, modelFallback.fallbackModelName) && x44.r(this.displayName, modelFallback.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: getFallbackModelName-i-4oh0I, reason: not valid java name */
    public final String m780getFallbackModelNamei4oh0I() {
        return this.fallbackModelName;
    }

    public int hashCode() {
        return this.displayName.hashCode() + (ModelId.m1062hashCodeimpl(this.fallbackModelName) * 31);
    }

    public String toString() {
        return ij0.l("ModelFallback(fallbackModelName=", ModelId.m1063toStringimpl(this.fallbackModelName), ", displayName=", this.displayName, ")");
    }

    public /* synthetic */ ModelFallback(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ ModelFallback(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private ModelFallback(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.fallbackModelName = str;
        this.displayName = str2;
    }
}
