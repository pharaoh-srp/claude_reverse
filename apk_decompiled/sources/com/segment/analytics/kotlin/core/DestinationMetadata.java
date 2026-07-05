package com.segment.analytics.kotlin.core;

import defpackage.lm6;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017JF\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010'R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010'¨\u0006."}, d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "", "", "", "bundled", "unbundled", "bundledIds", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/DestinationMetadata;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBundled", "setBundled", "(Ljava/util/List;)V", "getUnbundled", "setUnbundled", "getBundledIds", "setBundledIds", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class DestinationMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private List<String> bundled;
    private List<String> bundledIds;
    private List<String> unbundled;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return DestinationMetadata$$serializer.INSTANCE;
        }
    }

    @lz5
    public /* synthetic */ DestinationMetadata(int i, List list, List list2, List list3, vnf vnfVar) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.bundled = lm6Var;
        } else {
            this.bundled = list;
        }
        if ((i & 2) == 0) {
            this.unbundled = lm6Var;
        } else {
            this.unbundled = list2;
        }
        if ((i & 4) == 0) {
            this.bundledIds = lm6Var;
        } else {
            this.bundledIds = list3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DestinationMetadata copy$default(DestinationMetadata destinationMetadata, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = destinationMetadata.bundled;
        }
        if ((i & 2) != 0) {
            list2 = destinationMetadata.unbundled;
        }
        if ((i & 4) != 0) {
            list3 = destinationMetadata.bundledIds;
        }
        return destinationMetadata.copy(list, list2, list3);
    }

    public static final void write$Self(DestinationMetadata self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.bundled, lm6Var)) {
            output.B(serialDesc, 0, new uo0(srg.a, 0), self.bundled);
        }
        if (output.E(serialDesc) || !x44.r(self.unbundled, lm6Var)) {
            output.B(serialDesc, 1, new uo0(srg.a, 0), self.unbundled);
        }
        if (!output.E(serialDesc) && x44.r(self.bundledIds, lm6Var)) {
            return;
        }
        output.B(serialDesc, 2, new uo0(srg.a, 0), self.bundledIds);
    }

    public final List<String> component1() {
        return this.bundled;
    }

    public final List<String> component2() {
        return this.unbundled;
    }

    public final List<String> component3() {
        return this.bundledIds;
    }

    public final DestinationMetadata copy(List<String> bundled, List<String> unbundled, List<String> bundledIds) {
        return new DestinationMetadata(bundled, unbundled, bundledIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DestinationMetadata)) {
            return false;
        }
        DestinationMetadata destinationMetadata = (DestinationMetadata) other;
        return x44.r(this.bundled, destinationMetadata.bundled) && x44.r(this.unbundled, destinationMetadata.unbundled) && x44.r(this.bundledIds, destinationMetadata.bundledIds);
    }

    public final List<String> getBundled() {
        return this.bundled;
    }

    public final List<String> getBundledIds() {
        return this.bundledIds;
    }

    public final List<String> getUnbundled() {
        return this.unbundled;
    }

    public int hashCode() {
        List<String> list = this.bundled;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.unbundled;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.bundledIds;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final void setBundled(List<String> list) {
        this.bundled = list;
    }

    public final void setBundledIds(List<String> list) {
        this.bundledIds = list;
    }

    public final void setUnbundled(List<String> list) {
        this.unbundled = list;
    }

    public String toString() {
        return "DestinationMetadata(bundled=" + this.bundled + ", unbundled=" + this.unbundled + ", bundledIds=" + this.bundledIds + ')';
    }

    public DestinationMetadata() {
        this((List) null, (List) null, (List) null, 7, (mq5) null);
    }

    public DestinationMetadata(List<String> list, List<String> list2, List<String> list3) {
        this.bundled = list;
        this.unbundled = list2;
        this.bundledIds = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DestinationMetadata(List list, List list2, List list3, int i, mq5 mq5Var) {
        int i2 = i & 1;
        lm6 lm6Var = lm6.E;
        this(i2 != 0 ? lm6Var : list, (i & 2) != 0 ? lm6Var : list2, (i & 4) != 0 ? lm6Var : list3);
    }
}
