package com.anthropic.claude.api.chat.tool;

import defpackage.ebh;
import defpackage.gvj;
import defpackage.h3h;
import defpackage.i3h;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/TableDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "", "", "table", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/TableDisplayContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/TableDisplayContent;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTable", "Companion", "h3h", "i3h", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TableDisplayContent implements ToolDisplayContent {
    public static final int $stable = 0;
    private final List<List<String>> table;
    public static final i3h Companion = new i3h();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new wof(14))};

    public /* synthetic */ TableDisplayContent(int i, List list, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.table = list;
        } else {
            gvj.f(i, 1, h3h.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(new uo0(srg.a, 0), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TableDisplayContent copy$default(TableDisplayContent tableDisplayContent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tableDisplayContent.table;
        }
        return tableDisplayContent.copy(list);
    }

    public final List<List<String>> component1() {
        return this.table;
    }

    public final TableDisplayContent copy(List<? extends List<String>> table) {
        table.getClass();
        return new TableDisplayContent(table);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TableDisplayContent) && x44.r(this.table, ((TableDisplayContent) other).table);
    }

    public final List<List<String>> getTable() {
        return this.table;
    }

    public int hashCode() {
        return this.table.hashCode();
    }

    public String toString() {
        return ebh.n("TableDisplayContent(table=", ")", this.table);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TableDisplayContent(List<? extends List<String>> list) {
        list.getClass();
        this.table = list;
    }
}
