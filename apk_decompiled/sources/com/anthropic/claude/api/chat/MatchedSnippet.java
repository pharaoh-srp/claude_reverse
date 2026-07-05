package com.anthropic.claude.api.chat;

import defpackage.gvj;
import defpackage.iva;
import defpackage.kva;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.lva;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/MatchedSnippet;", "", "", "text", "", "Lcom/anthropic/claude/api/chat/MatchSpan;", "matches", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MatchedSnippet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/api/chat/MatchedSnippet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getMatches", "Companion", "kva", "lva", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MatchedSnippet {
    public static final int $stable = 0;
    private final List<MatchSpan> matches;
    private final String text;
    public static final lva Companion = new lva();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new mia(8))};

    public /* synthetic */ MatchedSnippet(int i, String str, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, kva.a.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.matches = lm6.E;
        } else {
            this.matches = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(iva.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchedSnippet copy$default(MatchedSnippet matchedSnippet, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchedSnippet.text;
        }
        if ((i & 2) != 0) {
            list = matchedSnippet.matches;
        }
        return matchedSnippet.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$api(MatchedSnippet self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.text);
        if (!output.E(serialDesc) && x44.r(self.matches, lm6.E)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.matches);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<MatchSpan> component2() {
        return this.matches;
    }

    public final MatchedSnippet copy(String text, List<MatchSpan> matches) {
        text.getClass();
        matches.getClass();
        return new MatchedSnippet(text, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchedSnippet)) {
            return false;
        }
        MatchedSnippet matchedSnippet = (MatchedSnippet) other;
        return x44.r(this.text, matchedSnippet.text) && x44.r(this.matches, matchedSnippet.matches);
    }

    public final List<MatchSpan> getMatches() {
        return this.matches;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.matches.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return y6a.o("MatchedSnippet(text=", this.text, ", matches=", this.matches, ")");
    }

    public MatchedSnippet(String str, List<MatchSpan> list) {
        str.getClass();
        list.getClass();
        this.text = str;
        this.matches = list;
    }

    public /* synthetic */ MatchedSnippet(String str, List list, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? lm6.E : list);
    }
}
