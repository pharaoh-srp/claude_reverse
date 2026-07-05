package com.anthropic.claude.api.memory;

import defpackage.c9b;
import defpackage.d9b;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/api/memory/MelangeEditResponse;", "", "", "path", "previous_content", "content", "", "size_bytes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MelangeEditResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/anthropic/claude/api/memory/MelangeEditResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getPrevious_content", "getContent", "J", "getSize_bytes", "Companion", "c9b", "d9b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MelangeEditResponse {
    public static final int $stable = 0;
    public static final d9b Companion = new d9b();
    private final String content;
    private final String path;
    private final String previous_content;
    private final long size_bytes;

    public /* synthetic */ MelangeEditResponse(int i, String str, String str2, String str3, long j, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, c9b.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.previous_content = str2;
        this.content = str3;
        this.size_bytes = j;
    }

    public static /* synthetic */ MelangeEditResponse copy$default(MelangeEditResponse melangeEditResponse, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = melangeEditResponse.path;
        }
        if ((i & 2) != 0) {
            str2 = melangeEditResponse.previous_content;
        }
        if ((i & 4) != 0) {
            str3 = melangeEditResponse.content;
        }
        if ((i & 8) != 0) {
            j = melangeEditResponse.size_bytes;
        }
        String str4 = str3;
        return melangeEditResponse.copy(str, str2, str4, j);
    }

    public static final /* synthetic */ void write$Self$api(MelangeEditResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.q(serialDesc, 1, self.previous_content);
        output.q(serialDesc, 2, self.content);
        output.D(serialDesc, 3, self.size_bytes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrevious_content() {
        return this.previous_content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize_bytes() {
        return this.size_bytes;
    }

    public final MelangeEditResponse copy(String path, String previous_content, String content, long size_bytes) {
        path.getClass();
        previous_content.getClass();
        content.getClass();
        return new MelangeEditResponse(path, previous_content, content, size_bytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeEditResponse)) {
            return false;
        }
        MelangeEditResponse melangeEditResponse = (MelangeEditResponse) other;
        return x44.r(this.path, melangeEditResponse.path) && x44.r(this.previous_content, melangeEditResponse.previous_content) && x44.r(this.content, melangeEditResponse.content) && this.size_bytes == melangeEditResponse.size_bytes;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPrevious_content() {
        return this.previous_content;
    }

    public final long getSize_bytes() {
        return this.size_bytes;
    }

    public int hashCode() {
        return Long.hashCode(this.size_bytes) + kgh.l(kgh.l(this.path.hashCode() * 31, 31, this.previous_content), 31, this.content);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.previous_content;
        String str3 = this.content;
        long j = this.size_bytes;
        StringBuilder sbR = kgh.r("MelangeEditResponse(path=", str, ", previous_content=", str2, ", content=");
        sbR.append(str3);
        sbR.append(", size_bytes=");
        sbR.append(j);
        sbR.append(")");
        return sbR.toString();
    }

    public MelangeEditResponse(String str, String str2, String str3, long j) {
        grc.B(str, str2, str3);
        this.path = str;
        this.previous_content = str2;
        this.content = str3;
        this.size_bytes = j;
    }
}
