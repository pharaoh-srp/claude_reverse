package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.knk;
import defpackage.kw9;
import defpackage.m99;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq9;
import defpackage.w1a;
import defpackage.wq9;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBs\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(Jl\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b\f\u0010(R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b;\u0010\u001f¨\u0006?"}, d2 = {"Lcom/anthropic/claude/tool/model/KnowledgeSource;", "", "", "url", "title", "subtitle", "Lcom/anthropic/claude/tool/model/SourceImage;", "sourceImage", "sourceName", "resourceType", "body", "", "isTrusted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/SourceImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "key", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/SourceImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/KnowledgeSource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/tool/model/SourceImage;", "component5", "component6", "component7", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/SourceImage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/tool/model/KnowledgeSource;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getTitle", "getSubtitle", "Lcom/anthropic/claude/tool/model/SourceImage;", "getSourceImage", "getSourceName", "getResourceType", "getBody", "Z", "getKey", "Companion", "wq9", "vq9", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class KnowledgeSource {
    private final String body;
    private final boolean isTrusted;
    private final String key;
    private final String resourceType;
    private final SourceImage sourceImage;
    private final String sourceName;
    private final String subtitle;
    private final String title;
    private final String url;
    public static final wq9 Companion = new wq9();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new m99(3)), null, null, null, null, null};

    public /* synthetic */ KnowledgeSource(int i, String str, String str2, String str3, SourceImage sourceImage, String str4, String str5, String str6, boolean z, String str7, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, vq9.a.getDescriptor());
            throw null;
        }
        this.url = str;
        this.title = str2;
        this.subtitle = str3;
        this.sourceImage = sourceImage;
        this.sourceName = str4;
        this.resourceType = str5;
        this.body = str6;
        this.isTrusted = z;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.key = str == null ? knk.F().toString() : str;
        } else {
            this.key = str7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return SourceImage.Companion.serializer();
    }

    public static /* synthetic */ KnowledgeSource copy$default(KnowledgeSource knowledgeSource, String str, String str2, String str3, SourceImage sourceImage, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = knowledgeSource.url;
        }
        if ((i & 2) != 0) {
            str2 = knowledgeSource.title;
        }
        if ((i & 4) != 0) {
            str3 = knowledgeSource.subtitle;
        }
        if ((i & 8) != 0) {
            sourceImage = knowledgeSource.sourceImage;
        }
        if ((i & 16) != 0) {
            str4 = knowledgeSource.sourceName;
        }
        if ((i & 32) != 0) {
            str5 = knowledgeSource.resourceType;
        }
        if ((i & 64) != 0) {
            str6 = knowledgeSource.body;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = knowledgeSource.isTrusted;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str4;
        String str9 = str5;
        return knowledgeSource.copy(str, str2, str3, sourceImage, str8, str9, str7, z2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(KnowledgeSource self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        srg srgVar = srg.a;
        output.B(serialDesc, 0, srgVar, self.url);
        output.B(serialDesc, 1, srgVar, self.title);
        output.B(serialDesc, 2, srgVar, self.subtitle);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.sourceImage);
        output.B(serialDesc, 4, srgVar, self.sourceName);
        output.B(serialDesc, 5, srgVar, self.resourceType);
        output.B(serialDesc, 6, srgVar, self.body);
        output.p(serialDesc, 7, self.isTrusted);
        if (!output.E(serialDesc)) {
            String str = self.key;
            String string = self.url;
            if (string == null) {
                string = knk.F().toString();
            }
            if (x44.r(str, string)) {
                return;
            }
        }
        output.q(serialDesc, 8, self.key);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SourceImage getSourceImage() {
        return this.sourceImage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResourceType() {
        return this.resourceType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsTrusted() {
        return this.isTrusted;
    }

    public final KnowledgeSource copy(String url, String title, String subtitle, SourceImage sourceImage, String sourceName, String resourceType, String body, boolean isTrusted) {
        sourceImage.getClass();
        return new KnowledgeSource(url, title, subtitle, sourceImage, sourceName, resourceType, body, isTrusted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KnowledgeSource)) {
            return false;
        }
        KnowledgeSource knowledgeSource = (KnowledgeSource) other;
        return x44.r(this.url, knowledgeSource.url) && x44.r(this.title, knowledgeSource.title) && x44.r(this.subtitle, knowledgeSource.subtitle) && x44.r(this.sourceImage, knowledgeSource.sourceImage) && x44.r(this.sourceName, knowledgeSource.sourceName) && x44.r(this.resourceType, knowledgeSource.resourceType) && x44.r(this.body, knowledgeSource.body) && this.isTrusted == knowledgeSource.isTrusted;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final SourceImage getSourceImage() {
        return this.sourceImage;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (this.sourceImage.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.sourceName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.resourceType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.body;
        return Boolean.hashCode(this.isTrusted) + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final boolean isTrusted() {
        return this.isTrusted;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.title;
        String str3 = this.subtitle;
        SourceImage sourceImage = this.sourceImage;
        String str4 = this.sourceName;
        String str5 = this.resourceType;
        String str6 = this.body;
        boolean z = this.isTrusted;
        StringBuilder sbR = kgh.r("KnowledgeSource(url=", str, ", title=", str2, ", subtitle=");
        sbR.append(str3);
        sbR.append(", sourceImage=");
        sbR.append(sourceImage);
        sbR.append(", sourceName=");
        kgh.u(sbR, str4, ", resourceType=", str5, ", body=");
        sbR.append(str6);
        sbR.append(", isTrusted=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public KnowledgeSource(String str, String str2, String str3, SourceImage sourceImage, String str4, String str5, String str6, boolean z) {
        sourceImage.getClass();
        this.url = str;
        this.title = str2;
        this.subtitle = str3;
        this.sourceImage = sourceImage;
        this.sourceName = str4;
        this.resourceType = str5;
        this.body = str6;
        this.isTrusted = z;
        this.key = str == null ? knk.F().toString() : str;
    }
}
