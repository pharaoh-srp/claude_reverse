package com.anthropic.claude.api.chat.citation;

import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fg3;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ng3;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w44;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0088\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b\t\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b>\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b?\u0010\u0018R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010$R\u0011\u0010C\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u0010DR\u0013\u0010G\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bF\u0010\u0018¨\u0006K"}, d2 = {"Lcom/anthropic/claude/api/chat/citation/Citation;", "", "", "uuid", "title", "", "Lcom/anthropic/claude/api/chat/citation/CitationSource;", "sources", "", "is_trusted", "", "start_index", "end_index", "url", "subtitles", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "()Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/tool/SourceMetadata;)Lcom/anthropic/claude/api/chat/citation/Citation;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/citation/Citation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid", "getTitle", "Ljava/util/List;", "getSources", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getStart_index", "getEnd_index", "getUrl", "getSubtitles", "Lcom/anthropic/claude/api/chat/tool/SourceMetadata;", "getMetadata", "isGrouped", "()Z", "isTrusted", "getSourceUrl", "sourceUrl", "Companion", "eg3", "fg3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Citation {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final fg3 Companion = new fg3();
    private final Integer end_index;
    private final Boolean is_trusted;
    private final SourceMetadata metadata;
    private final List<CitationSource> sources;
    private final Integer start_index;
    private final List<String> subtitles;
    private final String title;
    private final String url;
    private final String uuid;

    static {
        wy2 wy2Var = new wy2(21);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, wy2Var), null, null, null, null, yb5.w(w1aVar, new wy2(22)), yb5.w(w1aVar, new wy2(23))};
    }

    public /* synthetic */ Citation(int i, String str, String str2, List list, Boolean bool, Integer num, Integer num2, String str3, List list2, SourceMetadata sourceMetadata, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.sources = null;
        } else {
            this.sources = list;
        }
        if ((i & 8) == 0) {
            this.is_trusted = null;
        } else {
            this.is_trusted = bool;
        }
        if ((i & 16) == 0) {
            this.start_index = null;
        } else {
            this.start_index = num;
        }
        if ((i & 32) == 0) {
            this.end_index = null;
        } else {
            this.end_index = num2;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.subtitles = null;
        } else {
            this.subtitles = list2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.metadata = null;
        } else {
            this.metadata = sourceMetadata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ng3.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return SourceMetadata.Companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Citation copy$default(Citation citation, String str, String str2, List list, Boolean bool, Integer num, Integer num2, String str3, List list2, SourceMetadata sourceMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = citation.uuid;
        }
        if ((i & 2) != 0) {
            str2 = citation.title;
        }
        if ((i & 4) != 0) {
            list = citation.sources;
        }
        if ((i & 8) != 0) {
            bool = citation.is_trusted;
        }
        if ((i & 16) != 0) {
            num = citation.start_index;
        }
        if ((i & 32) != 0) {
            num2 = citation.end_index;
        }
        if ((i & 64) != 0) {
            str3 = citation.url;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list2 = citation.subtitles;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            sourceMetadata = citation.metadata;
        }
        List list3 = list2;
        SourceMetadata sourceMetadata2 = sourceMetadata;
        Integer num3 = num2;
        String str4 = str3;
        Integer num4 = num;
        List list4 = list;
        return citation.copy(str, str2, list4, bool, num4, num3, str4, list3, sourceMetadata2);
    }

    public static final /* synthetic */ void write$Self$api(Citation self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.uuid != null) {
            output.B(serialDesc, 0, srg.a, self.uuid);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 1, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.sources != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.sources);
        }
        if (output.E(serialDesc) || self.is_trusted != null) {
            output.B(serialDesc, 3, zt1.a, self.is_trusted);
        }
        if (output.E(serialDesc) || self.start_index != null) {
            output.B(serialDesc, 4, e79.a, self.start_index);
        }
        if (output.E(serialDesc) || self.end_index != null) {
            output.B(serialDesc, 5, e79.a, self.end_index);
        }
        if (output.E(serialDesc) || self.url != null) {
            output.B(serialDesc, 6, srg.a, self.url);
        }
        if (output.E(serialDesc) || self.subtitles != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.subtitles);
        }
        if (!output.E(serialDesc) && self.metadata == null) {
            return;
        }
        output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<CitationSource> component3() {
        return this.sources;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIs_trusted() {
        return this.is_trusted;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStart_index() {
        return this.start_index;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getEnd_index() {
        return this.end_index;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final List<String> component8() {
        return this.subtitles;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SourceMetadata getMetadata() {
        return this.metadata;
    }

    public final Citation copy(String uuid, String title, List<CitationSource> sources, Boolean is_trusted, Integer start_index, Integer end_index, String url, List<String> subtitles, SourceMetadata metadata) {
        return new Citation(uuid, title, sources, is_trusted, start_index, end_index, url, subtitles, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Citation)) {
            return false;
        }
        Citation citation = (Citation) other;
        return x44.r(this.uuid, citation.uuid) && x44.r(this.title, citation.title) && x44.r(this.sources, citation.sources) && x44.r(this.is_trusted, citation.is_trusted) && x44.r(this.start_index, citation.start_index) && x44.r(this.end_index, citation.end_index) && x44.r(this.url, citation.url) && x44.r(this.subtitles, citation.subtitles) && x44.r(this.metadata, citation.metadata);
    }

    public final Integer getEnd_index() {
        return this.end_index;
    }

    public final SourceMetadata getMetadata() {
        return this.metadata;
    }

    public final String getSourceUrl() {
        CitationSource citationSource;
        String url;
        List<CitationSource> list = this.sources;
        return (list == null || (citationSource = (CitationSource) w44.N0(list)) == null || (url = citationSource.getUrl()) == null) ? this.url : url;
    }

    public final List<CitationSource> getSources() {
        return this.sources;
    }

    public final Integer getStart_index() {
        return this.start_index;
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

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.uuid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CitationSource> list = this.sources;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.is_trusted;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.start_index;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.end_index;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.subtitles;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SourceMetadata sourceMetadata = this.metadata;
        return iHashCode8 + (sourceMetadata != null ? sourceMetadata.hashCode() : 0);
    }

    public final boolean isGrouped() {
        List<CitationSource> list = this.sources;
        return (list != null ? list.size() : 0) > 1;
    }

    public final boolean isTrusted() {
        return !x44.r(this.is_trusted, Boolean.FALSE);
    }

    public final Boolean is_trusted() {
        return this.is_trusted;
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.title;
        List<CitationSource> list = this.sources;
        Boolean bool = this.is_trusted;
        Integer num = this.start_index;
        Integer num2 = this.end_index;
        String str3 = this.url;
        List<String> list2 = this.subtitles;
        SourceMetadata sourceMetadata = this.metadata;
        StringBuilder sbR = kgh.r("Citation(uuid=", str, ", title=", str2, ", sources=");
        sbR.append(list);
        sbR.append(", is_trusted=");
        sbR.append(bool);
        sbR.append(", start_index=");
        sbR.append(num);
        sbR.append(", end_index=");
        sbR.append(num2);
        sbR.append(", url=");
        qy1.p(str3, ", subtitles=", ", metadata=", sbR, list2);
        sbR.append(sourceMetadata);
        sbR.append(")");
        return sbR.toString();
    }

    public Citation() {
        this((String) null, (String) null, (List) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (List) null, (SourceMetadata) null, 511, (mq5) null);
    }

    public Citation(String str, String str2, List<CitationSource> list, Boolean bool, Integer num, Integer num2, String str3, List<String> list2, SourceMetadata sourceMetadata) {
        this.uuid = str;
        this.title = str2;
        this.sources = list;
        this.is_trusted = bool;
        this.start_index = num;
        this.end_index = num2;
        this.url = str3;
        this.subtitles = list2;
        this.metadata = sourceMetadata;
    }

    public /* synthetic */ Citation(String str, String str2, List list, Boolean bool, Integer num, Integer num2, String str3, List list2, SourceMetadata sourceMetadata, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : sourceMetadata);
    }
}
