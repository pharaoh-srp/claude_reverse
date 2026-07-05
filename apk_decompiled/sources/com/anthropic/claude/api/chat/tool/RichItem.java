package com.anthropic.claude.api.chat.tool;

import defpackage.afe;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.onf;
import defpackage.srg;
import defpackage.tse;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ^\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/RichItem;", "", "", "url", "title", "", "subtitles", "icon_url", "resource_type", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/RichItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/RichItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getTitle", "Ljava/util/List;", "getSubtitles", "getIcon_url", "getResource_type", "getSource", "Companion", "sse", "tse", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RichItem {
    public static final int $stable = 0;
    private final String icon_url;
    private final String resource_type;
    private final String source;
    private final List<String> subtitles;
    private final String title;
    private final String url;
    public static final tse Companion = new tse();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new afe(13)), null, null, null};

    public /* synthetic */ RichItem(int i, String str, String str2, List list, String str3, String str4, String str5, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitles = null;
        } else {
            this.subtitles = list;
        }
        if ((i & 8) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str3;
        }
        if ((i & 16) == 0) {
            this.resource_type = null;
        } else {
            this.resource_type = str4;
        }
        if ((i & 32) == 0) {
            this.source = null;
        } else {
            this.source = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RichItem copy$default(RichItem richItem, String str, String str2, List list, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richItem.url;
        }
        if ((i & 2) != 0) {
            str2 = richItem.title;
        }
        if ((i & 4) != 0) {
            list = richItem.subtitles;
        }
        if ((i & 8) != 0) {
            str3 = richItem.icon_url;
        }
        if ((i & 16) != 0) {
            str4 = richItem.resource_type;
        }
        if ((i & 32) != 0) {
            str5 = richItem.source;
        }
        String str6 = str4;
        String str7 = str5;
        return richItem.copy(str, str2, list, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$api(RichItem self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 0, srg.a, self.url);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 1, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.subtitles != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.subtitles);
        }
        if (output.E(serialDesc) || self.icon_url != null) {
            output.B(serialDesc, 3, srg.a, self.icon_url);
        }
        if (output.E(serialDesc) || self.resource_type != null) {
            output.B(serialDesc, 4, srg.a, self.resource_type);
        }
        if (!output.E(serialDesc) && self.source == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component3() {
        return this.subtitles;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon_url() {
        return this.icon_url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getResource_type() {
        return this.resource_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final RichItem copy(String url, String title, List<String> subtitles, String icon_url, String resource_type, String source) {
        return new RichItem(url, title, subtitles, icon_url, resource_type, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichItem)) {
            return false;
        }
        RichItem richItem = (RichItem) other;
        return x44.r(this.url, richItem.url) && x44.r(this.title, richItem.title) && x44.r(this.subtitles, richItem.subtitles) && x44.r(this.icon_url, richItem.icon_url) && x44.r(this.resource_type, richItem.resource_type) && x44.r(this.source, richItem.source);
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getResource_type() {
        return this.resource_type;
    }

    public final String getSource() {
        return this.source;
    }

    public final List<String> getSubtitles() {
        return this.subtitles;
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
        List<String> list = this.subtitles;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.icon_url;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resource_type;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.source;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.title;
        List<String> list = this.subtitles;
        String str3 = this.icon_url;
        String str4 = this.resource_type;
        String str5 = this.source;
        StringBuilder sbR = kgh.r("RichItem(url=", str, ", title=", str2, ", subtitles=");
        ms6.x(", icon_url=", str3, ", resource_type=", sbR, list);
        return vb7.t(sbR, str4, ", source=", str5, ")");
    }

    public RichItem() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 63, (mq5) null);
    }

    public RichItem(String str, String str2, List<String> list, String str3, String str4, String str5) {
        this.url = str;
        this.title = str2;
        this.subtitles = list;
        this.icon_url = str3;
        this.resource_type = str4;
        this.source = str5;
    }

    public /* synthetic */ RichItem(String str, String str2, List list, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
