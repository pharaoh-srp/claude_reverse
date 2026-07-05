package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luug;", "Lnqb;", "Lvug;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final /* data */ class uug extends nqb {
    public final ab6 E;

    public uug(ab6 ab6Var) {
        this.E = ab6Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new vug(dch.o, this.E);
    }

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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uug)) {
            return false;
        }
        uug uugVar = (uug) obj;
        l40 l40Var = dch.o;
        return l40Var.equals(l40Var) && x44.r(this.E, uugVar.E);
    }

    public final int hashCode() {
        int iP = fsh.p(1022 * 31, 31, false);
        ab6 ab6Var = this.E;
        return iP + (ab6Var != null ? ab6Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + dch.o + ", overrideDescendants=false, touchBoundsExpansion=" + this.E + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        vug vugVar = (vug) hqbVar;
        l40 l40Var = dch.o;
        if (!x44.r(vugVar.T, l40Var)) {
            vugVar.T = l40Var;
            if (vugVar.U) {
                vugVar.r1();
            }
        }
        vugVar.S = this.E;
    }
}
