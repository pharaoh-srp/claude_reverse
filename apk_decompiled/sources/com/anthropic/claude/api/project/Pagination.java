package com.anthropic.claude.api.project;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.yoc;
import defpackage.zoc;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/project/Pagination;", "", "", "has_more", "", "limit", "offset", "total", "<init>", "(ZIII)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZIIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/Pagination;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "component4", "copy", "(ZIII)Lcom/anthropic/claude/api/project/Pagination;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHas_more", "I", "getLimit", "getOffset", "getTotal", "Companion", "yoc", "zoc", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Pagination {
    public static final int $stable = 0;
    public static final zoc Companion = new zoc();
    private final boolean has_more;
    private final int limit;
    private final int offset;
    private final int total;

    public /* synthetic */ Pagination(int i, boolean z, int i2, int i3, int i4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, yoc.a.getDescriptor());
            throw null;
        }
        this.has_more = z;
        this.limit = i2;
        this.offset = i3;
        this.total = i4;
    }

    public static /* synthetic */ Pagination copy$default(Pagination pagination, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = pagination.has_more;
        }
        if ((i4 & 2) != 0) {
            i = pagination.limit;
        }
        if ((i4 & 4) != 0) {
            i2 = pagination.offset;
        }
        if ((i4 & 8) != 0) {
            i3 = pagination.total;
        }
        return pagination.copy(z, i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$api(Pagination self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.has_more);
        output.l(1, self.limit, serialDesc);
        output.l(2, self.offset, serialDesc);
        output.l(3, self.total, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHas_more() {
        return this.has_more;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final Pagination copy(boolean has_more, int limit, int offset, int total) {
        return new Pagination(has_more, limit, offset, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pagination)) {
            return false;
        }
        Pagination pagination = (Pagination) other;
        return this.has_more == pagination.has_more && this.limit == pagination.limit && this.offset == pagination.offset && this.total == pagination.total;
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + vb7.c(this.offset, vb7.c(this.limit, Boolean.hashCode(this.has_more) * 31, 31), 31);
    }

    public String toString() {
        return "Pagination(has_more=" + this.has_more + ", limit=" + this.limit + ", offset=" + this.offset + ", total=" + this.total + ")";
    }

    public Pagination(boolean z, int i, int i2, int i3) {
        this.has_more = z;
        this.limit = i;
        this.offset = i2;
        this.total = i3;
    }
}
