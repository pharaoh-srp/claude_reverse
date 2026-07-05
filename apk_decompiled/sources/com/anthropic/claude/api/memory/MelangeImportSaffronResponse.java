package com.anthropic.claude.api.memory;

import defpackage.g9b;
import defpackage.gvj;
import defpackage.h9b;
import defpackage.i9b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J0\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeImportSaffronResponse;", "", "", "", "files_written", "skipped_existing", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeImportSaffronResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/memory/MelangeImportSaffronResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFiles_written", "getSkipped_existing", "Companion", "h9b", "i9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeImportSaffronResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final i9b Companion = new i9b();
    private final List<String> files_written;
    private final List<String> skipped_existing;

    static {
        g9b g9bVar = new g9b(0);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, g9bVar), yb5.w(w1aVar, new g9b(1))};
    }

    public /* synthetic */ MelangeImportSaffronResponse(int i, List list, List list2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, h9b.a.getDescriptor());
            throw null;
        }
        this.files_written = list;
        this.skipped_existing = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MelangeImportSaffronResponse copy$default(MelangeImportSaffronResponse melangeImportSaffronResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = melangeImportSaffronResponse.files_written;
        }
        if ((i & 2) != 0) {
            list2 = melangeImportSaffronResponse.skipped_existing;
        }
        return melangeImportSaffronResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$api(MelangeImportSaffronResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.files_written);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.skipped_existing);
    }

    public final List<String> component1() {
        return this.files_written;
    }

    public final List<String> component2() {
        return this.skipped_existing;
    }

    public final MelangeImportSaffronResponse copy(List<String> files_written, List<String> skipped_existing) {
        files_written.getClass();
        skipped_existing.getClass();
        return new MelangeImportSaffronResponse(files_written, skipped_existing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeImportSaffronResponse)) {
            return false;
        }
        MelangeImportSaffronResponse melangeImportSaffronResponse = (MelangeImportSaffronResponse) other;
        return x44.r(this.files_written, melangeImportSaffronResponse.files_written) && x44.r(this.skipped_existing, melangeImportSaffronResponse.skipped_existing);
    }

    public final List<String> getFiles_written() {
        return this.files_written;
    }

    public final List<String> getSkipped_existing() {
        return this.skipped_existing;
    }

    public int hashCode() {
        return this.skipped_existing.hashCode() + (this.files_written.hashCode() * 31);
    }

    public String toString() {
        return "MelangeImportSaffronResponse(files_written=" + this.files_written + ", skipped_existing=" + this.skipped_existing + ")";
    }

    public MelangeImportSaffronResponse(List<String> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.files_written = list;
        this.skipped_existing = list2;
    }
}
