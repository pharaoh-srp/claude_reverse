package com.anthropic.claude.api.chat.tool;

import defpackage.b38;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/GenericSourceMetadata;", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "", "preview_title", "icon_url", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/GenericSourceMetadata;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/GenericSourceMetadata;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreview_title", "getIcon_url", "getSource", "Companion", "a38", "b38", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GenericSourceMetadata implements SourceMetadata {
    public static final int $stable = 0;
    public static final b38 Companion = new b38();
    private final String icon_url;
    private final String preview_title;
    private final String source;

    public /* synthetic */ GenericSourceMetadata(int i, String str, String str2, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.preview_title = null;
        } else {
            this.preview_title = str;
        }
        if ((i & 2) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str2;
        }
        if ((i & 4) == 0) {
            this.source = null;
        } else {
            this.source = str3;
        }
    }

    public static /* synthetic */ GenericSourceMetadata copy$default(GenericSourceMetadata genericSourceMetadata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericSourceMetadata.preview_title;
        }
        if ((i & 2) != 0) {
            str2 = genericSourceMetadata.icon_url;
        }
        if ((i & 4) != 0) {
            str3 = genericSourceMetadata.source;
        }
        return genericSourceMetadata.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$api(GenericSourceMetadata self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.preview_title != null) {
            output.B(serialDesc, 0, srg.a, self.preview_title);
        }
        if (output.E(serialDesc) || self.icon_url != null) {
            output.B(serialDesc, 1, srg.a, self.icon_url);
        }
        if (!output.E(serialDesc) && self.source == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPreview_title() {
        return this.preview_title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon_url() {
        return this.icon_url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final GenericSourceMetadata copy(String preview_title, String icon_url, String source) {
        return new GenericSourceMetadata(preview_title, icon_url, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericSourceMetadata)) {
            return false;
        }
        GenericSourceMetadata genericSourceMetadata = (GenericSourceMetadata) other;
        return x44.r(this.preview_title, genericSourceMetadata.preview_title) && x44.r(this.icon_url, genericSourceMetadata.icon_url) && x44.r(this.source, genericSourceMetadata.source);
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getPreview_title() {
        return this.preview_title;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.preview_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.preview_title;
        String str2 = this.icon_url;
        return ij0.m(kgh.r("GenericSourceMetadata(preview_title=", str, ", icon_url=", str2, ", source="), this.source, ")");
    }

    public GenericSourceMetadata() {
        this((String) null, (String) null, (String) null, 7, (mq5) null);
    }

    public GenericSourceMetadata(String str, String str2, String str3) {
        this.preview_title = str;
        this.icon_url = str2;
        this.source = str3;
    }

    public /* synthetic */ GenericSourceMetadata(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
