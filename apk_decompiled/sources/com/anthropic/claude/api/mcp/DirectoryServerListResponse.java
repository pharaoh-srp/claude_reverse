package com.anthropic.claude.api.mcp;

import defpackage.h85;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.m56;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServerListResponse;", "", "", "Lcom/anthropic/claude/api/mcp/DirectoryServer;", "servers", "", "total", "", "next_cursor", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/DirectoryServerListResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ILjava/lang/String;)Lcom/anthropic/claude/api/mcp/DirectoryServerListResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getServers", "I", "getTotal", "Ljava/lang/String;", "getNext_cursor", "Companion", "l56", "m56", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DirectoryServerListResponse {
    public static final int $stable = 0;
    private final String next_cursor;
    private final List<DirectoryServer> servers;
    private final int total;
    public static final m56 Companion = new m56();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new h85(22)), null, null};

    public /* synthetic */ DirectoryServerListResponse(int i, List list, int i2, String str, vnf vnfVar) {
        this.servers = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.total = 0;
        } else {
            this.total = i2;
        }
        if ((i & 4) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectoryServerListResponse copy$default(DirectoryServerListResponse directoryServerListResponse, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = directoryServerListResponse.servers;
        }
        if ((i2 & 2) != 0) {
            i = directoryServerListResponse.total;
        }
        if ((i2 & 4) != 0) {
            str = directoryServerListResponse.next_cursor;
        }
        return directoryServerListResponse.copy(list, i, str);
    }

    public static final /* synthetic */ void write$Self$api(DirectoryServerListResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.servers, lm6.E)) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.servers);
        }
        if (output.E(serialDesc) || self.total != 0) {
            output.l(1, self.total, serialDesc);
        }
        if (!output.E(serialDesc) && self.next_cursor == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.next_cursor);
    }

    public final List<DirectoryServer> component1() {
        return this.servers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final DirectoryServerListResponse copy(List<DirectoryServer> servers, int total, String next_cursor) {
        servers.getClass();
        return new DirectoryServerListResponse(servers, total, next_cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectoryServerListResponse)) {
            return false;
        }
        DirectoryServerListResponse directoryServerListResponse = (DirectoryServerListResponse) other;
        return x44.r(this.servers, directoryServerListResponse.servers) && this.total == directoryServerListResponse.total && x44.r(this.next_cursor, directoryServerListResponse.next_cursor);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final List<DirectoryServer> getServers() {
        return this.servers;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iC = vb7.c(this.total, this.servers.hashCode() * 31, 31);
        String str = this.next_cursor;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<DirectoryServer> list = this.servers;
        int i = this.total;
        String str = this.next_cursor;
        StringBuilder sb = new StringBuilder("DirectoryServerListResponse(servers=");
        sb.append(list);
        sb.append(", total=");
        sb.append(i);
        sb.append(", next_cursor=");
        return ij0.m(sb, str, ")");
    }

    public DirectoryServerListResponse() {
        this((List) null, 0, (String) null, 7, (mq5) null);
    }

    public DirectoryServerListResponse(List<DirectoryServer> list, int i, String str) {
        list.getClass();
        this.servers = list;
        this.total = i;
        this.next_cursor = str;
    }

    public /* synthetic */ DirectoryServerListResponse(List list, int i, String str, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? lm6.E : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
