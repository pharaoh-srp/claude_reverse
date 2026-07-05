package com.anthropic.claude.api.export;

import defpackage.gvj;
import defpackage.mb7;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nb7;
import defpackage.ob7;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/export/ExportStatusResponse;", "", "Lcom/anthropic/claude/api/export/ExportStatus;", "status", "", "signed_url", "<init>", "(Lcom/anthropic/claude/api/export/ExportStatus;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/export/ExportStatus;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/export/ExportStatusResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/export/ExportStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/api/export/ExportStatus;Ljava/lang/String;)Lcom/anthropic/claude/api/export/ExportStatusResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/export/ExportStatus;", "getStatus", "Ljava/lang/String;", "getSigned_url", "Companion", "mb7", "nb7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExportStatusResponse {
    public static final int $stable = 0;
    public static final nb7 Companion = new nb7();
    private final String signed_url;
    private final ExportStatus status;

    public /* synthetic */ ExportStatusResponse(int i, ExportStatus exportStatus, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, mb7.a.getDescriptor());
            throw null;
        }
        this.status = exportStatus;
        if ((i & 2) == 0) {
            this.signed_url = null;
        } else {
            this.signed_url = str;
        }
    }

    public static /* synthetic */ ExportStatusResponse copy$default(ExportStatusResponse exportStatusResponse, ExportStatus exportStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            exportStatus = exportStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str = exportStatusResponse.signed_url;
        }
        return exportStatusResponse.copy(exportStatus, str);
    }

    public static final /* synthetic */ void write$Self$api(ExportStatusResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ob7.d, self.status);
        if (!output.E(serialDesc) && self.signed_url == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.signed_url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExportStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSigned_url() {
        return this.signed_url;
    }

    public final ExportStatusResponse copy(ExportStatus status, String signed_url) {
        status.getClass();
        return new ExportStatusResponse(status, signed_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportStatusResponse)) {
            return false;
        }
        ExportStatusResponse exportStatusResponse = (ExportStatusResponse) other;
        return this.status == exportStatusResponse.status && x44.r(this.signed_url, exportStatusResponse.signed_url);
    }

    public final String getSigned_url() {
        return this.signed_url;
    }

    public final ExportStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.signed_url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExportStatusResponse(status=" + this.status + ", signed_url=" + this.signed_url + ")";
    }

    public ExportStatusResponse(ExportStatus exportStatus, String str) {
        exportStatus.getClass();
        this.status = exportStatus;
        this.signed_url = str;
    }

    public /* synthetic */ ExportStatusResponse(ExportStatus exportStatus, String str, int i, mq5 mq5Var) {
        this(exportStatus, (i & 2) != 0 ? null : str);
    }
}
