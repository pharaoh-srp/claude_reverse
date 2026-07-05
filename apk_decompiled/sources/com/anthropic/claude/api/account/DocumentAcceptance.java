package com.anthropic.claude.api.account;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.q96;
import defpackage.r96;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lcom/anthropic/claude/api/account/DocumentAcceptance;", "", "", "document_id", "", "accepted_via_checkbox", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/DocumentAcceptance;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/account/DocumentAcceptance;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDocument_id", "Ljava/lang/Boolean;", "getAccepted_via_checkbox", "Companion", "q96", "r96", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DocumentAcceptance {
    public static final int $stable = 0;
    public static final r96 Companion = new r96();
    private final Boolean accepted_via_checkbox;
    private final String document_id;

    public /* synthetic */ DocumentAcceptance(int i, String str, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, q96.a.getDescriptor());
            throw null;
        }
        this.document_id = str;
        if ((i & 2) == 0) {
            this.accepted_via_checkbox = null;
        } else {
            this.accepted_via_checkbox = bool;
        }
    }

    public static /* synthetic */ DocumentAcceptance copy$default(DocumentAcceptance documentAcceptance, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = documentAcceptance.document_id;
        }
        if ((i & 2) != 0) {
            bool = documentAcceptance.accepted_via_checkbox;
        }
        return documentAcceptance.copy(str, bool);
    }

    public static final /* synthetic */ void write$Self$api(DocumentAcceptance self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.document_id);
        if (!output.E(serialDesc) && self.accepted_via_checkbox == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.accepted_via_checkbox);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocument_id() {
        return this.document_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAccepted_via_checkbox() {
        return this.accepted_via_checkbox;
    }

    public final DocumentAcceptance copy(String document_id, Boolean accepted_via_checkbox) {
        document_id.getClass();
        return new DocumentAcceptance(document_id, accepted_via_checkbox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentAcceptance)) {
            return false;
        }
        DocumentAcceptance documentAcceptance = (DocumentAcceptance) other;
        return x44.r(this.document_id, documentAcceptance.document_id) && x44.r(this.accepted_via_checkbox, documentAcceptance.accepted_via_checkbox);
    }

    public final Boolean getAccepted_via_checkbox() {
        return this.accepted_via_checkbox;
    }

    public final String getDocument_id() {
        return this.document_id;
    }

    public int hashCode() {
        int iHashCode = this.document_id.hashCode() * 31;
        Boolean bool = this.accepted_via_checkbox;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "DocumentAcceptance(document_id=" + this.document_id + ", accepted_via_checkbox=" + this.accepted_via_checkbox + ")";
    }

    public DocumentAcceptance(String str, Boolean bool) {
        str.getClass();
        this.document_id = str;
        this.accepted_via_checkbox = bool;
    }

    public /* synthetic */ DocumentAcceptance(String str, Boolean bool, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : bool);
    }
}
