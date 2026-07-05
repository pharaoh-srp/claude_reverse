package com.anthropic.claude.models;

import com.anthropic.claude.types.strings.ModelId;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sng;
import defpackage.tng;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/models/StickyModelSelection;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "modelId", "", "isOverflow", "", "selectionTimestampMillis", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;JLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;JLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/StickyModelSelection;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "()Ljava/lang/Boolean;", "component3", "()J", "copy--OUSveg", "(Ljava/lang/String;Ljava/lang/Boolean;J)Lcom/anthropic/claude/models/StickyModelSelection;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getModelId-i-4oh0I", "Ljava/lang/Boolean;", "J", "getSelectionTimestampMillis", "Companion", "sng", "tng", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StickyModelSelection {
    public static final int $stable = 0;
    public static final tng Companion = new tng();
    private final Boolean isOverflow;
    private final String modelId;
    private final long selectionTimestampMillis;

    private /* synthetic */ StickyModelSelection(int i, String str, Boolean bool, long j, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, sng.a.getDescriptor());
            throw null;
        }
        this.modelId = str;
        this.isOverflow = bool;
        if ((i & 4) == 0) {
            this.selectionTimestampMillis = 0L;
        } else {
            this.selectionTimestampMillis = j;
        }
    }

    /* JADX INFO: renamed from: copy--OUSveg$default, reason: not valid java name */
    public static /* synthetic */ StickyModelSelection m765copyOUSveg$default(StickyModelSelection stickyModelSelection, String str, Boolean bool, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickyModelSelection.modelId;
        }
        if ((i & 2) != 0) {
            bool = stickyModelSelection.isOverflow;
        }
        if ((i & 4) != 0) {
            j = stickyModelSelection.selectionTimestampMillis;
        }
        return stickyModelSelection.m767copyOUSveg(str, bool, j);
    }

    public static final /* synthetic */ void write$Self$models(StickyModelSelection self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.modelId));
        output.B(serialDesc, 1, zt1.a, self.isOverflow);
        if (!output.E(serialDesc) && self.selectionTimestampMillis == 0) {
            return;
        }
        output.D(serialDesc, 2, self.selectionTimestampMillis);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getModelId() {
        return this.modelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsOverflow() {
        return this.isOverflow;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSelectionTimestampMillis() {
        return this.selectionTimestampMillis;
    }

    /* JADX INFO: renamed from: copy--OUSveg, reason: not valid java name */
    public final StickyModelSelection m767copyOUSveg(String modelId, Boolean isOverflow, long selectionTimestampMillis) {
        modelId.getClass();
        return new StickyModelSelection(modelId, isOverflow, selectionTimestampMillis, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyModelSelection)) {
            return false;
        }
        StickyModelSelection stickyModelSelection = (StickyModelSelection) other;
        return ModelId.m1061equalsimpl0(this.modelId, stickyModelSelection.modelId) && x44.r(this.isOverflow, stickyModelSelection.isOverflow) && this.selectionTimestampMillis == stickyModelSelection.selectionTimestampMillis;
    }

    /* JADX INFO: renamed from: getModelId-i-4oh0I, reason: not valid java name */
    public final String m768getModelIdi4oh0I() {
        return this.modelId;
    }

    public final long getSelectionTimestampMillis() {
        return this.selectionTimestampMillis;
    }

    public int hashCode() {
        int iM1062hashCodeimpl = ModelId.m1062hashCodeimpl(this.modelId) * 31;
        Boolean bool = this.isOverflow;
        return Long.hashCode(this.selectionTimestampMillis) + ((iM1062hashCodeimpl + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final Boolean isOverflow() {
        return this.isOverflow;
    }

    public String toString() {
        String strM1063toStringimpl = ModelId.m1063toStringimpl(this.modelId);
        Boolean bool = this.isOverflow;
        long j = this.selectionTimestampMillis;
        StringBuilder sb = new StringBuilder("StickyModelSelection(modelId=");
        sb.append(strM1063toStringimpl);
        sb.append(", isOverflow=");
        sb.append(bool);
        sb.append(", selectionTimestampMillis=");
        return grc.r(j, ")", sb);
    }

    public /* synthetic */ StickyModelSelection(String str, Boolean bool, long j, mq5 mq5Var) {
        this(str, bool, j);
    }

    public /* synthetic */ StickyModelSelection(int i, String str, Boolean bool, long j, vnf vnfVar, mq5 mq5Var) {
        this(i, str, bool, j, vnfVar);
    }

    private StickyModelSelection(String str, Boolean bool, long j) {
        str.getClass();
        this.modelId = str;
        this.isOverflow = bool;
        this.selectionTimestampMillis = j;
    }

    public /* synthetic */ StickyModelSelection(String str, Boolean bool, long j, int i, mq5 mq5Var) {
        this(str, bool, (i & 4) != 0 ? 0L : j, null);
    }
}
