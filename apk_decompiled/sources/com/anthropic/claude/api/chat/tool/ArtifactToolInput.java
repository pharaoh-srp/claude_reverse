package com.anthropic.claude.api.chat.tool;

import com.anthropic.claude.api.chat.citation.Citation;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.eg3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.os0;
import defpackage.qt0;
import defpackage.rt0;
import defpackage.srg;
import defpackage.uo0;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&Jr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001eR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006="}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ArtifactToolInput;", "", "", "id", "type", "title", "language", "source", "command", "content", "", "Lcom/anthropic/claude/api/chat/citation/Citation;", "md_citations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ArtifactToolInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/ArtifactToolInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getType", "getTitle", "getLanguage", "getSource", "getCommand", "getContent", "Ljava/util/List;", "getMd_citations", "Companion", "qt0", "rt0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactToolInput {
    public static final int $stable = 0;
    private final String command;
    private final String content;
    private final String id;
    private final String language;
    private final List<Citation> md_citations;
    private final String source;
    private final String title;
    private final String type;
    public static final rt0 Companion = new rt0();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, yb5.w(w1a.F, new os0(11))};

    public /* synthetic */ ArtifactToolInput(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, vnf vnfVar) {
        if (33 != (i & 33)) {
            gvj.f(i, 33, qt0.a.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.language = null;
        } else {
            this.language = str4;
        }
        if ((i & 16) == 0) {
            this.source = null;
        } else {
            this.source = str5;
        }
        this.command = str6;
        if ((i & 64) == 0) {
            this.content = null;
        } else {
            this.content = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.md_citations = null;
        } else {
            this.md_citations = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(eg3.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArtifactToolInput copy$default(ArtifactToolInput artifactToolInput, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactToolInput.id;
        }
        if ((i & 2) != 0) {
            str2 = artifactToolInput.type;
        }
        if ((i & 4) != 0) {
            str3 = artifactToolInput.title;
        }
        if ((i & 8) != 0) {
            str4 = artifactToolInput.language;
        }
        if ((i & 16) != 0) {
            str5 = artifactToolInput.source;
        }
        if ((i & 32) != 0) {
            str6 = artifactToolInput.command;
        }
        if ((i & 64) != 0) {
            str7 = artifactToolInput.content;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list = artifactToolInput.md_citations;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        return artifactToolInput.copy(str, str2, str3, str4, str9, str10, str8, list2);
    }

    public static final /* synthetic */ void write$Self$api(ArtifactToolInput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 1, srg.a, self.type);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 2, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.language != null) {
            output.B(serialDesc, 3, srg.a, self.language);
        }
        if (output.E(serialDesc) || self.source != null) {
            output.B(serialDesc, 4, srg.a, self.source);
        }
        output.q(serialDesc, 5, self.command);
        if (output.E(serialDesc) || self.content != null) {
            output.B(serialDesc, 6, srg.a, self.content);
        }
        if (!output.E(serialDesc) && self.md_citations == null) {
            return;
        }
        output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.md_citations);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final List<Citation> component8() {
        return this.md_citations;
    }

    public final ArtifactToolInput copy(String id, String type, String title, String language, String source, String command, String content, List<Citation> md_citations) {
        id.getClass();
        command.getClass();
        return new ArtifactToolInput(id, type, title, language, source, command, content, md_citations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactToolInput)) {
            return false;
        }
        ArtifactToolInput artifactToolInput = (ArtifactToolInput) other;
        return x44.r(this.id, artifactToolInput.id) && x44.r(this.type, artifactToolInput.type) && x44.r(this.title, artifactToolInput.title) && x44.r(this.language, artifactToolInput.language) && x44.r(this.source, artifactToolInput.source) && x44.r(this.command, artifactToolInput.command) && x44.r(this.content, artifactToolInput.content) && x44.r(this.md_citations, artifactToolInput.md_citations);
    }

    public final String getCommand() {
        return this.command;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final List<Citation> getMd_citations() {
        return this.md_citations;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int iL = kgh.l((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.command);
        String str5 = this.content;
        int iHashCode5 = (iL + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<Citation> list = this.md_citations;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.language;
        String str5 = this.source;
        String str6 = this.command;
        String str7 = this.content;
        List<Citation> list = this.md_citations;
        StringBuilder sbR = kgh.r("ArtifactToolInput(id=", str, ", type=", str2, ", title=");
        kgh.u(sbR, str3, ", language=", str4, ", source=");
        kgh.u(sbR, str5, ", command=", str6, ", content=");
        sbR.append(str7);
        sbR.append(", md_citations=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public ArtifactToolInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Citation> list) {
        str.getClass();
        str6.getClass();
        this.id = str;
        this.type = str2;
        this.title = str3;
        this.language = str4;
        this.source = str5;
        this.command = str6;
        this.content = str7;
        this.md_citations = list;
    }

    public /* synthetic */ ArtifactToolInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list);
    }
}
