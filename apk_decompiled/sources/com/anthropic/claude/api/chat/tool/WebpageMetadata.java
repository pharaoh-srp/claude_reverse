package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.r8j;
import defpackage.s8j;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/WebpageMetadata;", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "", "favicon_url", "site_name", "site_domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/WebpageMetadata;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/WebpageMetadata;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFavicon_url", "getSite_name", "getSite_domain", "Companion", "r8j", "s8j", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WebpageMetadata implements SourceMetadata {
    public static final int $stable = 0;
    public static final s8j Companion = new s8j();
    private final String favicon_url;
    private final String site_domain;
    private final String site_name;

    public /* synthetic */ WebpageMetadata(int i, String str, String str2, String str3, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, r8j.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.favicon_url = null;
        } else {
            this.favicon_url = str;
        }
        if ((i & 2) == 0) {
            this.site_name = null;
        } else {
            this.site_name = str2;
        }
        this.site_domain = str3;
    }

    public static /* synthetic */ WebpageMetadata copy$default(WebpageMetadata webpageMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webpageMetadata.favicon_url;
        }
        if ((i & 2) != 0) {
            str2 = webpageMetadata.site_name;
        }
        if ((i & 4) != 0) {
            str3 = webpageMetadata.site_domain;
        }
        return webpageMetadata.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(WebpageMetadata self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.favicon_url != null) {
            output.B(serialDesc, 0, srg.a, self.favicon_url);
        }
        if (output.E(serialDesc) || self.site_name != null) {
            output.B(serialDesc, 1, srg.a, self.site_name);
        }
        output.q(serialDesc, 2, self.site_domain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFavicon_url() {
        return this.favicon_url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSite_name() {
        return this.site_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSite_domain() {
        return this.site_domain;
    }

    public final WebpageMetadata copy(String favicon_url, String site_name, String site_domain) {
        site_domain.getClass();
        return new WebpageMetadata(favicon_url, site_name, site_domain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebpageMetadata)) {
            return false;
        }
        WebpageMetadata webpageMetadata = (WebpageMetadata) other;
        return x44.r(this.favicon_url, webpageMetadata.favicon_url) && x44.r(this.site_name, webpageMetadata.site_name) && x44.r(this.site_domain, webpageMetadata.site_domain);
    }

    public final String getFavicon_url() {
        return this.favicon_url;
    }

    public final String getSite_domain() {
        return this.site_domain;
    }

    public final String getSite_name() {
        return this.site_name;
    }

    public int hashCode() {
        String str = this.favicon_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.site_name;
        return this.site_domain.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.favicon_url;
        String str2 = this.site_name;
        return ij0.m(kgh.r("WebpageMetadata(favicon_url=", str, ", site_name=", str2, ", site_domain="), this.site_domain, ")");
    }

    public WebpageMetadata(String str, String str2, String str3) {
        str3.getClass();
        this.favicon_url = str;
        this.site_name = str2;
        this.site_domain = str3;
    }

    public /* synthetic */ WebpageMetadata(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
    }
}
