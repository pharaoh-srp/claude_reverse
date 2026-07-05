package defpackage;

import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f03 extends iwe {
    public final f9 b;
    public final qi3 c;
    public final oy2 d;
    public final xa3 e;
    public final vd3 f;
    public final dmd g;
    public final wqd h;
    public final q0i i;
    public final b1i j;
    public final koi k;
    public final zy1 l;
    public final wz5 m;
    public final yih n;
    public final lsc o;
    public String p;
    public final lsc q;
    public final lsc r;
    public final gmf s;
    public final tk5 t;
    public final wz5 u;
    public boolean v;
    public final lsc w;
    public final mdg x;
    public final wz5 y;

    public f03(f9 f9Var, qi3 qi3Var, oy2 oy2Var, xa3 xa3Var, vd3 vd3Var, b bVar, dmd dmdVar, vpd vpdVar, wqd wqdVar, q0i q0iVar, b1i b1iVar, koi koiVar, h86 h86Var) {
        super(h86Var);
        this.b = f9Var;
        this.c = qi3Var;
        this.d = oy2Var;
        this.e = xa3Var;
        this.f = vd3Var;
        this.g = dmdVar;
        this.h = wqdVar;
        this.i = q0iVar;
        this.j = b1iVar;
        this.k = koiVar;
        this.l = x44.a();
        this.m = vpdVar.d;
        tp4 tp4Var = null;
        this.n = new yih((String) null, 3);
        this.o = mpk.P(null);
        this.q = mpk.P(null);
        this.r = mpk.P(gnd.F);
        this.s = new gmf(7, this);
        this.t = new tk5(6, this);
        int i = 0;
        gb9.D(this.a, null, null, new zz2(this, tp4Var, i), 3);
        int i2 = 1;
        gb9.D(this.a, null, null, new zz2(this, tp4Var, i2), 3);
        this.u = mpk.w(new xz2(this, i));
        this.v = true;
        this.w = mpk.P(null);
        this.x = new mdg();
        this.y = mpk.w(new xz2(this, i2));
    }

    public final a03 O() {
        return !bsg.I0(P()) ? this.t : this.s;
    }

    public final String P() {
        return this.n.d().G.toString();
    }

    public final void Q(List list) {
        this.o.setValue(list);
    }

    public final String R(String str) {
        ChatConversationSettings settings;
        if (str == null) {
            ToolSearchMode toolSearchMode = (ToolSearchMode) this.k.n.getValue();
            if (toolSearchMode != null) {
                return toolSearchMode.m1156unboximpl();
            }
            return null;
        }
        vd3 vd3Var = this.f;
        vd3Var.getClass();
        ChatConversationWithProjectReference chatConversationWithProjectReferenceT = vd3Var.e.t(str);
        if (chatConversationWithProjectReferenceT == null || (settings = chatConversationWithProjectReferenceT.getSettings()) == null) {
            return null;
        }
        return settings.m188getTool_search_modeOP4DWQA();
    }
}
