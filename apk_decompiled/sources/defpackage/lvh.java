package defpackage;

import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class lvh {
    public final String a;
    public final gh2 b;
    public final pz7 c;
    public final zy7 d;
    public final bz7 e;
    public final bz7 f;
    public final bz7 g;
    public final bz7 h;
    public final boolean i;
    public final zy7 j;
    public final bz7 k;
    public final bz7 l;
    public final bz7 m;
    public final zy7 n;
    public final bz7 o;
    public final bz7 p;
    public final SuggestConnectorsOutputConnectorsItem q;
    public final pz7 r;

    public /* synthetic */ lvh(String str, gh2 gh2Var, pz7 pz7Var, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, mti mtiVar, bz7 bz7Var5, bz7 bz7Var6, bz7 bz7Var7, int i) {
        this(str, gh2Var, pz7Var, zy7Var, bz7Var, bz7Var2, bz7Var3, bz7Var4, false, (i & 512) != 0 ? null : mtiVar, bz7Var5, bz7Var6, bz7Var7, new ll1(10), dah.G, new x2h(24), null, new vj(18));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvh)) {
            return false;
        }
        lvh lvhVar = (lvh) obj;
        return ChatId.m981equalsimpl0(this.a, lvhVar.a) && x44.r(this.b, lvhVar.b) && x44.r(this.c, lvhVar.c) && x44.r(this.d, lvhVar.d) && x44.r(this.e, lvhVar.e) && x44.r(this.f, lvhVar.f) && x44.r(this.g, lvhVar.g) && x44.r(this.h, lvhVar.h) && this.i == lvhVar.i && x44.r(this.j, lvhVar.j) && x44.r(this.k, lvhVar.k) && x44.r(this.l, lvhVar.l) && x44.r(this.m, lvhVar.m) && x44.r(this.n, lvhVar.n) && x44.r(this.o, lvhVar.o) && x44.r(this.p, lvhVar.p) && x44.r(this.q, lvhVar.q) && x44.r(this.r, lvhVar.r);
    }

    public final int hashCode() {
        int iM982hashCodeimpl = ChatId.m982hashCodeimpl(this.a) * 31;
        gh2 gh2Var = this.b;
        int iP = fsh.p(qy1.e(this.h, qy1.e(this.g, qy1.e(this.f, qy1.e(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((iM982hashCodeimpl + (gh2Var == null ? 0 : gh2Var.hashCode())) * 31)) * 31)) * 31, 31), 31), 31), 31), 31, this.i);
        zy7 zy7Var = this.j;
        int iE = qy1.e(this.p, qy1.e(this.o, (this.n.hashCode() + qy1.e(this.m, qy1.e(this.l, qy1.e(this.k, (iP + (zy7Var == null ? 0 : zy7Var.hashCode())) * 31, 31), 31), 31)) * 31, 31), 31);
        SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem = this.q;
        return this.r.hashCode() + ((iE + (suggestConnectorsOutputConnectorsItem != null ? suggestConnectorsOutputConnectorsItem.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ToolActions(chatId=" + ChatId.m983toStringimpl(this.a) + ", errorChannel=" + this.b + ", onCopyMessage=" + this.c + ", onOpenSystemAppSettings=" + this.d + ", onOpenLocation=" + this.e + ", onOpenRoute=" + this.f + ", onToolShown=" + this.g + ", onSendMessage=" + this.h + ", isSending=" + this.i + ", onDismissTool=" + this.j + ", onBrowserTakeOver=" + this.k + ", onOpenFile=" + this.l + ", onOpenImageGallery=" + this.m + ", onReloadConversation=" + this.n + ", onViewTaskDetail=" + this.o + ", onConnectSuggestedConnector=" + this.p + ", connectingSuggestedConnector=" + this.q + ", onSetConnectorSuggestionsEnabled=" + this.r + ")";
    }

    public lvh(String str, gh2 gh2Var, pz7 pz7Var, zy7 zy7Var, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, boolean z, zy7 zy7Var2, bz7 bz7Var5, bz7 bz7Var6, bz7 bz7Var7, zy7 zy7Var3, bz7 bz7Var8, bz7 bz7Var9, SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem, pz7 pz7Var2) {
        str.getClass();
        bz7Var7.getClass();
        this.a = str;
        this.b = gh2Var;
        this.c = pz7Var;
        this.d = zy7Var;
        this.e = bz7Var;
        this.f = bz7Var2;
        this.g = bz7Var3;
        this.h = bz7Var4;
        this.i = z;
        this.j = zy7Var2;
        this.k = bz7Var5;
        this.l = bz7Var6;
        this.m = bz7Var7;
        this.n = zy7Var3;
        this.o = bz7Var8;
        this.p = bz7Var9;
        this.q = suggestConnectorsOutputConnectorsItem;
        this.r = pz7Var2;
    }
}
