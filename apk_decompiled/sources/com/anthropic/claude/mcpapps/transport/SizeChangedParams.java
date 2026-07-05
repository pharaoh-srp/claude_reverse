package com.anthropic.claude.mcpapps.transport;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.s8g;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/SizeChangedParams;", "", "", "height", "width", "<init>", "(ILjava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/SizeChangedParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/anthropic/claude/mcpapps/transport/SizeChangedParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "Ljava/lang/Integer;", "getWidth", "Companion", "r8g", "s8g", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SizeChangedParams {
    public static final int $stable = 0;
    public static final s8g Companion = new s8g();
    private final int height;
    private final Integer width;

    public /* synthetic */ SizeChangedParams(int i, int i2, Integer num, vnf vnfVar) {
        this.height = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
    }

    public static /* synthetic */ SizeChangedParams copy$default(SizeChangedParams sizeChangedParams, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sizeChangedParams.height;
        }
        if ((i2 & 2) != 0) {
            num = sizeChangedParams.width;
        }
        return sizeChangedParams.copy(i, num);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(SizeChangedParams self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.height != 0) {
            output.l(0, self.height, serialDesc);
        }
        if (!output.E(serialDesc) && self.width == null) {
            return;
        }
        output.B(serialDesc, 1, e79.a, self.width);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    public final SizeChangedParams copy(int height, Integer width) {
        return new SizeChangedParams(height, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeChangedParams)) {
            return false;
        }
        SizeChangedParams sizeChangedParams = (SizeChangedParams) other;
        return this.height == sizeChangedParams.height && x44.r(this.width, sizeChangedParams.width);
    }

    public final int getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.height) * 31;
        Integer num = this.width;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "SizeChangedParams(height=" + this.height + ", width=" + this.width + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeChangedParams() {
        this(0, (Integer) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public SizeChangedParams(int i, Integer num) {
        this.height = i;
        this.width = num;
    }

    public /* synthetic */ SizeChangedParams(int i, Integer num, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : num);
    }
}
