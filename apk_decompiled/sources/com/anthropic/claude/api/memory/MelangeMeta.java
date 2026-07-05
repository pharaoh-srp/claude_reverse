package com.anthropic.claude.api.memory;

import defpackage.bc9;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o9b;
import defpackage.onf;
import defpackage.p9b;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010!R.\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b5\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b6\u0010\u001f¨\u0006:"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeMeta;", "", "", "path", "", "size_bytes", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "updated_at", "display_name", "category_id", "<init>", "(Ljava/lang/String;JLjava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/Date;", "component4", "component5", "copy", "(Ljava/lang/String;JLjava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/memory/MelangeMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "J", "getSize_bytes", "Ljava/util/Date;", "getUpdated_at", "getDisplay_name", "getCategory_id", "Companion", "o9b", "p9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeMeta {
    public static final int $stable = 0;
    public static final p9b Companion = new p9b();
    private final String category_id;
    private final String display_name;
    private final String path;
    private final long size_bytes;
    private final Date updated_at;

    public /* synthetic */ MelangeMeta(int i, String str, long j, Date date, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, o9b.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.size_bytes = j;
        if ((i & 4) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = date;
        }
        if ((i & 8) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
        if ((i & 16) == 0) {
            this.category_id = null;
        } else {
            this.category_id = str3;
        }
    }

    public static /* synthetic */ MelangeMeta copy$default(MelangeMeta melangeMeta, String str, long j, Date date, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = melangeMeta.path;
        }
        if ((i & 2) != 0) {
            j = melangeMeta.size_bytes;
        }
        if ((i & 4) != 0) {
            date = melangeMeta.updated_at;
        }
        if ((i & 8) != 0) {
            str2 = melangeMeta.display_name;
        }
        if ((i & 16) != 0) {
            str3 = melangeMeta.category_id;
        }
        String str4 = str3;
        Date date2 = date;
        return melangeMeta.copy(str, j, date2, str2, str4);
    }

    public static final /* synthetic */ void write$Self$api(MelangeMeta self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.D(serialDesc, 1, self.size_bytes);
        if (output.E(serialDesc) || self.updated_at != null) {
            output.B(serialDesc, 2, bc9.a, self.updated_at);
        }
        if (output.E(serialDesc) || self.display_name != null) {
            output.B(serialDesc, 3, srg.a, self.display_name);
        }
        if (!output.E(serialDesc) && self.category_id == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.category_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize_bytes() {
        return this.size_bytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory_id() {
        return this.category_id;
    }

    public final MelangeMeta copy(String path, long size_bytes, Date updated_at, String display_name, String category_id) {
        path.getClass();
        return new MelangeMeta(path, size_bytes, updated_at, display_name, category_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeMeta)) {
            return false;
        }
        MelangeMeta melangeMeta = (MelangeMeta) other;
        return x44.r(this.path, melangeMeta.path) && this.size_bytes == melangeMeta.size_bytes && x44.r(this.updated_at, melangeMeta.updated_at) && x44.r(this.display_name, melangeMeta.display_name) && x44.r(this.category_id, melangeMeta.category_id);
    }

    public final String getCategory_id() {
        return this.category_id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize_bytes() {
        return this.size_bytes;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int iE = vb7.e(this.path.hashCode() * 31, 31, this.size_bytes);
        Date date = this.updated_at;
        int iHashCode = (iE + (date == null ? 0 : date.hashCode())) * 31;
        String str = this.display_name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category_id;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        long j = this.size_bytes;
        Date date = this.updated_at;
        String str2 = this.display_name;
        String str3 = this.category_id;
        StringBuilder sbW = vb7.w("MelangeMeta(path=", str, ", size_bytes=", j);
        sbW.append(", updated_at=");
        sbW.append(date);
        sbW.append(", display_name=");
        sbW.append(str2);
        return kgh.q(sbW, ", category_id=", str3, ")");
    }

    public MelangeMeta(String str, long j, Date date, String str2, String str3) {
        str.getClass();
        this.path = str;
        this.size_bytes = j;
        this.updated_at = date;
        this.display_name = str2;
        this.category_id = str3;
    }

    public /* synthetic */ MelangeMeta(String str, long j, Date date, String str2, String str3, int i, mq5 mq5Var) {
        this(str, j, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
