package com.anthropic.claude.api.memory;

import defpackage.bc9;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q9b;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y8b;
import defpackage.z8b;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011BU\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001f\b\u0002\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010#R.\u0010\u000b\u001a\u0019\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b9\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b<\u0010!¨\u0006@"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeDoc;", "", "", "path", "", "size_bytes", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "updated_at", "content", "Lcom/anthropic/claude/api/memory/MelangeParsedContent;", "parsed", "display_name", "<init>", "(Ljava/lang/String;JLjava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeParsedContent;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeParsedContent;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeDoc;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/Date;", "component4", "component5", "()Lcom/anthropic/claude/api/memory/MelangeParsedContent;", "component6", "copy", "(Ljava/lang/String;JLjava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/memory/MelangeParsedContent;Ljava/lang/String;)Lcom/anthropic/claude/api/memory/MelangeDoc;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "J", "getSize_bytes", "Ljava/util/Date;", "getUpdated_at", "getContent", "Lcom/anthropic/claude/api/memory/MelangeParsedContent;", "getParsed", "getDisplay_name", "Companion", "y8b", "z8b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeDoc {
    public static final int $stable = 0;
    public static final z8b Companion = new z8b();
    private final String content;
    private final String display_name;
    private final MelangeParsedContent parsed;
    private final String path;
    private final long size_bytes;
    private final Date updated_at;

    public /* synthetic */ MelangeDoc(int i, String str, long j, Date date, String str2, MelangeParsedContent melangeParsedContent, String str3, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, y8b.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.size_bytes = j;
        if ((i & 4) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = date;
        }
        this.content = str2;
        if ((i & 16) == 0) {
            this.parsed = null;
        } else {
            this.parsed = melangeParsedContent;
        }
        if ((i & 32) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str3;
        }
    }

    public static /* synthetic */ MelangeDoc copy$default(MelangeDoc melangeDoc, String str, long j, Date date, String str2, MelangeParsedContent melangeParsedContent, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = melangeDoc.path;
        }
        if ((i & 2) != 0) {
            j = melangeDoc.size_bytes;
        }
        if ((i & 4) != 0) {
            date = melangeDoc.updated_at;
        }
        if ((i & 8) != 0) {
            str2 = melangeDoc.content;
        }
        if ((i & 16) != 0) {
            melangeParsedContent = melangeDoc.parsed;
        }
        if ((i & 32) != 0) {
            str3 = melangeDoc.display_name;
        }
        return melangeDoc.copy(str, j, date, str2, melangeParsedContent, str3);
    }

    public static final /* synthetic */ void write$Self$api(MelangeDoc self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.D(serialDesc, 1, self.size_bytes);
        if (output.E(serialDesc) || self.updated_at != null) {
            output.B(serialDesc, 2, bc9.a, self.updated_at);
        }
        output.q(serialDesc, 3, self.content);
        if (output.E(serialDesc) || self.parsed != null) {
            output.B(serialDesc, 4, q9b.a, self.parsed);
        }
        if (!output.E(serialDesc) && self.display_name == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.display_name);
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
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MelangeParsedContent getParsed() {
        return this.parsed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    public final MelangeDoc copy(String path, long size_bytes, Date updated_at, String content, MelangeParsedContent parsed, String display_name) {
        path.getClass();
        content.getClass();
        return new MelangeDoc(path, size_bytes, updated_at, content, parsed, display_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeDoc)) {
            return false;
        }
        MelangeDoc melangeDoc = (MelangeDoc) other;
        return x44.r(this.path, melangeDoc.path) && this.size_bytes == melangeDoc.size_bytes && x44.r(this.updated_at, melangeDoc.updated_at) && x44.r(this.content, melangeDoc.content) && x44.r(this.parsed, melangeDoc.parsed) && x44.r(this.display_name, melangeDoc.display_name);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final MelangeParsedContent getParsed() {
        return this.parsed;
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
        int iL = kgh.l((iE + (date == null ? 0 : date.hashCode())) * 31, 31, this.content);
        MelangeParsedContent melangeParsedContent = this.parsed;
        int iHashCode = (iL + (melangeParsedContent == null ? 0 : melangeParsedContent.hashCode())) * 31;
        String str = this.display_name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.path;
        long j = this.size_bytes;
        Date date = this.updated_at;
        String str2 = this.content;
        MelangeParsedContent melangeParsedContent = this.parsed;
        String str3 = this.display_name;
        StringBuilder sbW = vb7.w("MelangeDoc(path=", str, ", size_bytes=", j);
        sbW.append(", updated_at=");
        sbW.append(date);
        sbW.append(", content=");
        sbW.append(str2);
        sbW.append(", parsed=");
        sbW.append(melangeParsedContent);
        sbW.append(", display_name=");
        sbW.append(str3);
        sbW.append(")");
        return sbW.toString();
    }

    public MelangeDoc(String str, long j, Date date, String str2, MelangeParsedContent melangeParsedContent, String str3) {
        str.getClass();
        str2.getClass();
        this.path = str;
        this.size_bytes = j;
        this.updated_at = date;
        this.content = str2;
        this.parsed = melangeParsedContent;
        this.display_name = str3;
    }

    public /* synthetic */ MelangeDoc(String str, long j, Date date, String str2, MelangeParsedContent melangeParsedContent, String str3, int i, mq5 mq5Var) {
        this(str, j, (i & 4) != 0 ? null : date, str2, (i & 16) != 0 ? null : melangeParsedContent, (i & 32) != 0 ? null : str3);
    }
}
