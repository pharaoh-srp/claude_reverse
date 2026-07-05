package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.chat.tool.Tool;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jvh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.nlh;
import defpackage.onf;
import defpackage.sz6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \t2\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool;", "", "Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;", "toApiModel", "()Lcom/anthropic/claude/api/chat/tool/Tool$KnownTool;", "", "getName", "()Ljava/lang/String;", "name", "Companion", "jvh", "Analysis", "WebSearch", "DriveSearch", "Compass", "Artifacts", "Unknown", "com/anthropic/claude/tool/model/f", "Lcom/anthropic/claude/tool/model/Tool$Analysis;", "Lcom/anthropic/claude/tool/model/Tool$Artifacts;", "Lcom/anthropic/claude/tool/model/Tool$Compass;", "Lcom/anthropic/claude/tool/model/Tool$DriveSearch;", "Lcom/anthropic/claude/tool/model/Tool$Unknown;", "Lcom/anthropic/claude/tool/model/Tool$WebSearch;", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface Tool {
    public static final f Companion = f.a;

    /* JADX INFO: loaded from: classes3.dex */
    @lz5
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$Analysis;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "type", "getType", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Analysis implements Tool, jvh {
        public static final Analysis INSTANCE = new Analysis();
        private static final String name = "repl";
        private static final String type = "repl_v0";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(16));

        private Analysis() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.model.Tool.Analysis", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Analysis);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -162532168;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return "Analysis";
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$Artifacts;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "type", "getType", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Artifacts implements Tool, jvh {
        public static final Artifacts INSTANCE = new Artifacts();
        private static final String name = "artifacts";
        private static final String type = "artifacts_v0";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(17));

        private Artifacts() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.model.Tool.Artifacts", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Artifacts);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1511468677;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return "Artifacts";
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$Compass;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "type", "getType", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Compass implements Tool, jvh {
        public static final Compass INSTANCE = new Compass();
        private static final String name = "launch_extended_search_task";
        private static final String type = "launch_extended_search_task_v0";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(18));

        private Compass() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.model.Tool.Compass", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Compass);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1671024566;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return "Compass";
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$DriveSearch;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "type", "getType", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class DriveSearch implements Tool, jvh {
        public static final DriveSearch INSTANCE = new DriveSearch();
        private static final String name = "drive_search";
        private static final String type = "drive_search_v0";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(19));

        private DriveSearch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.model.Tool.DriveSearch", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DriveSearch);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -1971602314;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return "DriveSearch";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$WebSearch;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "type", "getType", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class WebSearch implements Tool, jvh {
        public static final WebSearch INSTANCE = new WebSearch();
        private static final String name = "web_search";
        private static final String type = "web_search_v0";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new nlh(12));

        private WebSearch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tool.model.Tool.WebSearch", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WebSearch);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -205469760;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return "WebSearch";
        }
    }

    String getName();

    default Tool.KnownTool toApiModel() {
        jvh jvhVar = this instanceof jvh ? (jvh) this : null;
        if (jvhVar != null) {
            return new Tool.KnownTool(getName(), jvhVar.getType());
        }
        sz6.p("Tool must be a KnownTool to convert to API model");
        return null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002'(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010\u0017¨\u0006)"}, d2 = {"Lcom/anthropic/claude/tool/model/Tool$Unknown;", "Lcom/anthropic/claude/tool/model/Tool;", "Ljvh;", "", "name", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/Tool$Unknown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/Tool$Unknown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getType", "Companion", "com/anthropic/claude/tool/model/g", "com/anthropic/claude/tool/model/h", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements Tool, jvh {
        public static final h Companion = new h();
        private final String name;
        private final String type;

        public /* synthetic */ Unknown(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, g.a.getDescriptor());
                throw null;
            }
            this.name = str;
            this.type = str2;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.name;
            }
            if ((i & 2) != 0) {
                str2 = unknown.type;
            }
            return unknown.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$Claude_tool_model(Unknown self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getName());
            output.q(serialDesc, 1, self.getType());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Unknown copy(String name, String type) {
            name.getClass();
            type.getClass();
            return new Unknown(name, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return x44.r(this.name, unknown.name) && x44.r(this.type, unknown.type);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public String getName() {
            return this.name;
        }

        @Override // defpackage.jvh
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        @Override // com.anthropic.claude.tool.model.Tool
        public /* bridge */ Tool.KnownTool toApiModel() {
            return super.toApiModel();
        }

        public String toString() {
            return ij0.l("Unknown(name=", this.name, ", type=", this.type, ")");
        }

        public Unknown(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.type = str2;
        }
    }
}
