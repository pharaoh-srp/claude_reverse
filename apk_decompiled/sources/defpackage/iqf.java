package defpackage;

import com.anthropic.claude.code.remote.i;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iqf {
    public final jrf a;
    public final l45 b;
    public final i c;
    public final ik6 d;
    public final Map e;
    public final amg f;
    public final a4e g;
    public final amg h;
    public final amg i;
    public final amg j;
    public final amg k;
    public final a4e l;
    public fkg m;
    public hqf n;

    public iqf(jrf jrfVar, mp4 mp4Var, wt3 wt3Var, wt3 wt3Var2, i iVar, ik6 ik6Var) {
        mp4Var.getClass();
        this.a = jrfVar;
        this.b = mp4Var;
        this.c = iVar;
        this.d = ik6Var;
        this.e = new mdg();
        amg amgVarA = bmg.a(mh4.a);
        this.f = amgVarA;
        this.g = j8.k(amgVarA);
        this.h = bmg.a(null);
        this.i = bmg.a(Boolean.FALSE);
        this.j = bmg.a(null);
        amg amgVarA2 = bmg.a(new nuf(false, false));
        this.k = amgVarA2;
        this.l = j8.k(amgVarA2);
        gb9.D(mp4Var, null, null, new gqf(this, null, 0), 3);
    }

    public static final String a(iqf iqfVar, alf alfVar) {
        nf0 nf0Var = alfVar.b;
        if (!(nf0Var instanceof lf0)) {
            if (nf0Var instanceof mf0) {
                return ltk.n(((mf0) nf0Var).a);
            }
            if (nf0Var == null) {
                return ltk.n(alfVar.a);
            }
            wg6.i();
            return null;
        }
        lf0 lf0Var = (lf0) nf0Var;
        bj3 bj3Var = lf0Var.b;
        String d = bj3Var.getC();
        if (d == null) {
            d = jce.a.b(bj3Var.getClass()).f();
            if (d == null) {
                d = "ClaudeApiError";
            }
        }
        return d + " (http " + lf0Var.a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b0 A[LOOP:9: B:175:0x03aa->B:177:0x03b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0513 A[LOOP:13: B:243:0x050d->B:245:0x0513, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:756:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:777:0x045a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARN: Type inference failed for: r5v40, types: [c45, o45, tp4] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [fkg, java.lang.Long, java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.fvf r33) {
        /*
            Method dump skipped, instruction units count: 3277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqf.b(fvf):void");
    }

    public final void c(String str, boolean z, boolean z2, Boolean bool) {
        this.n = new hqf(str, z, z2, bool);
        fkg fkgVar = this.m;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.m = gb9.D(this.b, null, null, new ln3(this, str, z, z2, bool, null), 3);
    }

    public final void d(String str, String str2, String str3, List list) {
        str3.getClass();
        amg amgVar = this.h;
        amgVar.getClass();
        amgVar.n(null, str);
        Boolean bool = Boolean.TRUE;
        amg amgVar2 = this.i;
        amgVar2.getClass();
        amgVar2.n(null, bool);
        gb9.D(this.b, null, null, new mt4(this, str, list, str2, str3, (tp4) null, 22), 3);
    }
}
