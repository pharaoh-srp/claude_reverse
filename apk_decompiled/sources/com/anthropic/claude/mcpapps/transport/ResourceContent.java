package com.anthropic.claude.mcpapps.transport;

import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vpe;
import defpackage.wne;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/ResourceContent;", "", "", "uri", "mimeType", "text", "Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;", "_meta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/ResourceContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;)Lcom/anthropic/claude/mcpapps/transport/ResourceContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getMimeType", "getText", "Lcom/anthropic/claude/mcpapps/transport/ResourceMeta;", "get_meta", "Companion", "vne", "wne", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ResourceContent {
    public static final int $stable = 8;
    public static final wne Companion = new wne();
    private final ResourceMeta _meta;
    private final String mimeType;
    private final String text;
    private final String uri;

    public /* synthetic */ ResourceContent(int i, String str, String str2, String str3, ResourceMeta resourceMeta, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.uri = null;
        } else {
            this.uri = str;
        }
        if ((i & 2) == 0) {
            this.mimeType = null;
        } else {
            this.mimeType = str2;
        }
        if ((i & 4) == 0) {
            this.text = null;
        } else {
            this.text = str3;
        }
        if ((i & 8) == 0) {
            this._meta = null;
        } else {
            this._meta = resourceMeta;
        }
    }

    public static /* synthetic */ ResourceContent copy$default(ResourceContent resourceContent, String str, String str2, String str3, ResourceMeta resourceMeta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourceContent.uri;
        }
        if ((i & 2) != 0) {
            str2 = resourceContent.mimeType;
        }
        if ((i & 4) != 0) {
            str3 = resourceContent.text;
        }
        if ((i & 8) != 0) {
            resourceMeta = resourceContent._meta;
        }
        return resourceContent.copy(str, str2, str3, resourceMeta);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(ResourceContent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.uri != null) {
            output.B(serialDesc, 0, srg.a, self.uri);
        }
        if (output.E(serialDesc) || self.mimeType != null) {
            output.B(serialDesc, 1, srg.a, self.mimeType);
        }
        if (output.E(serialDesc) || self.text != null) {
            output.B(serialDesc, 2, srg.a, self.text);
        }
        if (!output.E(serialDesc) && self._meta == null) {
            return;
        }
        output.B(serialDesc, 3, vpe.a, self._meta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResourceMeta get_meta() {
        return this._meta;
    }

    public final ResourceContent copy(String uri, String mimeType, String text, ResourceMeta _meta) {
        return new ResourceContent(uri, mimeType, text, _meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceContent)) {
            return false;
        }
        ResourceContent resourceContent = (ResourceContent) other;
        return x44.r(this.uri, resourceContent.uri) && x44.r(this.mimeType, resourceContent.mimeType) && x44.r(this.text, resourceContent.text) && x44.r(this._meta, resourceContent._meta);
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUri() {
        return this.uri;
    }

    public final ResourceMeta get_meta() {
        return this._meta;
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mimeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ResourceMeta resourceMeta = this._meta;
        return iHashCode3 + (resourceMeta != null ? resourceMeta.hashCode() : 0);
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.mimeType;
        String str3 = this.text;
        ResourceMeta resourceMeta = this._meta;
        StringBuilder sbR = kgh.r("ResourceContent(uri=", str, ", mimeType=", str2, ", text=");
        sbR.append(str3);
        sbR.append(", _meta=");
        sbR.append(resourceMeta);
        sbR.append(")");
        return sbR.toString();
    }

    public ResourceContent() {
        this((String) null, (String) null, (String) null, (ResourceMeta) null, 15, (mq5) null);
    }

    public ResourceContent(String str, String str2, String str3, ResourceMeta resourceMeta) {
        this.uri = str;
        this.mimeType = str2;
        this.text = str3;
        this._meta = resourceMeta;
    }

    public /* synthetic */ ResourceContent(String str, String str2, String str3, ResourceMeta resourceMeta, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : resourceMeta);
    }
}
