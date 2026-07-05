package defpackage;

import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.project.create.ProjectTemplateId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class y85 extends iwe {
    public final CreateTemplateProjectScreenParams b;
    public final koi c;
    public final wqd d;
    public final mkd e;
    public final nf7 f;
    public final qi3 g;
    public final hl8 h;
    public final List i;
    public final zy1 j;
    public final zy1 k;
    public final lsc l;
    public final lsc m;
    public final yih n;
    public final lsc o;
    public final lsc p;
    public final wz5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y85(CreateTemplateProjectScreenParams createTemplateProjectScreenParams, koi koiVar, wqd wqdVar, mkd mkdVar, nf7 nf7Var, fod fodVar, h86 h86Var, qi3 qi3Var, hl8 hl8Var) {
        super(h86Var);
        createTemplateProjectScreenParams.getClass();
        this.b = createTemplateProjectScreenParams;
        this.c = koiVar;
        this.d = wqdVar;
        this.e = mkdVar;
        this.f = nf7Var;
        this.g = qi3Var;
        this.h = hl8Var;
        Map map = fodVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ProjectTemplateId) entry.getKey()).getType() == this.b.getProjectType()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.i = w44.p1(linkedHashMap.values());
        this.j = x44.a();
        this.k = x44.a();
        this.l = mpk.P(o75.E);
        this.m = mpk.P(null);
        this.n = new yih("", 2);
        this.o = mpk.P(Boolean.TRUE);
        this.p = mpk.P(Boolean.FALSE);
        this.q = mpk.w(new x85(this, 0));
    }

    public final o75 O() {
        return (o75) this.l.getValue();
    }

    public final znd P() {
        return (znd) this.m.getValue();
    }
}
