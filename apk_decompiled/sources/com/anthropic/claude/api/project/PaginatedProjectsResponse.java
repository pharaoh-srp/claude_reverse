package com.anthropic.claude.api.project;

import defpackage.gvj;
import defpackage.ikd;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oob;
import defpackage.uo0;
import defpackage.uoc;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.voc;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yoc;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/project/PaginatedProjectsResponse;", "", "", "Lcom/anthropic/claude/api/project/Project;", "data", "Lcom/anthropic/claude/api/project/Pagination;", "pagination", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/api/project/Pagination;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/api/project/Pagination;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/PaginatedProjectsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/api/project/Pagination;", "copy", "(Ljava/util/List;Lcom/anthropic/claude/api/project/Pagination;)Lcom/anthropic/claude/api/project/PaginatedProjectsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "Lcom/anthropic/claude/api/project/Pagination;", "getPagination", "Companion", "uoc", "voc", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PaginatedProjectsResponse {
    public static final int $stable = 0;
    private final List<Project> data;
    private final Pagination pagination;
    public static final voc Companion = new voc();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new oob(21)), null};

    public /* synthetic */ PaginatedProjectsResponse(int i, List list, Pagination pagination, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, uoc.a.getDescriptor());
            throw null;
        }
        this.data = list;
        this.pagination = pagination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ikd.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedProjectsResponse copy$default(PaginatedProjectsResponse paginatedProjectsResponse, List list, Pagination pagination, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paginatedProjectsResponse.data;
        }
        if ((i & 2) != 0) {
            pagination = paginatedProjectsResponse.pagination;
        }
        return paginatedProjectsResponse.copy(list, pagination);
    }

    public static final /* synthetic */ void write$Self$api(PaginatedProjectsResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.data);
        output.r(serialDesc, 1, yoc.a, self.pagination);
    }

    public final List<Project> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Pagination getPagination() {
        return this.pagination;
    }

    public final PaginatedProjectsResponse copy(List<Project> data, Pagination pagination) {
        data.getClass();
        pagination.getClass();
        return new PaginatedProjectsResponse(data, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedProjectsResponse)) {
            return false;
        }
        PaginatedProjectsResponse paginatedProjectsResponse = (PaginatedProjectsResponse) other;
        return x44.r(this.data, paginatedProjectsResponse.data) && x44.r(this.pagination, paginatedProjectsResponse.pagination);
    }

    public final List<Project> getData() {
        return this.data;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        return this.pagination.hashCode() + (this.data.hashCode() * 31);
    }

    public String toString() {
        return "PaginatedProjectsResponse(data=" + this.data + ", pagination=" + this.pagination + ")";
    }

    public PaginatedProjectsResponse(List<Project> list, Pagination pagination) {
        list.getClass();
        pagination.getClass();
        this.data = list;
        this.pagination = pagination;
    }
}
