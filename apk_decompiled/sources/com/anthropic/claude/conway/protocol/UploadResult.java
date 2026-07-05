package com.anthropic.claude.conway.protocol;

import defpackage.bki;
import defpackage.cki;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UploadResult;", "", "", "path", "", "size", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/UploadResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/anthropic/claude/conway/protocol/UploadResult;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "J", "getSize", "Companion", "bki", "cki", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UploadResult {
    public static final int $stable = 0;
    public static final cki Companion = new cki();
    private final String path;
    private final long size;

    public /* synthetic */ UploadResult(int i, String str, long j, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, bki.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.size = j;
    }

    public static /* synthetic */ UploadResult copy$default(UploadResult uploadResult, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadResult.path;
        }
        if ((i & 2) != 0) {
            j = uploadResult.size;
        }
        return uploadResult.copy(str, j);
    }

    public static final /* synthetic */ void write$Self$conway(UploadResult self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.D(serialDesc, 1, self.size);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final UploadResult copy(String path, long size) {
        path.getClass();
        return new UploadResult(path, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadResult)) {
            return false;
        }
        UploadResult uploadResult = (UploadResult) other;
        return x44.r(this.path, uploadResult.path) && this.size == uploadResult.size;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + (this.path.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbW = vb7.w("UploadResult(path=", this.path, ", size=", this.size);
        sbW.append(")");
        return sbW.toString();
    }

    public UploadResult(String str, long j) {
        str.getClass();
        this.path = str;
        this.size = j;
    }
}
