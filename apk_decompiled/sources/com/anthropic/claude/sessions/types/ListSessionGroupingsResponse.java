package com.anthropic.claude.sessions.types;

import defpackage.laa;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.tme;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/sessions/types/ListSessionGroupingsResponse;", "", "", "Lcom/anthropic/claude/sessions/types/SessionGrouping;", "data", "", "next_cursor", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ListSessionGroupingsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ListSessionGroupingsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getData", "getData$annotations", "()V", "Ljava/lang/String;", "getNext_cursor", "Companion", "kaa", "laa", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ListSessionGroupingsResponse {
    public static final laa Companion = new laa();
    private final List<SessionGrouping> data;
    private final String next_cursor;

    public /* synthetic */ ListSessionGroupingsResponse(int i, List list, String str, vnf vnfVar) {
        this.data = (i & 1) == 0 ? lm6.E : list;
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListSessionGroupingsResponse copy$default(ListSessionGroupingsResponse listSessionGroupingsResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listSessionGroupingsResponse.data;
        }
        if ((i & 2) != 0) {
            str = listSessionGroupingsResponse.next_cursor;
        }
        return listSessionGroupingsResponse.copy(list, str);
    }

    @onf(with = tme.class)
    public static /* synthetic */ void getData$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(ListSessionGroupingsResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.data, lm6.E)) {
            output.r(serialDesc, 0, tme.d, self.data);
        }
        if (!output.E(serialDesc) && self.next_cursor == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.next_cursor);
    }

    public final List<SessionGrouping> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final ListSessionGroupingsResponse copy(List<SessionGrouping> data, String next_cursor) {
        data.getClass();
        return new ListSessionGroupingsResponse(data, next_cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListSessionGroupingsResponse)) {
            return false;
        }
        ListSessionGroupingsResponse listSessionGroupingsResponse = (ListSessionGroupingsResponse) other;
        return x44.r(this.data, listSessionGroupingsResponse.data) && x44.r(this.next_cursor, listSessionGroupingsResponse.next_cursor);
    }

    public final List<SessionGrouping> getData() {
        return this.data;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        String str = this.next_cursor;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ListSessionGroupingsResponse(data=" + this.data + ", next_cursor=" + this.next_cursor + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListSessionGroupingsResponse() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ListSessionGroupingsResponse(List<SessionGrouping> list, String str) {
        list.getClass();
        this.data = list;
        this.next_cursor = str;
    }

    public /* synthetic */ ListSessionGroupingsResponse(List list, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? lm6.E : list, (i & 2) != 0 ? null : str);
    }
}
