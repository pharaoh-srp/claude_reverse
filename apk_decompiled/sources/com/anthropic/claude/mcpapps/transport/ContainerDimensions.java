package com.anthropic.claude.mcpapps.transport;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pm4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J@\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0017¨\u0006."}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;", "", "", "width", "maxWidth", "height", "maxHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getWidth", "getMaxWidth", "getHeight", "getMaxHeight", "Companion", "om4", "pm4", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContainerDimensions {
    public static final int $stable = 0;
    public static final pm4 Companion = new pm4();
    private final Integer height;
    private final Integer maxHeight;
    private final Integer maxWidth;
    private final Integer width;

    public /* synthetic */ ContainerDimensions(int i, Integer num, Integer num2, Integer num3, Integer num4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 2) == 0) {
            this.maxWidth = null;
        } else {
            this.maxWidth = num2;
        }
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = num3;
        }
        if ((i & 8) == 0) {
            this.maxHeight = null;
        } else {
            this.maxHeight = num4;
        }
    }

    public static /* synthetic */ ContainerDimensions copy$default(ContainerDimensions containerDimensions, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = containerDimensions.width;
        }
        if ((i & 2) != 0) {
            num2 = containerDimensions.maxWidth;
        }
        if ((i & 4) != 0) {
            num3 = containerDimensions.height;
        }
        if ((i & 8) != 0) {
            num4 = containerDimensions.maxHeight;
        }
        return containerDimensions.copy(num, num2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(ContainerDimensions self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.width != null) {
            output.B(serialDesc, 0, e79.a, self.width);
        }
        if (output.E(serialDesc) || self.maxWidth != null) {
            output.B(serialDesc, 1, e79.a, self.maxWidth);
        }
        if (output.E(serialDesc) || self.height != null) {
            output.B(serialDesc, 2, e79.a, self.height);
        }
        if (!output.E(serialDesc) && self.maxHeight == null) {
            return;
        }
        output.B(serialDesc, 3, e79.a, self.maxHeight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final ContainerDimensions copy(Integer width, Integer maxWidth, Integer height, Integer maxHeight) {
        return new ContainerDimensions(width, maxWidth, height, maxHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerDimensions)) {
            return false;
        }
        ContainerDimensions containerDimensions = (ContainerDimensions) other;
        return x44.r(this.width, containerDimensions.width) && x44.r(this.maxWidth, containerDimensions.maxWidth) && x44.r(this.height, containerDimensions.height) && x44.r(this.maxHeight, containerDimensions.maxHeight);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxWidth;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxHeight;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "ContainerDimensions(width=" + this.width + ", maxWidth=" + this.maxWidth + ", height=" + this.height + ", maxHeight=" + this.maxHeight + ")";
    }

    public ContainerDimensions() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (mq5) null);
    }

    public ContainerDimensions(Integer num, Integer num2, Integer num3, Integer num4) {
        this.width = num;
        this.maxWidth = num2;
        this.height = num3;
        this.maxHeight = num4;
    }

    public /* synthetic */ ContainerDimensions(Integer num, Integer num2, Integer num3, Integer num4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
