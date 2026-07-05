package com.anthropic.claude.mcpapps.transport;

import defpackage.ldi;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odi;
import defpackage.onf;
import defpackage.pdi;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J@\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/UiResourceMeta;", "", "Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;", "csp", "Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;", "permissions", "", "domain", "", "prefersBorder", "<init>", "(Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/mcpapps/transport/UiResourceCsp;Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/UiResourceMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;", "component2", "()Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/mcpapps/transport/UiResourceMeta;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/mcpapps/transport/UiResourceCsp;", "getCsp", "Lcom/anthropic/claude/mcpapps/transport/UiResourcePermissions;", "getPermissions", "Ljava/lang/String;", "getDomain", "Ljava/lang/Boolean;", "getPrefersBorder", "Companion", "ndi", "odi", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UiResourceMeta {
    public static final int $stable = 8;
    public static final odi Companion = new odi();
    private final UiResourceCsp csp;
    private final String domain;
    private final UiResourcePermissions permissions;
    private final Boolean prefersBorder;

    public /* synthetic */ UiResourceMeta(int i, UiResourceCsp uiResourceCsp, UiResourcePermissions uiResourcePermissions, String str, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.csp = null;
        } else {
            this.csp = uiResourceCsp;
        }
        if ((i & 2) == 0) {
            this.permissions = null;
        } else {
            this.permissions = uiResourcePermissions;
        }
        if ((i & 4) == 0) {
            this.domain = null;
        } else {
            this.domain = str;
        }
        if ((i & 8) == 0) {
            this.prefersBorder = null;
        } else {
            this.prefersBorder = bool;
        }
    }

    public static /* synthetic */ UiResourceMeta copy$default(UiResourceMeta uiResourceMeta, UiResourceCsp uiResourceCsp, UiResourcePermissions uiResourcePermissions, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            uiResourceCsp = uiResourceMeta.csp;
        }
        if ((i & 2) != 0) {
            uiResourcePermissions = uiResourceMeta.permissions;
        }
        if ((i & 4) != 0) {
            str = uiResourceMeta.domain;
        }
        if ((i & 8) != 0) {
            bool = uiResourceMeta.prefersBorder;
        }
        return uiResourceMeta.copy(uiResourceCsp, uiResourcePermissions, str, bool);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(UiResourceMeta self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.csp != null) {
            output.B(serialDesc, 0, ldi.a, self.csp);
        }
        if (output.E(serialDesc) || self.permissions != null) {
            output.B(serialDesc, 1, pdi.a, self.permissions);
        }
        if (output.E(serialDesc) || self.domain != null) {
            output.B(serialDesc, 2, srg.a, self.domain);
        }
        if (!output.E(serialDesc) && self.prefersBorder == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.prefersBorder);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UiResourceCsp getCsp() {
        return this.csp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UiResourcePermissions getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getPrefersBorder() {
        return this.prefersBorder;
    }

    public final UiResourceMeta copy(UiResourceCsp csp, UiResourcePermissions permissions, String domain, Boolean prefersBorder) {
        return new UiResourceMeta(csp, permissions, domain, prefersBorder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiResourceMeta)) {
            return false;
        }
        UiResourceMeta uiResourceMeta = (UiResourceMeta) other;
        return x44.r(this.csp, uiResourceMeta.csp) && x44.r(this.permissions, uiResourceMeta.permissions) && x44.r(this.domain, uiResourceMeta.domain) && x44.r(this.prefersBorder, uiResourceMeta.prefersBorder);
    }

    public final UiResourceCsp getCsp() {
        return this.csp;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final UiResourcePermissions getPermissions() {
        return this.permissions;
    }

    public final Boolean getPrefersBorder() {
        return this.prefersBorder;
    }

    public int hashCode() {
        UiResourceCsp uiResourceCsp = this.csp;
        int iHashCode = (uiResourceCsp == null ? 0 : uiResourceCsp.hashCode()) * 31;
        UiResourcePermissions uiResourcePermissions = this.permissions;
        int iHashCode2 = (iHashCode + (uiResourcePermissions == null ? 0 : uiResourcePermissions.hashCode())) * 31;
        String str = this.domain;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.prefersBorder;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "UiResourceMeta(csp=" + this.csp + ", permissions=" + this.permissions + ", domain=" + this.domain + ", prefersBorder=" + this.prefersBorder + ")";
    }

    public UiResourceMeta() {
        this((UiResourceCsp) null, (UiResourcePermissions) null, (String) null, (Boolean) null, 15, (mq5) null);
    }

    public UiResourceMeta(UiResourceCsp uiResourceCsp, UiResourcePermissions uiResourcePermissions, String str, Boolean bool) {
        this.csp = uiResourceCsp;
        this.permissions = uiResourcePermissions;
        this.domain = str;
        this.prefersBorder = bool;
    }

    public /* synthetic */ UiResourceMeta(UiResourceCsp uiResourceCsp, UiResourcePermissions uiResourcePermissions, String str, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : uiResourceCsp, (i & 2) != 0 ? null : uiResourcePermissions, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool);
    }
}
