package com.anthropic.claude.chat.parse;

import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n9b;
import defpackage.onf;
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
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0003+,-B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006."}, d2 = {"com/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent", "", "", "", "path_segments", "Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;", "parsed", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;Lvnf;)V", "Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;", "copy", "(Ljava/util/List;Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;)Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPath_segments", "Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;", "getParsed", "Companion", "Parsed", "com/anthropic/claude/chat/parse/b", "n9b", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class MelangeMemoryFormat$StructuredContent {
    private final Parsed parsed;
    private final List<String> path_segments;
    public static final n9b Companion = new n9b();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new a()), null};

    public /* synthetic */ MelangeMemoryFormat$StructuredContent(int i, List list, Parsed parsed, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.path_segments = null;
        } else {
            this.path_segments = list;
        }
        if ((i & 2) == 0) {
            this.parsed = null;
        } else {
            this.parsed = parsed;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MelangeMemoryFormat$StructuredContent copy$default(MelangeMemoryFormat$StructuredContent melangeMemoryFormat$StructuredContent, List list, Parsed parsed, int i, Object obj) {
        if ((i & 1) != 0) {
            list = melangeMemoryFormat$StructuredContent.path_segments;
        }
        if ((i & 2) != 0) {
            parsed = melangeMemoryFormat$StructuredContent.parsed;
        }
        return melangeMemoryFormat$StructuredContent.copy(list, parsed);
    }

    public static final /* synthetic */ void write$Self$Claude_chat_parse(MelangeMemoryFormat$StructuredContent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.path_segments != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.path_segments);
        }
        if (!output.E(serialDesc) && self.parsed == null) {
            return;
        }
        output.B(serialDesc, 1, c.a, self.parsed);
    }

    public final List<String> component1() {
        return this.path_segments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Parsed getParsed() {
        return this.parsed;
    }

    public final MelangeMemoryFormat$StructuredContent copy(List<String> path_segments, Parsed parsed) {
        return new MelangeMemoryFormat$StructuredContent(path_segments, parsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MelangeMemoryFormat$StructuredContent)) {
            return false;
        }
        MelangeMemoryFormat$StructuredContent melangeMemoryFormat$StructuredContent = (MelangeMemoryFormat$StructuredContent) other;
        return x44.r(this.path_segments, melangeMemoryFormat$StructuredContent.path_segments) && x44.r(this.parsed, melangeMemoryFormat$StructuredContent.parsed);
    }

    public final Parsed getParsed() {
        return this.parsed;
    }

    public final List<String> getPath_segments() {
        return this.path_segments;
    }

    public int hashCode() {
        List<String> list = this.path_segments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Parsed parsed = this.parsed;
        return iHashCode + (parsed != null ? parsed.hashCode() : 0);
    }

    public String toString() {
        return "StructuredContent(path_segments=" + this.path_segments + ", parsed=" + this.parsed + ")";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/parse/MelangeMemoryFormat$StructuredContent$Parsed;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Companion", "com/anthropic/claude/chat/parse/c", "com/anthropic/claude/chat/parse/d", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Parsed {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String description;

        public /* synthetic */ Parsed(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.description = null;
            } else {
                this.description = str;
            }
        }

        public static /* synthetic */ Parsed copy$default(Parsed parsed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parsed.description;
            }
            return parsed.copy(str);
        }

        public static final /* synthetic */ void write$Self$Claude_chat_parse(Parsed self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.description == null) {
                return;
            }
            output.B(serialDesc, 0, srg.a, self.description);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Parsed copy(String description) {
            return new Parsed(description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Parsed) && x44.r(this.description, ((Parsed) other).description);
        }

        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            String str = this.description;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ij0.j("Parsed(description=", this.description, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Parsed() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Parsed(String str) {
            this.description = str;
        }

        public /* synthetic */ Parsed(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MelangeMemoryFormat$StructuredContent() {
        this((List) null, (Parsed) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public MelangeMemoryFormat$StructuredContent(List<String> list, Parsed parsed) {
        this.path_segments = list;
        this.parsed = parsed;
    }

    public /* synthetic */ MelangeMemoryFormat$StructuredContent(List list, Parsed parsed, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : parsed);
    }
}
