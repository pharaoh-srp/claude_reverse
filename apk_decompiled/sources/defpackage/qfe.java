package defpackage;

import com.anthropic.claude.api.project.Project;

/* JADX INFO: loaded from: classes2.dex */
public final class qfe extends iwe {
    public final String b;
    public final wqd c;
    public final zy1 d;
    public final String e;
    public final lsc f;
    public final lsc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfe(String str, wqd wqdVar, h86 h86Var) {
        super(h86Var);
        str.getClass();
        this.b = str;
        this.c = wqdVar;
        this.d = x44.a();
        Project projectB = wqdVar.h.b(str);
        String name = projectB != null ? projectB.getName() : null;
        name = name == null ? "" : name;
        this.e = name;
        int length = name.length();
        this.f = mpk.P(new cjh(name, mwa.m(length, length), 4));
        this.g = mpk.P(Boolean.FALSE);
    }
}
