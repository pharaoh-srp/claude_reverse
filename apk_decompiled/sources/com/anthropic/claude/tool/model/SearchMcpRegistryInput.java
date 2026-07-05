package com.anthropic.claude.tool.model;

import defpackage.def;
import defpackage.ebh;
import defpackage.eef;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"Lcom/anthropic/claude/tool/model/SearchMcpRegistryInput;", "", "", "", "keywords", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/SearchMcpRegistryInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/tool/model/SearchMcpRegistryInput;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getKeywords", "Companion", "def", "eef", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SearchMcpRegistryInput {
    private final List<String> keywords;
    public static final eef Companion = new eef();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new zcd(27))};

    public /* synthetic */ SearchMcpRegistryInput(int i, List list, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.keywords = list;
        } else {
            gvj.f(i, 1, def.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMcpRegistryInput copy$default(SearchMcpRegistryInput searchMcpRegistryInput, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchMcpRegistryInput.keywords;
        }
        return searchMcpRegistryInput.copy(list);
    }

    public final List<String> component1() {
        return this.keywords;
    }

    public final SearchMcpRegistryInput copy(List<String> keywords) {
        keywords.getClass();
        return new SearchMcpRegistryInput(keywords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchMcpRegistryInput) && x44.r(this.keywords, ((SearchMcpRegistryInput) other).keywords);
    }

    public final List<String> getKeywords() {
        return this.keywords;
    }

    public int hashCode() {
        return this.keywords.hashCode();
    }

    public String toString() {
        return ebh.n("SearchMcpRegistryInput(keywords=", ")", this.keywords);
    }

    public SearchMcpRegistryInput(List<String> list) {
        list.getClass();
        this.keywords = list;
    }
}
