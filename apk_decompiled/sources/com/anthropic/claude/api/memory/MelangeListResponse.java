package com.anthropic.claude.api.memory;

import defpackage.g9b;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.l9b;
import defpackage.m9b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o9b;
import defpackage.onf;
import defpackage.sbb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J2\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeListResponse;", "", "", "Lcom/anthropic/claude/api/memory/MelangeMeta;", "data", "Lcom/anthropic/claude/api/memory/MemoryFsCategory;", "categories", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeListResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/memory/MelangeListResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "getCategories", "Companion", "l9b", "m9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeListResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final m9b Companion = new m9b();
    private final List<MemoryFsCategory> categories;
    private final List<MelangeMeta> data;

    static {
        g9b g9bVar = new g9b(2);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, g9bVar), yb5.w(w1aVar, new g9b(3))};
    }

    public /* synthetic */ MelangeListResponse(int i, List list, List list2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, l9b.a.getDescriptor());
            throw null;
        }
        this.data = list;
        if ((i & 2) == 0) {
            this.categories = null;
        } else {
            this.categories = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(o9b.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(sbb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MelangeListResponse copy$default(MelangeListResponse melangeListResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = melangeListResponse.data;
        }
        if ((i & 2) != 0) {
            list2 = melangeListResponse.categories;
        }
        return melangeListResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(MelangeListResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.data);
        if (!output.E(serialDesc) && self.categories == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.categories);
    }

    public final List<MelangeMeta> component1() {
        return this.data;
    }

    public final List<MemoryFsCategory> component2() {
        return this.categories;
    }

    public final MelangeListResponse copy(List<MelangeMeta> data, List<MemoryFsCategory> categories) {
        data.getClass();
        return new MelangeListResponse(data, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeListResponse)) {
            return false;
        }
        MelangeListResponse melangeListResponse = (MelangeListResponse) other;
        return x44.r(this.data, melangeListResponse.data) && x44.r(this.categories, melangeListResponse.categories);
    }

    public final List<MemoryFsCategory> getCategories() {
        return this.categories;
    }

    public final List<MelangeMeta> getData() {
        return this.data;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        List<MemoryFsCategory> list = this.categories;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "MelangeListResponse(data=" + this.data + ", categories=" + this.categories + ")";
    }

    public MelangeListResponse(List<MelangeMeta> list, List<MemoryFsCategory> list2) {
        list.getClass();
        this.data = list;
        this.categories = list2;
    }

    public /* synthetic */ MelangeListResponse(List list, List list2, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
