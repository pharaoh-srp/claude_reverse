package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

/* JADX INFO: loaded from: classes.dex */
public final class nfe extends iwe {
    public final String b;
    public final vd3 c;
    public final zy1 d;
    public final lsc e;
    public final lsc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfe(String str, vd3 vd3Var, h86 h86Var) {
        cjh cjhVar;
        String name;
        super(h86Var);
        str.getClass();
        this.b = str;
        this.c = vd3Var;
        this.d = x44.a();
        ChatConversationWithProjectReference chatConversationWithProjectReferenceT = vd3Var.e.t(str);
        if (chatConversationWithProjectReferenceT == null || (name = chatConversationWithProjectReferenceT.getName()) == null) {
            cjhVar = new cjh((String) null, 0L, 7);
        } else {
            int length = name.length();
            cjhVar = new cjh(name, mwa.m(length, length), 4);
        }
        this.e = mpk.P(cjhVar);
        this.f = mpk.P(Boolean.FALSE);
    }
}
